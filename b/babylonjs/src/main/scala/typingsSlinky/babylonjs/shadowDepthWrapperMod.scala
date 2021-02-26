package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.effectMod.Effect
import typingsSlinky.babylonjs.materialMod.Material
import typingsSlinky.babylonjs.sceneMod.Scene
import typingsSlinky.babylonjs.shadowGeneratorMod.ShadowGenerator
import typingsSlinky.babylonjs.subMeshMod.SubMesh
import typingsSlinky.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shadowDepthWrapperMod {
  
  @JSImport("babylonjs/Materials/shadowDepthWrapper", "ShadowDepthWrapper")
  @js.native
  class ShadowDepthWrapper protected () extends StObject {
    /**
      * Instantiate a new shadow depth wrapper.
      * It works by injecting some specific code in the vertex/fragment shaders of the base material and is used by a shadow generator to
      * generate the shadow depth map. For more information, please refer to the documentation:
      * https://doc.babylonjs.com/babylon101/shadows
      * @param baseMaterial Material to wrap
      * @param scene Define the scene the material belongs to
      * @param options Options used to create the wrapper
      */
    def this(baseMaterial: Material, scene: Scene) = this()
    def this(baseMaterial: Material, scene: Scene, options: IIOptionShadowDepthMaterial) = this()
    
    var _baseMaterial: js.Any = js.native
    
    var _makeEffect: js.Any = js.native
    
    /** @hidden */
    var _matriceNames: js.Any = js.native
    
    var _meshes: js.Any = js.native
    
    var _onEffectCreatedObserver: js.Any = js.native
    
    var _options: js.Any = js.native
    
    var _scene: js.Any = js.native
    
    var _subMeshToDepthEffect: js.Any = js.native
    
    var _subMeshToEffect: js.Any = js.native
    
    /** Gets the base material the wrapper is built upon */
    def baseMaterial: Material = js.native
    
    /**
      * Disposes the resources
      */
    def dispose(): Unit = js.native
    
    /**
      * Gets the effect to use to generate the depth map
      * @param subMesh subMesh to get the effect for
      * @param shadowGenerator shadow generator to get the effect for
      * @returns the effect to use to generate the depth map for the subMesh + shadow generator specified
      */
    def getEffect(subMesh: Nullable[SubMesh], shadowGenerator: ShadowGenerator): Nullable[Effect] = js.native
    
    /**
      * Specifies that the submesh is ready to be used for depth rendering
      * @param subMesh submesh to check
      * @param defines the list of defines to take into account when checking the effect
      * @param shadowGenerator combined with subMesh, it defines the effect to check
      * @param useInstances specifies that instances should be used
      * @returns a boolean indicating that the submesh is ready or not
      */
    def isReadyForSubMesh(
      subMesh: SubMesh,
      defines: js.Array[String],
      shadowGenerator: ShadowGenerator,
      useInstances: Boolean
    ): Boolean = js.native
    
    /** Gets the standalone status of the wrapper */
    def standalone: Boolean = js.native
  }
  
  @js.native
  trait IIOptionShadowDepthMaterial extends StObject {
    
    /** Variables in the vertex shader code that need to have their names remapped.
      * The format is: ["var_name", "var_remapped_name", "var_name", "var_remapped_name", ...]
      * "var_name" should be either: worldPos or vNormalW
      * So, if the variable holding the world position in your vertex shader is not named worldPos, you must tell the system
      * the name to use instead by using: ["worldPos", "myWorldPosVar"] assuming the variable is named myWorldPosVar in your code.
      * If the normal must also be remapped: ["worldPos", "myWorldPosVar", "vNormalW", "myWorldNormal"]
      */
    var remappedVariables: js.UndefOr[js.Array[String]] = js.native
    
    /** Set standalone to true if the base material wrapped by ShadowDepthMaterial is not used for a regular object but for depth shadow generation only */
    var standalone: js.UndefOr[Boolean] = js.native
  }
  object IIOptionShadowDepthMaterial {
    
    @scala.inline
    def apply(): IIOptionShadowDepthMaterial = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IIOptionShadowDepthMaterial]
    }
    
    @scala.inline
    implicit class IIOptionShadowDepthMaterialMutableBuilder[Self <: IIOptionShadowDepthMaterial] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRemappedVariables(value: js.Array[String]): Self = StObject.set(x, "remappedVariables", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemappedVariablesUndefined: Self = StObject.set(x, "remappedVariables", js.undefined)
      
      @scala.inline
      def setRemappedVariablesVarargs(value: String*): Self = StObject.set(x, "remappedVariables", js.Array(value :_*))
      
      @scala.inline
      def setStandalone(value: Boolean): Self = StObject.set(x, "standalone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStandaloneUndefined: Self = StObject.set(x, "standalone", js.undefined)
    }
  }
}
