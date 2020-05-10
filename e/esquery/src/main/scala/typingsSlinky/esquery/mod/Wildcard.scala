package typingsSlinky.esquery.mod

import typingsSlinky.esquery.esqueryStrings.Asterisk
import typingsSlinky.esquery.esqueryStrings.wildcard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Wildcard
  extends SubjectSelectorAtom
     with Selector
     with SubjectSelector {
  @JSName("type")
  var type_Wildcard: wildcard = js.native
  var value: Asterisk = js.native
}

object Wildcard {
  @scala.inline
  def apply(`type`: wildcard, value: Asterisk): Wildcard = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Wildcard]
  }
  @scala.inline
  implicit class WildcardOps[Self <: Wildcard] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: wildcard): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Asterisk): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

