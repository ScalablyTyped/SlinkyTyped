package typingsSlinky.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlashFrame extends js.Object {
  var actionScript: js.Any = js.native
  var duration: js.Any = js.native
  var elements: js.Array[FlashElement] = js.native
  var hasCustomEase: js.Any = js.native
  var labelType: js.Any = js.native
  var motionTweenOrientToPath: js.Any = js.native
  var motionTweenRotate: js.Any = js.native
  var motionTweenRotateTimes: js.Any = js.native
  var motionTweenScale: js.Any = js.native
  var motionTweenSnap: js.Any = js.native
  var motionTweenSync: js.Any = js.native
  var name: js.Any = js.native
  var shapeTweenBlend: js.Any = js.native
  var soundEffect: js.Any = js.native
  var soundLibraryItem: FlashSoundItem = js.native
  var soundLoop: js.Any = js.native
  var soundLoopMode: js.Any = js.native
  var soundName: js.Any = js.native
  var soundSync: js.Any = js.native
  var startFrame: js.Any = js.native
  var tweenEasing: js.Any = js.native
  var tweenType: js.Any = js.native
  var useSingleEaseCurve: js.Any = js.native
  def getCustomEase(): js.Any = js.native
  def setCustomEase(): js.Any = js.native
}

object FlashFrame {
  @scala.inline
  def apply(
    actionScript: js.Any,
    duration: js.Any,
    elements: js.Array[FlashElement],
    getCustomEase: () => js.Any,
    hasCustomEase: js.Any,
    labelType: js.Any,
    motionTweenOrientToPath: js.Any,
    motionTweenRotate: js.Any,
    motionTweenRotateTimes: js.Any,
    motionTweenScale: js.Any,
    motionTweenSnap: js.Any,
    motionTweenSync: js.Any,
    name: js.Any,
    setCustomEase: () => js.Any,
    shapeTweenBlend: js.Any,
    soundEffect: js.Any,
    soundLibraryItem: FlashSoundItem,
    soundLoop: js.Any,
    soundLoopMode: js.Any,
    soundName: js.Any,
    soundSync: js.Any,
    startFrame: js.Any,
    tweenEasing: js.Any,
    tweenType: js.Any,
    useSingleEaseCurve: js.Any
  ): FlashFrame = {
    val __obj = js.Dynamic.literal(actionScript = actionScript.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], elements = elements.asInstanceOf[js.Any], getCustomEase = js.Any.fromFunction0(getCustomEase), hasCustomEase = hasCustomEase.asInstanceOf[js.Any], labelType = labelType.asInstanceOf[js.Any], motionTweenOrientToPath = motionTweenOrientToPath.asInstanceOf[js.Any], motionTweenRotate = motionTweenRotate.asInstanceOf[js.Any], motionTweenRotateTimes = motionTweenRotateTimes.asInstanceOf[js.Any], motionTweenScale = motionTweenScale.asInstanceOf[js.Any], motionTweenSnap = motionTweenSnap.asInstanceOf[js.Any], motionTweenSync = motionTweenSync.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], setCustomEase = js.Any.fromFunction0(setCustomEase), shapeTweenBlend = shapeTweenBlend.asInstanceOf[js.Any], soundEffect = soundEffect.asInstanceOf[js.Any], soundLibraryItem = soundLibraryItem.asInstanceOf[js.Any], soundLoop = soundLoop.asInstanceOf[js.Any], soundLoopMode = soundLoopMode.asInstanceOf[js.Any], soundName = soundName.asInstanceOf[js.Any], soundSync = soundSync.asInstanceOf[js.Any], startFrame = startFrame.asInstanceOf[js.Any], tweenEasing = tweenEasing.asInstanceOf[js.Any], tweenType = tweenType.asInstanceOf[js.Any], useSingleEaseCurve = useSingleEaseCurve.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashFrame]
  }
  @scala.inline
  implicit class FlashFrameOps[Self <: FlashFrame] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionScript(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionScript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElements(value: js.Array[FlashElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetCustomEase(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCustomEase")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasCustomEase(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasCustomEase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabelType(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMotionTweenOrientToPath(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("motionTweenOrientToPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMotionTweenRotate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("motionTweenRotate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMotionTweenRotateTimes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("motionTweenRotateTimes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMotionTweenScale(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("motionTweenScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMotionTweenSnap(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("motionTweenSnap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMotionTweenSync(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("motionTweenSync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetCustomEase(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCustomEase")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withShapeTweenBlend(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeTweenBlend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSoundEffect(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("soundEffect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSoundLibraryItem(value: FlashSoundItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("soundLibraryItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSoundLoop(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("soundLoop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSoundLoopMode(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("soundLoopMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSoundName(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("soundName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSoundSync(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("soundSync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartFrame(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startFrame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTweenEasing(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tweenEasing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTweenType(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tweenType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseSingleEaseCurve(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSingleEaseCurve")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

