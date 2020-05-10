package typingsSlinky.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dwtEnv extends js.Object {
  var ActiveXInstallWithCAB: Boolean = js.native
  var ActiveXVersion: String = js.native
  var AutoLoad: Boolean = js.native
  var Containers: js.Array[Container] = js.native
  var CustomizableDisplayInfo: js.Any = js.native
  var Debug: Boolean = js.native
  var DynamicContainers: js.Array[String] = js.native
  var IfAddMD5InUploadHeader: Boolean = js.native
  var IfConfineMaskWithinTheViewer: Boolean = js.native
  var IfInstallDWTModuleWithZIP: Boolean = js.native
  var IfUseActiveXForIE10Plus: Boolean = js.native
  /*ignored
    OnWebTwainReady
    */
  var JSVersion: String = js.native
  var PluginVersion: String = js.native
  var ProductKey: String = js.native
  var ResourcesPath: String = js.native
  var ServerVersionInfo: String = js.native
  var Trial: Boolean = js.native
  var UseDefaultInstallUI: Boolean = js.native
  var initQueue: js.Array[_] = js.native
  var inited: Boolean = js.native
  def CloseDialog(): Unit = js.native
  def CreateDWTObject(
    newObjID: String,
    successFn: js.Function1[/* dwtObject */ WebTwain, Unit],
    failurefn: js.Function1[/* repeated */ js.Any, Unit]
  ): Unit = js.native
  def DeleteDWTObject(objID: String): Unit = js.native
  def GetWebTwain(cid: String): WebTwain = js.native
  def Load(): Unit = js.native
  /*ignored
    OnWebTwainInitMessage  OnWebTwainNeedUpgrade  OnWebTwainNeedUpgradeWebJavascript  OnWebTwainNotFound  OnWebTwainOldPluginNotAllowed
    */
  def OnWebTwainPostExecute(): Unit = js.native
  def OnWebTwainPreExecute(): Unit = js.native
  def RegisterEvent(event: String, fn: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  def RemoveAllAuthorizations(): Unit = js.native
  def ShowDialog(
    _dialogWidth: Double,
    _dialogHeight: Double,
    _strDialogMessageWithHtmlFormat: String,
    _bChangeImage: Boolean,
    bHideCloseButton: Boolean
  ): Unit = js.native
  def Unload(): Unit = js.native
}

object dwtEnv {
  @scala.inline
  def apply(
    ActiveXInstallWithCAB: Boolean,
    ActiveXVersion: String,
    AutoLoad: Boolean,
    CloseDialog: () => Unit,
    Containers: js.Array[Container],
    CreateDWTObject: (String, js.Function1[/* dwtObject */ WebTwain, Unit], js.Function1[/* repeated */ js.Any, Unit]) => Unit,
    CustomizableDisplayInfo: js.Any,
    Debug: Boolean,
    DeleteDWTObject: String => Unit,
    DynamicContainers: js.Array[String],
    GetWebTwain: String => WebTwain,
    IfAddMD5InUploadHeader: Boolean,
    IfConfineMaskWithinTheViewer: Boolean,
    IfInstallDWTModuleWithZIP: Boolean,
    IfUseActiveXForIE10Plus: Boolean,
    JSVersion: String,
    Load: () => Unit,
    OnWebTwainPostExecute: () => Unit,
    OnWebTwainPreExecute: () => Unit,
    PluginVersion: String,
    ProductKey: String,
    RegisterEvent: (String, js.Function1[/* repeated */ js.Any, Unit]) => Unit,
    RemoveAllAuthorizations: () => Unit,
    ResourcesPath: String,
    ServerVersionInfo: String,
    ShowDialog: (Double, Double, String, Boolean, Boolean) => Unit,
    Trial: Boolean,
    Unload: () => Unit,
    UseDefaultInstallUI: Boolean,
    initQueue: js.Array[_],
    inited: Boolean
  ): dwtEnv = {
    val __obj = js.Dynamic.literal(ActiveXInstallWithCAB = ActiveXInstallWithCAB.asInstanceOf[js.Any], ActiveXVersion = ActiveXVersion.asInstanceOf[js.Any], AutoLoad = AutoLoad.asInstanceOf[js.Any], CloseDialog = js.Any.fromFunction0(CloseDialog), Containers = Containers.asInstanceOf[js.Any], CreateDWTObject = js.Any.fromFunction3(CreateDWTObject), CustomizableDisplayInfo = CustomizableDisplayInfo.asInstanceOf[js.Any], Debug = Debug.asInstanceOf[js.Any], DeleteDWTObject = js.Any.fromFunction1(DeleteDWTObject), DynamicContainers = DynamicContainers.asInstanceOf[js.Any], GetWebTwain = js.Any.fromFunction1(GetWebTwain), IfAddMD5InUploadHeader = IfAddMD5InUploadHeader.asInstanceOf[js.Any], IfConfineMaskWithinTheViewer = IfConfineMaskWithinTheViewer.asInstanceOf[js.Any], IfInstallDWTModuleWithZIP = IfInstallDWTModuleWithZIP.asInstanceOf[js.Any], IfUseActiveXForIE10Plus = IfUseActiveXForIE10Plus.asInstanceOf[js.Any], JSVersion = JSVersion.asInstanceOf[js.Any], Load = js.Any.fromFunction0(Load), OnWebTwainPostExecute = js.Any.fromFunction0(OnWebTwainPostExecute), OnWebTwainPreExecute = js.Any.fromFunction0(OnWebTwainPreExecute), PluginVersion = PluginVersion.asInstanceOf[js.Any], ProductKey = ProductKey.asInstanceOf[js.Any], RegisterEvent = js.Any.fromFunction2(RegisterEvent), RemoveAllAuthorizations = js.Any.fromFunction0(RemoveAllAuthorizations), ResourcesPath = ResourcesPath.asInstanceOf[js.Any], ServerVersionInfo = ServerVersionInfo.asInstanceOf[js.Any], ShowDialog = js.Any.fromFunction5(ShowDialog), Trial = Trial.asInstanceOf[js.Any], Unload = js.Any.fromFunction0(Unload), UseDefaultInstallUI = UseDefaultInstallUI.asInstanceOf[js.Any], initQueue = initQueue.asInstanceOf[js.Any], inited = inited.asInstanceOf[js.Any])
    __obj.asInstanceOf[dwtEnv]
  }
  @scala.inline
  implicit class dwtEnvOps[Self <: dwtEnv] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveXInstallWithCAB(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActiveXInstallWithCAB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActiveXVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActiveXVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoLoad(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCloseDialog(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloseDialog")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withContainers(value: js.Array[Container]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Containers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateDWTObject(
      value: (String, js.Function1[/* dwtObject */ WebTwain, Unit], js.Function1[/* repeated */ js.Any, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateDWTObject")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withCustomizableDisplayInfo(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomizableDisplayInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteDWTObject(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeleteDWTObject")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDynamicContainers(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DynamicContainers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetWebTwain(value: String => WebTwain): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetWebTwain")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIfAddMD5InUploadHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IfAddMD5InUploadHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIfConfineMaskWithinTheViewer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IfConfineMaskWithinTheViewer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIfInstallDWTModuleWithZIP(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IfInstallDWTModuleWithZIP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIfUseActiveXForIE10Plus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IfUseActiveXForIE10Plus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJSVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoad(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Load")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnWebTwainPostExecute(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnWebTwainPostExecute")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnWebTwainPreExecute(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnWebTwainPreExecute")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPluginVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PluginVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProductKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegisterEvent(value: (String, js.Function1[/* repeated */ js.Any, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegisterEvent")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRemoveAllAuthorizations(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoveAllAuthorizations")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withResourcesPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourcesPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerVersionInfo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerVersionInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowDialog(value: (Double, Double, String, Boolean, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowDialog")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withTrial(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Trial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnload(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Unload")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUseDefaultInstallUI(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UseDefaultInstallUI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitQueue(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initQueue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInited(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inited")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

