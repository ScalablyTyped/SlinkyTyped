package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.FieldConfig
import typingsSlinky.arcgisJsApi.esri.FieldConfigConstructor
import typingsSlinky.arcgisJsApi.esri.FieldConfigProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fieldConfigMod extends Shortcut {
  
  @JSImport("esri/widgets/FeatureForm/FieldConfig", JSImport.Namespace)
  @js.native
  val ^ : FieldConfigConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/FeatureForm/FieldConfig", JSImport.Namespace)
  @js.native
  /**
    * Configuration options for displaying an individual field within the [FeatureForm](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldConfig.html)
    */
  class Class () extends FieldConfig {
    def this(properties: FieldConfigProperties) = this()
  }
  
  type _To = FieldConfigConstructor
  
  /* This means you don't have to write `^`, but can instead just say `fieldConfigMod.foo` */
  override def _to: FieldConfigConstructor = ^
}
