package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.DatePicker
import typingsSlinky.arcgisJsApi.esri.DatePickerConstructor
import typingsSlinky.arcgisJsApi.esri.DatePickerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datePickerMod extends Shortcut {
  
  @JSImport("esri/widgets/support/DatePicker", JSImport.Namespace)
  @js.native
  val ^ : DatePickerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/support/DatePicker", JSImport.Namespace)
  @js.native
  class Class () extends DatePicker {
    def this(properties: DatePickerProperties) = this()
  }
  
  type _To = DatePickerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `datePickerMod.foo` */
  override def _to: DatePickerConstructor = ^
}
