package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.AccessAccessibility
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.NoopKind
import typingsSlinky.astTypes.kindsMod.NumericLiteralKind
import typingsSlinky.astTypes.kindsMod.PatternKind
import typingsSlinky.astTypes.kindsMod.StringLiteralKind
import typingsSlinky.astTypes.kindsMod.TSTypeAnnotationKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSDeclareMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSDeclareMethodBuilder extends StObject {
  
  def apply(key: ExpressionKind, params: js.Array[PatternKind]): TSDeclareMethod = js.native
  def apply(key: ExpressionKind, params: js.Array[PatternKind], returnType: NoopKind): TSDeclareMethod = js.native
  def apply(key: ExpressionKind, params: js.Array[PatternKind], returnType: TSTypeAnnotationKind): TSDeclareMethod = js.native
  def apply(key: IdentifierKind, params: js.Array[PatternKind]): TSDeclareMethod = js.native
  def apply(key: IdentifierKind, params: js.Array[PatternKind], returnType: NoopKind): TSDeclareMethod = js.native
  def apply(key: IdentifierKind, params: js.Array[PatternKind], returnType: TSTypeAnnotationKind): TSDeclareMethod = js.native
  def apply(key: NumericLiteralKind, params: js.Array[PatternKind]): TSDeclareMethod = js.native
  def apply(key: NumericLiteralKind, params: js.Array[PatternKind], returnType: NoopKind): TSDeclareMethod = js.native
  def apply(key: NumericLiteralKind, params: js.Array[PatternKind], returnType: TSTypeAnnotationKind): TSDeclareMethod = js.native
  def apply(key: StringLiteralKind, params: js.Array[PatternKind]): TSDeclareMethod = js.native
  def apply(key: StringLiteralKind, params: js.Array[PatternKind], returnType: NoopKind): TSDeclareMethod = js.native
  def apply(key: StringLiteralKind, params: js.Array[PatternKind], returnType: TSTypeAnnotationKind): TSDeclareMethod = js.native
  
  def from(params: AccessAccessibility): TSDeclareMethod = js.native
}
