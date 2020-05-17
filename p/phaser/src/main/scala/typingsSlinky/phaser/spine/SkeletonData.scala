package typingsSlinky.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkeletonData extends js.Object {
  var animations: js.Array[Animation] = js.native
  var audioPath: String = js.native
  var bones: js.Array[BoneData] = js.native
  var defaultSkin: Skin = js.native
  var events: js.Array[EventData] = js.native
  var fps: Double = js.native
  var hash: String = js.native
  var height: Double = js.native
  var ikConstraints: js.Array[IkConstraintData] = js.native
  var imagesPath: String = js.native
  var name: String = js.native
  var pathConstraints: js.Array[PathConstraintData] = js.native
  var skins: js.Array[Skin] = js.native
  var slots: js.Array[SlotData] = js.native
  var transformConstraints: js.Array[TransformConstraintData] = js.native
  var version: String = js.native
  var width: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  def findAnimation(animationName: String): Animation = js.native
  def findBone(boneName: String): BoneData = js.native
  def findBoneIndex(boneName: String): Double = js.native
  def findEvent(eventDataName: String): EventData = js.native
  def findIkConstraint(constraintName: String): IkConstraintData = js.native
  def findPathConstraint(constraintName: String): PathConstraintData = js.native
  def findPathConstraintIndex(pathConstraintName: String): Double = js.native
  def findSkin(skinName: String): Skin = js.native
  def findSlot(slotName: String): SlotData = js.native
  def findSlotIndex(slotName: String): Double = js.native
  def findTransformConstraint(constraintName: String): TransformConstraintData = js.native
}

object SkeletonData {
  @scala.inline
  def apply(
    animations: js.Array[Animation],
    audioPath: String,
    bones: js.Array[BoneData],
    defaultSkin: Skin,
    events: js.Array[EventData],
    findAnimation: String => Animation,
    findBone: String => BoneData,
    findBoneIndex: String => Double,
    findEvent: String => EventData,
    findIkConstraint: String => IkConstraintData,
    findPathConstraint: String => PathConstraintData,
    findPathConstraintIndex: String => Double,
    findSkin: String => Skin,
    findSlot: String => SlotData,
    findSlotIndex: String => Double,
    findTransformConstraint: String => TransformConstraintData,
    fps: Double,
    hash: String,
    height: Double,
    ikConstraints: js.Array[IkConstraintData],
    imagesPath: String,
    name: String,
    pathConstraints: js.Array[PathConstraintData],
    skins: js.Array[Skin],
    slots: js.Array[SlotData],
    transformConstraints: js.Array[TransformConstraintData],
    version: String,
    width: Double,
    x: Double,
    y: Double
  ): SkeletonData = {
    val __obj = js.Dynamic.literal(animations = animations.asInstanceOf[js.Any], audioPath = audioPath.asInstanceOf[js.Any], bones = bones.asInstanceOf[js.Any], defaultSkin = defaultSkin.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], findAnimation = js.Any.fromFunction1(findAnimation), findBone = js.Any.fromFunction1(findBone), findBoneIndex = js.Any.fromFunction1(findBoneIndex), findEvent = js.Any.fromFunction1(findEvent), findIkConstraint = js.Any.fromFunction1(findIkConstraint), findPathConstraint = js.Any.fromFunction1(findPathConstraint), findPathConstraintIndex = js.Any.fromFunction1(findPathConstraintIndex), findSkin = js.Any.fromFunction1(findSkin), findSlot = js.Any.fromFunction1(findSlot), findSlotIndex = js.Any.fromFunction1(findSlotIndex), findTransformConstraint = js.Any.fromFunction1(findTransformConstraint), fps = fps.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], ikConstraints = ikConstraints.asInstanceOf[js.Any], imagesPath = imagesPath.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pathConstraints = pathConstraints.asInstanceOf[js.Any], skins = skins.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any], transformConstraints = transformConstraints.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkeletonData]
  }
  @scala.inline
  implicit class SkeletonDataOps[Self <: SkeletonData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimations(value: js.Array[Animation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAudioPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBones(value: js.Array[BoneData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bones")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultSkin(value: Skin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSkin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvents(value: js.Array[EventData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFindAnimation(value: String => Animation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findAnimation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFindBone(value: String => BoneData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findBone")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFindBoneIndex(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findBoneIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFindEvent(value: String => EventData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findEvent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFindIkConstraint(value: String => IkConstraintData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findIkConstraint")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFindPathConstraint(value: String => PathConstraintData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findPathConstraint")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFindPathConstraintIndex(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findPathConstraintIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFindSkin(value: String => Skin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findSkin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFindSlot(value: String => SlotData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findSlot")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFindSlotIndex(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findSlotIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFindTransformConstraint(value: String => TransformConstraintData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findTransformConstraint")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFps(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIkConstraints(value: js.Array[IkConstraintData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ikConstraints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImagesPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imagesPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPathConstraints(value: js.Array[PathConstraintData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathConstraints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSkins(value: js.Array[Skin]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlots(value: js.Array[SlotData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransformConstraints(value: js.Array[TransformConstraintData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformConstraints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

