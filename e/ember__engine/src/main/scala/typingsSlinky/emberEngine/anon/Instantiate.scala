package typingsSlinky.emberEngine.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instantiate extends js.Object {
  var instantiate: js.UndefOr[Boolean] = js.native
  var singleton: js.UndefOr[Boolean] = js.native
}

object Instantiate {
  @scala.inline
  def apply(): Instantiate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Instantiate]
  }
  @scala.inline
  implicit class InstantiateOps[Self <: Instantiate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstantiate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instantiate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstantiate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instantiate")(js.undefined)
        ret
    }
    @scala.inline
    def withSingleton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingleton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleton")(js.undefined)
        ret
    }
  }
  
}

