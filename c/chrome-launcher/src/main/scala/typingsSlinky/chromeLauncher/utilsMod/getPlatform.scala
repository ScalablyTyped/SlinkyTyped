package typingsSlinky.chromeLauncher.utilsMod

import typingsSlinky.chromeLauncher.chromeLauncherStrings.aix
import typingsSlinky.chromeLauncher.chromeLauncherStrings.android
import typingsSlinky.chromeLauncher.chromeLauncherStrings.cygwin
import typingsSlinky.chromeLauncher.chromeLauncherStrings.darwin
import typingsSlinky.chromeLauncher.chromeLauncherStrings.freebsd
import typingsSlinky.chromeLauncher.chromeLauncherStrings.linux
import typingsSlinky.chromeLauncher.chromeLauncherStrings.netbsd
import typingsSlinky.chromeLauncher.chromeLauncherStrings.openbsd
import typingsSlinky.chromeLauncher.chromeLauncherStrings.sunos
import typingsSlinky.chromeLauncher.chromeLauncherStrings.win32
import typingsSlinky.chromeLauncher.chromeLauncherStrings.wsl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("chrome-launcher/dist/utils", "getPlatform")
@js.native
object getPlatform extends js.Object {
  
  def apply(): aix | android | darwin | freebsd | linux | openbsd | sunos | win32 | cygwin | netbsd | wsl = js.native
}
