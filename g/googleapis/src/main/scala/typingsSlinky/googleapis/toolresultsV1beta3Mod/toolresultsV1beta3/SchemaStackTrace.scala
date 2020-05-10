package typingsSlinky.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A stacktrace.
  */
@js.native
trait SchemaStackTrace extends js.Object {
  /**
    * The stack trace message.  Required
    */
  var exception: js.UndefOr[String] = js.native
}

object SchemaStackTrace {
  @scala.inline
  def apply(): SchemaStackTrace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStackTrace]
  }
  @scala.inline
  implicit class SchemaStackTraceOps[Self <: SchemaStackTrace] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withException(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exception")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutException: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exception")(js.undefined)
        ret
    }
  }
  
}

