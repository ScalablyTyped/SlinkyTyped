package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.FeatureTemplatesViewModel
import typingsSlinky.arcgisJsApi.esri.FeatureTemplatesViewModelConstructor
import typingsSlinky.arcgisJsApi.esri.FeatureTemplatesViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object featureTemplatesViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/FeatureTemplates/FeatureTemplatesViewModel", JSImport.Namespace)
  @js.native
  val ^ : FeatureTemplatesViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/FeatureTemplates/FeatureTemplatesViewModel", JSImport.Namespace)
  @js.native
  class Class () extends FeatureTemplatesViewModel {
    def this(properties: FeatureTemplatesViewModelProperties) = this()
  }
  
  type _To = FeatureTemplatesViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `featureTemplatesViewModelMod.foo` */
  override def _to: FeatureTemplatesViewModelConstructor = ^
}
