package typingsSlinky.imageQ

import typingsSlinky.imageQ.abstractDistanceCalculatorMod.AbstractDistanceCalculator
import typingsSlinky.imageQ.pointContainerMod.PointContainer
import typingsSlinky.imageQ.pointMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsPaletteMod {
  
  @JSImport("image-q/dist/utils/palette", "Palette")
  @js.native
  class Palette () extends StObject {
    
    var _i32idx: js.Any = js.native
    
    /* private */ def _nearestPointFromCache(key: js.Any): js.Any = js.native
    
    val _pointArray: js.Any = js.native
    
    val _pointContainer: js.Any = js.native
    
    def add(color: Point): Unit = js.native
    
    def getNearestColor(colorDistanceCalculator: AbstractDistanceCalculator, color: Point): Point = js.native
    
    /* private */ def getNearestIndex(colorDistanceCalculator: js.Any, point: js.Any): js.Any = js.native
    
    def getPointContainer(): PointContainer = js.native
    
    def has(color: Point): Boolean = js.native
    
    def sort(): Unit = js.native
  }
  
  @JSImport("image-q/dist/utils/palette", "hueGroup")
  @js.native
  def hueGroup(hue: Double, segmentsNumber: Double): Double = js.native
}
