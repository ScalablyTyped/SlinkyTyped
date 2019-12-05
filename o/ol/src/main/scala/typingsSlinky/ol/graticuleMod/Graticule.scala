package typingsSlinky.ol.graticuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Graticule extends js.Object {
  def getMap(): typingsSlinky.ol.pluggableMapMod.default
  def getMeridians(): js.Array[typingsSlinky.ol.geomLineStringMod.default]
  def getParallels(): js.Array[typingsSlinky.ol.geomLineStringMod.default]
  def setMap(map: typingsSlinky.ol.pluggableMapMod.default): Unit
}

object Graticule {
  @scala.inline
  def apply(
    getMap: () => typingsSlinky.ol.pluggableMapMod.default,
    getMeridians: () => js.Array[typingsSlinky.ol.geomLineStringMod.default],
    getParallels: () => js.Array[typingsSlinky.ol.geomLineStringMod.default],
    setMap: typingsSlinky.ol.pluggableMapMod.default => Unit
  ): Graticule = {
    val __obj = js.Dynamic.literal(getMap = js.Any.fromFunction0(getMap), getMeridians = js.Any.fromFunction0(getMeridians), getParallels = js.Any.fromFunction0(getParallels), setMap = js.Any.fromFunction1(setMap))
  
    __obj.asInstanceOf[Graticule]
  }
}

