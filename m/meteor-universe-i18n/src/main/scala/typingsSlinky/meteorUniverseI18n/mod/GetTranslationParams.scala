package typingsSlinky.meteorUniverseI18n.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTranslationParams
  extends /* key */ StringDictionary[js.Any] {
  var _locale: js.UndefOr[String] = js.native
  var _namespace: js.UndefOr[String] = js.native
}

object GetTranslationParams {
  @scala.inline
  def apply(): GetTranslationParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTranslationParams]
  }
  @scala.inline
  implicit class GetTranslationParamsOps[Self <: GetTranslationParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_locale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_locale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_locale")(js.undefined)
        ret
    }
    @scala.inline
    def with_namespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_namespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_namespace")(js.undefined)
        ret
    }
  }
  
}

