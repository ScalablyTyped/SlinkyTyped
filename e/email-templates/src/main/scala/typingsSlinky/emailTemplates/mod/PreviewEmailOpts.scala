package typingsSlinky.emailTemplates.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// No typedef for https://github.com/niftylettuce/preview-email
@js.native
trait PreviewEmailOpts extends js.Object {
  /**
    * a path to a directory for saving the generated email previews (defaults to os.tmpdir()
    */
  var dir: js.UndefOr[String] = js.native
  /**
    * a unique ID for the file name created for the preview in dir (defaults to uuid.v4() from uuid)
    */
  var id: js.UndefOr[String] = js.native
  /**
    * https://github.com/sindresorhus/open
    */
  var open: js.UndefOr[js.Any] = js.native
  /**
    * a file path to a pug template file (defaults to preview-email's template.pug by default)
    */
  var template: js.UndefOr[String] = js.native
}

object PreviewEmailOpts {
  @scala.inline
  def apply(): PreviewEmailOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreviewEmailOpts]
  }
  @scala.inline
  implicit class PreviewEmailOptsOps[Self <: PreviewEmailOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withOpen(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.undefined)
        ret
    }
  }
  
}

