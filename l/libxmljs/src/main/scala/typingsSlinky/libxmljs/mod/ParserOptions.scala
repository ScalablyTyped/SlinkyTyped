package typingsSlinky.libxmljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line:strict-export-declare-modifiers
@js.native
trait ParserOptions extends js.Object {
  var baseUrl: js.UndefOr[String] = js.native
  var basefix: js.UndefOr[Boolean] = js.native
  var big_lines: js.UndefOr[Boolean] = js.native
  var blanks: js.UndefOr[Boolean] = js.native
  var cdata: js.UndefOr[Boolean] = js.native
  var compact: js.UndefOr[Boolean] = js.native
  var dict: js.UndefOr[Boolean] = js.native
  var doctype: js.UndefOr[Boolean] = js.native
  var dtdattr: js.UndefOr[js.Any] = js.native
  var dtdload: js.UndefOr[Boolean] = js.native
  var dtdvalid: js.UndefOr[Boolean] = js.native
  var errors: js.UndefOr[Boolean] = js.native
  var huge: js.UndefOr[Boolean] = js.native
  var ignore_enc: js.UndefOr[Boolean] = js.native
  var implied: js.UndefOr[Boolean] = js.native
  var net: js.UndefOr[Boolean] = js.native
  var nobasefix: js.UndefOr[Boolean] = js.native
  var noblanks: js.UndefOr[Boolean] = js.native
  var nocdata: js.UndefOr[Boolean] = js.native
  var nodict: js.UndefOr[Boolean] = js.native
  var noent: js.UndefOr[Boolean] = js.native
  var noerror: js.UndefOr[Boolean] = js.native
  var nonet: js.UndefOr[Boolean] = js.native
  var nowarning: js.UndefOr[Boolean] = js.native
  var noxincnode: js.UndefOr[Boolean] = js.native
  var nsclean: js.UndefOr[Boolean] = js.native
  var old: js.UndefOr[Boolean] = js.native
  var oldsax: js.UndefOr[Boolean] = js.native
  var pedantic: js.UndefOr[Boolean] = js.native
  var recover: js.UndefOr[Boolean] = js.native
  var sax1: js.UndefOr[Boolean] = js.native
  var warnings: js.UndefOr[Boolean] = js.native
  var xinclude: js.UndefOr[Boolean] = js.native
}

object ParserOptions {
  @scala.inline
  def apply(): ParserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParserOptions]
  }
  @scala.inline
  implicit class ParserOptionsOps[Self <: ParserOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withBasefix(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBasefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basefix")(js.undefined)
        ret
    }
    @scala.inline
    def withBig_lines(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("big_lines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBig_lines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("big_lines")(js.undefined)
        ret
    }
    @scala.inline
    def withBlanks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blanks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlanks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blanks")(js.undefined)
        ret
    }
    @scala.inline
    def withCdata(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cdata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCdata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cdata")(js.undefined)
        ret
    }
    @scala.inline
    def withCompact(value: Boolean): Self = {
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
    def withDict(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dict")(js.undefined)
        ret
    }
    @scala.inline
    def withDoctype(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doctype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoctype: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doctype")(js.undefined)
        ret
    }
    @scala.inline
    def withDtdattr(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtdattr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDtdattr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtdattr")(js.undefined)
        ret
    }
    @scala.inline
    def withDtdload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtdload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDtdload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtdload")(js.undefined)
        ret
    }
    @scala.inline
    def withDtdvalid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtdvalid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDtdvalid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtdvalid")(js.undefined)
        ret
    }
    @scala.inline
    def withErrors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(js.undefined)
        ret
    }
    @scala.inline
    def withHuge(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("huge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHuge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("huge")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnore_enc(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore_enc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnore_enc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore_enc")(js.undefined)
        ret
    }
    @scala.inline
    def withImplied(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implied")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImplied: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implied")(js.undefined)
        ret
    }
    @scala.inline
    def withNet(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("net")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("net")(js.undefined)
        ret
    }
    @scala.inline
    def withNobasefix(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nobasefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNobasefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nobasefix")(js.undefined)
        ret
    }
    @scala.inline
    def withNoblanks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noblanks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoblanks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noblanks")(js.undefined)
        ret
    }
    @scala.inline
    def withNocdata(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nocdata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNocdata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nocdata")(js.undefined)
        ret
    }
    @scala.inline
    def withNodict(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodict")(js.undefined)
        ret
    }
    @scala.inline
    def withNoent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noent")(js.undefined)
        ret
    }
    @scala.inline
    def withNoerror(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noerror")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoerror: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noerror")(js.undefined)
        ret
    }
    @scala.inline
    def withNonet(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonet")(js.undefined)
        ret
    }
    @scala.inline
    def withNowarning(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nowarning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNowarning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nowarning")(js.undefined)
        ret
    }
    @scala.inline
    def withNoxincnode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noxincnode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoxincnode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noxincnode")(js.undefined)
        ret
    }
    @scala.inline
    def withNsclean(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nsclean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNsclean: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nsclean")(js.undefined)
        ret
    }
    @scala.inline
    def withOld(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("old")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOld: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("old")(js.undefined)
        ret
    }
    @scala.inline
    def withOldsax(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldsax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOldsax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldsax")(js.undefined)
        ret
    }
    @scala.inline
    def withPedantic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pedantic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPedantic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pedantic")(js.undefined)
        ret
    }
    @scala.inline
    def withRecover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recover")(js.undefined)
        ret
    }
    @scala.inline
    def withSax1(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sax1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSax1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sax1")(js.undefined)
        ret
    }
    @scala.inline
    def withWarnings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarnings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnings")(js.undefined)
        ret
    }
    @scala.inline
    def withXinclude(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xinclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXinclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xinclude")(js.undefined)
        ret
    }
  }
  
}

