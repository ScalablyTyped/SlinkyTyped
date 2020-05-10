package typingsSlinky.highlightJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HLJSStatic extends js.Object {
  var APOS_STRING_MODE: IMode = js.native
  // Common modes
  var BACKSLASH_ESCAPE: IMode = js.native
  var BINARY_NUMBER_MODE: IMode = js.native
  var BINARY_NUMBER_RE: String = js.native
  var CSS_NUMBER_MODE: IMode = js.native
  var C_BLOCK_COMMENT_MODE: IMode = js.native
  var C_LINE_COMMENT_MODE: IMode = js.native
  var C_NUMBER_MODE: IMode = js.native
  var C_NUMBER_RE: String = js.native
  var HASH_COMMENT_MODE: IMode = js.native
  // Common regexps
  var IDENT_RE: String = js.native
  var NUMBER_MODE: IMode = js.native
  var NUMBER_RE: String = js.native
  var PHRASAL_WORDS_MODE: IMode = js.native
  var QUOTE_STRING_MODE: IMode = js.native
  var REGEX_MODE: IMode = js.native
  var RE_STARTERS_RE: String = js.native
  var TITLE_MODE: IMode = js.native
  var UNDERSCORE_IDENT_RE: String = js.native
  var UNDERSCORE_TITLE_MODE: IMode = js.native
  def inherit(parent: js.Object, obj: js.Object): js.Object = js.native
}

object HLJSStatic {
  @scala.inline
  def apply(
    APOS_STRING_MODE: IMode,
    BACKSLASH_ESCAPE: IMode,
    BINARY_NUMBER_MODE: IMode,
    BINARY_NUMBER_RE: String,
    CSS_NUMBER_MODE: IMode,
    C_BLOCK_COMMENT_MODE: IMode,
    C_LINE_COMMENT_MODE: IMode,
    C_NUMBER_MODE: IMode,
    C_NUMBER_RE: String,
    HASH_COMMENT_MODE: IMode,
    IDENT_RE: String,
    NUMBER_MODE: IMode,
    NUMBER_RE: String,
    PHRASAL_WORDS_MODE: IMode,
    QUOTE_STRING_MODE: IMode,
    REGEX_MODE: IMode,
    RE_STARTERS_RE: String,
    TITLE_MODE: IMode,
    UNDERSCORE_IDENT_RE: String,
    UNDERSCORE_TITLE_MODE: IMode,
    inherit: (js.Object, js.Object) => js.Object
  ): HLJSStatic = {
    val __obj = js.Dynamic.literal(APOS_STRING_MODE = APOS_STRING_MODE.asInstanceOf[js.Any], BACKSLASH_ESCAPE = BACKSLASH_ESCAPE.asInstanceOf[js.Any], BINARY_NUMBER_MODE = BINARY_NUMBER_MODE.asInstanceOf[js.Any], BINARY_NUMBER_RE = BINARY_NUMBER_RE.asInstanceOf[js.Any], CSS_NUMBER_MODE = CSS_NUMBER_MODE.asInstanceOf[js.Any], C_BLOCK_COMMENT_MODE = C_BLOCK_COMMENT_MODE.asInstanceOf[js.Any], C_LINE_COMMENT_MODE = C_LINE_COMMENT_MODE.asInstanceOf[js.Any], C_NUMBER_MODE = C_NUMBER_MODE.asInstanceOf[js.Any], C_NUMBER_RE = C_NUMBER_RE.asInstanceOf[js.Any], HASH_COMMENT_MODE = HASH_COMMENT_MODE.asInstanceOf[js.Any], IDENT_RE = IDENT_RE.asInstanceOf[js.Any], NUMBER_MODE = NUMBER_MODE.asInstanceOf[js.Any], NUMBER_RE = NUMBER_RE.asInstanceOf[js.Any], PHRASAL_WORDS_MODE = PHRASAL_WORDS_MODE.asInstanceOf[js.Any], QUOTE_STRING_MODE = QUOTE_STRING_MODE.asInstanceOf[js.Any], REGEX_MODE = REGEX_MODE.asInstanceOf[js.Any], RE_STARTERS_RE = RE_STARTERS_RE.asInstanceOf[js.Any], TITLE_MODE = TITLE_MODE.asInstanceOf[js.Any], UNDERSCORE_IDENT_RE = UNDERSCORE_IDENT_RE.asInstanceOf[js.Any], UNDERSCORE_TITLE_MODE = UNDERSCORE_TITLE_MODE.asInstanceOf[js.Any], inherit = js.Any.fromFunction2(inherit))
    __obj.asInstanceOf[HLJSStatic]
  }
  @scala.inline
  implicit class HLJSStaticOps[Self <: HLJSStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAPOS_STRING_MODE(value: IMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("APOS_STRING_MODE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBACKSLASH_ESCAPE(value: IMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BACKSLASH_ESCAPE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBINARY_NUMBER_MODE(value: IMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BINARY_NUMBER_MODE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBINARY_NUMBER_RE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BINARY_NUMBER_RE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCSS_NUMBER_MODE(value: IMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CSS_NUMBER_MODE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withC_BLOCK_COMMENT_MODE(value: IMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("C_BLOCK_COMMENT_MODE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withC_LINE_COMMENT_MODE(value: IMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("C_LINE_COMMENT_MODE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withC_NUMBER_MODE(value: IMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("C_NUMBER_MODE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withC_NUMBER_RE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("C_NUMBER_RE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHASH_COMMENT_MODE(value: IMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HASH_COMMENT_MODE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIDENT_RE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IDENT_RE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNUMBER_MODE(value: IMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NUMBER_MODE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNUMBER_RE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NUMBER_RE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPHRASAL_WORDS_MODE(value: IMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PHRASAL_WORDS_MODE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQUOTE_STRING_MODE(value: IMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QUOTE_STRING_MODE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withREGEX_MODE(value: IMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("REGEX_MODE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRE_STARTERS_RE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RE_STARTERS_RE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTITLE_MODE(value: IMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TITLE_MODE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUNDERSCORE_IDENT_RE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UNDERSCORE_IDENT_RE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUNDERSCORE_TITLE_MODE(value: IMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UNDERSCORE_TITLE_MODE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInherit(value: (js.Object, js.Object) => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inherit")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

