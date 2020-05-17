package typingsSlinky.activexFaxcomexlib.FAXCOMEXLib

import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxDevice Class */
@js.native
trait FaxDevice extends js.Object {
  /** Device's Called Station ID */
  var CSID: String = js.native
  /** Description of the device */
  var Description: String = js.native
  /** Device name */
  val DeviceName: String = js.native
  @JSName("FAXCOMEXLib.FaxDevice_typekey")
  var FAXCOMEXLibDotFaxDevice_typekey: FaxDevice = js.native
  /** Unique device ID */
  val Id: Double = js.native
  /** Is the device is turned off */
  val PoweredOff: Boolean = js.native
  /** Device provider */
  val ProviderUniqueName: String = js.native
  /** The receive mode of the device */
  var ReceiveMode: FAX_DEVICE_RECEIVE_MODE_ENUM = js.native
  /** Is the device receiving now */
  val ReceivingNow: Boolean = js.native
  /** Is the device ringing now */
  val RingingNow: Boolean = js.native
  /** Number of rings before the device answers */
  var RingsBeforeAnswer: Double = js.native
  /** Is the device is enabled to send */
  var SendEnabled: Boolean = js.native
  /** Is the device sending now */
  val SendingNow: Boolean = js.native
  /** Device's Transmitting Station ID */
  var TSID: String = js.native
  /** Array of routing methods GUIDs */
  val UsedRoutingMethods: SafeArray[String] = js.native
  /** Answer the call */
  def AnswerCall(): Unit = js.native
  /** Get the device level extention property */
  def GetExtensionProperty(bstrGUID: String): SafeArray[_] = js.native
  /** Refresh the object */
  def Refresh(): Unit = js.native
  /** Save the object */
  def Save(): Unit = js.native
  /** Set the device level extention property */
  def SetExtensionProperty(bstrGUID: String, vProperty: SafeArray[_]): Unit = js.native
  /** Adds or removes routing method */
  def UseRoutingMethod(bstrMethodGUID: String, bUse: Boolean): Unit = js.native
}

object FaxDevice {
  @scala.inline
  def apply(
    AnswerCall: () => Unit,
    CSID: String,
    Description: String,
    DeviceName: String,
    FAXCOMEXLibDotFaxDevice_typekey: FaxDevice,
    GetExtensionProperty: String => SafeArray[_],
    Id: Double,
    PoweredOff: Boolean,
    ProviderUniqueName: String,
    ReceiveMode: FAX_DEVICE_RECEIVE_MODE_ENUM,
    ReceivingNow: Boolean,
    Refresh: () => Unit,
    RingingNow: Boolean,
    RingsBeforeAnswer: Double,
    Save: () => Unit,
    SendEnabled: Boolean,
    SendingNow: Boolean,
    SetExtensionProperty: (String, SafeArray[_]) => Unit,
    TSID: String,
    UseRoutingMethod: (String, Boolean) => Unit,
    UsedRoutingMethods: SafeArray[String]
  ): FaxDevice = {
    val __obj = js.Dynamic.literal(AnswerCall = js.Any.fromFunction0(AnswerCall), CSID = CSID.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], DeviceName = DeviceName.asInstanceOf[js.Any], GetExtensionProperty = js.Any.fromFunction1(GetExtensionProperty), Id = Id.asInstanceOf[js.Any], PoweredOff = PoweredOff.asInstanceOf[js.Any], ProviderUniqueName = ProviderUniqueName.asInstanceOf[js.Any], ReceiveMode = ReceiveMode.asInstanceOf[js.Any], ReceivingNow = ReceivingNow.asInstanceOf[js.Any], Refresh = js.Any.fromFunction0(Refresh), RingingNow = RingingNow.asInstanceOf[js.Any], RingsBeforeAnswer = RingsBeforeAnswer.asInstanceOf[js.Any], Save = js.Any.fromFunction0(Save), SendEnabled = SendEnabled.asInstanceOf[js.Any], SendingNow = SendingNow.asInstanceOf[js.Any], SetExtensionProperty = js.Any.fromFunction2(SetExtensionProperty), TSID = TSID.asInstanceOf[js.Any], UseRoutingMethod = js.Any.fromFunction2(UseRoutingMethod), UsedRoutingMethods = UsedRoutingMethods.asInstanceOf[js.Any])
    __obj.updateDynamic("FAXCOMEXLib.FaxDevice_typekey")(FAXCOMEXLibDotFaxDevice_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxDevice]
  }
  @scala.inline
  implicit class FaxDeviceOps[Self <: FaxDevice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnswerCall(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AnswerCall")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCSID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CSID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeviceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFAXCOMEXLibDotFaxDevice_typekey(value: FaxDevice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FAXCOMEXLib.FaxDevice_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetExtensionProperty(value: String => SafeArray[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetExtensionProperty")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPoweredOff(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PoweredOff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProviderUniqueName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProviderUniqueName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReceiveMode(value: FAX_DEVICE_RECEIVE_MODE_ENUM): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReceiveMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReceivingNow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReceivingNow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefresh(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Refresh")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRingingNow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RingingNow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRingsBeforeAnswer(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RingsBeforeAnswer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSave(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Save")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSendEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SendEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSendingNow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SendingNow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetExtensionProperty(value: (String, SafeArray[_]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetExtensionProperty")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTSID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TSID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseRoutingMethod(value: (String, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UseRoutingMethod")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUsedRoutingMethods(value: SafeArray[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UsedRoutingMethods")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

