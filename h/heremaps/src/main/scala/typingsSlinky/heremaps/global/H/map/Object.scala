package typingsSlinky.heremaps.global.H.map

import typingsSlinky.heremaps.H.map.Object.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class represents the abstract base class for map objects such as polylines, polygons, markers, groups etc.
  */
@JSGlobal("H.map.Object")
@js.native
/**
  * Constructor
  * @param opt_options {H.map.Object.Options=} - The values to initialize this object
  */
class Object ()
  extends typingsSlinky.heremaps.H.map.Object {
  def this(opt_options: Options) = this()
}
object Object {
  
  /**
    * The major types of map objects
    */
  @JSGlobal("H.map.Object.Type")
  @js.native
  object Type extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.heremaps.H.map.Object.Type with Double] = js.native
    
    /* 0 */ val ANY: typingsSlinky.heremaps.H.map.Object.Type.ANY with Double = js.native
    
    /* 4 */ val DOM_MARKER: typingsSlinky.heremaps.H.map.Object.Type.DOM_MARKER with Double = js.native
    
    /* 5 */ val GROUP: typingsSlinky.heremaps.H.map.Object.Type.GROUP with Double = js.native
    
    /* 3 */ val MARKER: typingsSlinky.heremaps.H.map.Object.Type.MARKER with Double = js.native
    
    /* 1 */ val OVERLAY: typingsSlinky.heremaps.H.map.Object.Type.OVERLAY with Double = js.native
    
    /* 2 */ val SPATIAL: typingsSlinky.heremaps.H.map.Object.Type.SPATIAL with Double = js.native
  }
  
  /**
    * Compares two objects regarding their z-order, useful to sort a list of objects via Array's sort() method
    * @param first {H.map.Object} - The first object to compare
    * @param second {H.map.Object} - The second object to compare
    * @returns {number} - If less then 0 the first object has a lower z-order. If equal 0 booth objects have the same z-order. If greater then 0 the first object has a higher z-order.
    */
  /* static member */
  @JSGlobal("H.map.Object.compareZOrder")
  @js.native
  def compareZOrder(first: typingsSlinky.heremaps.H.map.Object, second: typingsSlinky.heremaps.H.map.Object): Double = js.native
}
