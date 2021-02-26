package typingsSlinky.electron

import typingsSlinky.electron.Electron.Clipboard
import typingsSlinky.electron.Electron.CrashReporter
import typingsSlinky.electron.Electron.DesktopCapturer
import typingsSlinky.electron.Electron.Shell
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonMod {
  
  @JSImport("electron/common", "NativeImage")
  @js.native
  class NativeImage_ ()
    extends typingsSlinky.electron.Electron.NativeImage_
  
  @JSImport("electron/common", "clipboard")
  @js.native
  val clipboard: Clipboard = js.native
  
  @JSImport("electron/common", "crashReporter")
  @js.native
  val crashReporter: CrashReporter = js.native
  
  @JSImport("electron/common", "desktopCapturer")
  @js.native
  val desktopCapturer: DesktopCapturer = js.native
  
  /* was `typeof NativeImage` */
  @JSImport("electron/common", "nativeImage")
  @js.native
  class nativeImage ()
    extends typingsSlinky.electron.Electron.NativeImage_
  
  @JSImport("electron/common", "shell")
  @js.native
  val shell: Shell = js.native
}
