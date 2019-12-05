package typingsSlinky.estree.ESTree

import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionTypeParam extends js.Object {
  var name: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identifier */ js.Any
  var optional: Boolean
  var typeAnnotation: Node
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
}

