package typingsSlinky.activexExcel.global.Excel

import typingsSlinky.activexExcel.Excel.XlCreator
import typingsSlinky.activexOffice.Office.MsoConnectorType
import typingsSlinky.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.ConnectorFormat")
@js.native
class ConnectorFormat protected ()
  extends typingsSlinky.activexExcel.Excel.ConnectorFormat {
  /* CompleteClass */
  override val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  /* CompleteClass */
  override val BeginConnected: MsoTriState = js.native
  /* CompleteClass */
  override val BeginConnectedShape: typingsSlinky.activexExcel.Excel.Shape = js.native
  /* CompleteClass */
  override val BeginConnectionSite: Double = js.native
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  /* CompleteClass */
  override val EndConnected: MsoTriState = js.native
  /* CompleteClass */
  override val EndConnectedShape: typingsSlinky.activexExcel.Excel.Shape = js.native
  /* CompleteClass */
  override val EndConnectionSite: Double = js.native
  /* CompleteClass */
  @JSName("Excel.ConnectorFormat_typekey")
  override var ExcelDotConnectorFormat_typekey: typingsSlinky.activexExcel.Excel.ConnectorFormat = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override var Type: MsoConnectorType = js.native
  /* CompleteClass */
  override def BeginConnect(ConnectedShape: typingsSlinky.activexExcel.Excel.Shape, ConnectionSite: Double): Unit = js.native
  /* CompleteClass */
  override def BeginDisconnect(): Unit = js.native
  /* CompleteClass */
  override def EndConnect(ConnectedShape: typingsSlinky.activexExcel.Excel.Shape, ConnectionSite: Double): Unit = js.native
  /* CompleteClass */
  override def EndDisconnect(): Unit = js.native
}

