package typingsSlinky.popmotionPose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type AnimationDef = typingsSlinky.popmotionPose.typesMod.TransitionDefinition
  
  type BoundingBox = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in popmotion-pose.popmotion-pose/lib/types.BoundingBoxDimension ]: number}
    */ typingsSlinky.popmotionPose.popmotionPoseStrings.BoundingBox with org.scalablytyped.runtime.TopLevel[js.Any]
  
  type CubicBezierArgs = js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]
  
  type DecayDefinition = typingsSlinky.popmotionPose.anon.Type with typingsSlinky.popmotionPose.typesMod.TransitionDefinitionCommonProps with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DecayProps */ js.Any) with typingsSlinky.popmotionPose.typesMod.NoEase
  
  type DragBounds = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in popmotion-pose.popmotion-pose/lib/types.BoundingBoxDimension ]:? number | string}
    */ typingsSlinky.popmotionPose.popmotionPoseStrings.DragBounds with org.scalablytyped.runtime.TopLevel[js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - typingsSlinky.popmotionPose.popmotionPoseStrings.x
    - typingsSlinky.popmotionPose.popmotionPoseStrings.y
  */
  type Draggable = typingsSlinky.popmotionPose.typesMod._Draggable | scala.Boolean
  
  type KeyframesDefinition = typingsSlinky.popmotionPose.anon.`0` with typingsSlinky.popmotionPose.typesMod.TransitionDefinitionCommonProps with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KeyframesProps */ js.Any)
  
  type PhysicsDefinition = typingsSlinky.popmotionPose.anon.`1` with typingsSlinky.popmotionPose.typesMod.TransitionDefinitionCommonProps with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PhysicsProps */ js.Any) with typingsSlinky.popmotionPose.typesMod.NoEase
  
  type Pose = typingsSlinky.poseCore.typesMod.Pose[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ js.Any, 
    typingsSlinky.popmotionPose.typesMod.TransitionDefinition
  ]
  
  type PoseMap = typingsSlinky.poseCore.typesMod.PoseMap[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ js.Any, 
    typingsSlinky.popmotionPose.typesMod.TransitionDefinition
  ]
  
  type PoserState = typingsSlinky.poseCore.typesMod.PoserState[
    typingsSlinky.popmotionPose.typesMod.Value, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ js.Any, 
    typingsSlinky.popmotionPose.typesMod.DomPopmotionPoser
  ]
  
  type SpringDefinition = typingsSlinky.popmotionPose.anon.`2` with typingsSlinky.popmotionPose.typesMod.TransitionDefinitionCommonProps with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringProps */ js.Any) with typingsSlinky.popmotionPose.typesMod.NoEase
  
  type Transformer = js.Function1[/* v */ js.Any, js.Any]
  
  type Transition = js.Function1[
    /* props */ typingsSlinky.popmotionPose.typesMod.ResolverProps, 
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ js.Any) | typingsSlinky.popmotionPose.popmotionPoseBooleans.`false`
  ]
  
  type TransitionDefinition = typingsSlinky.popmotionPose.typesMod.TweenDefinition | typingsSlinky.popmotionPose.typesMod.PhysicsDefinition | typingsSlinky.popmotionPose.typesMod.SpringDefinition | typingsSlinky.popmotionPose.typesMod.DecayDefinition | typingsSlinky.popmotionPose.typesMod.KeyframesDefinition
  
  type TweenDefinition = typingsSlinky.tsEssentials.typesMod.Merge[
    typingsSlinky.popmotionPose.anon.`3` with typingsSlinky.popmotionPose.typesMod.TransitionDefinitionCommonProps with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TweenProps */ js.Any), 
    typingsSlinky.popmotionPose.anon.Ease
  ]
}
