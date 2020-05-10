package typingsSlinky.ol.projectionMod

import typingsSlinky.ol.coordinateMod.Coordinate
import typingsSlinky.ol.extentMod.Extent
import typingsSlinky.ol.unitsMod.Units
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Projection extends js.Object {
  def canWrapX(): Boolean = js.native
  def getAxisOrientation(): String = js.native
  def getCode(): String = js.native
  def getDefaultTileGrid(): typingsSlinky.ol.tilegridTileGridMod.default = js.native
  def getExtent(): Extent = js.native
  def getMetersPerUnit(): Double = js.native
  def getPointResolutionFunc(): js.Function2[/* p0 */ Double, /* p1 */ Coordinate, Double] = js.native
  def getUnits(): Units = js.native
  def getWorldExtent(): Extent = js.native
  def isGlobal(): Boolean = js.native
  def setDefaultTileGrid(tileGrid: typingsSlinky.ol.tilegridTileGridMod.default): Unit = js.native
  def setExtent(extent: Extent): Unit = js.native
  def setGetPointResolution(func: js.Function2[/* p0 */ Double, /* p1 */ Coordinate, Double]): Unit = js.native
  def setGlobal(global: Boolean): Unit = js.native
  def setWorldExtent(worldExtent: Extent): Unit = js.native
}

object Projection {
  @scala.inline
  def apply(
    canWrapX: () => Boolean,
    getAxisOrientation: () => String,
    getCode: () => String,
    getDefaultTileGrid: () => typingsSlinky.ol.tilegridTileGridMod.default,
    getExtent: () => Extent,
    getMetersPerUnit: () => Double,
    getPointResolutionFunc: () => js.Function2[/* p0 */ Double, /* p1 */ Coordinate, Double],
    getUnits: () => Units,
    getWorldExtent: () => Extent,
    isGlobal: () => Boolean,
    setDefaultTileGrid: typingsSlinky.ol.tilegridTileGridMod.default => Unit,
    setExtent: Extent => Unit,
    setGetPointResolution: js.Function2[/* p0 */ Double, /* p1 */ Coordinate, Double] => Unit,
    setGlobal: Boolean => Unit,
    setWorldExtent: Extent => Unit
  ): Projection = {
    val __obj = js.Dynamic.literal(canWrapX = js.Any.fromFunction0(canWrapX), getAxisOrientation = js.Any.fromFunction0(getAxisOrientation), getCode = js.Any.fromFunction0(getCode), getDefaultTileGrid = js.Any.fromFunction0(getDefaultTileGrid), getExtent = js.Any.fromFunction0(getExtent), getMetersPerUnit = js.Any.fromFunction0(getMetersPerUnit), getPointResolutionFunc = js.Any.fromFunction0(getPointResolutionFunc), getUnits = js.Any.fromFunction0(getUnits), getWorldExtent = js.Any.fromFunction0(getWorldExtent), isGlobal = js.Any.fromFunction0(isGlobal), setDefaultTileGrid = js.Any.fromFunction1(setDefaultTileGrid), setExtent = js.Any.fromFunction1(setExtent), setGetPointResolution = js.Any.fromFunction1(setGetPointResolution), setGlobal = js.Any.fromFunction1(setGlobal), setWorldExtent = js.Any.fromFunction1(setWorldExtent))
    __obj.asInstanceOf[Projection]
  }
  @scala.inline
  implicit class ProjectionOps[Self <: Projection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanWrapX(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canWrapX")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAxisOrientation(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAxisOrientation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCode(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDefaultTileGrid(value: () => typingsSlinky.ol.tilegridTileGridMod.default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefaultTileGrid")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetExtent(value: () => Extent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getExtent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMetersPerUnit(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMetersPerUnit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPointResolutionFunc(value: () => js.Function2[/* p0 */ Double, /* p1 */ Coordinate, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPointResolutionFunc")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetUnits(value: () => Units): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUnits")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetWorldExtent(value: () => Extent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWorldExtent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsGlobal(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isGlobal")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetDefaultTileGrid(value: typingsSlinky.ol.tilegridTileGridMod.default => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDefaultTileGrid")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetExtent(value: Extent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setExtent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetGetPointResolution(value: js.Function2[/* p0 */ Double, /* p1 */ Coordinate, Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setGetPointResolution")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetGlobal(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setGlobal")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetWorldExtent(value: Extent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setWorldExtent")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

