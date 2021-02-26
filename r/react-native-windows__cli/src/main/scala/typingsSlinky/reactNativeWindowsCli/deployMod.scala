package typingsSlinky.reactNativeWindowsCli

import typingsSlinky.reactNativeCommunityCliTypes.mod.Config
import typingsSlinky.reactNativeWindowsCli.msbuildtoolsMod.default
import typingsSlinky.reactNativeWindowsCli.runWindowsOptionsMod.BuildConfig
import typingsSlinky.reactNativeWindowsCli.runWindowsOptionsMod.RunWindowsOptions_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deployMod {
  
  @JSImport("@react-native-windows/cli/lib-commonjs/runWindows/utils/deploy", "deployToDesktop")
  @js.native
  def deployToDesktop(options: RunWindowsOptions_, verbose: Boolean, config: Config, buildTools: default): js.Promise[Unit] = js.native
  
  @JSImport("@react-native-windows/cli/lib-commonjs/runWindows/utils/deploy", "deployToDevice")
  @js.native
  def deployToDevice(options: RunWindowsOptions_, verbose: Boolean): js.Promise[Unit] = js.native
  
  @JSImport("@react-native-windows/cli/lib-commonjs/runWindows/utils/deploy", "getBuildConfiguration")
  @js.native
  def getBuildConfiguration(options: RunWindowsOptions_): BuildConfig = js.native
  
  @JSImport("@react-native-windows/cli/lib-commonjs/runWindows/utils/deploy", "startServerInNewWindow")
  @js.native
  def startServerInNewWindow(options: RunWindowsOptions_, verbose: Boolean): js.Promise[Unit] = js.native
}
