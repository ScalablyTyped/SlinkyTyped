package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.mathVectorMod.Vector3
import typingsSlinky.babylonjs.meshMod.Mesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object capsuleBuilderMod {
  
  @JSImport("babylonjs/Meshes/Builders/capsuleBuilder", "CapsuleBuilder")
  @js.native
  class CapsuleBuilder () extends StObject
  /* static members */
  object CapsuleBuilder {
    
    @JSImport("babylonjs/Meshes/Builders/capsuleBuilder", "CapsuleBuilder.CreateCapsule")
    @js.native
    def CreateCapsule(name: String, options: js.UndefOr[scala.Nothing], scene: js.Any): Mesh = js.native
    /**
      * Creates a capsule or a pill mesh
      * @param name defines the name of the mesh
      * @param options The constructors options.
      * @param scene The scene the mesh is scoped to.
      * @returns Capsule Mesh
      */
    @JSImport("babylonjs/Meshes/Builders/capsuleBuilder", "CapsuleBuilder.CreateCapsule")
    @js.native
    def CreateCapsule(name: String, options: ICreateCapsuleOptions, scene: js.Any): Mesh = js.native
  }
  
  @js.native
  trait ICreateCapsuleOptions extends StObject {
    
    /** Overwrite for the bottom capSubdivisions. */
    var bottomCapSubdivisions: js.UndefOr[Double] = js.native
    
    /** Number of sub segments on the cap sections of the capsule running parallel to orientation. */
    var capSubdivisions: Double = js.native
    
    /** Height or Length of the capsule. */
    var height: Double = js.native
    
    /** The Orientation of the capsule.  Default : Vector3.Up() */
    var orientation: js.UndefOr[Vector3] = js.native
    
    /** Radius of the capsule. */
    var radius: Double = js.native
    
    /** Overwrite for the bottom radius. */
    var radiusBottom: js.UndefOr[Double] = js.native
    
    /** Overwrite for the top radius. */
    var radiusTop: js.UndefOr[Double] = js.native
    
    /** Number of sub segments on the tube section of the capsule running parallel to orientation. */
    var subdivisions: Double = js.native
    
    /** Number of cylindrical segments on the capsule. */
    var tessellation: Double = js.native
    
    /** Overwrite for the top capSubdivisions. */
    var topCapSubdivisions: js.UndefOr[Double] = js.native
  }
  object ICreateCapsuleOptions {
    
    @scala.inline
    def apply(
      capSubdivisions: Double,
      height: Double,
      radius: Double,
      subdivisions: Double,
      tessellation: Double
    ): ICreateCapsuleOptions = {
      val __obj = js.Dynamic.literal(capSubdivisions = capSubdivisions.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], subdivisions = subdivisions.asInstanceOf[js.Any], tessellation = tessellation.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICreateCapsuleOptions]
    }
    
    @scala.inline
    implicit class ICreateCapsuleOptionsMutableBuilder[Self <: ICreateCapsuleOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottomCapSubdivisions(value: Double): Self = StObject.set(x, "bottomCapSubdivisions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomCapSubdivisionsUndefined: Self = StObject.set(x, "bottomCapSubdivisions", js.undefined)
      
      @scala.inline
      def setCapSubdivisions(value: Double): Self = StObject.set(x, "capSubdivisions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientation(value: Vector3): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      @scala.inline
      def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadiusBottom(value: Double): Self = StObject.set(x, "radiusBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadiusBottomUndefined: Self = StObject.set(x, "radiusBottom", js.undefined)
      
      @scala.inline
      def setRadiusTop(value: Double): Self = StObject.set(x, "radiusTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadiusTopUndefined: Self = StObject.set(x, "radiusTop", js.undefined)
      
      @scala.inline
      def setSubdivisions(value: Double): Self = StObject.set(x, "subdivisions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTessellation(value: Double): Self = StObject.set(x, "tessellation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopCapSubdivisions(value: Double): Self = StObject.set(x, "topCapSubdivisions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopCapSubdivisionsUndefined: Self = StObject.set(x, "topCapSubdivisions", js.undefined)
    }
  }
}
