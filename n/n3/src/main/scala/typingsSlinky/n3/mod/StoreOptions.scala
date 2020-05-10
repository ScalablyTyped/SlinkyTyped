package typingsSlinky.n3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoreOptions extends js.Object {
  var factory: js.UndefOr[
    typingsSlinky.rdfJs.mod.DataFactory[typingsSlinky.rdfJs.mod.Quad, typingsSlinky.rdfJs.mod.Quad]
  ] = js.native
}

object StoreOptions {
  @scala.inline
  def apply(): StoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StoreOptions]
  }
  @scala.inline
  implicit class StoreOptionsOps[Self <: StoreOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFactory(
      value: typingsSlinky.rdfJs.mod.DataFactory[typingsSlinky.rdfJs.mod.Quad, typingsSlinky.rdfJs.mod.Quad]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFactory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factory")(js.undefined)
        ret
    }
  }
  
}

