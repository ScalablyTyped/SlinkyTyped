package typingsSlinky.mobx.tojsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToJSOptions extends js.Object {
  var detectCycles: js.UndefOr[Boolean] = js.native
  var exportMapsAsObjects: js.UndefOr[Boolean] = js.native
  var recurseEverything: js.UndefOr[Boolean] = js.native
}

object ToJSOptions {
  @scala.inline
  def apply(): ToJSOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToJSOptions]
  }
  @scala.inline
  implicit class ToJSOptionsOps[Self <: ToJSOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetectCycles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectCycles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetectCycles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectCycles")(js.undefined)
        ret
    }
    @scala.inline
    def withExportMapsAsObjects(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportMapsAsObjects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportMapsAsObjects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportMapsAsObjects")(js.undefined)
        ret
    }
    @scala.inline
    def withRecurseEverything(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recurseEverything")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecurseEverything: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recurseEverything")(js.undefined)
        ret
    }
  }
  
}

