package typingsSlinky.agGrid.mod

import typingsSlinky.agGrid.exportParamsMod.ExportParams
import typingsSlinky.agGrid.gridSerializerMod.GridSerializingSession
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid", "BaseCreator")
@js.native
abstract class BaseCreator[T, S /* <: GridSerializingSession[T] */, P /* <: ExportParams[T] */] ()
  extends typingsSlinky.agGrid.csvCreatorMod.BaseCreator[T, S, P]

