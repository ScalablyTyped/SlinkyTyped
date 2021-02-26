package typingsSlinky.googleMapReact

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type BootstrapURLKeys = (typingsSlinky.googleMapReact.anon.Key | typingsSlinky.googleMapReact.anon.Client) with typingsSlinky.googleMapReact.anon.Language
  
  @scala.inline
  def convertNeSwToNwSe(boundCorder: typingsSlinky.googleMapReact.anon.Ne): typingsSlinky.googleMapReact.anon.Nw = typingsSlinky.googleMapReact.mod.^.asInstanceOf[js.Dynamic].applyDynamic("convertNeSwToNwSe")(boundCorder.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.googleMapReact.anon.Nw]
  
  @scala.inline
  def convertNwSeToNeSw(boundCorder: typingsSlinky.googleMapReact.anon.Nw): typingsSlinky.googleMapReact.anon.Ne = typingsSlinky.googleMapReact.mod.^.asInstanceOf[js.Dynamic].applyDynamic("convertNwSeToNeSw")(boundCorder.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.googleMapReact.anon.Ne]
  
  @scala.inline
  def fitBounds(bounds: typingsSlinky.googleMapReact.mod.NESWBounds, size: typingsSlinky.googleMapReact.mod.Size): typingsSlinky.googleMapReact.anon.Center = (typingsSlinky.googleMapReact.mod.^.asInstanceOf[js.Dynamic].applyDynamic("fitBounds")(bounds.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.googleMapReact.anon.Center]
  
  @scala.inline
  def getTilesIds(start: typingsSlinky.googleMapReact.anon.From, zoom: scala.Double): js.Array[typingsSlinky.googleMapReact.mod.Tile] = (typingsSlinky.googleMapReact.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getTilesIds")(start.asInstanceOf[js.Any], zoom.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsSlinky.googleMapReact.mod.Tile]]
  
  type googleMapReact = slinky.core.ReactComponentClass[typingsSlinky.googleMapReact.mod.Props]
  
  @scala.inline
  def latLng2Tile(coords: typingsSlinky.googleMapReact.mod.Coords, zoom: scala.Double): typingsSlinky.googleMapReact.anon.Point = (typingsSlinky.googleMapReact.mod.^.asInstanceOf[js.Dynamic].applyDynamic("latLng2Tile")(coords.asInstanceOf[js.Any], zoom.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.googleMapReact.anon.Point]
  
  @scala.inline
  def meters2ScreenPixels(meters: scala.Double, coords: typingsSlinky.googleMapReact.mod.Coords, zoom: scala.Double): typingsSlinky.googleMapReact.anon.H = (typingsSlinky.googleMapReact.mod.^.asInstanceOf[js.Dynamic].applyDynamic("meters2ScreenPixels")(meters.asInstanceOf[js.Any], coords.asInstanceOf[js.Any], zoom.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.googleMapReact.anon.H]
  
  @scala.inline
  def tile2LatLng(point: typingsSlinky.googleMapReact.mod.Point, zoom: scala.Double): typingsSlinky.googleMapReact.anon.Coords = (typingsSlinky.googleMapReact.mod.^.asInstanceOf[js.Dynamic].applyDynamic("tile2LatLng")(point.asInstanceOf[js.Any], zoom.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.googleMapReact.anon.Coords]
}
