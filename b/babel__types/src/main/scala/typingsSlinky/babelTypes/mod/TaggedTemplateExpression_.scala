package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.TaggedTemplateExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.babelTypes.mod.Node because Already inherited */ @js.native
trait TaggedTemplateExpression_
  extends Expression
     with BaseNode {
  var quasi: TemplateLiteral_ = js.native
  var tag: Expression = js.native
  var typeParameters: TypeParameterInstantiation_ | TSTypeParameterInstantiation_ | Null = js.native
  @JSName("type")
  var type_TaggedTemplateExpression_ : TaggedTemplateExpression = js.native
}

object TaggedTemplateExpression_ {
  @scala.inline
  def apply(quasi: TemplateLiteral_, tag: Expression, `type`: TaggedTemplateExpression): TaggedTemplateExpression_ = {
    val __obj = js.Dynamic.literal(quasi = quasi.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaggedTemplateExpression_]
  }
  @scala.inline
  implicit class TaggedTemplateExpression_Ops[Self <: TaggedTemplateExpression_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQuasi(value: TemplateLiteral_): Self = {
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
    def withType(value: TaggedTemplateExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeParameters(value: TypeParameterInstantiation_ | TSTypeParameterInstantiation_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeParametersNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeParameters")(null)
        ret
    }
  }
  
}

