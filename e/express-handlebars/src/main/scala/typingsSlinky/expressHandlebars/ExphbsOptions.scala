package typingsSlinky.expressHandlebars

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExphbsOptions extends js.Object {
  var compilerOptions: js.UndefOr[js.Any] = js.native
  var defaultLayout: js.UndefOr[String] = js.native
  var extname: js.UndefOr[String] = js.native
  var handlebars: js.UndefOr[js.Any] = js.native
  var helpers: js.UndefOr[js.Any] = js.native
  var layoutsDir: js.UndefOr[String] = js.native
  var partialsDir: js.UndefOr[js.Any] = js.native
}

object ExphbsOptions {
  @scala.inline
  def apply(): ExphbsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExphbsOptions]
  }
  @scala.inline
  implicit class ExphbsOptionsOps[Self <: ExphbsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompilerOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compilerOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompilerOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compilerOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultLayout(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withExtname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extname")(js.undefined)
        ret
    }
    @scala.inline
    def withHandlebars(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handlebars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandlebars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handlebars")(js.undefined)
        ret
    }
    @scala.inline
    def withHelpers(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helpers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHelpers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helpers")(js.undefined)
        ret
    }
    @scala.inline
    def withLayoutsDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutsDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayoutsDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutsDir")(js.undefined)
        ret
    }
    @scala.inline
    def withPartialsDir(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partialsDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartialsDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partialsDir")(js.undefined)
        ret
    }
  }
  
}

