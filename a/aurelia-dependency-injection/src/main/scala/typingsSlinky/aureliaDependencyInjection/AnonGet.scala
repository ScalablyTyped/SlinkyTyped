package typingsSlinky.aureliaDependencyInjection

import typingsSlinky.aureliaDependencyInjection.mod.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGet extends js.Object {
  def get(container: Container, key: js.Any): js.Any = js.native
}

object AnonGet {
  @scala.inline
  def apply(get: (Container, js.Any) => js.Any): AnonGet = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get))
    __obj.asInstanceOf[AnonGet]
  }
  @scala.inline
  implicit class AnonGetOps[Self <: AnonGet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: (Container, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

