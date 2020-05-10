package typingsSlinky.openfin.identityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NativeIdOptional
  extends Identity
     with ExternalWindowIdentity {
  var nativeId: js.UndefOr[String] = js.native
}

object NativeIdOptional {
  @scala.inline
  def apply(uuid: String): NativeIdOptional = {
    val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeIdOptional]
  }
  @scala.inline
  implicit class NativeIdOptionalOps[Self <: NativeIdOptional] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNativeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNativeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeId")(js.undefined)
        ret
    }
  }
  
}

