package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonAccessAccessibility
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.NoopKind
import typingsSlinky.astTypes.kindsMod.NumericLiteralKind
import typingsSlinky.astTypes.kindsMod.PatternKind
import typingsSlinky.astTypes.kindsMod.StringLiteralKind
import typingsSlinky.astTypes.kindsMod.TSTypeAnnotationKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSDeclareMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSDeclareMethodBuilder extends js.Object {
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
  def from(params: AnonAccessAccessibility): TSDeclareMethod = js.native
}

