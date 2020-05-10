package typingsSlinky.jestJasmine2

import typingsSlinky.jestJasmine2.typesMod.Spy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCurrentSpies extends js.Object {
  var currentSpies: js.UndefOr[js.Function0[js.Array[Spy]]] = js.native
}

object AnonCurrentSpies {
  @scala.inline
  def apply(): AnonCurrentSpies = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCurrentSpies]
  }
  @scala.inline
  implicit class AnonCurrentSpiesOps[Self <: AnonCurrentSpies] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentSpies(value: () => js.Array[Spy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentSpies")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutCurrentSpies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentSpies")(js.undefined)
        ret
    }
  }
  
}

