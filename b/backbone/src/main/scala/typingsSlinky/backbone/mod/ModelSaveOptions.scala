package typingsSlinky.backbone.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelSaveOptions
  extends Silenceable
     with Waitable
     with Validable
     with Parseable
     with PersistenceOptions {
  var patch: js.UndefOr[Boolean] = js.native
}

object ModelSaveOptions {
  @scala.inline
  def apply(): ModelSaveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelSaveOptions]
  }
  @scala.inline
  implicit class ModelSaveOptionsOps[Self <: ModelSaveOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPatch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.undefined)
        ret
    }
  }
  
}

