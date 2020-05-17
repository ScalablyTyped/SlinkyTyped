package typingsSlinky.reactInstantsearchDom.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Translations extends js.Object {
  var translations: js.UndefOr[StringDictionary[js.Function2[/* n */ Double, /* ms */ Double, String]]] = js.native
}

object Translations {
  @scala.inline
  def apply(): Translations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Translations]
  }
  @scala.inline
  implicit class TranslationsOps[Self <: Translations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTranslations(value: StringDictionary[js.Function2[/* n */ Double, /* ms */ Double, String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(js.undefined)
        ret
    }
  }
  
}

