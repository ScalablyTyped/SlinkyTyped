package typingsSlinky.arcgisJsApi.global.esri

import typingsSlinky.arcgisJsApi.esri.DrawProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.Draw")
@js.native
/**
  * The Draw class provides advanced drawing capabilities for developers who need complete control over creating temporary graphics with different geometries. For example, if you want to prevent users from drawing graphics with self-intersecting lines or overlapping polygons, then you can use this class to implement these rules. The draw experience is built upon draw actions, which use the view events to generate a set of coordinates for creating new geometries. Each geometry type has a corresponding draw action class.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-Draw.html)
  */
class DrawCls ()
  extends typingsSlinky.arcgisJsApi.esri.Draw {
  def this(properties: DrawProperties) = this()
}
