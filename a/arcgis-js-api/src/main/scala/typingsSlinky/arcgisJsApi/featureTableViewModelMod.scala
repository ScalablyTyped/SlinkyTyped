package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.FeatureTableViewModel
import typingsSlinky.arcgisJsApi.esri.FeatureTableViewModelConstructor
import typingsSlinky.arcgisJsApi.esri.FeatureTableViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object featureTableViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/FeatureTable/FeatureTableViewModel", JSImport.Namespace)
  @js.native
  val ^ : FeatureTableViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/FeatureTable/FeatureTableViewModel", JSImport.Namespace)
  @js.native
  class Class () extends FeatureTableViewModel {
    def this(properties: FeatureTableViewModelProperties) = this()
  }
  
  type _To = FeatureTableViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `featureTableViewModelMod.foo` */
  override def _to: FeatureTableViewModelConstructor = ^
}
