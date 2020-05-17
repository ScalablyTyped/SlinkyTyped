package typingsSlinky.reactInstantsearchCore.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TranslatableExposed extends js.Object {
  var translations: js.UndefOr[StringDictionary[String | (js.Function1[/* repeated */ js.Any, String])]] = js.native
}

object TranslatableExposed {
  @scala.inline
  def apply(): TranslatableExposed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TranslatableExposed]
  }
  @scala.inline
  implicit class TranslatableExposedOps[Self <: TranslatableExposed] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTranslations(value: StringDictionary[String | (js.Function1[/* repeated */ js.Any, String])]): Self = {
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

