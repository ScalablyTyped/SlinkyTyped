package typingsSlinky.estree.ESTree

import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionTypeParam extends js.Object {
  var name: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identifier */ js.Any = js.native
  var optional: Boolean = js.native
  var typeAnnotation: Node = js.native
}

object FunctionTypeParam {
  @scala.inline
  def apply(
    name: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identifier */ js.Any,
    optional: Boolean,
    typeAnnotation: Node
  ): FunctionTypeParam = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionTypeParam]
  }
  @scala.inline
  implicit class FunctionTypeParamOps[Self <: FunctionTypeParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identifier */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptional(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeAnnotation(value: Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

