package typingsSlinky.activexDashIwshruntimelibrary

import typingsSlinky.activexDashIwshruntimelibrary.IWshRuntimeLibrary.WshNetwork
import typingsSlinky.activexDashIwshruntimelibrary.IWshRuntimeLibrary.WshShell
import typingsSlinky.activexDashIwshruntimelibrary.ScriptSigner.Signer
import typingsSlinky.activexDashIwshruntimelibrary.WSHControllerLibrary.WSHController
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveXObjectNameMap extends js.Object {
  var `Scripting.Signer`: Signer
  var WSHController: typingsSlinky.activexDashIwshruntimelibrary.WSHControllerLibrary.WSHController
  var `WScript.Network`: WshNetwork
  var `WScript.Shell`: WshShell
}

object ActiveXObjectNameMap {
  @scala.inline
  def apply(
    `Scripting.Signer`: Signer,
    WSHController: WSHController,
    `WScript.Network`: WshNetwork,
    `WScript.Shell`: WshShell
  ): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal(WSHController = WSHController.asInstanceOf[js.Any])
    __obj.updateDynamic("Scripting.Signer")(`Scripting.Signer`.asInstanceOf[js.Any])
    __obj.updateDynamic("WScript.Network")(`WScript.Network`.asInstanceOf[js.Any])
    __obj.updateDynamic("WScript.Shell")(`WScript.Shell`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
}

