package typingsSlinky.activexFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxInboundRoutingMethod Class */
@js.native
trait FaxInboundRoutingMethod extends js.Object {
  /** Friendly name of the extension exposing this method */
  val ExtensionFriendlyName: String = js.native
  /** Image name of the extension exposing this method */
  val ExtensionImageName: String = js.native
  @JSName("FAXCOMEXLib.FaxInboundRoutingMethod_typekey")
  var FAXCOMEXLibDotFaxInboundRoutingMethod_typekey: FaxInboundRoutingMethod = js.native
  /** Internal function name */
  val FunctionName: String = js.native
  /** GUID of the method */
  val GUID: String = js.native
  /** The name of the method */
  val Name: String = js.native
  /** Priority of the method */
  var Priority: Double = js.native
  /** Refresh the object */
  def Refresh(): Unit = js.native
  /** Save the object */
  def Save(): Unit = js.native
}

object FaxInboundRoutingMethod {
  @scala.inline
  def apply(
    ExtensionFriendlyName: String,
    ExtensionImageName: String,
    FAXCOMEXLibDotFaxInboundRoutingMethod_typekey: FaxInboundRoutingMethod,
    FunctionName: String,
    GUID: String,
    Name: String,
    Priority: Double,
    Refresh: () => Unit,
    Save: () => Unit
  ): FaxInboundRoutingMethod = {
    val __obj = js.Dynamic.literal(ExtensionFriendlyName = ExtensionFriendlyName.asInstanceOf[js.Any], ExtensionImageName = ExtensionImageName.asInstanceOf[js.Any], FunctionName = FunctionName.asInstanceOf[js.Any], GUID = GUID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Priority = Priority.asInstanceOf[js.Any], Refresh = js.Any.fromFunction0(Refresh), Save = js.Any.fromFunction0(Save))
    __obj.updateDynamic("FAXCOMEXLib.FaxInboundRoutingMethod_typekey")(FAXCOMEXLibDotFaxInboundRoutingMethod_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxInboundRoutingMethod]
  }
  @scala.inline
  implicit class FaxInboundRoutingMethodOps[Self <: FaxInboundRoutingMethod] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtensionFriendlyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExtensionFriendlyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtensionImageName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExtensionImageName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFAXCOMEXLibDotFaxInboundRoutingMethod_typekey(value: FaxInboundRoutingMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FAXCOMEXLib.FaxInboundRoutingMethod_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFunctionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FunctionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGUID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GUID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPriority(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefresh(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Refresh")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSave(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Save")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

