package typingsSlinky.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Categories extends StObject {
  
  def Add(Name: String): Category = js.native
  def Add(Name: String, Color: js.UndefOr[scala.Nothing], ShortcutKey: js.Any): Category = js.native
  def Add(Name: String, Color: js.Any): Category = js.native
  def Add(Name: String, Color: js.Any, ShortcutKey: js.Any): Category = js.native
  
  val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  
  val Class: OlObjectClass = js.native
  
  val Count: Double = js.native
  
  def Item(Index: js.Any): Category = js.native
  
  @JSName("Outlook.Categories_typekey")
  var OutlookDotCategories_typekey: Categories = js.native
  
  val Parent: js.Any = js.native
  
  def Remove(Index: js.Any): Unit = js.native
  
  val Session: NameSpace = js.native
}
