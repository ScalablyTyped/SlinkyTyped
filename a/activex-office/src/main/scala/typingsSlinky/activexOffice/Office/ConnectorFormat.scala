package typingsSlinky.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectorFormat extends js.Object {
  val Application: js.Any = js.native
  val BeginConnected: MsoTriState = js.native
  val BeginConnectedShape: Shape = js.native
  val BeginConnectionSite: Double = js.native
  val Creator: Double = js.native
  val EndConnected: MsoTriState = js.native
  val EndConnectedShape: Shape = js.native
  val EndConnectionSite: Double = js.native
  @JSName("Office.ConnectorFormat_typekey")
  var OfficeDotConnectorFormat_typekey: ConnectorFormat = js.native
  val Parent: js.Any = js.native
  var Type: MsoConnectorType = js.native
  def BeginConnect(ConnectedShape: Shape, ConnectionSite: Double): Unit = js.native
  def BeginDisconnect(): Unit = js.native
  def EndConnect(ConnectedShape: Shape, ConnectionSite: Double): Unit = js.native
  def EndDisconnect(): Unit = js.native
}

object ConnectorFormat {
  @scala.inline
  def apply(
    Application: js.Any,
    BeginConnect: (Shape, Double) => Unit,
    BeginConnected: MsoTriState,
    BeginConnectedShape: Shape,
    BeginConnectionSite: Double,
    BeginDisconnect: () => Unit,
    Creator: Double,
    EndConnect: (Shape, Double) => Unit,
    EndConnected: MsoTriState,
    EndConnectedShape: Shape,
    EndConnectionSite: Double,
    EndDisconnect: () => Unit,
    OfficeDotConnectorFormat_typekey: ConnectorFormat,
    Parent: js.Any,
    Type: MsoConnectorType
  ): ConnectorFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], BeginConnect = js.Any.fromFunction2(BeginConnect), BeginConnected = BeginConnected.asInstanceOf[js.Any], BeginConnectedShape = BeginConnectedShape.asInstanceOf[js.Any], BeginConnectionSite = BeginConnectionSite.asInstanceOf[js.Any], BeginDisconnect = js.Any.fromFunction0(BeginDisconnect), Creator = Creator.asInstanceOf[js.Any], EndConnect = js.Any.fromFunction2(EndConnect), EndConnected = EndConnected.asInstanceOf[js.Any], EndConnectedShape = EndConnectedShape.asInstanceOf[js.Any], EndConnectionSite = EndConnectionSite.asInstanceOf[js.Any], EndDisconnect = js.Any.fromFunction0(EndDisconnect), Parent = Parent.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.ConnectorFormat_typekey")(OfficeDotConnectorFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectorFormat]
  }
  @scala.inline
  implicit class ConnectorFormatOps[Self <: ConnectorFormat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeginConnect(value: (Shape, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BeginConnect")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withBeginConnected(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BeginConnected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeginConnectedShape(value: Shape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BeginConnectedShape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeginConnectionSite(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BeginConnectionSite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeginDisconnect(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BeginDisconnect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndConnect(value: (Shape, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndConnect")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withEndConnected(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndConnected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndConnectedShape(value: Shape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndConnectedShape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndConnectionSite(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndConnectionSite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndDisconnect(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndDisconnect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOfficeDotConnectorFormat_typekey(value: ConnectorFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Office.ConnectorFormat_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: MsoConnectorType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

