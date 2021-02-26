package typingsSlinky.reactLeaflet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AddLayerHandler = js.Function3[
    /* layer */ typingsSlinky.leaflet.mod.Layer, 
    /* name */ java.lang.String, 
    /* checked */ js.UndefOr[scala.Boolean], 
    scala.Unit
  ]
  
  type Children = slinky.core.facade.ReactElement | js.Array[slinky.core.facade.ReactElement]
  
  type LatLng = typingsSlinky.leaflet.mod.LatLng_ | js.Array[scala.Double] | js.Object
  
  type LatLngBounds = typingsSlinky.leaflet.mod.LatLngBounds_ | js.Array[typingsSlinky.reactLeaflet.mod.LatLng]
  
  @scala.inline
  def LeafletConsumer: slinky.core.ReactComponentClass[
    typingsSlinky.react.mod.ConsumerProps[typingsSlinky.reactLeaflet.mod.LeafletContext]
  ] = typingsSlinky.reactLeaflet.mod.^.asInstanceOf[js.Dynamic].selectDynamic("LeafletConsumer").asInstanceOf[slinky.core.ReactComponentClass[
    typingsSlinky.react.mod.ConsumerProps[typingsSlinky.reactLeaflet.mod.LeafletContext]
  ]]
  
  type LeafletEvents = typingsSlinky.reactLeaflet.mod.MapEvents with typingsSlinky.reactLeaflet.mod.MarkerEvents with typingsSlinky.reactLeaflet.mod.TileLayerEvents with typingsSlinky.reactLeaflet.mod.PathEvents with typingsSlinky.reactLeaflet.mod.FeatureGroupEvents with typingsSlinky.reactLeaflet.mod.LayersControlEvents
  
  @scala.inline
  def LeafletProvider: slinky.core.ReactComponentClass[
    typingsSlinky.react.mod.ProviderProps[typingsSlinky.reactLeaflet.mod.LeafletContext]
  ] = typingsSlinky.reactLeaflet.mod.^.asInstanceOf[js.Dynamic].selectDynamic("LeafletProvider").asInstanceOf[slinky.core.ReactComponentClass[
    typingsSlinky.react.mod.ProviderProps[typingsSlinky.reactLeaflet.mod.LeafletContext]
  ]]
  
  type Omit[T, K /* <: /* keyof T */ java.lang.String */] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, K]]
  
  type Point = (js.Tuple2[scala.Double, scala.Double]) | typingsSlinky.leaflet.mod.Point_
  
  type RemoveLayerHandler = js.Function1[/* layer */ typingsSlinky.leaflet.mod.Layer, scala.Unit]
  
  @scala.inline
  def useLeaflet(): typingsSlinky.reactLeaflet.mod.LeafletContext = typingsSlinky.reactLeaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useLeaflet")().asInstanceOf[typingsSlinky.reactLeaflet.mod.LeafletContext]
  
  @scala.inline
  def withLeaflet[T /* <: typingsSlinky.reactLeaflet.mod.ContextProps */](WrappedComponent: slinky.core.ReactComponentClass[T]): slinky.core.ReactComponentClass[
    typingsSlinky.reactLeaflet.mod.Omit[T, typingsSlinky.reactLeaflet.reactLeafletStrings.leaflet]
  ] = typingsSlinky.reactLeaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("withLeaflet")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[slinky.core.ReactComponentClass[
    typingsSlinky.reactLeaflet.mod.Omit[T, typingsSlinky.reactLeaflet.reactLeafletStrings.leaflet]
  ]]
}
