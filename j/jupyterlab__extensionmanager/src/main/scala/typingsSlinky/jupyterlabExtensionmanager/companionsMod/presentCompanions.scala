package typingsSlinky.jupyterlabExtensionmanager.companionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/extensionmanager/lib/companions", "presentCompanions")
@js.native
object presentCompanions extends js.Object {
  
  def apply(kernelCompanions: js.Array[KernelCompanion]): js.Promise[Boolean] = js.native
  def apply(kernelCompanions: js.Array[KernelCompanion], serverCompanion: IInstallInfo): js.Promise[Boolean] = js.native
}
