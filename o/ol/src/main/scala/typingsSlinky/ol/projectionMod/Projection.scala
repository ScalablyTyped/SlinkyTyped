package typingsSlinky.ol.projectionMod

import typingsSlinky.ol.coordinateMod.Coordinate
import typingsSlinky.ol.extentMod.Extent
import typingsSlinky.ol.unitsMod.Units
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Projection extends js.Object {
  
  def canWrapX(): Boolean = js.native
  
  /**
    * Get the axis orientation of this projection.
    * Example values are:
    * enu - the default easting, northing, elevation.
    * neu - northing, easting, up - useful for "lat/long" geographic coordinates,
    *     or south orientated transverse mercator.
    * wnu - westing, northing, up - some planetary coordinate systems have
    *     "west positive" coordinate systems
    */
  def getAxisOrientation(): String = js.native
  
  /**
    * Get the code for this projection, e.g. 'EPSG:4326'.
    */
  def getCode(): String = js.native
  
  def getDefaultTileGrid(): typingsSlinky.ol.tilegridTileGridMod.default = js.native
  
  /**
    * Get the validity extent for this projection.
    */
  def getExtent(): Extent = js.native
  
  /**
    * Get the amount of meters per unit of this projection.  If the projection is
    * not configured with metersPerUnit or a units identifier, the return is
    * undefined.
    */
  def getMetersPerUnit(): js.UndefOr[Double] = js.native
  
  /**
    * Get the custom point resolution function for this projection (if set).
    */
  def getPointResolutionFunc(): js.Function2[/* p0 */ Double, /* p1 */ Coordinate, js.UndefOr[Double]] = js.native
  
  /**
    * Get the units of this projection.
    */
  def getUnits(): Units = js.native
  
  /**
    * Get the world extent for this projection.
    */
  def getWorldExtent(): Extent = js.native
  
  /**
    * Is this projection a global projection which spans the whole world?
    */
  def isGlobal(): Boolean = js.native
  
  def setDefaultTileGrid(tileGrid: typingsSlinky.ol.tilegridTileGridMod.default): Unit = js.native
  
  /**
    * Set the validity extent for this projection.
    */
  def setExtent(extent: Extent): Unit = js.native
  
  /**
    * Set the getPointResolution function (see {@link module:ol/proj~getPointResolution}
    * for this projection.
    */
  def setGetPointResolution(func: js.Function2[/* p0 */ Double, /* p1 */ Coordinate, Double]): Unit = js.native
  
  /**
    * Set if the projection is a global projection which spans the whole world
    */
  def setGlobal(global: Boolean): Unit = js.native
  
  /**
    * Set the world extent for this projection.
    */
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
    getMetersPerUnit: () => js.UndefOr[Double],
    getPointResolutionFunc: () => js.Function2[/* p0 */ Double, /* p1 */ Coordinate, js.UndefOr[Double]],
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCanWrapX(value: () => Boolean): Self = this.set("canWrapX", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAxisOrientation(value: () => String): Self = this.set("getAxisOrientation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCode(value: () => String): Self = this.set("getCode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDefaultTileGrid(value: () => typingsSlinky.ol.tilegridTileGridMod.default): Self = this.set("getDefaultTileGrid", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetExtent(value: () => Extent): Self = this.set("getExtent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMetersPerUnit(value: () => js.UndefOr[Double]): Self = this.set("getMetersPerUnit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPointResolutionFunc(value: () => js.Function2[/* p0 */ Double, /* p1 */ Coordinate, js.UndefOr[Double]]): Self = this.set("getPointResolutionFunc", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUnits(value: () => Units): Self = this.set("getUnits", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetWorldExtent(value: () => Extent): Self = this.set("getWorldExtent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsGlobal(value: () => Boolean): Self = this.set("isGlobal", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetDefaultTileGrid(value: typingsSlinky.ol.tilegridTileGridMod.default => Unit): Self = this.set("setDefaultTileGrid", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetExtent(value: Extent => Unit): Self = this.set("setExtent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetGetPointResolution(value: js.Function2[/* p0 */ Double, /* p1 */ Coordinate, Double] => Unit): Self = this.set("setGetPointResolution", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetGlobal(value: Boolean => Unit): Self = this.set("setGlobal", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetWorldExtent(value: Extent => Unit): Self = this.set("setWorldExtent", js.Any.fromFunction1(value))
  }
}
