package typingsSlinky.rbacA

import typingsSlinky.rbacA.mod.AttributesManager
import typingsSlinky.rbacA.mod.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAttributes[P /* <: Provider */, AM /* <: AttributesManager */] extends js.Object {
  var attributes: js.UndefOr[AM] = js.native
  var provider: P = js.native
}

object AnonAttributes {
  @scala.inline
  def apply[P, AM](provider: P): AnonAttributes[P, AM] = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAttributes[P, AM]]
  }
  @scala.inline
  implicit class AnonAttributesOps[Self[p, am] <: AnonAttributes[p, am], P, AM] (val x: Self[P, AM]) extends AnyVal {
    @scala.inline
    def duplicate: Self[P, AM] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[P, AM]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[P, AM]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[P, AM]) with Other]
    @scala.inline
    def withProvider(value: P): Self[P, AM] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttributes(value: AM): Self[P, AM] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self[P, AM] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(js.undefined)
        ret
    }
  }
  
}

