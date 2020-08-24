package typingsSlinky.rootAsn1.anon

import typingsSlinky.rootAsn1.rootAsn1Booleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DerJson extends js.Object {
  var der: js.typedarray.Uint8Array = js.native
  var json: js.UndefOr[`true`] = js.native
  var verbose: `true` = js.native
}

object DerJson {
  @scala.inline
  def apply(der: js.typedarray.Uint8Array, verbose: `true`): DerJson = {
    val __obj = js.Dynamic.literal(der = der.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[DerJson]
  }
  @scala.inline
  implicit class DerJsonOps[Self <: DerJson] (val x: Self) extends AnyVal {
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
    def setVerbose(value: `true`): Self = this.set("verbose", value.asInstanceOf[js.Any])
    @scala.inline
    def setJson(value: `true`): Self = this.set("json", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJson: Self = this.set("json", js.undefined)
  }
  
}

