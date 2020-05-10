package typingsSlinky.raygun4js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RaygunStackTrace extends js.Object {
  var ClassName: String = js.native
  var ColumnNumber: Double = js.native
  var FileName: String = js.native
  var LineNumber: Double = js.native
  var MethodName: String = js.native
}

object RaygunStackTrace {
  @scala.inline
  def apply(ClassName: String, ColumnNumber: Double, FileName: String, LineNumber: Double, MethodName: String): RaygunStackTrace = {
    val __obj = js.Dynamic.literal(ClassName = ClassName.asInstanceOf[js.Any], ColumnNumber = ColumnNumber.asInstanceOf[js.Any], FileName = FileName.asInstanceOf[js.Any], LineNumber = LineNumber.asInstanceOf[js.Any], MethodName = MethodName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaygunStackTrace]
  }
  @scala.inline
  implicit class RaygunStackTraceOps[Self <: RaygunStackTrace] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColumnNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LineNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethodName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MethodName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

