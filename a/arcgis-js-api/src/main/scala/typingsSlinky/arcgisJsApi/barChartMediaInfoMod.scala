package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.BarChartMediaInfo
import typingsSlinky.arcgisJsApi.esri.BarChartMediaInfoConstructor
import typingsSlinky.arcgisJsApi.esri.BarChartMediaInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object barChartMediaInfoMod extends Shortcut {
  
  @JSImport("esri/popup/content/BarChartMediaInfo", JSImport.Namespace)
  @js.native
  val ^ : BarChartMediaInfoConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/popup/content/BarChartMediaInfo", JSImport.Namespace)
  @js.native
  /**
    * A `BarChartMediaInfo` is a type of chart media element that represents a bar chart displayed within a popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-BarChartMediaInfo.html)
    */
  class Class () extends BarChartMediaInfo {
    def this(properties: BarChartMediaInfoProperties) = this()
  }
  
  type _To = BarChartMediaInfoConstructor
  
  /* This means you don't have to write `^`, but can instead just say `barChartMediaInfoMod.foo` */
  override def _to: BarChartMediaInfoConstructor = ^
}
