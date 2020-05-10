package typingsSlinky.restify.mod.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JsonBodyParserOptions extends js.Object {
  var bodyReader: js.UndefOr[Boolean] = js.native
  var mapParams: js.UndefOr[Boolean] = js.native
  var overrideParams: js.UndefOr[Boolean] = js.native
  var reviver: js.UndefOr[js.Function2[/* key */ js.Any, /* value */ js.Any, _]] = js.native
}

object JsonBodyParserOptions {
  @scala.inline
  def apply(): JsonBodyParserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsonBodyParserOptions]
  }
  @scala.inline
  implicit class JsonBodyParserOptionsOps[Self <: JsonBodyParserOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBodyReader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyReader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodyReader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyReader")(js.undefined)
        ret
    }
    @scala.inline
    def withMapParams(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapParams")(js.undefined)
        ret
    }
    @scala.inline
    def withOverrideParams(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrideParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideParams")(js.undefined)
        ret
    }
    @scala.inline
    def withReviver(value: (/* key */ js.Any, /* value */ js.Any) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reviver")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutReviver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reviver")(js.undefined)
        ret
    }
  }
  
}

