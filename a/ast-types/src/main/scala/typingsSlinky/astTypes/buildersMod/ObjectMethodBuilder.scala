package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonReturnType
import typingsSlinky.astTypes.astTypesStrings.get
import typingsSlinky.astTypes.astTypesStrings.method
import typingsSlinky.astTypes.astTypesStrings.set
import typingsSlinky.astTypes.kindsMod.BlockStatementKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.LiteralKind
import typingsSlinky.astTypes.kindsMod.PatternKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectMethodBuilder extends js.Object {
  def apply(kind: get, key: ExpressionKind, params: js.Array[PatternKind], body: BlockStatementKind): ObjectMethod = js.native
  def apply(
    kind: get,
    key: ExpressionKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    computed: Boolean
  ): ObjectMethod = js.native
  def apply(kind: get, key: IdentifierKind, params: js.Array[PatternKind], body: BlockStatementKind): ObjectMethod = js.native
  def apply(
    kind: get,
    key: IdentifierKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    computed: Boolean
  ): ObjectMethod = js.native
  def apply(kind: get, key: LiteralKind, params: js.Array[PatternKind], body: BlockStatementKind): ObjectMethod = js.native
  def apply(
    kind: get,
    key: LiteralKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    computed: Boolean
  ): ObjectMethod = js.native
  def apply(kind: method, key: ExpressionKind, params: js.Array[PatternKind], body: BlockStatementKind): ObjectMethod = js.native
  def apply(
    kind: method,
    key: ExpressionKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    computed: Boolean
  ): ObjectMethod = js.native
  def apply(kind: method, key: IdentifierKind, params: js.Array[PatternKind], body: BlockStatementKind): ObjectMethod = js.native
  def apply(
    kind: method,
    key: IdentifierKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    computed: Boolean
  ): ObjectMethod = js.native
  def apply(kind: method, key: LiteralKind, params: js.Array[PatternKind], body: BlockStatementKind): ObjectMethod = js.native
  def apply(
    kind: method,
    key: LiteralKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    computed: Boolean
  ): ObjectMethod = js.native
  def apply(kind: set, key: ExpressionKind, params: js.Array[PatternKind], body: BlockStatementKind): ObjectMethod = js.native
  def apply(
    kind: set,
    key: ExpressionKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    computed: Boolean
  ): ObjectMethod = js.native
  def apply(kind: set, key: IdentifierKind, params: js.Array[PatternKind], body: BlockStatementKind): ObjectMethod = js.native
  def apply(
    kind: set,
    key: IdentifierKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    computed: Boolean
  ): ObjectMethod = js.native
  def apply(kind: set, key: LiteralKind, params: js.Array[PatternKind], body: BlockStatementKind): ObjectMethod = js.native
  def apply(
    kind: set,
    key: LiteralKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    computed: Boolean
  ): ObjectMethod = js.native
  def from(params: AnonReturnType): ObjectMethod = js.native
}

