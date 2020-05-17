package typingsSlinky.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkeletonBinary extends js.Object {
  var attachmentLoader: AttachmentLoader = js.native
  var linkedMeshes: js.Any = js.native
  var readAnimation: js.Any = js.native
  var readAttachment: js.Any = js.native
  var readCurve: js.Any = js.native
  var readFloatArray: js.Any = js.native
  var readShortArray: js.Any = js.native
  var readSkin: js.Any = js.native
  var readVertices: js.Any = js.native
  var scale: Double = js.native
  def readSkeletonData(binary: js.typedarray.Uint8Array): SkeletonData = js.native
  def setCurve(timeline: CurveTimeline, frameIndex: Double, cx1: Double, cy1: Double, cx2: Double, cy2: Double): Unit = js.native
}

object SkeletonBinary {
  @scala.inline
  def apply(
    attachmentLoader: AttachmentLoader,
    linkedMeshes: js.Any,
    readAnimation: js.Any,
    readAttachment: js.Any,
    readCurve: js.Any,
    readFloatArray: js.Any,
    readShortArray: js.Any,
    readSkeletonData: js.typedarray.Uint8Array => SkeletonData,
    readSkin: js.Any,
    readVertices: js.Any,
    scale: Double,
    setCurve: (CurveTimeline, Double, Double, Double, Double, Double) => Unit
  ): SkeletonBinary = {
    val __obj = js.Dynamic.literal(attachmentLoader = attachmentLoader.asInstanceOf[js.Any], linkedMeshes = linkedMeshes.asInstanceOf[js.Any], readAnimation = readAnimation.asInstanceOf[js.Any], readAttachment = readAttachment.asInstanceOf[js.Any], readCurve = readCurve.asInstanceOf[js.Any], readFloatArray = readFloatArray.asInstanceOf[js.Any], readShortArray = readShortArray.asInstanceOf[js.Any], readSkeletonData = js.Any.fromFunction1(readSkeletonData), readSkin = readSkin.asInstanceOf[js.Any], readVertices = readVertices.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], setCurve = js.Any.fromFunction6(setCurve))
    __obj.asInstanceOf[SkeletonBinary]
  }
  @scala.inline
  implicit class SkeletonBinaryOps[Self <: SkeletonBinary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachmentLoader(value: AttachmentLoader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachmentLoader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinkedMeshes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkedMeshes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadAnimation(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadAttachment(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readAttachment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadCurve(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readCurve")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadFloatArray(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readFloatArray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadShortArray(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readShortArray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadSkeletonData(value: js.typedarray.Uint8Array => SkeletonData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readSkeletonData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReadSkin(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readSkin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadVertices(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readVertices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetCurve(value: (CurveTimeline, Double, Double, Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCurve")(js.Any.fromFunction6(value))
        ret
    }
  }
  
}

