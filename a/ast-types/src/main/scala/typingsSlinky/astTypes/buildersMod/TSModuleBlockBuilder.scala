package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonBodyArray
import typingsSlinky.astTypes.kindsMod.StatementKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSModuleBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSModuleBlockBuilder extends js.Object {
  def apply(body: js.Array[StatementKind]): TSModuleBlock = js.native
  def from(params: AnonBodyArray): TSModuleBlock = js.native
}

