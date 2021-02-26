package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.InputField
import typingsSlinky.arcgisJsApi.esri.InputFieldConstructor
import typingsSlinky.arcgisJsApi.esri.InputFieldProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputFieldMod extends Shortcut {
  
  @JSImport("esri/widgets/FeatureForm/InputField", JSImport.Namespace)
  @js.native
  val ^ : InputFieldConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/FeatureForm/InputField", JSImport.Namespace)
  @js.native
  class Class () extends InputField {
    def this(properties: InputFieldProperties) = this()
  }
  
  type _To = InputFieldConstructor
  
  /* This means you don't have to write `^`, but can instead just say `inputFieldMod.foo` */
  override def _to: InputFieldConstructor = ^
}
