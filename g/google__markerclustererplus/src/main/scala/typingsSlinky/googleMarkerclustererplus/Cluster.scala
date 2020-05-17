package typingsSlinky.googleMarkerclustererplus

import org.scalajs.dom.raw.Element
import typingsSlinky.googlemaps.google.maps.LatLng
import typingsSlinky.googlemaps.google.maps.LatLngBounds
import typingsSlinky.googlemaps.google.maps.Map
import typingsSlinky.googlemaps.google.maps.Marker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cluster extends js.Object {
  /**
    * Adds a marker to the cluster.
    *
    * @param marker The marker to be added.
    * @return True if the marker was added.
    * @ignore
    */
  def addMarker(marker: Marker): Boolean = js.native
  /**
    * Calculates the extended bounds of the cluster with the grid.
    */
  def calculateBounds_(): Unit = js.native
  /**
    * Returns the bounds of the cluster.
    *
    * @return the cluster bounds.
    * @ignore
    */
  def getBounds(): LatLngBounds = js.native
  /**
    * Returns the center of the cluster. You can call this from
    * a <code>click</code>, <code>mouseover</code>, or <code>mouseout</code> event handler
    * for the <code>MarkerClusterer</code> object.
    *
    * @return The center of the cluster.
    */
  def getCenter(): LatLng = js.native
  /**
    * Returns the map with which the cluster is associated.
    *
    * @return The map.
    * @ignore
    */
  def getMap(): Map[Element] = js.native
  /**
    * Returns the <code>MarkerClusterer</code> object with which the cluster is associated.
    *
    * @return The associated marker clusterer.
    * @ignore
    */
  def getMarkerClusterer(): MarkerClusterer = js.native
  /**
    * Returns the array of markers managed by the cluster. You can call this from
    * a <code>click</code>, <code>mouseover</code>, or <code>mouseout</code> event handler
    * for the <code>MarkerClusterer</code> object.
    *
    * @return The array of markers in the cluster.
    */
  def getMarkers(): js.Array[Marker] = js.native
  /**
    * Returns the number of markers managed by the cluster. You can call this from
    * a <code>click</code>, <code>mouseover</code>, or <code>mouseout</code> event handler
    * for the <code>MarkerClusterer</code> object.
    *
    * @return The number of markers in the cluster.
    */
  def getSize(): Double = js.native
  /**
    * Determines if a marker has already been added to the cluster.
    *
    * @param marker The marker to check.
    * @return True if the marker has already been added.
    */
  def isMarkerAlreadyAdded_(marker: Marker): Boolean = js.native
  /**
    * Determines if a marker lies within the cluster's bounds.
    *
    * @param marker The marker to check.
    * @return True if the marker lies in the bounds.
    * @ignore
    */
  def isMarkerInClusterBounds(marker: Marker): Boolean = js.native
  /**
    * Removes the cluster from the map.
    *
    * @ignore
    */
  def remove(): Unit = js.native
  /**
    * Updates the cluster icon.
    */
  def updateIcon_(): Unit = js.native
}

object Cluster {
  @scala.inline
  def apply(
    addMarker: Marker => Boolean,
    calculateBounds_ : () => Unit,
    getBounds: () => LatLngBounds,
    getCenter: () => LatLng,
    getMap: () => Map[Element],
    getMarkerClusterer: () => MarkerClusterer,
    getMarkers: () => js.Array[Marker],
    getSize: () => Double,
    isMarkerAlreadyAdded_ : Marker => Boolean,
    isMarkerInClusterBounds: Marker => Boolean,
    remove: () => Unit,
    updateIcon_ : () => Unit
  ): Cluster = {
    val __obj = js.Dynamic.literal(addMarker = js.Any.fromFunction1(addMarker), calculateBounds_ = js.Any.fromFunction0(calculateBounds_), getBounds = js.Any.fromFunction0(getBounds), getCenter = js.Any.fromFunction0(getCenter), getMap = js.Any.fromFunction0(getMap), getMarkerClusterer = js.Any.fromFunction0(getMarkerClusterer), getMarkers = js.Any.fromFunction0(getMarkers), getSize = js.Any.fromFunction0(getSize), isMarkerAlreadyAdded_ = js.Any.fromFunction1(isMarkerAlreadyAdded_), isMarkerInClusterBounds = js.Any.fromFunction1(isMarkerInClusterBounds), remove = js.Any.fromFunction0(remove), updateIcon_ = js.Any.fromFunction0(updateIcon_))
    __obj.asInstanceOf[Cluster]
  }
  @scala.inline
  implicit class ClusterOps[Self <: Cluster] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddMarker(value: Marker => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addMarker")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCalculateBounds_(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculateBounds_")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetBounds(value: () => LatLngBounds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBounds")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCenter(value: () => LatLng): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCenter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMap(value: () => Map[Element]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMap")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMarkerClusterer(value: () => MarkerClusterer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMarkerClusterer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMarkers(value: () => js.Array[Marker]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMarkers")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSize(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsMarkerAlreadyAdded_(value: Marker => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMarkerAlreadyAdded_")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsMarkerInClusterBounds(value: Marker => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMarkerInClusterBounds")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemove(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUpdateIcon_(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateIcon_")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

