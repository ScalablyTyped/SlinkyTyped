package typingsSlinky.popmotionPose

import typingsSlinky.popmotionPose.libTypesMod.Pose
import typingsSlinky.popmotionPose.libTypesMod.PoserState
import typingsSlinky.popmotionPose.typesMod.DomPopmotionPoser
import typingsSlinky.popmotionPose.typesMod.TransitionDefinition
import typingsSlinky.popmotionPose.typesMod.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("popmotion-pose/lib/dom/unit-conversion", JSImport.Namespace)
@js.native
object unitConversionMod extends js.Object {
  
  def convertPositionalUnits(
    state: PoserState[
      Value, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_flip.Action */ _, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_flip.ColdSubscription */ _, 
      DomPopmotionPoser
    ],
    nextPose: Pose[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_flip.Action */ _, 
      TransitionDefinition
    ]
  ): Pose[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_flip.Action */ _, 
    TransitionDefinition
  ] = js.native
  
  def isPositional(
    pose: Pose[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_flip.Action */ _, 
      TransitionDefinition
    ]
  ): Boolean = js.native
}
