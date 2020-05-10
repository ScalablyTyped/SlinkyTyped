package typingsSlinky.phaser.Phaser.Types.GameObjects.Text

import typingsSlinky.phaser.TextStyleWordWrapCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Text Word Wrap configuration object as used by the Text Style configuration.
  */
@js.native
trait TextWordWrap extends js.Object {
  /**
    * Provide a custom callback when word wrapping is enabled.
    */
  var callback: js.UndefOr[TextStyleWordWrapCallback] = js.native
  /**
    * The context in which the word wrap callback is invoked.
    */
  var callbackScope: js.UndefOr[js.Any] = js.native
  /**
    * Use basic or advanced word wrapping?
    */
  var useAdvancedWrap: js.UndefOr[Boolean] = js.native
  /**
    * The width at which text should be considered for word-wrapping.
    */
  var width: js.UndefOr[Double] = js.native
}

object TextWordWrap {
  @scala.inline
  def apply(): TextWordWrap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextWordWrap]
  }
  @scala.inline
  implicit class TextWordWrapOps[Self <: TextWordWrap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallback(value: (/* text */ String, /* textObject */ typingsSlinky.phaser.Phaser.GameObjects.Text) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.undefined)
        ret
    }
    @scala.inline
    def withCallbackScope(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallbackScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackScope")(js.undefined)
        ret
    }
    @scala.inline
    def withUseAdvancedWrap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useAdvancedWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseAdvancedWrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useAdvancedWrap")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

