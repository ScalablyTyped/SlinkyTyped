package typingsSlinky.babylonjs.texturesIndexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object babylonjsAbstractSceneAugmentingMod {
  
  @js.native
  trait AbstractScene extends StObject {
    
    /**
      * The list of procedural textures added to the scene
      * @see https://doc.babylonjs.com/how_to/how_to_use_procedural_textures
      */
    var proceduralTextures: js.Array[typingsSlinky.babylonjs.proceduralTextureMod.ProceduralTexture] = js.native
  }
  object AbstractScene {
    
    @scala.inline
    def apply(proceduralTextures: js.Array[typingsSlinky.babylonjs.proceduralTextureMod.ProceduralTexture]): AbstractScene = {
      val __obj = js.Dynamic.literal(proceduralTextures = proceduralTextures.asInstanceOf[js.Any])
      __obj.asInstanceOf[AbstractScene]
    }
    
    @scala.inline
    implicit class AbstractSceneMutableBuilder[Self <: AbstractScene] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProceduralTextures(value: js.Array[typingsSlinky.babylonjs.proceduralTextureMod.ProceduralTexture]): Self = StObject.set(x, "proceduralTextures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProceduralTexturesVarargs(value: typingsSlinky.babylonjs.proceduralTextureMod.ProceduralTexture*): Self = StObject.set(x, "proceduralTextures", js.Array(value :_*))
    }
  }
}
