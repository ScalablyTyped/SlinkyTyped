package typingsSlinky.heremaps.H

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object map {
  type AbstractMarker = typingsSlinky.heremaps.H.map.AbstractMarker_
  type ArrowStyle = typingsSlinky.heremaps.H.map.ArrowStyle_
  type Circle = typingsSlinky.heremaps.H.map.Circle_
  /**
    * The class represents data model of the map. It holds list of layers that are rendered by map's RenderEngine.
    * The class listens to 'update' events from layers and dispatches them to the RenderEngine.
    */
  type DataModel = typingsSlinky.heremaps.H.util.OList
  type DomIcon = typingsSlinky.heremaps.H.map.DomIcon_
  /**
    * A marker with a visual representation in the form of a full styleable and scripteable DOM element. DomMarker are predestinated if small amounts of markers with dynamic styled and/or
    * scripted icons should be displayed om the map (e.g. animated interactive SVG).
    */
  type DomMarker = typingsSlinky.heremaps.H.map.AbstractMarker
  type Group = typingsSlinky.heremaps.H.map.Group_
  type Icon = typingsSlinky.heremaps.H.map.Icon_
  type Imprint = typingsSlinky.heremaps.H.map.Imprint_
  /**
    * A marker with a visual representation in the form of a bitmap icon. Marker are predestinated if large amounts of markers with static icons should be displayed om the map.
    */
  type Marker = typingsSlinky.heremaps.H.map.AbstractMarker
  type Object = typingsSlinky.heremaps.H.map.Object_
  type Overlay = typingsSlinky.heremaps.H.map.Overlay_
  type Polygon = typingsSlinky.heremaps.H.map.Polygon_
  type Polyline = typingsSlinky.heremaps.H.map.Polyline_
  type Spatial = typingsSlinky.heremaps.H.map.Spatial_
  type SpatialStyle = typingsSlinky.heremaps.H.map.SpatialStyle_
  type ViewModel = typingsSlinky.heremaps.H.map.ViewModel_
  type ViewPort = typingsSlinky.heremaps.H.map.ViewPort_
}
