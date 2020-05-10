package typingsSlinky.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a stack frame context.
  */
@js.native
trait SchemaStackFrame extends js.Object {
  /**
    * Set of arguments passed to this function. Note that this might not be
    * populated for all stack frames.
    */
  var arguments: js.UndefOr[js.Array[SchemaVariable]] = js.native
  /**
    * Demangled function name at the call site.
    */
  var function: js.UndefOr[String] = js.native
  /**
    * Set of local variables at the stack frame location. Note that this might
    * not be populated for all stack frames.
    */
  var locals: js.UndefOr[js.Array[SchemaVariable]] = js.native
  /**
    * Source location of the call site.
    */
  var location: js.UndefOr[SchemaSourceLocation] = js.native
}

object SchemaStackFrame {
  @scala.inline
  def apply(): SchemaStackFrame = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStackFrame]
  }
  @scala.inline
  implicit class SchemaStackFrameOps[Self <: SchemaStackFrame] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArguments(value: js.Array[SchemaVariable]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arguments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArguments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arguments")(js.undefined)
        ret
    }
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
    def withLocals(value: js.Array[SchemaVariable]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locals")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: SchemaSourceLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
  }
  
}

