package typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InlineObjectProperties extends js.Object {
  var embeddedObject: js.UndefOr[EmbeddedObject] = js.native
}

object InlineObjectProperties {
  @scala.inline
  def apply(): InlineObjectProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InlineObjectProperties]
  }
  @scala.inline
  implicit class InlineObjectPropertiesOps[Self <: InlineObjectProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmbeddedObject(value: EmbeddedObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embeddedObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmbeddedObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embeddedObject")(js.undefined)
        ret
    }
  }
  
}

