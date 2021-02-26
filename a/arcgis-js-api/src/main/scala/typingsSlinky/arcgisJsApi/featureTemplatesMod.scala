package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.FeatureTemplates
import typingsSlinky.arcgisJsApi.esri.FeatureTemplatesConstructor
import typingsSlinky.arcgisJsApi.esri.FeatureTemplatesProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object featureTemplatesMod extends Shortcut {
  
  @JSImport("esri/widgets/FeatureTemplates", JSImport.Namespace)
  @js.native
  val ^ : FeatureTemplatesConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/FeatureTemplates", JSImport.Namespace)
  @js.native
  /**
    * The FeatureTemplates widget is part of the overall editing workflow.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html)
    */
  class Class () extends FeatureTemplates {
    def this(properties: FeatureTemplatesProperties) = this()
  }
  
  type _To = FeatureTemplatesConstructor
  
  /* This means you don't have to write `^`, but can instead just say `featureTemplatesMod.foo` */
  override def _to: FeatureTemplatesConstructor = ^
}
