package typingsSlinky.babelTypes.indexTs37Mod

import typingsSlinky.babelTypes.babelTypesStrings.TSCallSignatureDeclaration
import typingsSlinky.babelTypes.babelTypesStrings.TSConstructSignatureDeclaration
import typingsSlinky.babelTypes.babelTypesStrings.TSIndexSignature
import typingsSlinky.babelTypes.babelTypesStrings.TSMethodSignature
import typingsSlinky.babelTypes.babelTypesStrings.TSPropertySignature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.indexTs37Mod.TSCallSignatureDeclaration_
  - typingsSlinky.babelTypes.indexTs37Mod.TSConstructSignatureDeclaration_
  - typingsSlinky.babelTypes.indexTs37Mod.TSPropertySignature_
  - typingsSlinky.babelTypes.indexTs37Mod.TSMethodSignature_
  - typingsSlinky.babelTypes.indexTs37Mod.TSIndexSignature_
*/
trait TSTypeElement extends _Node
object TSTypeElement {
  
  @scala.inline
  def TSIndexSignature_(parameters: js.Array[Identifier_], `type`: TSIndexSignature): TSTypeElement = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTypeElement]
  }
  
  @scala.inline
  def TSConstructSignatureDeclaration_(parameters: js.Array[Identifier_ | RestElement_], `type`: TSConstructSignatureDeclaration): TSTypeElement = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTypeElement]
  }
  
  @scala.inline
  def TSCallSignatureDeclaration_(parameters: js.Array[Identifier_ | RestElement_], `type`: TSCallSignatureDeclaration): TSTypeElement = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTypeElement]
  }
  
  @scala.inline
  def TSMethodSignature_(key: Expression, parameters: js.Array[Identifier_ | RestElement_], `type`: TSMethodSignature): TSTypeElement = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTypeElement]
  }
  
  @scala.inline
  def TSPropertySignature_(key: Expression, `type`: TSPropertySignature): TSTypeElement = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTypeElement]
  }
}
