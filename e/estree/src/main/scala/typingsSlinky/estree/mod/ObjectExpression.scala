package typingsSlinky.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectExpression
  extends BaseNode
     with Expression {
  var properties: js.Array[Property | SpreadElement] = js.native
  @JSName("type")
  var type_ObjectExpression: typingsSlinky.estree.estreeStrings.ObjectExpression = js.native
}

object ObjectExpression {
  @scala.inline
  def apply(
    properties: js.Array[Property | SpreadElement],
    `type`: typingsSlinky.estree.estreeStrings.ObjectExpression
  ): ObjectExpression = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectExpression]
  }
  @scala.inline
  implicit class ObjectExpressionOps[Self <: ObjectExpression] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProperties(value: js.Array[Property | SpreadElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: typingsSlinky.estree.estreeStrings.ObjectExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

