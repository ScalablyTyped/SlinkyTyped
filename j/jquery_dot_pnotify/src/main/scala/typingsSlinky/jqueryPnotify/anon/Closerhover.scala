package typingsSlinky.jqueryPnotify.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Closerhover extends js.Object {
  /**
    * Provide a button for the user to manually close the notice.
    */
  var closer: js.UndefOr[Boolean] = js.native
  /**
    * Only show the closer button on hover.
    */
  var closer_hover: js.UndefOr[Boolean] = js.native
  /**
    * Provide a button for the user to manually stick the notice.
    */
  var sticker: js.UndefOr[Boolean] = js.native
  /**
    * Only show the sticker button on hover.
    */
  var sticker_hover: js.UndefOr[Boolean] = js.native
}

object Closerhover {
  @scala.inline
  def apply(): Closerhover = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Closerhover]
  }
  @scala.inline
  implicit class CloserhoverOps[Self <: Closerhover] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloser(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closer")(js.undefined)
        ret
    }
    @scala.inline
    def withCloser_hover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closer_hover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloser_hover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closer_hover")(js.undefined)
        ret
    }
    @scala.inline
    def withSticker(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sticker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSticker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sticker")(js.undefined)
        ret
    }
    @scala.inline
    def withSticker_hover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sticker_hover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSticker_hover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sticker_hover")(js.undefined)
        ret
    }
  }
  
}

