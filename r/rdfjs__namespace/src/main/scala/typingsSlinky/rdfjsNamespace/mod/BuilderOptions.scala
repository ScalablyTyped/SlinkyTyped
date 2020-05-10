package typingsSlinky.rdfjsNamespace.mod

import typingsSlinky.rdfJs.mod.DataFactory
import typingsSlinky.rdfJs.mod.Quad
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuilderOptions extends js.Object {
  var factory: js.UndefOr[DataFactory[Quad, Quad]] = js.native
}

object BuilderOptions {
  @scala.inline
  def apply(): BuilderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuilderOptions]
  }
  @scala.inline
  implicit class BuilderOptionsOps[Self <: BuilderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFactory(value: DataFactory[Quad, Quad]): Self = {
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

