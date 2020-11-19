package typingsSlinky.ionicCliFramework.loggerMod

import typingsSlinky.ionicCliFramework.colorsMod.ColorFunction
import typingsSlinky.ionicCliFramework.colorsMod.Colors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/cli-framework/lib/logger", "getLoggerLevelColor")
@js.native
object getLoggerLevelColor extends js.Object {
  
  def apply(colors: Colors): js.UndefOr[ColorFunction] = js.native
  def apply(colors: Colors, level: LoggerLevelWeight): js.UndefOr[ColorFunction] = js.native
}
