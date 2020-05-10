package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.ClassDeclaration
import typingsSlinky.babelTypes.babelTypesStrings.ClassExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.mod.ClassExpression_
  - typingsSlinky.babelTypes.mod.ClassDeclaration_
*/
trait Class extends _Node

object Class {
  @scala.inline
  def ClassExpression_(body: ClassBody_, mixins: js.Any, `type`: ClassExpression): Class = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], mixins = mixins.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Class]
  }
  @scala.inline
  def ClassDeclaration_(
    body: js.Any,
    decorators: js.Any,
    id: js.Any,
    implements: js.Any,
    mixins: js.Any,
    superClass: js.Any,
    superTypeParameters: js.Any,
    `type`: ClassDeclaration,
    typeParameters: js.Any
  ): Class = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], decorators = decorators.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], implements = implements.asInstanceOf[js.Any], mixins = mixins.asInstanceOf[js.Any], superClass = superClass.asInstanceOf[js.Any], superTypeParameters = superTypeParameters.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Class]
  }
}

