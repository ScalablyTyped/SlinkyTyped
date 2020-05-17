package typingsSlinky.monacoEditor.mod.languages.json

import typingsSlinky.monacoEditor.anon.FileMatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiagnosticsOptions extends js.Object {
  /**
    * If set, comments are tolerated. If set to false, syntax errors will be emitted for comments.
    */
  val allowComments: js.UndefOr[Boolean] = js.native
  /**
    *  If set, the schema service would load schema content on-demand with 'fetch' if available
    */
  val enableSchemaRequest: js.UndefOr[Boolean] = js.native
  /**
    * A list of known schemas and/or associations of schemas to file names.
    */
  val schemas: js.UndefOr[js.Array[FileMatch]] = js.native
  /**
    * If set, the validator will be enabled and perform syntax validation as well as schema based validation.
    */
  val validate: js.UndefOr[Boolean] = js.native
}

object DiagnosticsOptions {
  @scala.inline
  def apply(): DiagnosticsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagnosticsOptions]
  }
  @scala.inline
  implicit class DiagnosticsOptionsOps[Self <: DiagnosticsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowComments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowComments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowComments")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableSchemaRequest(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSchemaRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableSchemaRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSchemaRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withSchemas(value: js.Array[FileMatch]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchemas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemas")(js.undefined)
        ret
    }
    @scala.inline
    def withValidate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.undefined)
        ret
    }
  }
  
}

