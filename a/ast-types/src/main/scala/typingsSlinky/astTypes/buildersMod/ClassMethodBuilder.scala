package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonAbstract
import typingsSlinky.astTypes.astTypesStrings.constructor
import typingsSlinky.astTypes.astTypesStrings.get
import typingsSlinky.astTypes.astTypesStrings.method
import typingsSlinky.astTypes.astTypesStrings.set
import typingsSlinky.astTypes.kindsMod.BlockStatementKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.LiteralKind
import typingsSlinky.astTypes.kindsMod.PatternKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassMethodBuilder extends js.Object {
  def apply(
    kind: js.UndefOr[get | set | method | constructor],
    key: LiteralKind | IdentifierKind | ExpressionKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind
  ): ClassMethod = js.native
  def apply(
    kind: js.UndefOr[get | set | method | constructor],
    key: LiteralKind | IdentifierKind | ExpressionKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    computed: Boolean
  ): ClassMethod = js.native
  def apply(
    kind: js.UndefOr[get | set | method | constructor],
    key: LiteralKind | IdentifierKind | ExpressionKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    computed: Boolean,
    staticParam: Boolean
  ): ClassMethod = js.native
  def from(params: AnonAbstract): ClassMethod = js.native
}

