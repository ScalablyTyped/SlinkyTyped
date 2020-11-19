package typingsSlinky.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/geom/GeometryLayout", JSImport.Namespace)
@js.native
object geometryLayoutMod extends js.Object {
  
  @js.native
  sealed trait GeometryLayout extends js.Object
  @js.native
  object GeometryLayout extends js.Object {
    
    @js.native
    sealed trait XY extends GeometryLayout
    
    @js.native
    sealed trait XYM extends GeometryLayout
    
    @js.native
    sealed trait XYZ extends GeometryLayout
    
    @js.native
    sealed trait XYZM extends GeometryLayout
  }
  
  @js.native
  object default extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[GeometryLayout with String] = js.native
    
    /* "XY" */ val XY: typingsSlinky.ol.geometryLayoutMod.GeometryLayout.XY with String = js.native
    
    /* "XYM" */ val XYM: typingsSlinky.ol.geometryLayoutMod.GeometryLayout.XYM with String = js.native
    
    /* "XYZ" */ val XYZ: typingsSlinky.ol.geometryLayoutMod.GeometryLayout.XYZ with String = js.native
    
    /* "XYZM" */ val XYZM: typingsSlinky.ol.geometryLayoutMod.GeometryLayout.XYZM with String = js.native
  }
}
