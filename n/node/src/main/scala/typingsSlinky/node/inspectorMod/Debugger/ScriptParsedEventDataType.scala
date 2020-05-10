package typingsSlinky.node.inspectorMod.Debugger

import typingsSlinky.node.inspectorMod.Runtime.ExecutionContextId
import typingsSlinky.node.inspectorMod.Runtime.ScriptId
import typingsSlinky.node.inspectorMod.Runtime.StackTrace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScriptParsedEventDataType extends js.Object {
  /**
    * Length of the last line of the script.
    */
  var endColumn: Double = js.native
  /**
    * Last line of the script.
    */
  var endLine: Double = js.native
  /**
    * Embedder-specific auxiliary data.
    */
  var executionContextAuxData: js.UndefOr[js.Object] = js.native
  /**
    * Specifies script creation context.
    */
  var executionContextId: ExecutionContextId = js.native
  /**
    * True, if this script has sourceURL.
    */
  var hasSourceURL: js.UndefOr[Boolean] = js.native
  /**
    * Content hash of the script.
    */
  var hash: String = js.native
  /**
    * True, if this script is generated as a result of the live edit operation.
    * @experimental
    */
  var isLiveEdit: js.UndefOr[Boolean] = js.native
  /**
    * True, if this script is ES6 module.
    */
  var isModule: js.UndefOr[Boolean] = js.native
  /**
    * This script length.
    */
  var length: js.UndefOr[Double] = js.native
  /**
    * Identifier of the script parsed.
    */
  var scriptId: ScriptId = js.native
  /**
    * URL of source map associated with script (if any).
    */
  var sourceMapURL: js.UndefOr[String] = js.native
  /**
    * JavaScript top stack frame of where the script parsed event was triggered if available.
    * @experimental
    */
  var stackTrace: js.UndefOr[StackTrace] = js.native
  /**
    * Column offset of the script within the resource with given URL.
    */
  var startColumn: Double = js.native
  /**
    * Line offset of the script within the resource with given URL (for script tags).
    */
  var startLine: Double = js.native
  /**
    * URL or name of the script parsed (if any).
    */
  var url: String = js.native
}

object ScriptParsedEventDataType {
  @scala.inline
  def apply(
    endColumn: Double,
    endLine: Double,
    executionContextId: ExecutionContextId,
    hash: String,
    scriptId: ScriptId,
    startColumn: Double,
    startLine: Double,
    url: String
  ): ScriptParsedEventDataType = {
    val __obj = js.Dynamic.literal(endColumn = endColumn.asInstanceOf[js.Any], endLine = endLine.asInstanceOf[js.Any], executionContextId = executionContextId.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], scriptId = scriptId.asInstanceOf[js.Any], startColumn = startColumn.asInstanceOf[js.Any], startLine = startLine.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptParsedEventDataType]
  }
  @scala.inline
  implicit class ScriptParsedEventDataTypeOps[Self <: ScriptParsedEventDataType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndColumn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndLine(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExecutionContextId(value: ExecutionContextId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionContextId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScriptId(value: ScriptId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartColumn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartLine(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExecutionContextAuxData(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionContextAuxData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionContextAuxData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionContextAuxData")(js.undefined)
        ret
    }
    @scala.inline
    def withHasSourceURL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasSourceURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasSourceURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasSourceURL")(js.undefined)
        ret
    }
    @scala.inline
    def withIsLiveEdit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLiveEdit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsLiveEdit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLiveEdit")(js.undefined)
        ret
    }
    @scala.inline
    def withIsModule(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isModule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsModule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isModule")(js.undefined)
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceMapURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMapURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceMapURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMapURL")(js.undefined)
        ret
    }
    @scala.inline
    def withStackTrace(value: StackTrace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackTrace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackTrace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackTrace")(js.undefined)
        ret
    }
  }
  
}

