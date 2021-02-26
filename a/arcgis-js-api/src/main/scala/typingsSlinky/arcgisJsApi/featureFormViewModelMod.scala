package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.FeatureFormViewModel
import typingsSlinky.arcgisJsApi.esri.FeatureFormViewModelConstructor
import typingsSlinky.arcgisJsApi.esri.FeatureFormViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object featureFormViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/FeatureForm/FeatureFormViewModel", JSImport.Namespace)
  @js.native
  val ^ : FeatureFormViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/FeatureForm/FeatureFormViewModel", JSImport.Namespace)
  @js.native
  /**
    * Provides the logic for the [FeatureForm](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FeatureFormViewModel.html)
    */
  class Class () extends FeatureFormViewModel {
    def this(properties: FeatureFormViewModelProperties) = this()
  }
  
  type _To = FeatureFormViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `featureFormViewModelMod.foo` */
  override def _to: FeatureFormViewModelConstructor = ^
}
