package typingsSlinky.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaggedTemplateExpression
  extends BaseNode
     with Expression {
  var quasi: TemplateLiteral = js.native
  var tag: Expression = js.native
  @JSName("type")
  var type_TaggedTemplateExpression: typingsSlinky.estree.estreeStrings.TaggedTemplateExpression = js.native
}

object TaggedTemplateExpression {
  @scala.inline
  def apply(
    quasi: TemplateLiteral,
    tag: Expression,
    `type`: typingsSlinky.estree.estreeStrings.TaggedTemplateExpression
  ): TaggedTemplateExpression = {
    val __obj = js.Dynamic.literal(quasi = quasi.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaggedTemplateExpression]
  }
  @scala.inline
  implicit class TaggedTemplateExpressionOps[Self <: TaggedTemplateExpression] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQuasi(value: TemplateLiteral): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quasi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTag(value: Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: typingsSlinky.estree.estreeStrings.TaggedTemplateExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

