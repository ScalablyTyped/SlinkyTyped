package typingsSlinky.ol.styleRegularShapeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegularShape
  extends typingsSlinky.ol.styleImageMod.default {
  var atlasManager_ : typingsSlinky.ol.styleAtlasManagerMod.default = js.native
  var radius_ : Double = js.native
  def getAngle(): Double = js.native
  def getChecksum(): String = js.native
  def getFill(): typingsSlinky.ol.styleFillMod.default = js.native
  def getPoints(): Double = js.native
  def getRadius(): Double = js.native
  def getRadius2(): js.UndefOr[Double] = js.native
  def getStroke(): typingsSlinky.ol.styleStrokeMod.default = js.native
  /* protected */ def render_(): Unit = js.native
  /* protected */ def render_(atlasManager: typingsSlinky.ol.styleAtlasManagerMod.default): Unit = js.native
}

