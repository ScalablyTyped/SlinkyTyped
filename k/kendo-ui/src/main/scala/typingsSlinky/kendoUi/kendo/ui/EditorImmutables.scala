package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditorImmutables extends js.Object {
  var deserialization: js.UndefOr[js.Function] = js.native
  var serialization: js.UndefOr[String | js.Function] = js.native
}

object EditorImmutables {
  @scala.inline
  def apply(): EditorImmutables = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorImmutables]
  }
  @scala.inline
  implicit class EditorImmutablesOps[Self <: EditorImmutables] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeserialization(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deserialization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeserialization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deserialization")(js.undefined)
        ret
    }
    @scala.inline
    def withSerialization(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSerialization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialization")(js.undefined)
        ret
    }
  }
  
}

