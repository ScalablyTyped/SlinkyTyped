package typingsSlinky.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThemeColorScheme extends js.Object {
  
  def apply(Index: MsoThemeColorSchemeIndex): ThemeColor = js.native
  
  val Application: js.Any = js.native
  
  def Colors(Index: MsoThemeColorSchemeIndex): ThemeColor = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def GetCustomColor(Name: String): Double = js.native
  
  def Load(FileName: String): Unit = js.native
  
  val Parent: js.Any = js.native
  
  def Save(FileName: String): Unit = js.native
}
