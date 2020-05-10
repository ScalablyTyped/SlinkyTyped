package typingsSlinky.reactToolbox.cardCardMediaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CardMediaTheme extends js.Object {
  /**
    * Added to the element root.
    */
  var cardMedia: js.UndefOr[String] = js.native
  /**
    * Used for the content element.
    */
  var content: js.UndefOr[String] = js.native
  /**
    * Added to content element if its overlayed.
    */
  var contentOverlay: js.UndefOr[String] = js.native
  /**
    * Added to content element if its squared.
    */
  var square: js.UndefOr[String] = js.native
  /**
    * Added to content element if its wide.
    */
  var wide: js.UndefOr[String] = js.native
}

object CardMediaTheme {
  @scala.inline
  def apply(): CardMediaTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardMediaTheme]
  }
  @scala.inline
  implicit class CardMediaThemeOps[Self <: CardMediaTheme] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCardMedia(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardMedia")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCardMedia: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardMedia")(js.undefined)
        ret
    }
    @scala.inline
    def withContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withContentOverlay(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentOverlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentOverlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentOverlay")(js.undefined)
        ret
    }
    @scala.inline
    def withSquare(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("square")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSquare: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("square")(js.undefined)
        ret
    }
    @scala.inline
    def withWide(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wide")(js.undefined)
        ret
    }
  }
  
}

