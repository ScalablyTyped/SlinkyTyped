package typingsSlinky.googleapis.scriptV1Mod.scriptV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A stack trace through the script that shows where the execution failed.
  */
@js.native
trait SchemaScriptStackTraceElement extends js.Object {
  /**
    * The name of the function that failed.
    */
  var function: js.UndefOr[String] = js.native
  /**
    * The line number where the script failed.
    */
  var lineNumber: js.UndefOr[Double] = js.native
}

object SchemaScriptStackTraceElement {
  @scala.inline
  def apply(): SchemaScriptStackTraceElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaScriptStackTraceElement]
  }
  @scala.inline
  implicit class SchemaScriptStackTraceElementOps[Self <: SchemaScriptStackTraceElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFunction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("function")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("function")(js.undefined)
        ret
    }
    @scala.inline
    def withLineNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineNumber")(js.undefined)
        ret
    }
  }
  
}

