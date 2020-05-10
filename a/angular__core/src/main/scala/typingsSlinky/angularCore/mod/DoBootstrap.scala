package typingsSlinky.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DoBootstrap extends js.Object {
  def ngDoBootstrap(appRef: ApplicationRef): Unit = js.native
}

object DoBootstrap {
  @scala.inline
  def apply(ngDoBootstrap: ApplicationRef => Unit): DoBootstrap = {
    val __obj = js.Dynamic.literal(ngDoBootstrap = js.Any.fromFunction1(ngDoBootstrap))
    __obj.asInstanceOf[DoBootstrap]
  }
  @scala.inline
  implicit class DoBootstrapOps[Self <: DoBootstrap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNgDoBootstrap(value: ApplicationRef => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ngDoBootstrap")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

