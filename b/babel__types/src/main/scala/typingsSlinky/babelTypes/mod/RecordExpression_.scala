package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.RecordExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.babelTypes.mod._Node because Already inherited */ @js.native
trait RecordExpression_
  extends Expression
     with BaseNode {
  var properties: js.Array[ObjectProperty_ | ObjectMethod_ | SpreadElement_] = js.native
  @JSName("type")
  var type_RecordExpression_ : RecordExpression = js.native
}

object RecordExpression_ {
  @scala.inline
  def apply(properties: js.Array[ObjectProperty_ | ObjectMethod_ | SpreadElement_], `type`: RecordExpression): RecordExpression_ = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordExpression_]
  }
  @scala.inline
  implicit class RecordExpression_Ops[Self <: RecordExpression_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProperties(value: js.Array[ObjectProperty_ | ObjectMethod_ | SpreadElement_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: RecordExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

