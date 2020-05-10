package typingsSlinky.dotdotdot.JQueryDotDotDot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDotDotDotOptionsLastCharacter extends js.Object {
  /** Don't add an ellipsis if this array contains
    * the last character of the truncated text.
    * Default:  []
    */
  var noEllipsis: js.UndefOr[js.Array[String]] = js.native
  /** Remove these characters from the end of the truncated text.
    * Default: [' ', ',', ';', '.', '!', '?']
    */
  var remove: js.UndefOr[js.Array[String]] = js.native
}

object IDotDotDotOptionsLastCharacter {
  @scala.inline
  def apply(): IDotDotDotOptionsLastCharacter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDotDotDotOptionsLastCharacter]
  }
  @scala.inline
  implicit class IDotDotDotOptionsLastCharacterOps[Self <: IDotDotDotOptionsLastCharacter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNoEllipsis(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noEllipsis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoEllipsis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noEllipsis")(js.undefined)
        ret
    }
    @scala.inline
    def withRemove(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.undefined)
        ret
    }
  }
  
}

