package typingsSlinky.popmotionPose

import typingsSlinky.popmotionPose.libTypesMod.PoserConfig
import typingsSlinky.popmotionPose.typesMod.PopmotionPoserFactoryConfig
import typingsSlinky.popmotionPose.typesMod.TransitionDefinition
import typingsSlinky.popmotionPose.typesMod.Value
import typingsSlinky.poseCore.typesMod.Poser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("popmotion-pose/lib/factories/pose", JSImport.Namespace)
@js.native
object factoriesPoseMod extends js.Object {
  
  def default[P](
    hasTransformPoseAddListenerToValueExtendAPIReadValueFromSourcePosePrioritySetValueNative: PopmotionPoserFactoryConfig[P, TransitionDefinition]
  ): js.Function1[
    /* config */ PoserConfig[Value], 
    Poser[
      Value, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ _, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ _, 
      P
    ]
  ] = js.native
}
