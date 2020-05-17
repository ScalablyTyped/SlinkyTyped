package typingsSlinky.backstopjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bitmapsreference extends js.Object {
  var bitmaps_reference: js.UndefOr[String] = js.native
  var bitmaps_test: js.UndefOr[String] = js.native
  var ci_report: js.UndefOr[String] = js.native
  var engine_scripts: js.UndefOr[String] = js.native
  var html_report: js.UndefOr[String] = js.native
  var json_report: js.UndefOr[String] = js.native
}

object Bitmapsreference {
  @scala.inline
  def apply(): Bitmapsreference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bitmapsreference]
  }
  @scala.inline
  implicit class BitmapsreferenceOps[Self <: Bitmapsreference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBitmaps_reference(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitmaps_reference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBitmaps_reference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitmaps_reference")(js.undefined)
        ret
    }
    @scala.inline
    def withBitmaps_test(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitmaps_test")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBitmaps_test: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitmaps_test")(js.undefined)
        ret
    }
    @scala.inline
    def withCi_report(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ci_report")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCi_report: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ci_report")(js.undefined)
        ret
    }
    @scala.inline
    def withEngine_scripts(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engine_scripts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngine_scripts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engine_scripts")(js.undefined)
        ret
    }
    @scala.inline
    def withHtml_report(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html_report")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtml_report: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html_report")(js.undefined)
        ret
    }
    @scala.inline
    def withJson_report(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json_report")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJson_report: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json_report")(js.undefined)
        ret
    }
  }
  
}

