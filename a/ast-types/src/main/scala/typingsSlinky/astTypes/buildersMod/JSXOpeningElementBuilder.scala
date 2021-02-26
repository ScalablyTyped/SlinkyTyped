package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.SelfClosing
import typingsSlinky.astTypes.kindsMod.JSXAttributeKind
import typingsSlinky.astTypes.kindsMod.JSXIdentifierKind
import typingsSlinky.astTypes.kindsMod.JSXMemberExpressionKind
import typingsSlinky.astTypes.kindsMod.JSXNamespacedNameKind
import typingsSlinky.astTypes.kindsMod.JSXSpreadAttributeKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXOpeningElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSXOpeningElementBuilder extends StObject {
  
  def apply(name: JSXIdentifierKind): JSXOpeningElement = js.native
  def apply(name: JSXIdentifierKind, attributes: js.UndefOr[scala.Nothing], selfClosing: Boolean): JSXOpeningElement = js.native
  def apply(name: JSXIdentifierKind, attributes: js.Array[JSXAttributeKind | JSXSpreadAttributeKind]): JSXOpeningElement = js.native
  def apply(
    name: JSXIdentifierKind,
    attributes: js.Array[JSXAttributeKind | JSXSpreadAttributeKind],
    selfClosing: Boolean
  ): JSXOpeningElement = js.native
  def apply(name: JSXMemberExpressionKind): JSXOpeningElement = js.native
  def apply(name: JSXMemberExpressionKind, attributes: js.UndefOr[scala.Nothing], selfClosing: Boolean): JSXOpeningElement = js.native
  def apply(name: JSXMemberExpressionKind, attributes: js.Array[JSXAttributeKind | JSXSpreadAttributeKind]): JSXOpeningElement = js.native
  def apply(
    name: JSXMemberExpressionKind,
    attributes: js.Array[JSXAttributeKind | JSXSpreadAttributeKind],
    selfClosing: Boolean
  ): JSXOpeningElement = js.native
  def apply(name: JSXNamespacedNameKind): JSXOpeningElement = js.native
  def apply(name: JSXNamespacedNameKind, attributes: js.UndefOr[scala.Nothing], selfClosing: Boolean): JSXOpeningElement = js.native
  def apply(name: JSXNamespacedNameKind, attributes: js.Array[JSXAttributeKind | JSXSpreadAttributeKind]): JSXOpeningElement = js.native
  def apply(
    name: JSXNamespacedNameKind,
    attributes: js.Array[JSXAttributeKind | JSXSpreadAttributeKind],
    selfClosing: Boolean
  ): JSXOpeningElement = js.native
  
  def from(params: SelfClosing): JSXOpeningElement = js.native
}
