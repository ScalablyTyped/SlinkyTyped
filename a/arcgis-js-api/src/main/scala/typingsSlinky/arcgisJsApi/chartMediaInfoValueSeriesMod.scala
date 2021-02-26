package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.ChartMediaInfoValueSeries
import typingsSlinky.arcgisJsApi.esri.ChartMediaInfoValueSeriesConstructor
import typingsSlinky.arcgisJsApi.esri.ChartMediaInfoValueSeriesProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chartMediaInfoValueSeriesMod extends Shortcut {
  
  @JSImport("esri/popup/content/support/ChartMediaInfoValueSeries", JSImport.Namespace)
  @js.native
  val ^ : ChartMediaInfoValueSeriesConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/popup/content/support/ChartMediaInfoValueSeries", JSImport.Namespace)
  @js.native
  class Class () extends ChartMediaInfoValueSeries {
    def this(properties: ChartMediaInfoValueSeriesProperties) = this()
  }
  
  type _To = ChartMediaInfoValueSeriesConstructor
  
  /* This means you don't have to write `^`, but can instead just say `chartMediaInfoValueSeriesMod.foo` */
  override def _to: ChartMediaInfoValueSeriesConstructor = ^
}
