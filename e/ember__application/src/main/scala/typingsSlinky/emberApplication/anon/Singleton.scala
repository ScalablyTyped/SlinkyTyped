package typingsSlinky.emberApplication.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Singleton extends js.Object {
  var singleton: js.UndefOr[Boolean] = js.native
}

object Singleton {
  @scala.inline
  def apply(): Singleton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Singleton]
  }
  @scala.inline
  implicit class SingletonOps[Self <: Singleton] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

