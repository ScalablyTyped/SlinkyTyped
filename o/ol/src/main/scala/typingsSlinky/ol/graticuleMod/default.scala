package typingsSlinky.ol.graticuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/Graticule", JSImport.Default)
@js.native
class default () extends Graticule {
  def this(opt_options: Options) = this()
  /* CompleteClass */
  override def getMap(): typingsSlinky.ol.pluggableMapMod.default = js.native
  /* CompleteClass */
  override def getMeridians(): js.Array[typingsSlinky.ol.geomLineStringMod.default] = js.native
  /* CompleteClass */
  override def getParallels(): js.Array[typingsSlinky.ol.geomLineStringMod.default] = js.native
  /* CompleteClass */
  override def setMap(map: typingsSlinky.ol.pluggableMapMod.default): Unit = js.native
}

