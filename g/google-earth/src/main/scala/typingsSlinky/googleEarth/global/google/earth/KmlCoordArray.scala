package typingsSlinky.googleEarth.global.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.KmlCoordArray")
@js.native
class KmlCoordArray ()
  extends typingsSlinky.googleEarth.google.earth.KmlCoordArray {
  /**
    * Clears all of the elements in the array
    */
  /* CompleteClass */
  override def clear(): Unit = js.native
  /**
    * Returns the coordinates at the given index.
    */
  /* CompleteClass */
  override def get(index: Double): typingsSlinky.googleEarth.google.earth.KmlCoord = js.native
  /**
    * Specifies the length of the index array.
    */
  /* CompleteClass */
  override def getLength(): Double = js.native
  /**
    * Deletes the last element of an array, decrements the array length, and returns the value that is removed.
    */
  /* CompleteClass */
  override def pop(): typingsSlinky.googleEarth.google.earth.KmlCoord = js.native
  /**
    * Appends one or more new elements to the end of an array and returns the new length of the array.
    */
  /* CompleteClass */
  override def push(coordOrList: typingsSlinky.googleEarth.google.earth.KmlCoord): Unit = js.native
  /**
    * Appends one or more new elements to the end of an array and returns the new length of the array.
    */
  /* CompleteClass */
  override def pushLatLngAlt(latitude: Double, longitude: Double, altitude: Double): Unit = js.native
  /**
    * Reverses the order of the elements in the array.
    */
  /* CompleteClass */
  override def reverse(): Unit = js.native
  /**
    * Sets the coordinates at the given index..
    */
  /* CompleteClass */
  override def set(index: Double, coord: typingsSlinky.googleEarth.google.earth.KmlCoord): Unit = js.native
  /**
    * Sets the latitude, longitude, and altitude.
    */
  /* CompleteClass */
  override def setLatLngAlt(index: Double, latitude: Double, longitude: Double, altitude: Double): Unit = js.native
  /**
    * Removes and returns the first element of the array.
    */
  /* CompleteClass */
  override def shift(): typingsSlinky.googleEarth.google.earth.KmlCoord = js.native
  /**
    * Adds an element or elements to the beginning of an array.
    */
  /* CompleteClass */
  override def unshift(coordOrList: typingsSlinky.googleEarth.google.earth.KmlCoord): Double = js.native
  /**
    * Adds an element or elements to the beginning of an array.
    */
  /* CompleteClass */
  override def unshiftLatLngAlt(latitude: Double, longitude: Double, altitude: Double): Unit = js.native
}

