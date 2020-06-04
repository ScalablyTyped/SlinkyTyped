package typingsSlinky.angularCompiler.i18nUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait I18nMeta extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var meaning: js.UndefOr[String] = js.undefined
}

object I18nMeta {
  @scala.inline
  def apply(): I18nMeta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[I18nMeta]
  }
  @scala.inline
  implicit class I18nMetaOps[Self <: I18nMeta] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setMeaning(value: String): Self = this.set("meaning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeaning: Self = this.set("meaning", js.undefined)
  }
  
}

