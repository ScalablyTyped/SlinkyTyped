package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.FeatureViewModel
import typingsSlinky.arcgisJsApi.esri.FeatureViewModelConstructor
import typingsSlinky.arcgisJsApi.esri.FeatureViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object featureViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/Feature/FeatureViewModel", JSImport.Namespace)
  @js.native
  val ^ : FeatureViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Feature/FeatureViewModel", JSImport.Namespace)
  @js.native
  class Class () extends FeatureViewModel {
    def this(properties: FeatureViewModelProperties) = this()
  }
  
  type _To = FeatureViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `featureViewModelMod.foo` */
  override def _to: FeatureViewModelConstructor = ^
}
