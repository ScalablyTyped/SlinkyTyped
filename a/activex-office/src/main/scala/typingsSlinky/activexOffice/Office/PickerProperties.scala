package typingsSlinky.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PickerProperties extends js.Object {
  
  def apply(Index: Double): PickerProperty = js.native
  
  def Add(Id: String, Value: String, Type: MsoPickerField): PickerProperty = js.native
  
  val Application: js.Any = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: Double): PickerProperty = js.native
  
  def Remove(Id: String): Unit = js.native
}
