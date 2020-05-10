package typingsSlinky.reactI18next

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonInitialI18nStore extends js.Object {
  var initialI18nStore: StringDictionary[js.Object] = js.native
  var initialLanguage: String = js.native
}

object AnonInitialI18nStore {
  @scala.inline
  def apply(initialI18nStore: StringDictionary[js.Object], initialLanguage: String): AnonInitialI18nStore = {
    val __obj = js.Dynamic.literal(initialI18nStore = initialI18nStore.asInstanceOf[js.Any], initialLanguage = initialLanguage.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInitialI18nStore]
  }
  @scala.inline
  implicit class AnonInitialI18nStoreOps[Self <: AnonInitialI18nStore] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInitialI18nStore(value: StringDictionary[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialI18nStore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitialLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialLanguage")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

