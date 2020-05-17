package typingsSlinky.gulpBabel.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ast extends js.Object {
  var ast: js.UndefOr[Boolean] = js.native
  var auxiliaryCommentAfter: js.UndefOr[js.Any] = js.native
  var auxiliaryCommentBefore: js.UndefOr[js.Any] = js.native
  var code: js.UndefOr[Boolean] = js.native
  var comments: js.UndefOr[Boolean] = js.native
  var compact: js.UndefOr[js.Any] = js.native
  var env: js.UndefOr[js.Any] = js.native
  var filename: js.UndefOr[String] = js.native
  var filenameRelative: js.UndefOr[String] = js.native
  var getModuleId: js.UndefOr[js.Any] = js.native
  var highlightCode: js.UndefOr[Boolean] = js.native
  var ignore: js.UndefOr[String | js.Array[String]] = js.native
  var inputSourceMap: js.UndefOr[js.Any] = js.native
  var keepModuleIdExtesions: js.UndefOr[Boolean] = js.native
  var moduleId: js.UndefOr[js.Any] = js.native
  var moduleIds: js.UndefOr[js.Any] = js.native
  var moduleRoot: js.UndefOr[js.Any] = js.native
  var only: js.UndefOr[String | js.Array[String]] = js.native
  var plugins: js.UndefOr[js.Array[String]] = js.native
  var presets: js.UndefOr[js.Array[String]] = js.native
  var resolveModuleSource: js.UndefOr[js.Any] = js.native
  var retainLines: js.UndefOr[Boolean] = js.native
  var shouldPrintComment: js.UndefOr[js.Any] = js.native
  var sourceFileName: js.UndefOr[js.Any] = js.native
  var sourceMapTarget: js.UndefOr[js.Any] = js.native
  var sourceMaps: js.UndefOr[js.Any] = js.native
  var sourceRoot: js.UndefOr[js.Any] = js.native
}

object Ast {
  @scala.inline
  def apply(): Ast = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ast]
  }
  @scala.inline
  implicit class AstOps[Self <: Ast] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAst(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ast")(js.undefined)
        ret
    }
    @scala.inline
    def withAuxiliaryCommentAfter(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auxiliaryCommentAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuxiliaryCommentAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auxiliaryCommentAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withAuxiliaryCommentBefore(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auxiliaryCommentBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuxiliaryCommentBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auxiliaryCommentBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withCode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(js.undefined)
        ret
    }
    @scala.inline
    def withComments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(js.undefined)
        ret
    }
    @scala.inline
    def withCompact(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compact")(js.undefined)
        ret
    }
    @scala.inline
    def withEnv(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(js.undefined)
        ret
    }
    @scala.inline
    def withFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(js.undefined)
        ret
    }
    @scala.inline
    def withFilenameRelative(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filenameRelative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilenameRelative: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filenameRelative")(js.undefined)
        ret
    }
    @scala.inline
    def withGetModuleId(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getModuleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetModuleId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getModuleId")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightCode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightCode")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnore(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(js.undefined)
        ret
    }
    @scala.inline
    def withInputSourceMap(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputSourceMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputSourceMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputSourceMap")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepModuleIdExtesions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepModuleIdExtesions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepModuleIdExtesions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepModuleIdExtesions")(js.undefined)
        ret
    }
    @scala.inline
    def withModuleId(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModuleId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleId")(js.undefined)
        ret
    }
    @scala.inline
    def withModuleIds(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModuleIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleIds")(js.undefined)
        ret
    }
    @scala.inline
    def withModuleRoot(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModuleRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleRoot")(js.undefined)
        ret
    }
    @scala.inline
    def withOnly(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("only")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("only")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugins(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(js.undefined)
        ret
    }
    @scala.inline
    def withPresets(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPresets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presets")(js.undefined)
        ret
    }
    @scala.inline
    def withResolveModuleSource(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveModuleSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolveModuleSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveModuleSource")(js.undefined)
        ret
    }
    @scala.inline
    def withRetainLines(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retainLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetainLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retainLines")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldPrintComment(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldPrintComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldPrintComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldPrintComment")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceFileName(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceFileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceFileName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceFileName")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceMapTarget(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMapTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceMapTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMapTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceMaps(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMaps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceMaps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMaps")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceRoot(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceRoot")(js.undefined)
        ret
    }
  }
  
}

