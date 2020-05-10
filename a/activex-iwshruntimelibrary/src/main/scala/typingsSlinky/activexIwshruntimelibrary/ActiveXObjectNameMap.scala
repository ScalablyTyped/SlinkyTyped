package typingsSlinky.activexIwshruntimelibrary

import typingsSlinky.activexIwshruntimelibrary.IWshRuntimeLibrary.WshNetwork
import typingsSlinky.activexIwshruntimelibrary.IWshRuntimeLibrary.WshShell
import typingsSlinky.activexIwshruntimelibrary.ScriptSigner.Signer
import typingsSlinky.activexIwshruntimelibrary.WSHControllerLibrary.WSHController
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveXObjectNameMap extends js.Object {
  @JSName("Scripting.Signer")
  var ScriptingDotSigner: Signer = js.native
  var WSHController: typingsSlinky.activexIwshruntimelibrary.WSHControllerLibrary.WSHController = js.native
  @JSName("WScript.Network")
  var WScriptDotNetwork: WshNetwork = js.native
  @JSName("WScript.Shell")
  var WScriptDotShell: WshShell = js.native
}

object ActiveXObjectNameMap {
  @scala.inline
  def apply(
    ScriptingDotSigner: Signer,
    WSHController: WSHController,
    WScriptDotNetwork: WshNetwork,
    WScriptDotShell: WshShell
  ): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal(WSHController = WSHController.asInstanceOf[js.Any])
    __obj.updateDynamic("Scripting.Signer")(ScriptingDotSigner.asInstanceOf[js.Any])
    __obj.updateDynamic("WScript.Network")(WScriptDotNetwork.asInstanceOf[js.Any])
    __obj.updateDynamic("WScript.Shell")(WScriptDotShell.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
  @scala.inline
  implicit class ActiveXObjectNameMapOps[Self <: ActiveXObjectNameMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScriptingDotSigner(value: Signer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scripting.Signer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWSHController(value: WSHController): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WSHController")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWScriptDotNetwork(value: WshNetwork): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WScript.Network")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWScriptDotShell(value: WshShell): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WScript.Shell")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

