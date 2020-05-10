package typingsSlinky.nodeGettext.mod

import typingsSlinky.nodeGettext.nodeGettextStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetText extends js.Object {
  val domain: String = js.native
  val locale: String = js.native
  def addTranslations(locale: String, domain: String, translations: js.Object): Unit = js.native
  def dgettext(domain: String, msgid: String): String = js.native
  def dngettext(domain: String, msgid: String, msgidPlural: String, count: Double): String = js.native
  def dnpgettext(domain: String, msgctxt: String, msgid: String, msgidPlural: String, count: Double): String = js.native
  def dpgettext(domain: String, msgctxt: String, msgid: String): String = js.native
  def emit(eventName: String, eventData: js.Any): Unit = js.native
  def getComment(domain: String, msgctxt: String, msgid: String): js.Object | Boolean = js.native
  def gettext(msgid: String): String = js.native
  def ngettext(msgid: String, msgidPlural: String, count: Double): String = js.native
  def npgettext(msgctxt: String, msgid: String, msgidPlural: String, count: Double): String = js.native
  @JSName("off")
  def off_error(eventName: error, callback: js.Function1[/* error */ js.Error, Unit]): Unit = js.native
  @JSName("on")
  def on_error(eventName: error, callback: js.Function1[/* error */ js.Error, Unit]): Unit = js.native
  def pgettext(msgctxt: String, msgid: String): String = js.native
  def setLocale(locale: String): Unit = js.native
  def setTextDomain(domain: String): Unit = js.native
  def textdomain(domain: String): Unit = js.native
  def warn(message: String): Unit = js.native
}

object GetText {
  @scala.inline
  def apply(
    addTranslations: (String, String, js.Object) => Unit,
    dgettext: (String, String) => String,
    dngettext: (String, String, String, Double) => String,
    dnpgettext: (String, String, String, String, Double) => String,
    domain: String,
    dpgettext: (String, String, String) => String,
    emit: (String, js.Any) => Unit,
    getComment: (String, String, String) => js.Object | Boolean,
    gettext: String => String,
    locale: String,
    ngettext: (String, String, Double) => String,
    npgettext: (String, String, String, Double) => String,
    off: (error, js.Function1[/* error */ js.Error, Unit]) => Unit,
    on: (error, js.Function1[/* error */ js.Error, Unit]) => Unit,
    pgettext: (String, String) => String,
    setLocale: String => Unit,
    setTextDomain: String => Unit,
    textdomain: String => Unit,
    warn: String => Unit
  ): GetText = {
    val __obj = js.Dynamic.literal(addTranslations = js.Any.fromFunction3(addTranslations), dgettext = js.Any.fromFunction2(dgettext), dngettext = js.Any.fromFunction4(dngettext), dnpgettext = js.Any.fromFunction5(dnpgettext), domain = domain.asInstanceOf[js.Any], dpgettext = js.Any.fromFunction3(dpgettext), emit = js.Any.fromFunction2(emit), getComment = js.Any.fromFunction3(getComment), gettext = js.Any.fromFunction1(gettext), locale = locale.asInstanceOf[js.Any], ngettext = js.Any.fromFunction3(ngettext), npgettext = js.Any.fromFunction4(npgettext), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), pgettext = js.Any.fromFunction2(pgettext), setLocale = js.Any.fromFunction1(setLocale), setTextDomain = js.Any.fromFunction1(setTextDomain), textdomain = js.Any.fromFunction1(textdomain), warn = js.Any.fromFunction1(warn))
    __obj.asInstanceOf[GetText]
  }
  @scala.inline
  implicit class GetTextOps[Self <: GetText] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddTranslations(value: (String, String, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addTranslations")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withDgettext(value: (String, String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dgettext")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDngettext(value: (String, String, String, Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dngettext")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withDnpgettext(value: (String, String, String, String, Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnpgettext")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDpgettext(value: (String, String, String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dpgettext")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withEmit(value: (String, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emit")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetComment(value: (String, String, String) => js.Object | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getComment")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGettext(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gettext")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNgettext(value: (String, String, Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ngettext")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withNpgettext(value: (String, String, String, Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("npgettext")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withOff(value: (error, js.Function1[/* error */ js.Error, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("off")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOn(value: (error, js.Function1[/* error */ js.Error, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPgettext(value: (String, String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pgettext")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetLocale(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLocale")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetTextDomain(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTextDomain")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTextdomain(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textdomain")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWarn(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warn")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

