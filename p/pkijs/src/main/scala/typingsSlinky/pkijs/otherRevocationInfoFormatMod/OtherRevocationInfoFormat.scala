package typingsSlinky.pkijs.otherRevocationInfoFormatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OtherRevocationInfoFormat extends js.Object {
  var otherRevInfo: js.Any = js.native
  var otherRevInfoFormat: String = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

object OtherRevocationInfoFormat {
  @scala.inline
  def apply(
    fromSchema: js.Any => Unit,
    otherRevInfo: js.Any,
    otherRevInfoFormat: String,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): OtherRevocationInfoFormat = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), otherRevInfo = otherRevInfo.asInstanceOf[js.Any], otherRevInfoFormat = otherRevInfoFormat.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    __obj.asInstanceOf[OtherRevocationInfoFormat]
  }
  @scala.inline
  implicit class OtherRevocationInfoFormatOps[Self <: OtherRevocationInfoFormat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFromSchema(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromSchema")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOtherRevInfo(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otherRevInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOtherRevInfoFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otherRevInfoFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToJSON(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToSchema(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toSchema")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

