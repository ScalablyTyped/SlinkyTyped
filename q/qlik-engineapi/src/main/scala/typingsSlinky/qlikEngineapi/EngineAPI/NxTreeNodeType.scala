package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * One of:
  * - V for NX_DIM_CELL_VALUE. Applies to values in the data matrix.
  * - E for NX_DIM_CELL_EMPTY. Applies to empty cells in the top and left dimensions.
  * - G for NX_DIM_CELL_GENERATED. Applies to generated nodes that are inserted into the returned tree when there is no actual value (qAllValues in NxPageTreeNode set to true).
  * - N for NX_DIM_CELL_NORMAL. Applies to left and top dimensions cells.
  * - T for NX_DIM_CELL_TOTAL. Applies to cells marked with Total.
  * - P for NX_DIM_CELL_PSEUDO. Applies to pseudo dimensions.
  * - R for NX_DIM_CELL_ROOT. Applies to root node.
  * - U for NX_DIM_CELL_NULL. Applies to Null values in the data matrix.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.qlikEngineapi.qlikEngineapiStrings.V
  - typingsSlinky.qlikEngineapi.qlikEngineapiStrings.E
  - typingsSlinky.qlikEngineapi.qlikEngineapiStrings.G
  - typingsSlinky.qlikEngineapi.qlikEngineapiStrings.N
  - typingsSlinky.qlikEngineapi.qlikEngineapiStrings.T
  - typingsSlinky.qlikEngineapi.qlikEngineapiStrings.P
  - typingsSlinky.qlikEngineapi.qlikEngineapiStrings.R
  - typingsSlinky.qlikEngineapi.qlikEngineapiStrings.U
*/
trait NxTreeNodeType extends js.Object

object NxTreeNodeType {
  @scala.inline
  def E: typingsSlinky.qlikEngineapi.qlikEngineapiStrings.E = this.cast("E")
  @scala.inline
  def G: typingsSlinky.qlikEngineapi.qlikEngineapiStrings.G = this.cast("G")
  @scala.inline
  def N: typingsSlinky.qlikEngineapi.qlikEngineapiStrings.N = this.cast("N")
  @scala.inline
  def P: typingsSlinky.qlikEngineapi.qlikEngineapiStrings.P = this.cast("P")
  @scala.inline
  def R: typingsSlinky.qlikEngineapi.qlikEngineapiStrings.R = this.cast("R")
  @scala.inline
  def T: typingsSlinky.qlikEngineapi.qlikEngineapiStrings.T = this.cast("T")
  @scala.inline
  def U: typingsSlinky.qlikEngineapi.qlikEngineapiStrings.U = this.cast("U")
  @scala.inline
  def V: typingsSlinky.qlikEngineapi.qlikEngineapiStrings.V = this.cast("V")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

