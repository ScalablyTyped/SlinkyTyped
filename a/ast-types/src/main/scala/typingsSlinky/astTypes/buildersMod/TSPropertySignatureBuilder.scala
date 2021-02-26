package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Initializer
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.TSTypeAnnotationKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSPropertySignature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSPropertySignatureBuilder extends StObject {
  
  def apply(key: ExpressionKind): TSPropertySignature = js.native
  def apply(key: ExpressionKind, typeAnnotation: js.UndefOr[scala.Nothing], optional: Boolean): TSPropertySignature = js.native
  def apply(key: ExpressionKind, typeAnnotation: Null, optional: Boolean): TSPropertySignature = js.native
  def apply(key: ExpressionKind, typeAnnotation: TSTypeAnnotationKind): TSPropertySignature = js.native
  def apply(key: ExpressionKind, typeAnnotation: TSTypeAnnotationKind, optional: Boolean): TSPropertySignature = js.native
  
  def from(params: Initializer): TSPropertySignature = js.native
}
