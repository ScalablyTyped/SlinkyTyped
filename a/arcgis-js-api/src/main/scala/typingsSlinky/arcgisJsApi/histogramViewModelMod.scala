package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.HistogramViewModel
import typingsSlinky.arcgisJsApi.esri.HistogramViewModelConstructor
import typingsSlinky.arcgisJsApi.esri.HistogramViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object histogramViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/Histogram/HistogramViewModel", JSImport.Namespace)
  @js.native
  val ^ : HistogramViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Histogram/HistogramViewModel", JSImport.Namespace)
  @js.native
  class Class () extends HistogramViewModel {
    def this(properties: HistogramViewModelProperties) = this()
  }
  
  type _To = HistogramViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `histogramViewModelMod.foo` */
  override def _to: HistogramViewModelConstructor = ^
}
