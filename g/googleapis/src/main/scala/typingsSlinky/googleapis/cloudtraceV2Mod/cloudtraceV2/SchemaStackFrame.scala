package typingsSlinky.googleapis.cloudtraceV2Mod.cloudtraceV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a single stack frame in a stack trace.
  */
@js.native
trait SchemaStackFrame extends js.Object {
  /**
    * The column number where the function call appears, if available. This is
    * important in JavaScript because of its anonymous functions.
    */
  var columnNumber: js.UndefOr[String] = js.native
  /**
    * The name of the source file where the function call appears (up to 256
    * bytes).
    */
  var fileName: js.UndefOr[SchemaTruncatableString] = js.native
  /**
    * The fully-qualified name that uniquely identifies the function or method
    * that is active in this frame (up to 1024 bytes).
    */
  var functionName: js.UndefOr[SchemaTruncatableString] = js.native
  /**
    * The line number in `file_name` where the function call appears.
    */
  var lineNumber: js.UndefOr[String] = js.native
  /**
    * The binary module from where the code was loaded.
    */
  var loadModule: js.UndefOr[SchemaModule] = js.native
  /**
    * An un-mangled function name, if `function_name` is
    * [mangled](http://www.avabodh.com/cxxin/namemangling.html). The name can
    * be fully-qualified (up to 1024 bytes).
    */
  var originalFunctionName: js.UndefOr[SchemaTruncatableString] = js.native
  /**
    * The version of the deployed source code (up to 128 bytes).
    */
  var sourceVersion: js.UndefOr[SchemaTruncatableString] = js.native
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
    def withColumnNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withFileName(value: SchemaTruncatableString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(js.undefined)
        ret
    }
    @scala.inline
    def withFunctionName(value: SchemaTruncatableString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunctionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionName")(js.undefined)
        ret
    }
    @scala.inline
    def withLineNumber(value: String): Self = {
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
    @scala.inline
    def withLoadModule(value: SchemaModule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadModule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadModule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadModule")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginalFunctionName(value: SchemaTruncatableString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalFunctionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalFunctionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalFunctionName")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceVersion(value: SchemaTruncatableString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceVersion")(js.undefined)
        ret
    }
  }
  
}

