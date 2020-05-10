package typingsSlinky.reactAdaptiveHooks

import typingsSlinky.reactAdaptiveHooks.networkMod.EffectiveConnectionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEffectiveConnectionType extends js.Object {
  var effectiveConnectionType: EffectiveConnectionType | Null = js.native
  var unsupported: Boolean = js.native
}

object AnonEffectiveConnectionType {
  @scala.inline
  def apply(unsupported: Boolean): AnonEffectiveConnectionType = {
    val __obj = js.Dynamic.literal(unsupported = unsupported.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEffectiveConnectionType]
  }
  @scala.inline
  implicit class AnonEffectiveConnectionTypeOps[Self <: AnonEffectiveConnectionType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUnsupported(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsupported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEffectiveConnectionType(value: EffectiveConnectionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectiveConnectionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEffectiveConnectionTypeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectiveConnectionType")(null)
        ret
    }
  }
  
}

