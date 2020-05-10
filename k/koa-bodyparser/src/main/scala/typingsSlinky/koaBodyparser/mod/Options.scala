package typingsSlinky.koaBodyparser.mod

import typingsSlinky.koa.mod.Context
import typingsSlinky.koaBodyparser.AnonForm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * custom json request detect function. Default is null
    */
  var detectJSON: js.UndefOr[js.Function1[/* ctx */ Context, Boolean]] = js.native
  /**
    *  parser will only parse when request type hits enableTypes, default is ['json', 'form'].
    */
  var enableTypes: js.UndefOr[js.Array[String]] = js.native
  /**
    * requested encoding. Default is utf-8 by co-body
    */
  var encode: js.UndefOr[String] = js.native
  /**
    * support extend types
    */
  var extendTypes: js.UndefOr[AnonForm] = js.native
  /**
    * limit of the urlencoded body. If the body ends up being larger than this limit
    * a 413 error code is returned. Default is 56kb
    */
  var formLimit: js.UndefOr[String] = js.native
  /**
    * limit of the json body. Default is 1mb
    */
  var jsonLimit: js.UndefOr[String] = js.native
  /**
    * support custom error handle
    */
  var onerror: js.UndefOr[js.Function2[/* err */ js.Error, /* ctx */ Context, Unit]] = js.native
  /**
    * when set to true, JSON parser will only accept arrays and objects. Default is true
    */
  var strict: js.UndefOr[Boolean] = js.native
  /**
    * limit of the text body. Default is 1mb.
    */
  var textLimit: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetectJSON(value: /* ctx */ Context => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectJSON")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDetectJSON: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectJSON")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withEncode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encode")(js.undefined)
        ret
    }
    @scala.inline
    def withExtendTypes(value: AnonForm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtendTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withFormLimit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withJsonLimit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJsonLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withOnerror(value: (/* err */ js.Error, /* ctx */ Context) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onerror")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnerror: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onerror")(js.undefined)
        ret
    }
    @scala.inline
    def withStrict(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(js.undefined)
        ret
    }
    @scala.inline
    def withTextLimit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textLimit")(js.undefined)
        ret
    }
  }
  
}

