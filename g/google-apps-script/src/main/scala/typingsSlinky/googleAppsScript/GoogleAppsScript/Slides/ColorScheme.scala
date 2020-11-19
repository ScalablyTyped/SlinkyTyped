package typingsSlinky.googleAppsScript.GoogleAppsScript.Slides

import typingsSlinky.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A color scheme defines a mapping from members of ThemeColorType to the actual colors used
  * to render them.
  */
@js.native
trait ColorScheme extends js.Object {
  
  def getConcreteColor(theme: ThemeColorType): Color = js.native
  
  def getThemeColors(): js.Array[ThemeColorType] = js.native
  
  def setConcreteColor(`type`: ThemeColorType, color: Color): ColorScheme = js.native
  def setConcreteColor(`type`: ThemeColorType, hexColor: String): ColorScheme = js.native
  def setConcreteColor(`type`: ThemeColorType, red: Integer, green: Integer, blue: Integer): ColorScheme = js.native
}
