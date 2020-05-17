package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.AbstractAccess
import typingsSlinky.astTypes.astTypesStrings.constructor
import typingsSlinky.astTypes.astTypesStrings.get
import typingsSlinky.astTypes.astTypesStrings.method
import typingsSlinky.astTypes.astTypesStrings.set
import typingsSlinky.astTypes.kindsMod.BlockStatementKind
import typingsSlinky.astTypes.kindsMod.PatternKind
import typingsSlinky.astTypes.kindsMod.PrivateNameKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassPrivateMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassPrivateMethodBuilder extends js.Object {
  def apply(key: PrivateNameKind, params: js.Array[PatternKind], body: BlockStatementKind): ClassPrivateMethod = js.native
  def apply(key: PrivateNameKind, params: js.Array[PatternKind], body: BlockStatementKind, kind: constructor): ClassPrivateMethod = js.native
  def apply(
    key: PrivateNameKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    kind: constructor,
    computed: Boolean
  ): ClassPrivateMethod = js.native
  def apply(
    key: PrivateNameKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    kind: constructor,
    computed: Boolean,
    staticParam: Boolean
  ): ClassPrivateMethod = js.native
  def apply(key: PrivateNameKind, params: js.Array[PatternKind], body: BlockStatementKind, kind: get): ClassPrivateMethod = js.native
  def apply(
    key: PrivateNameKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    kind: get,
    computed: Boolean
  ): ClassPrivateMethod = js.native
  def apply(
    key: PrivateNameKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    kind: get,
    computed: Boolean,
    staticParam: Boolean
  ): ClassPrivateMethod = js.native
  def apply(key: PrivateNameKind, params: js.Array[PatternKind], body: BlockStatementKind, kind: method): ClassPrivateMethod = js.native
  def apply(
    key: PrivateNameKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    kind: method,
    computed: Boolean
  ): ClassPrivateMethod = js.native
  def apply(
    key: PrivateNameKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    kind: method,
    computed: Boolean,
    staticParam: Boolean
  ): ClassPrivateMethod = js.native
  def apply(key: PrivateNameKind, params: js.Array[PatternKind], body: BlockStatementKind, kind: set): ClassPrivateMethod = js.native
  def apply(
    key: PrivateNameKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    kind: set,
    computed: Boolean
  ): ClassPrivateMethod = js.native
  def apply(
    key: PrivateNameKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    kind: set,
    computed: Boolean,
    staticParam: Boolean
  ): ClassPrivateMethod = js.native
  def from(params: AbstractAccess): ClassPrivateMethod = js.native
}

