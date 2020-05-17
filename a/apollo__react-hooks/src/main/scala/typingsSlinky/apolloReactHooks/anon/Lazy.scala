package typingsSlinky.apolloReactHooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lazy extends js.Object {
  var `lazy`: js.UndefOr[Boolean] = js.native
}

object Lazy {
  @scala.inline
  def apply(): Lazy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Lazy]
  }
  @scala.inline
  implicit class LazyOps[Self <: Lazy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLazy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLazy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazy")(js.undefined)
        ret
    }
  }
  
}

