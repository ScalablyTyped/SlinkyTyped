package typingsSlinky.egg.anon

import typingsSlinky.egg.mod.Context
import typingsSlinky.egg.mod.IgnoreOrMatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Enable extends js.Object {
  var enable: Boolean = js.native
  var enableTypes: js.Array[String] = js.native
  var encoding: String = js.native
  var extendTypes: Form = js.native
  var formLimit: String = js.native
  var ignore: IgnoreOrMatch = js.native
  var jsonLimit: String = js.native
  var `match`: IgnoreOrMatch = js.native
  var queryString: ArrayLimit = js.native
  var strict: Boolean = js.native
}

object Enable {
  @scala.inline
  def apply(
    enable: Boolean,
    enableTypes: js.Array[String],
    encoding: String,
    extendTypes: Form,
    formLimit: String,
    ignore: IgnoreOrMatch,
    jsonLimit: String,
    `match`: IgnoreOrMatch,
    queryString: ArrayLimit,
    strict: Boolean
  ): Enable = {
    val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any], enableTypes = enableTypes.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], extendTypes = extendTypes.asInstanceOf[js.Any], formLimit = formLimit.asInstanceOf[js.Any], ignore = ignore.asInstanceOf[js.Any], jsonLimit = jsonLimit.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any], strict = strict.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Enable]
  }
  @scala.inline
  implicit class EnableOps[Self <: Enable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtendTypes(value: Form): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormLimit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIgnoreFunction1(value: /* ctx */ Context => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIgnoreRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIgnore(value: IgnoreOrMatch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJsonLimit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatchFunction1(value: /* ctx */ Context => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("match")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMatchRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("match")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatch(value: IgnoreOrMatch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("match")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueryString(value: ArrayLimit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrict(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

