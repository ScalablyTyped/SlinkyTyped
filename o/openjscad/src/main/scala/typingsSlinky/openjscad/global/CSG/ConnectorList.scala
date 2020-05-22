package typingsSlinky.openjscad.global.CSG

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CSG.ConnectorList")
@js.native
class ConnectorList protected ()
  extends typingsSlinky.openjscad.CSG.ConnectorList {
  def this(connectors: js.Array[typingsSlinky.openjscad.CSG.Connector]) = this()
  /* CompleteClass */
  override var closed: Boolean = js.native
  /* CompleteClass */
  override var connectors_ : js.Array[typingsSlinky.openjscad.CSG.Connector] = js.native
  /* CompleteClass */
  override def appendConnector(conn: typingsSlinky.openjscad.CSG.Connector): Unit = js.native
  /* CompleteClass */
  override def followWith(cagish: js.Any): typingsSlinky.openjscad.CSG = js.native
  /* CompleteClass */
  override def setClosed(bool: Boolean): Unit = js.native
  /* CompleteClass */
  override def verify(): Unit = js.native
}

/* static members */
@JSGlobal("CSG.ConnectorList")
@js.native
object ConnectorList extends js.Object {
  var defaultNormal: js.Array[Double] = js.native
  def _fromPath2DExplicit(path2D: js.Any, angleIsh: js.Any): typingsSlinky.openjscad.CSG.ConnectorList = js.native
  def _fromPath2DTangents(path2D: js.Any, start: js.Any, end: js.Any): typingsSlinky.openjscad.CSG.ConnectorList = js.native
  def fromPath2D(path2D: typingsSlinky.openjscad.CSG.Path2D, arg1: js.Any, arg2: js.Any): typingsSlinky.openjscad.CSG.ConnectorList = js.native
}

