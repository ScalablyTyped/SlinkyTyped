package typingsSlinky.popmotionPose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type AnimationDef = typingsSlinky.popmotionPose.typesMod.TransitionDefinition
  type BoundingBox = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in popmotion-pose.popmotion-pose/lib/types.BoundingBoxDimension ]: number}
    */ typingsSlinky.popmotionPose.popmotionPoseStrings.BoundingBox with org.scalablytyped.runtime.TopLevel[js.Any]
  type CubicBezierArgs = js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]
  type DragBounds = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in popmotion-pose.popmotion-pose/lib/types.BoundingBoxDimension ]:? number | string}
    */ typingsSlinky.popmotionPose.popmotionPoseStrings.DragBounds with org.scalablytyped.runtime.TopLevel[js.Any]
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - typingsSlinky.popmotionPose.popmotionPoseStrings.x
    - typingsSlinky.popmotionPose.popmotionPoseStrings.y
  */
  type Draggable = typingsSlinky.popmotionPose.typesMod._Draggable | scala.Boolean
  type Pose = typingsSlinky.poseCore.typesMod.Pose[
    typingsSlinky.popmotion.mod.Action_, 
    typingsSlinky.popmotionPose.typesMod.TransitionDefinition
  ]
  type PoseMap = typingsSlinky.poseCore.typesMod.PoseMap[
    typingsSlinky.popmotion.mod.Action_, 
    typingsSlinky.popmotionPose.typesMod.TransitionDefinition
  ]
  type PoserState = typingsSlinky.poseCore.typesMod.PoserState[
    typingsSlinky.popmotionPose.typesMod.Value, 
    typingsSlinky.popmotion.mod.Action_, 
    typingsSlinky.popmotion.typesMod.ColdSubscription, 
    typingsSlinky.popmotionPose.typesMod.DomPopmotionPoser
  ]
  type Transformer = js.Function1[/* v */ js.Any, js.Any]
  type Transition = js.Function1[
    /* props */ typingsSlinky.popmotionPose.typesMod.ResolverProps, 
    typingsSlinky.popmotion.mod.Action_ | typingsSlinky.popmotionPose.popmotionPoseBooleans.`false`
  ]
}
