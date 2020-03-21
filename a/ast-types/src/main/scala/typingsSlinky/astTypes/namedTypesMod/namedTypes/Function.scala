package typingsSlinky.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astTypes.kindsMod.BlockStatementKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.PatternKind
import typingsSlinky.astTypes.kindsMod.TSTypeAnnotationKind
import typingsSlinky.astTypes.kindsMod.TSTypeParameterDeclarationKind
import typingsSlinky.astTypes.kindsMod.TypeAnnotationKind
import typingsSlinky.astTypes.kindsMod.TypeParameterDeclarationKind
import typingsSlinky.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Function extends Node {
  var async: js.UndefOr[Boolean] = js.native
  var body: BlockStatementKind = js.native
  var defaults: js.UndefOr[js.Array[ExpressionKind | Null]] = js.native
  var expression: js.UndefOr[Boolean] = js.native
  var generator: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[IdentifierKind | Null] = js.native
  var params: js.Array[PatternKind] = js.native
  var rest: js.UndefOr[IdentifierKind | Null] = js.native
  var returnType: js.UndefOr[TypeAnnotationKind | TSTypeAnnotationKind | Null] = js.native
  var typeParameters: js.UndefOr[TypeParameterDeclarationKind | TSTypeParameterDeclarationKind | Null] = js.native
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.Function")
@js.native
object Function extends TopLevel[Type[Function]]

