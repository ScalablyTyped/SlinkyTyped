package typingsSlinky.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KmlLatLonBox extends KmlObject {
  /**
    * Specifies the longitude of the east edge of the bounding box, in decimal degrees from -180 to 180.
    * (For overlays that overlap the meridian of 180 degrees longitude, values can extend beyond that range.)
    */
  def getEast(): Double = js.native
  /**
    * Specifies the latitude of the north edge of the bounding box, in decimal degrees from -90 to 90.
    */
  def getNorth(): Double = js.native
  /**
    * Specifies a rotation of the overlay about its center, in degrees.
    * Values can be +/-180. The default is 0 (north).
    * Rotations are specified in a counterclockwise direction.
    */
  def getRotation(): Double = js.native
  /**
    * Specifies the latitude of the south edge of the bounding box, in decimal degrees from -90 to 90.
    */
  def getSouth(): Double = js.native
  /**
    * Specifies the longitude of the west edge of the bounding box, in decimal degrees from -180 to 180.
    * (For overlays that overlap the meridian of 180 degrees longitude, values can extend beyond that range.)
    */
  def getWest(): Double = js.native
  /**
    * Sets the north, south, east, and west edges of the bounding box, as well as the rotation of the overlay.
    */
  def setBox(north: Double, south: Double, east: Double, west: Double, rotation: Double): Unit = js.native
  /**
    * Specifies the longitude of the east edge of the bounding box, in decimal degrees from -180 to 180.
    * (For overlays that overlap the meridian of 180 degrees longitude, values can extend beyond that range.)
    */
  def setEast(east: Double): Unit = js.native
  /**
    * Specifies the latitude of the north edge of the bounding box, in decimal degrees from -90 to 90.
    */
  def setNorth(north: Double): Unit = js.native
  /**
    * Specifies a rotation of the overlay about its center, in degrees.
    * Values can be +/-180. The default is 0 (north).
    * Rotations are specified in a counterclockwise direction.
    */
  def setRotation(rotation: Double): Unit = js.native
  /**
    * Specifies the latitude of the south edge of the bounding box, in decimal degrees from -90 to 90.
    */
  def setSouth(south: Double): Unit = js.native
  /**
    * Specifies the longitude of the west edge of the bounding box, in decimal degrees from -180 to 180.
    * (For overlays that overlap the meridian of 180 degrees longitude, values can extend beyond that range.)
    */
  def setWest(west: Double): Unit = js.native
}

object KmlLatLonBox {
  @scala.inline
  def apply(
    click: KmlMouseEvent => Unit,
    dblclick: KmlMouseEvent => Unit,
    equals: KmlObject => Boolean,
    getEast: () => Double,
    getId: () => String,
    getNorth: () => Double,
    getOwnerDocument: () => KmlDocument,
    getParentNode: () => KmlObject,
    getRotation: () => Double,
    getSouth: () => Double,
    getType: () => String,
    getUrl: () => String,
    getWest: () => Double,
    mousedown: KmlMouseEvent => Unit,
    mousemove: KmlMouseEvent => Unit,
    mouseout: KmlMouseEvent => Unit,
    mouseover: KmlMouseEvent => Unit,
    mouseup: KmlMouseEvent => Unit,
    release: () => Unit,
    setBox: (Double, Double, Double, Double, Double) => Unit,
    setEast: Double => Unit,
    setNorth: Double => Unit,
    setRotation: Double => Unit,
    setSouth: Double => Unit,
    setWest: Double => Unit
  ): KmlLatLonBox = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1(click), dblclick = js.Any.fromFunction1(dblclick), equals = js.Any.fromFunction1(equals), getEast = js.Any.fromFunction0(getEast), getId = js.Any.fromFunction0(getId), getNorth = js.Any.fromFunction0(getNorth), getOwnerDocument = js.Any.fromFunction0(getOwnerDocument), getParentNode = js.Any.fromFunction0(getParentNode), getRotation = js.Any.fromFunction0(getRotation), getSouth = js.Any.fromFunction0(getSouth), getType = js.Any.fromFunction0(getType), getUrl = js.Any.fromFunction0(getUrl), getWest = js.Any.fromFunction0(getWest), mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), mouseout = js.Any.fromFunction1(mouseout), mouseover = js.Any.fromFunction1(mouseover), mouseup = js.Any.fromFunction1(mouseup), release = js.Any.fromFunction0(release), setBox = js.Any.fromFunction5(setBox), setEast = js.Any.fromFunction1(setEast), setNorth = js.Any.fromFunction1(setNorth), setRotation = js.Any.fromFunction1(setRotation), setSouth = js.Any.fromFunction1(setSouth), setWest = js.Any.fromFunction1(setWest))
    __obj.asInstanceOf[KmlLatLonBox]
  }
  @scala.inline
  implicit class KmlLatLonBoxOps[Self <: KmlLatLonBox] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetEast(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEast")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetNorth(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNorth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRotation(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRotation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSouth(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSouth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetWest(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetBox(value: (Double, Double, Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBox")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withSetEast(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEast")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetNorth(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setNorth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetRotation(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRotation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSouth(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSouth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetWest(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setWest")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

