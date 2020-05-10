package typingsSlinky.cypressCucumberPreprocessor.stepsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transform extends js.Object {
  var name: js.UndefOr[String] = js.native
  var preferForRegexpMatch: js.UndefOr[Boolean] = js.native
  var regexp: js.RegExp = js.native
  var typeName: js.UndefOr[String] = js.native
  var useForSnippets: js.UndefOr[Boolean] = js.native
  def transformer(arg: String*): js.Any = js.native
}

object Transform {
  @scala.inline
  def apply(regexp: js.RegExp, transformer: /* repeated */ String => js.Any): Transform = {
    val __obj = js.Dynamic.literal(regexp = regexp.asInstanceOf[js.Any], transformer = js.Any.fromFunction1(transformer))
    __obj.asInstanceOf[Transform]
  }
  @scala.inline
  implicit class TransformOps[Self <: Transform] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRegexp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regexp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransformer(value: /* repeated */ String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPreferForRegexpMatch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferForRegexpMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferForRegexpMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferForRegexpMatch")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeName")(js.undefined)
        ret
    }
    @scala.inline
    def withUseForSnippets(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useForSnippets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseForSnippets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useForSnippets")(js.undefined)
        ret
    }
  }
  
}

