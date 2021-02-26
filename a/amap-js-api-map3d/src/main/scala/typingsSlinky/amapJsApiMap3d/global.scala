package typingsSlinky.amapJsApiMap3d

import typingsSlinky.amapJsApiMap3d.AMap.Object3D.MeshLine.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object AMap {
    
    @JSGlobal("AMap.Geometry3D")
    @js.native
    abstract class Geometry3D ()
      extends typingsSlinky.amapJsApiMap3d.AMap.Geometry3D
    object Geometry3D {
      
      @JSGlobal("AMap.Geometry3D.Line")
      @js.native
      class Line ()
        extends typingsSlinky.amapJsApiMap3d.AMap.Geometry3D.Line
      
      @JSGlobal("AMap.Geometry3D.Mesh")
      @js.native
      class Mesh ()
        extends typingsSlinky.amapJsApiMap3d.AMap.Geometry3D.Mesh
      
      @JSGlobal("AMap.Geometry3D.Points")
      @js.native
      class Points ()
        extends typingsSlinky.amapJsApiMap3d.AMap.Geometry3D.Points
    }
    
    object Lights {
      
      @JSGlobal("AMap.Lights.AmbientLight")
      @js.native
      class AmbientLight protected ()
        extends typingsSlinky.amapJsApiMap3d.AMap.Lights.AmbientLight {
        def this(color: js.Tuple3[Double, Double, Double], intensity: Double) = this()
      }
      
      @JSGlobal("AMap.Lights.DirectionLight")
      @js.native
      class DirectionLight protected ()
        extends typingsSlinky.amapJsApiMap3d.AMap.Lights.DirectionLight {
        def this(
          direction: js.Tuple3[Double, Double, Double],
          color: js.Tuple3[Double, Double, Double],
          intensity: Double
        ) = this()
      }
    }
    
    @JSGlobal("AMap.Object3D")
    @js.native
    class Object3D ()
      extends typingsSlinky.amapJsApiMap3d.AMap.Object3D
    object Object3D {
      
      @JSGlobal("AMap.Object3D.Line")
      @js.native
      class Line ()
        extends typingsSlinky.amapJsApiMap3d.AMap.Object3D.Line
      
      @JSGlobal("AMap.Object3D.Mesh")
      @js.native
      class Mesh ()
        extends typingsSlinky.amapJsApiMap3d.AMap.Object3D.Mesh
      
      @JSGlobal("AMap.Object3D.MeshAcceptLights")
      @js.native
      class MeshAcceptLights ()
        extends typingsSlinky.amapJsApiMap3d.AMap.Object3D.MeshAcceptLights
      
      // inherit from WideLine
      @JSGlobal("AMap.Object3D.MeshLine")
      @js.native
      class MeshLine protected ()
        extends typingsSlinky.amapJsApiMap3d.AMap.Object3D.MeshLine {
        def this(options: Options) = this()
      }
      
      @JSGlobal("AMap.Object3D.Points")
      @js.native
      class Points ()
        extends typingsSlinky.amapJsApiMap3d.AMap.Object3D.Points
      
      @JSGlobal("AMap.Object3D.Prism")
      @js.native
      class Prism protected ()
        extends typingsSlinky.amapJsApiMap3d.AMap.Object3D.MeshAcceptLights {
        def this(options: typingsSlinky.amapJsApiMap3d.AMap.Object3D.Prism.Options) = this()
      }
      
      @JSGlobal("AMap.Object3D.RoundPoints")
      @js.native
      class RoundPoints ()
        extends typingsSlinky.amapJsApiMap3d.AMap.Object3D.RoundPoints
      
      @JSGlobal("AMap.Object3D.ThinLine")
      @js.native
      class ThinLine protected ()
        extends typingsSlinky.amapJsApiMap3d.AMap.Object3D.Line {
        def this(options: typingsSlinky.amapJsApiMap3d.AMap.Object3D.ThinLine.Options) = this()
      }
      
      @JSGlobal("AMap.Object3D.Wall")
      @js.native
      class Wall ()
        extends typingsSlinky.amapJsApiMap3d.AMap.Object3D.MeshAcceptLights
    }
    
    @JSGlobal("AMap.Object3DGroup")
    @js.native
    class Object3DGroup[C /* <: typingsSlinky.amapJsApiMap3d.AMap.Object3D */] ()
      extends typingsSlinky.amapJsApiMap3d.AMap.Object3DGroup[C]
    
    @JSGlobal("AMap.Object3DLayer")
    @js.native
    class Object3DLayer ()
      extends typingsSlinky.amapJsApiMap3d.AMap.Object3DLayer {
      def this(options: typingsSlinky.amapJsApiMap3d.AMap.Object3DLayer.Options) = this()
    }
    
    @JSGlobal("AMap.Vector3")
    @js.native
    class Vector3 protected ()
      extends typingsSlinky.amapJsApiMap3d.AMap.Vector3 {
      def this(elements: js.Tuple3[Double, Double, Double]) = this()
      def this(elements: typingsSlinky.amapJsApiMap3d.AMap.Vector3) = this()
    }
  }
}
