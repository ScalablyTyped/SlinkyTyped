package typingsSlinky.aframe

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.three.srcCoreGeometryMod.MorphTarget
import typingsSlinky.three.srcObjectsBoneMod.Bone
import typingsSlinky.three.threeMod.AnimationClip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassAnimationClip extends Instantiable0[AnimationClip] {
  def CreateClipsFromMorphTargetSequences(morphTargets: js.Array[MorphTarget], fps: Double, noLoop: Boolean): js.Array[typingsSlinky.three.srcAnimationAnimationClipMod.AnimationClip] = js.native
  def CreateFromMorphTargetSequence(name: String, morphTargetSequence: js.Array[MorphTarget], fps: Double, noLoop: Boolean): typingsSlinky.three.srcAnimationAnimationClipMod.AnimationClip = js.native
  def findByName(clipArray: js.Array[typingsSlinky.three.srcAnimationAnimationClipMod.AnimationClip], name: String): typingsSlinky.three.srcAnimationAnimationClipMod.AnimationClip = js.native
  def parse(json: js.Any): typingsSlinky.three.srcAnimationAnimationClipMod.AnimationClip = js.native
  def parseAnimation(animation: js.Any, bones: js.Array[Bone], nodeName: String): typingsSlinky.three.srcAnimationAnimationClipMod.AnimationClip = js.native
  def toJSON(): js.Any = js.native
}

