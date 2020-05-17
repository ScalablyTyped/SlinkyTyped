package typingsSlinky.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MedianSvgClassName extends js.Object {
  var medianSvgClassName: String = js.native
  var medianSvgStyle: js.Object = js.native
  var whiskerEndLength: String = js.native
  var whiskerEndSvgClassName: String = js.native
  var whiskerEndSvgStyle: js.Object = js.native
  var whiskerSvgClassName: String = js.native
  var whiskerSvgStyle: js.Object = js.native
}

object MedianSvgClassName {
  @scala.inline
  def apply(
    medianSvgClassName: String,
    medianSvgStyle: js.Object,
    whiskerEndLength: String,
    whiskerEndSvgClassName: String,
    whiskerEndSvgStyle: js.Object,
    whiskerSvgClassName: String,
    whiskerSvgStyle: js.Object
  ): MedianSvgClassName = {
    val __obj = js.Dynamic.literal(medianSvgClassName = medianSvgClassName.asInstanceOf[js.Any], medianSvgStyle = medianSvgStyle.asInstanceOf[js.Any], whiskerEndLength = whiskerEndLength.asInstanceOf[js.Any], whiskerEndSvgClassName = whiskerEndSvgClassName.asInstanceOf[js.Any], whiskerEndSvgStyle = whiskerEndSvgStyle.asInstanceOf[js.Any], whiskerSvgClassName = whiskerSvgClassName.asInstanceOf[js.Any], whiskerSvgStyle = whiskerSvgStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedianSvgClassName]
  }
  @scala.inline
  implicit class MedianSvgClassNameOps[Self <: MedianSvgClassName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMedianSvgClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("medianSvgClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMedianSvgStyle(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("medianSvgStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWhiskerEndLength(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whiskerEndLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWhiskerEndSvgClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whiskerEndSvgClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWhiskerEndSvgStyle(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whiskerEndSvgStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWhiskerSvgClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whiskerSvgClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWhiskerSvgStyle(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whiskerSvgStyle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

