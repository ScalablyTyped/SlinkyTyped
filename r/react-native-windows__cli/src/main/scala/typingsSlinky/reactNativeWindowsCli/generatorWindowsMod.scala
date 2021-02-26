package typingsSlinky.reactNativeWindowsCli

import typingsSlinky.reactNativeWindowsCli.anon.Verbose
import typingsSlinky.reactNativeWindowsCli.mod.GenerateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object generatorWindowsMod {
  
  @JSImport("@react-native-windows/cli/lib-commonjs/generator-windows", "copyProjectTemplateAndReplace")
  @js.native
  def copyProjectTemplateAndReplace(
    srcRootPath: String,
    destPath: String,
    newProjectName: String,
    namespace: String,
    options: GenerateOptions
  ): js.Promise[Unit] = js.native
  
  @JSImport("@react-native-windows/cli/lib-commonjs/generator-windows", "installDependencies")
  @js.native
  def installDependencies(options: Verbose): Unit = js.native
}
