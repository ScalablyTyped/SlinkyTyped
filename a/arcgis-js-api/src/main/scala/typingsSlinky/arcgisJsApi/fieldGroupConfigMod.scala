package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.FieldGroupConfig
import typingsSlinky.arcgisJsApi.esri.FieldGroupConfigConstructor
import typingsSlinky.arcgisJsApi.esri.FieldGroupConfigProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fieldGroupConfigMod extends Shortcut {
  
  @JSImport("esri/widgets/FeatureForm/FieldGroupConfig", JSImport.Namespace)
  @js.native
  val ^ : FieldGroupConfigConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/FeatureForm/FieldGroupConfig", JSImport.Namespace)
  @js.native
  /**
    * Configuration options for displaying a group of fields within the [FeatureForm](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldGroupConfig.html)
    */
  class Class () extends FieldGroupConfig {
    def this(properties: FieldGroupConfigProperties) = this()
  }
  
  type _To = FieldGroupConfigConstructor
  
  /* This means you don't have to write `^`, but can instead just say `fieldGroupConfigMod.foo` */
  override def _to: FieldGroupConfigConstructor = ^
}
