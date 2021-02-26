package typingsSlinky.reactNativeWindowsCli

import typingsSlinky.reactNativeCommunityCliTypes.mod.Command
import typingsSlinky.reactNativeWindowsCli.reactNativeWindowsCliBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runWindowsMod {
  
  @JSImport("@react-native-windows/cli/lib-commonjs/runWindows/runWindows", "getAnonymizedProjectName")
  @js.native
  def getAnonymizedProjectName(projectRoot: String): js.Promise[String | Null] = js.native
  
  @JSImport("@react-native-windows/cli/lib-commonjs/runWindows/runWindows", "runWindowsCommand")
  @js.native
  val runWindowsCommand: Command[`false`] = js.native
}
