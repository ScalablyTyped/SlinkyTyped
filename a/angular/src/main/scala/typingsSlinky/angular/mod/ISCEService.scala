package typingsSlinky.angular.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

///////////////////////////////////////////////////////////////////////////
// SCEService
// see http://docs.angularjs.org/api/ng.$sce
///////////////////////////////////////////////////////////////////////////
@js.native
trait ISCEService extends js.Object {
  def getTrusted(`type`: String, mayBeTrusted: js.Any): js.Any = js.native
  def getTrustedCss(value: js.Any): js.Any = js.native
  def getTrustedHtml(value: js.Any): js.Any = js.native
  def getTrustedJs(value: js.Any): js.Any = js.native
  def getTrustedResourceUrl(value: js.Any): js.Any = js.native
  def getTrustedUrl(value: js.Any): js.Any = js.native
  def isEnabled(): Boolean = js.native
  def parse(`type`: String, expression: String): js.Function2[/* context */ js.Any, /* locals */ js.Any, _] = js.native
  def parseAsCss(expression: String): js.Function2[/* context */ js.Any, /* locals */ js.Any, _] = js.native
  def parseAsHtml(expression: String): js.Function2[/* context */ js.Any, /* locals */ js.Any, _] = js.native
  def parseAsJs(expression: String): js.Function2[/* context */ js.Any, /* locals */ js.Any, _] = js.native
  def parseAsResourceUrl(expression: String): js.Function2[/* context */ js.Any, /* locals */ js.Any, _] = js.native
  def parseAsUrl(expression: String): js.Function2[/* context */ js.Any, /* locals */ js.Any, _] = js.native
  def trustAs(`type`: String, value: js.Any): js.Any = js.native
  def trustAsHtml(value: js.Any): js.Any = js.native
  def trustAsJs(value: js.Any): js.Any = js.native
  def trustAsResourceUrl(value: js.Any): js.Any = js.native
  def trustAsUrl(value: js.Any): js.Any = js.native
}

object ISCEService {
  @scala.inline
  def apply(
    getTrusted: (String, js.Any) => js.Any,
    getTrustedCss: js.Any => js.Any,
    getTrustedHtml: js.Any => js.Any,
    getTrustedJs: js.Any => js.Any,
    getTrustedResourceUrl: js.Any => js.Any,
    getTrustedUrl: js.Any => js.Any,
    isEnabled: () => Boolean,
    parse: (String, String) => js.Function2[/* context */ js.Any, /* locals */ js.Any, _],
    parseAsCss: String => js.Function2[/* context */ js.Any, /* locals */ js.Any, _],
    parseAsHtml: String => js.Function2[/* context */ js.Any, /* locals */ js.Any, _],
    parseAsJs: String => js.Function2[/* context */ js.Any, /* locals */ js.Any, _],
    parseAsResourceUrl: String => js.Function2[/* context */ js.Any, /* locals */ js.Any, _],
    parseAsUrl: String => js.Function2[/* context */ js.Any, /* locals */ js.Any, _],
    trustAs: (String, js.Any) => js.Any,
    trustAsHtml: js.Any => js.Any,
    trustAsJs: js.Any => js.Any,
    trustAsResourceUrl: js.Any => js.Any,
    trustAsUrl: js.Any => js.Any
  ): ISCEService = {
    val __obj = js.Dynamic.literal(getTrusted = js.Any.fromFunction2(getTrusted), getTrustedCss = js.Any.fromFunction1(getTrustedCss), getTrustedHtml = js.Any.fromFunction1(getTrustedHtml), getTrustedJs = js.Any.fromFunction1(getTrustedJs), getTrustedResourceUrl = js.Any.fromFunction1(getTrustedResourceUrl), getTrustedUrl = js.Any.fromFunction1(getTrustedUrl), isEnabled = js.Any.fromFunction0(isEnabled), parse = js.Any.fromFunction2(parse), parseAsCss = js.Any.fromFunction1(parseAsCss), parseAsHtml = js.Any.fromFunction1(parseAsHtml), parseAsJs = js.Any.fromFunction1(parseAsJs), parseAsResourceUrl = js.Any.fromFunction1(parseAsResourceUrl), parseAsUrl = js.Any.fromFunction1(parseAsUrl), trustAs = js.Any.fromFunction2(trustAs), trustAsHtml = js.Any.fromFunction1(trustAsHtml), trustAsJs = js.Any.fromFunction1(trustAsJs), trustAsResourceUrl = js.Any.fromFunction1(trustAsResourceUrl), trustAsUrl = js.Any.fromFunction1(trustAsUrl))
    __obj.asInstanceOf[ISCEService]
  }
  @scala.inline
  implicit class ISCEServiceOps[Self <: ISCEService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetTrusted(value: (String, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTrusted")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetTrustedCss(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTrustedCss")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetTrustedHtml(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTrustedHtml")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetTrustedJs(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTrustedJs")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetTrustedResourceUrl(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTrustedResourceUrl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetTrustedUrl(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTrustedUrl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsEnabled(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnabled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withParse(value: (String, String) => js.Function2[/* context */ js.Any, /* locals */ js.Any, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withParseAsCss(value: String => js.Function2[/* context */ js.Any, /* locals */ js.Any, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseAsCss")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withParseAsHtml(value: String => js.Function2[/* context */ js.Any, /* locals */ js.Any, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseAsHtml")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withParseAsJs(value: String => js.Function2[/* context */ js.Any, /* locals */ js.Any, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseAsJs")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withParseAsResourceUrl(value: String => js.Function2[/* context */ js.Any, /* locals */ js.Any, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseAsResourceUrl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withParseAsUrl(value: String => js.Function2[/* context */ js.Any, /* locals */ js.Any, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseAsUrl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTrustAs(value: (String, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trustAs")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTrustAsHtml(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trustAsHtml")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTrustAsJs(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trustAsJs")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTrustAsResourceUrl(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trustAsResourceUrl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTrustAsUrl(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trustAsUrl")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

