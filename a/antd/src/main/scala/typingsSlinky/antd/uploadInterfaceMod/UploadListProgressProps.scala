package typingsSlinky.antd.uploadInterfaceMod

import slinky.core.facade.ReactElement
import typingsSlinky.antd.antdStrings.active
import typingsSlinky.antd.antdStrings.bottom
import typingsSlinky.antd.antdStrings.butt
import typingsSlinky.antd.antdStrings.exception
import typingsSlinky.antd.antdStrings.left
import typingsSlinky.antd.antdStrings.normal
import typingsSlinky.antd.antdStrings.right
import typingsSlinky.antd.antdStrings.round
import typingsSlinky.antd.antdStrings.square
import typingsSlinky.antd.antdStrings.success
import typingsSlinky.antd.antdStrings.top
import typingsSlinky.antd.progressProgressMod.ProgressGradient
import typingsSlinky.antd.progressProgressMod.ProgressSize
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Omit<antd.antd/lib/progress.ProgressProps, 'percent' | 'type'> */
trait UploadListProgressProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var format: js.UndefOr[
    js.Function2[
      /* percent */ js.UndefOr[Double], 
      /* successPercent */ js.UndefOr[Double], 
      ReactElement
    ]
  ] = js.undefined
  var gapDegree: js.UndefOr[Double] = js.undefined
  var gapPosition: js.UndefOr[top | bottom | left | right] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var showInfo: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[ProgressSize] = js.undefined
  var status: js.UndefOr[normal | exception | active | success] = js.undefined
  var steps: js.UndefOr[Double] = js.undefined
  var strokeColor: js.UndefOr[String | ProgressGradient] = js.undefined
  var strokeLinecap: js.UndefOr[butt | square | round] = js.undefined
  var strokeWidth: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var successPercent: js.UndefOr[Double] = js.undefined
  var trailColor: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object UploadListProgressProps {
  @scala.inline
  def apply(): UploadListProgressProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadListProgressProps]
  }
  @scala.inline
  implicit class UploadListProgressPropsOps[Self <: UploadListProgressProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setFormat(value: (/* percent */ js.UndefOr[Double], /* successPercent */ js.UndefOr[Double]) => ReactElement): Self = this.set("format", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setGapDegree(value: Double): Self = this.set("gapDegree", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGapDegree: Self = this.set("gapDegree", js.undefined)
    @scala.inline
    def setGapPosition(value: top | bottom | left | right): Self = this.set("gapPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGapPosition: Self = this.set("gapPosition", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setShowInfo(value: Boolean): Self = this.set("showInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowInfo: Self = this.set("showInfo", js.undefined)
    @scala.inline
    def setSize(value: ProgressSize): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setStatus(value: normal | exception | active | success): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setSteps(value: Double): Self = this.set("steps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSteps: Self = this.set("steps", js.undefined)
    @scala.inline
    def setStrokeColor(value: String | ProgressGradient): Self = this.set("strokeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeColor: Self = this.set("strokeColor", js.undefined)
    @scala.inline
    def setStrokeLinecap(value: butt | square | round): Self = this.set("strokeLinecap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeLinecap: Self = this.set("strokeLinecap", js.undefined)
    @scala.inline
    def setStrokeWidth(value: Double): Self = this.set("strokeWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeWidth: Self = this.set("strokeWidth", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setSuccessPercent(value: Double): Self = this.set("successPercent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuccessPercent: Self = this.set("successPercent", js.undefined)
    @scala.inline
    def setTrailColor(value: String): Self = this.set("trailColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrailColor: Self = this.set("trailColor", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

