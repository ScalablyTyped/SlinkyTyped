package typingsSlinky.phaser.Phaser.Types.Input

import typingsSlinky.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputConfiguration extends js.Object {
  /**
    * If `pixelPerfect` is set, this is the alpha tolerance threshold value used in the callback.
    */
  var alphaTolerance: js.UndefOr[integer] = js.native
  /**
    * The CSS string to be used when the cursor is over this Interactive Object.
    */
  var cursor: js.UndefOr[String] = js.native
  /**
    * If `true` the Interactive Object will be set to be draggable and emit drag events.
    */
  var draggable: js.UndefOr[Boolean] = js.native
  /**
    * If `true` the Interactive Object will be set to be a drop zone for draggable objects.
    */
  var dropZone: js.UndefOr[Boolean] = js.native
  /**
    * The object / shape to use as the Hit Area. If not given it will try to create a Rectangle based on the texture frame.
    */
  var hitArea: js.UndefOr[js.Any] = js.native
  /**
    * The callback that determines if the pointer is within the Hit Area shape or not.
    */
  var hitAreaCallback: js.UndefOr[js.Function] = js.native
  /**
    * If `true` the a pixel perfect function will be set for the hit area callback. Only works with texture based Game Objects.
    */
  var pixelPerfect: js.UndefOr[Boolean] = js.native
  /**
    * If `true` the Interactive Object will set the `pointer` hand cursor when a pointer is over it. This is a short-cut for setting `cursor: 'pointer'`.
    */
  var useHandCursor: js.UndefOr[Boolean] = js.native
}

object InputConfiguration {
  @scala.inline
  def apply(): InputConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputConfiguration]
  }
  @scala.inline
  implicit class InputConfigurationOps[Self <: InputConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlphaTolerance(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alphaTolerance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlphaTolerance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alphaTolerance")(js.undefined)
        ret
    }
    @scala.inline
    def withCursor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(js.undefined)
        ret
    }
    @scala.inline
    def withDraggable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(js.undefined)
        ret
    }
    @scala.inline
    def withDropZone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropZone")(js.undefined)
        ret
    }
    @scala.inline
    def withHitArea(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hitArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHitArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hitArea")(js.undefined)
        ret
    }
    @scala.inline
    def withHitAreaCallback(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hitAreaCallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHitAreaCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hitAreaCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withPixelPerfect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelPerfect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPixelPerfect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelPerfect")(js.undefined)
        ret
    }
    @scala.inline
    def withUseHandCursor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useHandCursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseHandCursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useHandCursor")(js.undefined)
        ret
    }
  }
  
}

