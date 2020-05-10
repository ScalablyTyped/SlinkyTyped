package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.TSCallSignatureDeclaration
import typingsSlinky.babelTypes.babelTypesStrings.TSConstructSignatureDeclaration
import typingsSlinky.babelTypes.babelTypesStrings.TSIndexSignature
import typingsSlinky.babelTypes.babelTypesStrings.TSMethodSignature
import typingsSlinky.babelTypes.babelTypesStrings.TSPropertySignature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.mod.TSCallSignatureDeclaration_
  - typingsSlinky.babelTypes.mod.TSConstructSignatureDeclaration_
  - typingsSlinky.babelTypes.mod.TSPropertySignature_
  - typingsSlinky.babelTypes.mod.TSMethodSignature_
  - typingsSlinky.babelTypes.mod.TSIndexSignature_
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
  def TSMethodSignature_(key: Expression, parameters: js.Array[Identifier_ | RestElement_], `type`: TSMethodSignature): TSTypeElement = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
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
  def TSPropertySignature_(key: Expression, `type`: TSPropertySignature): TSTypeElement = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTypeElement]
  }
  @scala.inline
  def TSConstructSignatureDeclaration_(parameters: js.Array[Identifier_ | RestElement_], `type`: TSConstructSignatureDeclaration): TSTypeElement = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTypeElement]
  }
}

