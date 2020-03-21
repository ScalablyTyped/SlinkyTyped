package typingsSlinky.astTypes.nodesMod

import typingsSlinky.astTypes.kindsMod.BlockStatementKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.PatternKind
import typingsSlinky.astTypes.kindsMod.TSTypeAnnotationKind
import typingsSlinky.astTypes.kindsMod.TSTypeParameterDeclarationKind
import typingsSlinky.astTypes.kindsMod.TypeAnnotationKind
import typingsSlinky.astTypes.kindsMod.TypeParameterDeclarationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Function extends Node {
  var async: Boolean = js.native
  var body: BlockStatementKind = js.native
  var defaults: js.Array[ExpressionKind | Null] = js.native
  var expression: Boolean = js.native
  var generator: Boolean = js.native
  var id: IdentifierKind | Null = js.native
  var params: js.Array[PatternKind] = js.native
  var rest: IdentifierKind | Null = js.native
  var returnType: TypeAnnotationKind | TSTypeAnnotationKind | Null = js.native
  var typeParameters: TypeParameterDeclarationKind | TSTypeParameterDeclarationKind | Null = js.native
}

