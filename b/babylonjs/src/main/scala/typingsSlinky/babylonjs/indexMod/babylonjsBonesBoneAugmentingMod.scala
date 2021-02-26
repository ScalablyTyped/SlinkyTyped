package typingsSlinky.babylonjs.indexMod

import typingsSlinky.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object babylonjsBonesBoneAugmentingMod {
  
  @js.native
  trait Bone extends StObject {
    
    /**
      * Copy an animation range from another bone
      * @param source defines the source bone
      * @param rangeName defines the range name to copy
      * @param frameOffset defines the frame offset
      * @param rescaleAsRequired defines if rescaling must be applied if required
      * @param skelDimensionsRatio defines the scaling ratio
      * @returns true if operation was successful
      */
    def copyAnimationRange(
      source: typingsSlinky.babylonjs.animatableMod.babylonjsBonesBoneAugmentingMod.Bone,
      rangeName: String,
      frameOffset: Double,
      rescaleAsRequired: Boolean,
      skelDimensionsRatio: Nullable[typingsSlinky.babylonjs.mathVectorMod.Vector3]
    ): Boolean = js.native
  }
  object Bone {
    
    @scala.inline
    def apply(
      copyAnimationRange: (typingsSlinky.babylonjs.animatableMod.babylonjsBonesBoneAugmentingMod.Bone, String, Double, Boolean, Nullable[typingsSlinky.babylonjs.mathVectorMod.Vector3]) => Boolean
    ): typingsSlinky.babylonjs.indexMod.babylonjsBonesBoneAugmentingMod.Bone = {
      val __obj = js.Dynamic.literal(copyAnimationRange = js.Any.fromFunction5(copyAnimationRange))
      __obj.asInstanceOf[typingsSlinky.babylonjs.indexMod.babylonjsBonesBoneAugmentingMod.Bone]
    }
    
    @scala.inline
    implicit class BoneMutableBuilder[Self <: typingsSlinky.babylonjs.indexMod.babylonjsBonesBoneAugmentingMod.Bone] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCopyAnimationRange(
        value: (typingsSlinky.babylonjs.animatableMod.babylonjsBonesBoneAugmentingMod.Bone, String, Double, Boolean, Nullable[typingsSlinky.babylonjs.mathVectorMod.Vector3]) => Boolean
      ): Self = StObject.set(x, "copyAnimationRange", js.Any.fromFunction5(value))
    }
  }
}
