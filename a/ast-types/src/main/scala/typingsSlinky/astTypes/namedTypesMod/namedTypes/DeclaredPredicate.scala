package typingsSlinky.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.FlowKind
import typingsSlinky.astTypes.kindsMod.FlowPredicateKind
import typingsSlinky.astTypes.kindsMod.NodeKind
import typingsSlinky.astTypes.kindsMod.PrintableKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.FlowPredicate, 'type'> */
trait DeclaredPredicate
  extends ASTNode
     with FlowKind
     with FlowPredicateKind
     with NodeKind
     with PrintableKind {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var `type`: typingsSlinky.astTypes.astTypesStrings.DeclaredPredicate
  var value: ExpressionKind
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.DeclaredPredicate")
@js.native
object DeclaredPredicate extends TopLevel[Type[DeclaredPredicate]]

