package typingsSlinky.appBuilderLib.windowsCodeSignMod

import typingsSlinky.appBuilderLib.winPackagerMod.WinPackager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("app-builder-lib/out/codeSign/windowsCodeSign", "sign")
@js.native
object sign extends js.Object {
  
  def apply(options: WindowsSignOptions, packager: WinPackager): js.Promise[Unit] = js.native
}
