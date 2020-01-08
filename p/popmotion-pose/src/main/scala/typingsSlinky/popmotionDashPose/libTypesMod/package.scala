package typingsSlinky.popmotionDashPose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTypesMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.popmotion.libActionTypesMod.ColdSubscription
  import typingsSlinky.popmotion.libAnimationsDecayTypesMod.DecayProps
  import typingsSlinky.popmotion.libAnimationsKeyframesTypesMod.KeyframesProps
  import typingsSlinky.popmotion.libAnimationsPhysicsTypesMod.PhysicsProps
  import typingsSlinky.popmotion.libAnimationsSpringTypesMod.SpringProps
  import typingsSlinky.popmotion.libAnimationsTweenTypesMod.TweenProps
  import typingsSlinky.popmotion.popmotionMod.Action
  import typingsSlinky.popmotionDashPose.Anon_Decay
  import typingsSlinky.popmotionDashPose.Anon_Ease
  import typingsSlinky.popmotionDashPose.Anon_Keyframes
  import typingsSlinky.popmotionDashPose.Anon_Physics
  import typingsSlinky.popmotionDashPose.Anon_Spring
  import typingsSlinky.popmotionDashPose.Anon_Tween
  import typingsSlinky.popmotionDashPose.popmotionDashPoseBooleans.`false`
  import typingsSlinky.tsDashEssentials.tsDashEssentialsMod.Merge

  type AnimationDef = TransitionDefinition
  type BoundingBox = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in popmotion-pose.popmotion-pose/lib/types.BoundingBoxDimension ]: number}
    */ typingsSlinky.popmotionDashPose.popmotionDashPoseStrings.BoundingBox with js.Any
  type CubicBezierArgs = js.Tuple4[Double, Double, Double, Double]
  type DecayDefinition = Anon_Decay with TransitionDefinitionCommonProps with DecayProps with NoEase
  type DragBounds = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in popmotion-pose.popmotion-pose/lib/types.BoundingBoxDimension ]:? number | string}
    */ typingsSlinky.popmotionDashPose.popmotionDashPoseStrings.DragBounds with js.Any
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - typings.popmotionDashPose.popmotionDashPoseStrings.x
    - typings.popmotionDashPose.popmotionDashPoseStrings.y
  */
  type Draggable = _Draggable | Boolean
  type KeyframesDefinition = Anon_Keyframes with TransitionDefinitionCommonProps with KeyframesProps
  type PhysicsDefinition = Anon_Physics with TransitionDefinitionCommonProps with PhysicsProps with NoEase
  type Pose = typingsSlinky.poseDashCore.libTypesMod.Pose[Action, TransitionDefinition]
  type PoseMap = typingsSlinky.poseDashCore.libTypesMod.PoseMap[Action, TransitionDefinition]
  type PoserState = typingsSlinky.poseDashCore.libTypesMod.PoserState[Value, Action, ColdSubscription, DomPopmotionPoser]
  type ResolverProps = TransitionProps with StringDictionary[js.Any]
  type SpringDefinition = Anon_Spring with TransitionDefinitionCommonProps with SpringProps with NoEase
  type Transformer = js.Function1[/* v */ js.Any, js.Any]
  type Transition = js.Function1[/* props */ ResolverProps, Action | `false`]
  type TransitionDefinition = TweenDefinition | PhysicsDefinition | SpringDefinition | DecayDefinition | KeyframesDefinition
  type TweenDefinition = Merge[Anon_Tween with TransitionDefinitionCommonProps with TweenProps, Anon_Ease]
}
