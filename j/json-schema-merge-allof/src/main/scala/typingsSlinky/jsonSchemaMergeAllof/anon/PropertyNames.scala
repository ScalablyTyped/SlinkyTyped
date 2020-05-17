package typingsSlinky.jsonSchemaMergeAllof.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropertyNames extends js.Object {
  var propertyNames: js.UndefOr[js.Any] = js.native
}

object PropertyNames {
  @scala.inline
  def apply(): PropertyNames = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertyNames]
  }
  @scala.inline
  implicit class PropertyNamesOps[Self <: PropertyNames] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPropertyNames(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPropertyNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyNames")(js.undefined)
        ret
    }
  }
  
}

