package typingsSlinky.kendoUi.kendo.dataviz.diagram

import typingsSlinky.kendoUi.kendo.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connector extends Observable {
  var connections: js.Any = js.native
  var options: ConnectorOptions = js.native
  var shape: Shape = js.native
  def position(): Point = js.native
}

