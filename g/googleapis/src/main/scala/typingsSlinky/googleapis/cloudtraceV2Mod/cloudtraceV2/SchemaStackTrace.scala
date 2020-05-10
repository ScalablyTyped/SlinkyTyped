package typingsSlinky.googleapis.cloudtraceV2Mod.cloudtraceV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A call stack appearing in a trace.
  */
@js.native
trait SchemaStackTrace extends js.Object {
  /**
    * Stack frames in this stack trace. A maximum of 128 frames are allowed.
    */
  var stackFrames: js.UndefOr[SchemaStackFrames] = js.native
  /**
    * The hash ID is used to conserve network bandwidth for duplicate stack
    * traces within a single trace.  Often multiple spans will have identical
    * stack traces. The first occurrence of a stack trace should contain both
    * the `stackFrame` content and a value in `stackTraceHashId`.  Subsequent
    * spans within the same request can refer to that stack trace by only
    * setting `stackTraceHashId`.
    */
  var stackTraceHashId: js.UndefOr[String] = js.native
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
    def withStackFrames(value: SchemaStackFrames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackFrames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackFrames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackFrames")(js.undefined)
        ret
    }
    @scala.inline
    def withStackTraceHashId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackTraceHashId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackTraceHashId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackTraceHashId")(js.undefined)
        ret
    }
  }
  
}

