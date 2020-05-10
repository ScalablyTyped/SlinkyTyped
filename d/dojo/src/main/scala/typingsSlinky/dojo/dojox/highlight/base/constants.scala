package typingsSlinky.dojo.dojox.highlight.base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/highlight/_base.constants.html
  *
  *
  */
@js.native
trait constants extends js.Object {
  /**
    *
    */
  var APOS_STRING_MODE: js.Object = js.native
  /**
    *
    */
  var BACKSLASH_ESCAPE: js.Object = js.native
  /**
    *
    */
  var C_BLOCK_COMMENT_MODE: js.Object = js.native
  /**
    *
    */
  var C_LINE_COMMENT_MODE: js.Object = js.native
  /**
    *
    */
  var C_NUMBER_MODE: js.Object = js.native
  /**
    *
    */
  var C_NUMBER_RE: String = js.native
  /**
    *
    */
  var HASH_COMMENT_MODE: js.Object = js.native
  /**
    *
    */
  var IDENT_RE: String = js.native
  /**
    *
    */
  var NUMBER_RE: String = js.native
  /**
    *
    */
  var QUOTE_STRING_MODE: js.Object = js.native
  /**
    *
    */
  var UNDERSCORE_IDENT_RE: String = js.native
}

object constants {
  @scala.inline
  def apply(
    APOS_STRING_MODE: js.Object,
    BACKSLASH_ESCAPE: js.Object,
    C_BLOCK_COMMENT_MODE: js.Object,
    C_LINE_COMMENT_MODE: js.Object,
    C_NUMBER_MODE: js.Object,
    C_NUMBER_RE: String,
    HASH_COMMENT_MODE: js.Object,
    IDENT_RE: String,
    NUMBER_RE: String,
    QUOTE_STRING_MODE: js.Object,
    UNDERSCORE_IDENT_RE: String
  ): constants = {
    val __obj = js.Dynamic.literal(APOS_STRING_MODE = APOS_STRING_MODE.asInstanceOf[js.Any], BACKSLASH_ESCAPE = BACKSLASH_ESCAPE.asInstanceOf[js.Any], C_BLOCK_COMMENT_MODE = C_BLOCK_COMMENT_MODE.asInstanceOf[js.Any], C_LINE_COMMENT_MODE = C_LINE_COMMENT_MODE.asInstanceOf[js.Any], C_NUMBER_MODE = C_NUMBER_MODE.asInstanceOf[js.Any], C_NUMBER_RE = C_NUMBER_RE.asInstanceOf[js.Any], HASH_COMMENT_MODE = HASH_COMMENT_MODE.asInstanceOf[js.Any], IDENT_RE = IDENT_RE.asInstanceOf[js.Any], NUMBER_RE = NUMBER_RE.asInstanceOf[js.Any], QUOTE_STRING_MODE = QUOTE_STRING_MODE.asInstanceOf[js.Any], UNDERSCORE_IDENT_RE = UNDERSCORE_IDENT_RE.asInstanceOf[js.Any])
    __obj.asInstanceOf[constants]
  }
  @scala.inline
  implicit class constantsOps[Self <: constants] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAPOS_STRING_MODE(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("APOS_STRING_MODE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBACKSLASH_ESCAPE(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BACKSLASH_ESCAPE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withC_BLOCK_COMMENT_MODE(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("C_BLOCK_COMMENT_MODE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withC_LINE_COMMENT_MODE(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("C_LINE_COMMENT_MODE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withC_NUMBER_MODE(value: js.Object): Self = {
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
    def withHASH_COMMENT_MODE(value: js.Object): Self = {
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
    def withNUMBER_RE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NUMBER_RE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQUOTE_STRING_MODE(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QUOTE_STRING_MODE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUNDERSCORE_IDENT_RE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UNDERSCORE_IDENT_RE")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

