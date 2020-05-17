package typingsSlinky.activexLibreoffice.com_.sun.star.text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes the vertical orientation of an object.
  *
  * If `VerticalOrientation == VERT_NONE` , then the value "YPos" describes the distance from the top of the context. Otherwise "YPos" is ignored.
  */
@js.native
trait VertOrientationFormat extends js.Object {
  /** determines the vertical alignment of an object. The values refer to com::sun::star::VertOrientation. */
  var VerticalOrientation: Double = js.native
  /**
    * determines the reference position of the vertical alignment.
    * @see com.sun.star.text.RelOrientation
    */
  var VerticalRelation: Double = js.native
  /** contains the distance from top. Only valid if the property VerticalOrientation contains the value VERT_NONE. */
  var YPos: Double = js.native
}

object VertOrientationFormat {
  @scala.inline
  def apply(VerticalOrientation: Double, VerticalRelation: Double, YPos: Double): VertOrientationFormat = {
    val __obj = js.Dynamic.literal(VerticalOrientation = VerticalOrientation.asInstanceOf[js.Any], VerticalRelation = VerticalRelation.asInstanceOf[js.Any], YPos = YPos.asInstanceOf[js.Any])
    __obj.asInstanceOf[VertOrientationFormat]
  }
  @scala.inline
  implicit class VertOrientationFormatOps[Self <: VertOrientationFormat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVerticalOrientation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VerticalOrientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerticalRelation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VerticalRelation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYPos(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("YPos")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

