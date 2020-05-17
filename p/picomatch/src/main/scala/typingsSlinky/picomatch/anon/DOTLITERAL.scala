package typingsSlinky.picomatch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DOTLITERAL extends js.Object {
  var DOTS_SLASH: String = js.native
  var DOT_LITERAL: String = js.native
  var END_ANCHOR: String = js.native
  var NO_DOT: String = js.native
  var NO_DOTS: String = js.native
  var NO_DOTS_SLASH: String = js.native
  var NO_DOT_SLASH: String = js.native
  var ONE_CHAR: String = js.native
  var PLUS_LITERAL: String = js.native
  var QMARK: String = js.native
  var QMARK_LITERAL: String = js.native
  var QMARK_NO_DOT: String = js.native
  var SLASH_LITERAL: String = js.native
  var STAR: String = js.native
  var START_ANCHOR: String = js.native
}

object DOTLITERAL {
  @scala.inline
  def apply(
    DOTS_SLASH: String,
    DOT_LITERAL: String,
    END_ANCHOR: String,
    NO_DOT: String,
    NO_DOTS: String,
    NO_DOTS_SLASH: String,
    NO_DOT_SLASH: String,
    ONE_CHAR: String,
    PLUS_LITERAL: String,
    QMARK: String,
    QMARK_LITERAL: String,
    QMARK_NO_DOT: String,
    SLASH_LITERAL: String,
    STAR: String,
    START_ANCHOR: String
  ): DOTLITERAL = {
    val __obj = js.Dynamic.literal(DOTS_SLASH = DOTS_SLASH.asInstanceOf[js.Any], DOT_LITERAL = DOT_LITERAL.asInstanceOf[js.Any], END_ANCHOR = END_ANCHOR.asInstanceOf[js.Any], NO_DOT = NO_DOT.asInstanceOf[js.Any], NO_DOTS = NO_DOTS.asInstanceOf[js.Any], NO_DOTS_SLASH = NO_DOTS_SLASH.asInstanceOf[js.Any], NO_DOT_SLASH = NO_DOT_SLASH.asInstanceOf[js.Any], ONE_CHAR = ONE_CHAR.asInstanceOf[js.Any], PLUS_LITERAL = PLUS_LITERAL.asInstanceOf[js.Any], QMARK = QMARK.asInstanceOf[js.Any], QMARK_LITERAL = QMARK_LITERAL.asInstanceOf[js.Any], QMARK_NO_DOT = QMARK_NO_DOT.asInstanceOf[js.Any], SLASH_LITERAL = SLASH_LITERAL.asInstanceOf[js.Any], STAR = STAR.asInstanceOf[js.Any], START_ANCHOR = START_ANCHOR.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOTLITERAL]
  }
  @scala.inline
  implicit class DOTLITERALOps[Self <: DOTLITERAL] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDOTS_SLASH(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DOTS_SLASH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDOT_LITERAL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DOT_LITERAL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEND_ANCHOR(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("END_ANCHOR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNO_DOT(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NO_DOT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNO_DOTS(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NO_DOTS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNO_DOTS_SLASH(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NO_DOTS_SLASH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNO_DOT_SLASH(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NO_DOT_SLASH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withONE_CHAR(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ONE_CHAR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPLUS_LITERAL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PLUS_LITERAL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQMARK(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QMARK")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQMARK_LITERAL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QMARK_LITERAL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQMARK_NO_DOT(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QMARK_NO_DOT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSLASH_LITERAL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SLASH_LITERAL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSTAR(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("STAR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSTART_ANCHOR(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("START_ANCHOR")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

