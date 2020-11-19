package typingsSlinky.physijs

import typingsSlinky.physijs.Physijs.SceneParameters
import typingsSlinky.three.mod.Geometry
import typingsSlinky.three.mod.Material
import typingsSlinky.three.mod.Object3D
import typingsSlinky.three.mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object Physijs extends js.Object {
    
    def createMaterial(material: Material): typingsSlinky.physijs.Physijs.Material = js.native
    def createMaterial(material: Material, friction: js.UndefOr[scala.Nothing], restitution: Double): typingsSlinky.physijs.Physijs.Material = js.native
    def createMaterial(material: Material, friction: Double): typingsSlinky.physijs.Physijs.Material = js.native
    def createMaterial(material: Material, friction: Double, restitution: Double): typingsSlinky.physijs.Physijs.Material = js.native
    
    def noConflict(): js.Object = js.native
    
    @js.native
    class BoxMesh protected ()
      extends typingsSlinky.physijs.Physijs.Mesh {
      def this(geometry: Geometry, material: Material) = this()
      def this(geometry: Geometry, material: Material, mass: Double) = this()
    }
    
    @js.native
    class CapsuleMesh protected ()
      extends typingsSlinky.physijs.Physijs.Mesh {
      def this(geometry: Geometry, material: Material) = this()
      def this(geometry: Geometry, material: Material, mass: Double) = this()
    }
    
    @js.native
    class ConcaveMesh protected ()
      extends typingsSlinky.physijs.Physijs.Mesh {
      def this(geometry: Geometry, material: Material) = this()
      def this(geometry: Geometry, material: Material, mass: Double) = this()
    }
    
    @js.native
    class ConeMesh protected ()
      extends typingsSlinky.physijs.Physijs.Mesh {
      def this(geometry: Geometry, material: Material) = this()
      def this(geometry: Geometry, material: Material, mass: Double) = this()
    }
    
    @js.native
    class ConeTwistConstraint protected ()
      extends typingsSlinky.physijs.Physijs.ConeTwistConstraint {
      def this(objecta: Object3D, objectb: Object3D, position: Vector3) = this()
    }
    
    @js.native
    class ConvexMesh protected ()
      extends typingsSlinky.physijs.Physijs.Mesh {
      def this(geometry: Geometry, material: Material) = this()
      def this(geometry: Geometry, material: Material, mass: Double) = this()
    }
    
    @js.native
    class CylinderMesh protected ()
      extends typingsSlinky.physijs.Physijs.Mesh {
      def this(geometry: Geometry, material: Material) = this()
      def this(geometry: Geometry, material: Material, mass: Double) = this()
    }
    
    @js.native
    class DOFConstraint protected ()
      extends typingsSlinky.physijs.Physijs.DOFConstraint {
      def this(objecta: Object3D, objectb: Object3D) = this()
      def this(objecta: Object3D, objectb: Object3D, position: Vector3) = this()
    }
    
    @js.native
    class HeightfieldMesh protected ()
      extends typingsSlinky.physijs.Physijs.Mesh {
      def this(geometry: Geometry, material: Material) = this()
      def this(geometry: Geometry, material: Material, mass: Double) = this()
      def this(geometry: Geometry, material: Material, mass: js.UndefOr[scala.Nothing], xdiv: Double) = this()
      def this(geometry: Geometry, material: Material, mass: Double, xdiv: Double) = this()
      def this(
        geometry: Geometry,
        material: Material,
        mass: js.UndefOr[scala.Nothing],
        xdiv: js.UndefOr[scala.Nothing],
        ydiv: Double
      ) = this()
      def this(
        geometry: Geometry,
        material: Material,
        mass: js.UndefOr[scala.Nothing],
        xdiv: Double,
        ydiv: Double
      ) = this()
      def this(
        geometry: Geometry,
        material: Material,
        mass: Double,
        xdiv: js.UndefOr[scala.Nothing],
        ydiv: Double
      ) = this()
      def this(geometry: Geometry, material: Material, mass: Double, xdiv: Double, ydiv: Double) = this()
    }
    
    @js.native
    class HingeConstraint protected ()
      extends typingsSlinky.physijs.Physijs.HingeConstraint {
      def this(objecta: Object3D, objectb: Object3D, position: Vector3) = this()
      def this(objecta: Object3D, objectb: Object3D, position: Vector3, axis: Vector3) = this()
    }
    
    @js.native
    class Mesh protected ()
      extends typingsSlinky.physijs.Physijs.Mesh {
      def this(geometry: Geometry) = this()
      def this(geometry: Geometry, material: Material) = this()
      def this(geometry: Geometry, material: js.UndefOr[scala.Nothing], mass: Double) = this()
      def this(geometry: Geometry, material: Material, mass: Double) = this()
    }
    
    @js.native
    class PlaneMesh protected ()
      extends typingsSlinky.physijs.Physijs.Mesh {
      def this(geometry: Geometry, material: Material) = this()
      def this(geometry: Geometry, material: Material, mass: Double) = this()
    }
    
    @js.native
    class PointConstraint protected ()
      extends typingsSlinky.physijs.Physijs.PointConstraint {
      def this(objecta: Object3D, objectb: Object3D) = this()
      def this(objecta: Object3D, objectb: Object3D, position: Vector3) = this()
    }
    
    @js.native
    class Scene ()
      extends typingsSlinky.physijs.Physijs.Scene {
      def this(param: SceneParameters) = this()
    }
    
    @js.native
    class SliderConstraint protected ()
      extends typingsSlinky.physijs.Physijs.SliderConstraint {
      def this(objecta: Object3D, objectb: Object3D, position: Vector3) = this()
      def this(objecta: Object3D, objectb: Object3D, position: Vector3, axis: Vector3) = this()
    }
    
    @js.native
    class SphereMesh protected ()
      extends typingsSlinky.physijs.Physijs.Mesh {
      def this(geometry: Geometry, material: Material) = this()
      def this(geometry: Geometry, material: Material, mass: Double) = this()
    }
    
    @js.native
    class Vehicle protected ()
      extends typingsSlinky.physijs.Physijs.Vehicle {
      def this(mesh: typingsSlinky.physijs.Physijs.Mesh) = this()
      def this(mesh: typingsSlinky.physijs.Physijs.Mesh, tuning: typingsSlinky.physijs.Physijs.VehicleTuning) = this()
    }
    
    @js.native
    class VehicleTuning protected ()
      extends typingsSlinky.physijs.Physijs.VehicleTuning {
      def this(
        suspension_stiffness: js.UndefOr[Double],
        suspension_compression: js.UndefOr[Double],
        suspension_damping: js.UndefOr[Double],
        max_suspension_travel: js.UndefOr[Double],
        friction_slip: js.UndefOr[Double],
        max_suspension_force: js.UndefOr[Double]
      ) = this()
    }
    
    @js.native
    object scripts extends js.Object {
      
      var ammo: String = js.native
      
      var worker: String = js.native
    }
  }
}
