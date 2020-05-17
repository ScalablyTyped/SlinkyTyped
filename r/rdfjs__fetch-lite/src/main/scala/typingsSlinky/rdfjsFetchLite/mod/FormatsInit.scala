package typingsSlinky.rdfjsFetchLite.mod

import typingsSlinky.rdfjsFetchLite.anon.FnCall
import typingsSlinky.rdfjsFetchLite.anon.PickparsersSinkMapEventEm
import typingsSlinky.std.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormatsInit extends RequestInit {
  var fetch: js.UndefOr[FnCall] = js.native
  var formats: PickparsersSinkMapEventEm = js.native
}

object FormatsInit {
  @scala.inline
  def apply(formats: PickparsersSinkMapEventEm): FormatsInit = {
    val __obj = js.Dynamic.literal(formats = formats.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatsInit]
  }
  @scala.inline
  implicit class FormatsInitOps[Self <: FormatsInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormats(value: PickparsersSinkMapEventEm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFetch(value: FnCall): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetch")(js.undefined)
        ret
    }
  }
  
}

