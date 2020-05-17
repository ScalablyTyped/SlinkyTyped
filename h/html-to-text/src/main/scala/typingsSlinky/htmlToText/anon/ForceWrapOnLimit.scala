package typingsSlinky.htmlToText.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForceWrapOnLimit extends js.Object {
  /**
    * defines whether to break long words on the limit if true.
    */
  var forceWrapOnLimit: Boolean = js.native
  /**
    * an array containing the characters that may be wrapped on.
    * These are used in order.
    */
  var wrapCharacters: js.Array[String] = js.native
}

object ForceWrapOnLimit {
  @scala.inline
  def apply(forceWrapOnLimit: Boolean, wrapCharacters: js.Array[String]): ForceWrapOnLimit = {
    val __obj = js.Dynamic.literal(forceWrapOnLimit = forceWrapOnLimit.asInstanceOf[js.Any], wrapCharacters = wrapCharacters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForceWrapOnLimit]
  }
  @scala.inline
  implicit class ForceWrapOnLimitOps[Self <: ForceWrapOnLimit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForceWrapOnLimit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceWrapOnLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrapCharacters(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapCharacters")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

