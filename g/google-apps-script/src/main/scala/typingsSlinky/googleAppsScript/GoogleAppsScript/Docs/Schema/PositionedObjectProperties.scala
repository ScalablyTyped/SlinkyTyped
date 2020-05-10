package typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PositionedObjectProperties extends js.Object {
  var embeddedObject: js.UndefOr[EmbeddedObject] = js.native
  var positioning: js.UndefOr[PositionedObjectPositioning] = js.native
}

object PositionedObjectProperties {
  @scala.inline
  def apply(): PositionedObjectProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PositionedObjectProperties]
  }
  @scala.inline
  implicit class PositionedObjectPropertiesOps[Self <: PositionedObjectProperties] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withPositioning(value: PositionedObjectPositioning): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positioning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositioning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positioning")(js.undefined)
        ret
    }
  }
  
}

