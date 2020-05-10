package typingsSlinky.regexpp.astMod

import typingsSlinky.regexpp.regexppStrings.property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnicodePropertyCharacterSet
  extends CharacterSet
     with NodeBase
     with CharacterClassElement {
  var key: String = js.native
  var kind: property = js.native
  var negate: Boolean = js.native
  @JSName("parent")
  var parent_UnicodePropertyCharacterSet: Alternative | Quantifier | CharacterClass = js.native
  @JSName("type")
  var type_UnicodePropertyCharacterSet: typingsSlinky.regexpp.regexppStrings.CharacterSet = js.native
  var value: String | Null = js.native
}

object UnicodePropertyCharacterSet {
  @scala.inline
  def apply(
    end: Double,
    key: String,
    kind: property,
    negate: Boolean,
    parent: Alternative | Quantifier | CharacterClass,
    raw: String,
    start: Double,
    `type`: typingsSlinky.regexpp.regexppStrings.CharacterSet
  ): UnicodePropertyCharacterSet = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], negate = negate.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnicodePropertyCharacterSet]
  }
  @scala.inline
  implicit class UnicodePropertyCharacterSetOps[Self <: UnicodePropertyCharacterSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: property): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNegate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: Alternative | Quantifier | CharacterClass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: typingsSlinky.regexpp.regexppStrings.CharacterSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(null)
        ret
    }
  }
  
}

