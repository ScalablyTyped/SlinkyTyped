package typingsSlinky.rootAsn1.anon

import typingsSlinky.rootAsn1.rootAsn1Booleans.`false`
import typingsSlinky.rootAsn1.rootAsn1Booleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Der extends js.Object {
  var der: js.typedarray.Uint8Array = js.native
  var json: js.UndefOr[`true`] = js.native
  var verbose: js.UndefOr[`false`] = js.native
}

object Der {
  @scala.inline
  def apply(der: js.typedarray.Uint8Array): Der = {
    val __obj = js.Dynamic.literal(der = der.asInstanceOf[js.Any])
    __obj.asInstanceOf[Der]
  }
  @scala.inline
  implicit class DerOps[Self <: Der] (val x: Self) extends AnyVal {
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
    def setDer(value: js.typedarray.Uint8Array): Self = this.set("der", value.asInstanceOf[js.Any])
    @scala.inline
    def setJson(value: `true`): Self = this.set("json", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJson: Self = this.set("json", js.undefined)
    @scala.inline
    def setVerbose(value: `false`): Self = this.set("verbose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
  }
  
}

