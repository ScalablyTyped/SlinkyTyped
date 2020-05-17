package typingsSlinky.jointjs.mod.dia.Cell

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmbeddableOptions extends Options {
  var deep: js.UndefOr[Boolean] = js.native
}

object EmbeddableOptions {
  @scala.inline
  def apply(): EmbeddableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmbeddableOptions]
  }
  @scala.inline
  implicit class EmbeddableOptionsOps[Self <: EmbeddableOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeep(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deep")(js.undefined)
        ret
    }
  }
  
}

