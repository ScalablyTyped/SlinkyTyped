package typingsSlinky.gulpTypescript.reporterMod

import typingsSlinky.gulpTypescript.AnonCharacter
import typingsSlinky.gulpTypescript.typesMod.VinylFile
import typingsSlinky.std.Error
import typingsSlinky.typescript.mod.Diagnostic
import typingsSlinky.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeScriptError extends Error {
  var diagnostic: Diagnostic = js.native
  var endPosition: js.UndefOr[AnonCharacter] = js.native
  var file: js.UndefOr[VinylFile] = js.native
  var fullFilename: js.UndefOr[String] = js.native
  var relativeFilename: js.UndefOr[String] = js.native
  var startPosition: js.UndefOr[AnonCharacter] = js.native
  var tsFile: js.UndefOr[SourceFile] = js.native
}

object TypeScriptError {
  @scala.inline
  def apply(diagnostic: Diagnostic, message: String, name: String): TypeScriptError = {
    val __obj = js.Dynamic.literal(diagnostic = diagnostic.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeScriptError]
  }
  @scala.inline
  implicit class TypeScriptErrorOps[Self <: TypeScriptError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDiagnostic(value: Diagnostic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagnostic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndPosition(value: AnonCharacter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withFile(value: VinylFile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(js.undefined)
        ret
    }
    @scala.inline
    def withFullFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullFilename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullFilename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullFilename")(js.undefined)
        ret
    }
    @scala.inline
    def withRelativeFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeFilename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelativeFilename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeFilename")(js.undefined)
        ret
    }
    @scala.inline
    def withStartPosition(value: AnonCharacter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withTsFile(value: SourceFile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tsFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTsFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tsFile")(js.undefined)
        ret
    }
  }
  
}

