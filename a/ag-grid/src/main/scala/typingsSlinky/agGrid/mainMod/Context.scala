package typingsSlinky.agGrid.mainMod

import typingsSlinky.agGrid.contextMod.ContextParams
import typingsSlinky.agGrid.iLoggerMod.ILogger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/main", "Context")
@js.native
class Context protected ()
  extends typingsSlinky.agGrid.contextMod.Context {
  def this(params: ContextParams, logger: ILogger) = this()
}

