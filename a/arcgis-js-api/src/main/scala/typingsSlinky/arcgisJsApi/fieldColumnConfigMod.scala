package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.FieldColumnConfig
import typingsSlinky.arcgisJsApi.esri.FieldColumnConfigConstructor
import typingsSlinky.arcgisJsApi.esri.FieldColumnConfigProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fieldColumnConfigMod extends Shortcut {
  
  @JSImport("esri/widgets/FeatureTable/FieldColumnConfig", JSImport.Namespace)
  @js.native
  val ^ : FieldColumnConfigConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/FeatureTable/FieldColumnConfig", JSImport.Namespace)
  @js.native
  /**
    * The configuration options for displaying an individual field within the [FeatureTable](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumnConfig.html)
    */
  class Class () extends FieldColumnConfig {
    def this(properties: FieldColumnConfigProperties) = this()
  }
  
  type _To = FieldColumnConfigConstructor
  
  /* This means you don't have to write `^`, but can instead just say `fieldColumnConfigMod.foo` */
  override def _to: FieldColumnConfigConstructor = ^
}
