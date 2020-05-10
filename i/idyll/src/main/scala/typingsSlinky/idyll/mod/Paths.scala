package typingsSlinky.idyll.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Record<idyll.idyll.PredefinedFile, string> & std.Record<idyll.idyll.ComponentFiles, std.Array<string>> */
@js.native
trait Paths extends js.Object {
  var APP_PATH: String = js.native
  var COMPONENT_DIRS: js.Array[String] = js.native
  var CSS_INPUT_FILE: String = js.native
  var CSS_OUTPUT_FILE: String = js.native
  var DATA_DIR: String = js.native
  var DEFAULT_COMPONENT_DIRS: js.Array[String] = js.native
  var HTML_OUTPUT_FILE: String = js.native
  var HTML_TEMPLATE_FILE: String = js.native
  var IDYLL_INPUT_FILE: String = js.native
  var INPUT_DIR: String = js.native
  var JS_OUTPUT_FILE: String = js.native
  var OUTPUT_DIR: String = js.native
  var PACKAGE_FILE: String = js.native
  var TMP_DIR: String = js.native
}

object Paths {
  @scala.inline
  def apply(
    APP_PATH: String,
    COMPONENT_DIRS: js.Array[String],
    CSS_INPUT_FILE: String,
    CSS_OUTPUT_FILE: String,
    DATA_DIR: String,
    DEFAULT_COMPONENT_DIRS: js.Array[String],
    HTML_OUTPUT_FILE: String,
    HTML_TEMPLATE_FILE: String,
    IDYLL_INPUT_FILE: String,
    INPUT_DIR: String,
    JS_OUTPUT_FILE: String,
    OUTPUT_DIR: String,
    PACKAGE_FILE: String,
    TMP_DIR: String
  ): Paths = {
    val __obj = js.Dynamic.literal(APP_PATH = APP_PATH.asInstanceOf[js.Any], COMPONENT_DIRS = COMPONENT_DIRS.asInstanceOf[js.Any], CSS_INPUT_FILE = CSS_INPUT_FILE.asInstanceOf[js.Any], CSS_OUTPUT_FILE = CSS_OUTPUT_FILE.asInstanceOf[js.Any], DATA_DIR = DATA_DIR.asInstanceOf[js.Any], DEFAULT_COMPONENT_DIRS = DEFAULT_COMPONENT_DIRS.asInstanceOf[js.Any], HTML_OUTPUT_FILE = HTML_OUTPUT_FILE.asInstanceOf[js.Any], HTML_TEMPLATE_FILE = HTML_TEMPLATE_FILE.asInstanceOf[js.Any], IDYLL_INPUT_FILE = IDYLL_INPUT_FILE.asInstanceOf[js.Any], INPUT_DIR = INPUT_DIR.asInstanceOf[js.Any], JS_OUTPUT_FILE = JS_OUTPUT_FILE.asInstanceOf[js.Any], OUTPUT_DIR = OUTPUT_DIR.asInstanceOf[js.Any], PACKAGE_FILE = PACKAGE_FILE.asInstanceOf[js.Any], TMP_DIR = TMP_DIR.asInstanceOf[js.Any])
    __obj.asInstanceOf[Paths]
  }
  @scala.inline
  implicit class PathsOps[Self <: Paths] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAPP_PATH(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("APP_PATH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCOMPONENT_DIRS(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("COMPONENT_DIRS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCSS_INPUT_FILE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CSS_INPUT_FILE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCSS_OUTPUT_FILE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CSS_OUTPUT_FILE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDATA_DIR(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DATA_DIR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDEFAULT_COMPONENT_DIRS(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_COMPONENT_DIRS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHTML_OUTPUT_FILE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTML_OUTPUT_FILE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHTML_TEMPLATE_FILE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTML_TEMPLATE_FILE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIDYLL_INPUT_FILE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IDYLL_INPUT_FILE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withINPUT_DIR(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("INPUT_DIR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJS_OUTPUT_FILE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JS_OUTPUT_FILE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOUTPUT_DIR(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OUTPUT_DIR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPACKAGE_FILE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PACKAGE_FILE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTMP_DIR(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TMP_DIR")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

