package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.BigIntLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.babelTypes.mod.Node because Already inherited */ @js.native
trait BigIntLiteral_
  extends Expression
     with BaseNode
     with Immutable
     with Literal
     with Pureish {
  @JSName("type")
  var type_BigIntLiteral_ : BigIntLiteral = js.native
  var value: String = js.native
}

object BigIntLiteral_ {
  @scala.inline
  def apply(`type`: BigIntLiteral, value: String): BigIntLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BigIntLiteral_]
  }
  @scala.inline
  implicit class BigIntLiteral_Ops[Self <: BigIntLiteral_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: BigIntLiteral): Self = {
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
  }
  
}

