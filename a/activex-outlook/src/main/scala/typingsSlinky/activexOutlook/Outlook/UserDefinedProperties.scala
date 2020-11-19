package typingsSlinky.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserDefinedProperties extends js.Object {
  
  def Add(Name: String, Type: OlUserPropertyType): UserDefinedProperty = js.native
  def Add(Name: String, Type: OlUserPropertyType, DisplayFormat: js.UndefOr[scala.Nothing], Formula: js.Any): UserDefinedProperty = js.native
  def Add(Name: String, Type: OlUserPropertyType, DisplayFormat: js.Any): UserDefinedProperty = js.native
  def Add(Name: String, Type: OlUserPropertyType, DisplayFormat: js.Any, Formula: js.Any): UserDefinedProperty = js.native
  
  val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  
  val Class: OlObjectClass = js.native
  
  val Count: Double = js.native
  
  def Find(Name: String): UserDefinedProperty = js.native
  
  def Item(Index: js.Any): UserDefinedProperty = js.native
  
  @JSName("Outlook.UserDefinedProperties_typekey")
  var OutlookDotUserDefinedProperties_typekey: UserDefinedProperties = js.native
  
  val Parent: js.Any = js.native
  
  def Refresh(): Unit = js.native
  
  def Remove(Index: Double): Unit = js.native
  
  val Session: NameSpace = js.native
}
