package typingsSlinky.activexOffice.global.Office

import typingsSlinky.activexOffice.Office.MsoConnectorType
import typingsSlinky.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.ConnectorFormat")
@js.native
class ConnectorFormat protected ()
  extends typingsSlinky.activexOffice.Office.ConnectorFormat {
  /* CompleteClass */
  override val Application: js.Any = js.native
  /* CompleteClass */
  override val BeginConnected: MsoTriState = js.native
  /* CompleteClass */
  override val BeginConnectedShape: typingsSlinky.activexOffice.Office.Shape = js.native
  /* CompleteClass */
  override val BeginConnectionSite: Double = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override val EndConnected: MsoTriState = js.native
  /* CompleteClass */
  override val EndConnectedShape: typingsSlinky.activexOffice.Office.Shape = js.native
  /* CompleteClass */
  override val EndConnectionSite: Double = js.native
  /* CompleteClass */
  @JSName("Office.ConnectorFormat_typekey")
  override var OfficeDotConnectorFormat_typekey: typingsSlinky.activexOffice.Office.ConnectorFormat = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override var Type: MsoConnectorType = js.native
  /* CompleteClass */
  override def BeginConnect(ConnectedShape: typingsSlinky.activexOffice.Office.Shape, ConnectionSite: Double): Unit = js.native
  /* CompleteClass */
  override def BeginDisconnect(): Unit = js.native
  /* CompleteClass */
  override def EndConnect(ConnectedShape: typingsSlinky.activexOffice.Office.Shape, ConnectionSite: Double): Unit = js.native
  /* CompleteClass */
  override def EndDisconnect(): Unit = js.native
}

