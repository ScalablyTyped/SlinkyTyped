package typingsSlinky.angularCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Providers extends js.Object {
  var providers: js.UndefOr[js.Array[_]] = js.native
  var useJit: js.UndefOr[Boolean] = js.native
}

object Providers {
  @scala.inline
  def apply(): Providers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Providers]
  }
  @scala.inline
  implicit class ProvidersOps[Self <: Providers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProviders(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProviders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providers")(js.undefined)
        ret
    }
    @scala.inline
    def withUseJit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useJit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseJit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useJit")(js.undefined)
        ret
    }
  }
  
}

