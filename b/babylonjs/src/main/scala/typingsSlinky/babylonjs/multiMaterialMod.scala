package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.materialMod.Material
import typingsSlinky.babylonjs.sceneMod.Scene
import typingsSlinky.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multiMaterialMod {
  
  @JSImport("babylonjs/Materials/multiMaterial", "MultiMaterial")
  @js.native
  class MultiMaterial protected () extends Material {
    /**
      * Instantiates a new Multi Material
      * A multi-material is used to apply different materials to different parts of the same object without the need of
      * separate meshes. This can be use to improve performances.
      * @see https://doc.babylonjs.com/how_to/multi_materials
      * @param name Define the name in the scene
      * @param scene Define the scene the material belongs to
      */
    def this(name: String, scene: Scene) = this()
    
    var _hookArray: js.Any = js.native
    
    var _subMaterials: js.Any = js.native
    
    def clone(name: String, cloneChildren: Boolean): MultiMaterial = js.native
    
    /**
      * Function used to align with Node.getChildren()
      * @returns the list of Materials used within the multi material
      */
    def getChildren(): js.Array[Nullable[Material]] = js.native
    
    /**
      * Get one of the submaterial by its index in the submaterials array
      * @param index The index to look the sub material at
      * @returns The Material if the index has been defined
      */
    def getSubMaterial(index: Double): Nullable[Material] = js.native
    
    /**
      * Gets or Sets the list of Materials used within the multi material.
      * They need to be ordered according to the submeshes order in the associated mesh
      */
    def subMaterials: js.Array[Nullable[Material]] = js.native
    def subMaterials_=(value: js.Array[Nullable[Material]]): Unit = js.native
  }
  /* static members */
  object MultiMaterial {
    
    /**
      * Creates a MultiMaterial from parsed MultiMaterial data.
      * @param parsedMultiMaterial defines parsed MultiMaterial data.
      * @param scene defines the hosting scene
      * @returns a new MultiMaterial
      */
    @JSImport("babylonjs/Materials/multiMaterial", "MultiMaterial.ParseMultiMaterial")
    @js.native
    def ParseMultiMaterial(parsedMultiMaterial: js.Any, scene: Scene): MultiMaterial = js.native
  }
}
