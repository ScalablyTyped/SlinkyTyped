package typingsSlinky.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.NodeKind
import typingsSlinky.astTypes.kindsMod.PatternKind
import typingsSlinky.astTypes.kindsMod.PrintableKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.TSTypeAnnotationKind
import typingsSlinky.astTypes.kindsMod.TypeAnnotationKind
import typingsSlinky.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Pattern, 'type'> */
@js.native
trait RestElement
  extends ASTNode
     with NodeKind
     with PatternKind
     with PrintableKind {
  var argument: PatternKind = js.native
  var comments: js.UndefOr[js.Array[CommentKind]] = js.native
  var loc: js.UndefOr[SourceLocationKind] = js.native
  var `type`: typingsSlinky.astTypes.astTypesStrings.RestElement = js.native
  var typeAnnotation: js.UndefOr[TypeAnnotationKind | TSTypeAnnotationKind | Null] = js.native
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.RestElement")
@js.native
object RestElement extends TopLevel[Type[RestElement]]

