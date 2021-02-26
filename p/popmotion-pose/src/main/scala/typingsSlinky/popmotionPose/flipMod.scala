package typingsSlinky.popmotionPose

import typingsSlinky.popmotionPose.libTypesMod.Pose
import typingsSlinky.popmotionPose.libTypesMod.PoserState
import typingsSlinky.popmotionPose.typesMod.DomPopmotionPoser
import typingsSlinky.popmotionPose.typesMod.TransitionDefinition
import typingsSlinky.popmotionPose.typesMod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flipMod {
  
  @JSImport("popmotion-pose/lib/dom/flip", "flipPose")
  @js.native
  def flipPose(
    props: PoserState[
      Value, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ _, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ _, 
      DomPopmotionPoser
    ],
    nextPose: Pose[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ _, 
      TransitionDefinition
    ]
  ): Pose[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ _, 
    TransitionDefinition
  ] = js.native
  
  @JSImport("popmotion-pose/lib/dom/flip", "isFlipPose")
  @js.native
  def isFlipPose(
    flip: Boolean,
    key: String,
    state: PoserState[
      Value, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ _, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ _, 
      DomPopmotionPoser
    ]
  ): Boolean = js.native
  
  @JSImport("popmotion-pose/lib/dom/flip", "setValue")
  @js.native
  def setValue(
    hasValuesProps: PoserState[
      Value, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ _, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ _, 
      DomPopmotionPoser
    ],
    key: String,
    to: js.Any
  ): Unit = js.native
}
