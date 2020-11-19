package typingsSlinky.angularMaterial.mod.angularAugmentingMod.material

import typingsSlinky.angular.JQuery
import typingsSlinky.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IThemingService extends js.Object {
  
   // get only
  def apply(element: JQuery): Unit = js.native
  
  var PALETTES: IConfiguredColorPalette = js.native
  
   // get only
  var THEMES: IConfiguredThemes = js.native
  
  def defaultTheme(): String = js.native
  
  def defineTheme(name: String, options: IDefineThemeOptions): IPromise[String] = js.native
  
  def generateTheme(name: String): Unit = js.native
  
  def registered(themeName: String): Boolean = js.native
  
  def setBrowserColor(options: IBrowserColors): js.Function0[Unit] = js.native
}
