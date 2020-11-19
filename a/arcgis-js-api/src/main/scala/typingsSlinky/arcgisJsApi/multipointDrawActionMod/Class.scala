package typingsSlinky.arcgisJsApi.multipointDrawActionMod

import typingsSlinky.arcgisJsApi.esri.MultipointDrawAction
import typingsSlinky.arcgisJsApi.esri.MultipointDrawActionProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("esri/views/draw/MultipointDrawAction", JSImport.Namespace)
@js.native
/**
  * This class uses the view events to generate a set of coordinates to create a new [Multipoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Multipoint.html) geometry using [Draw](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-Draw.html). When the [draw.create("multipoint")](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-Draw.html#create) method is called, a reference to MultipointDrawAction is returned. You can listen to [events](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-MultipointDrawAction.html#events-summary) on the MultipointDrawAction instance, which allows users to create a multipoint that meets criteria specified by the application.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-MultipointDrawAction.html)
  */
class Class () extends MultipointDrawAction {
  def this(properties: MultipointDrawActionProperties) = this()
}
