package typingsSlinky.activexWord.global.Word

import typingsSlinky.activexOffice.Office.MsoConnectorType
import typingsSlinky.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.ConnectorFormat")
@js.native
class ConnectorFormat protected ()
  extends typingsSlinky.activexWord.Word.ConnectorFormat {
  /* CompleteClass */
  override val Application: typingsSlinky.activexWord.Word.Application = js.native
  /* CompleteClass */
  override val BeginConnected: MsoTriState = js.native
  /* CompleteClass */
  override val BeginConnectedShape: typingsSlinky.activexWord.Word.Shape = js.native
  /* CompleteClass */
  override val BeginConnectionSite: Double = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override val EndConnected: MsoTriState = js.native
  /* CompleteClass */
  override val EndConnectedShape: typingsSlinky.activexWord.Word.Shape = js.native
  /* CompleteClass */
  override val EndConnectionSite: Double = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override var Type: MsoConnectorType = js.native
  /* CompleteClass */
  @JSName("Word.ConnectorFormat_typekey")
  override var WordDotConnectorFormat_typekey: typingsSlinky.activexWord.Word.ConnectorFormat = js.native
  /* CompleteClass */
  override def BeginConnect(ConnectedShape: typingsSlinky.activexWord.Word.Shape, ConnectionSite: Double): Unit = js.native
  /* CompleteClass */
  override def BeginDisconnect(): Unit = js.native
  /* CompleteClass */
  override def EndConnect(ConnectedShape: typingsSlinky.activexWord.Word.Shape, ConnectionSite: Double): Unit = js.native
  /* CompleteClass */
  override def EndDisconnect(): Unit = js.native
}

