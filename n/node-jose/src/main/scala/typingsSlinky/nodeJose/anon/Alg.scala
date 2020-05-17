package typingsSlinky.nodeJose.anon

import typingsSlinky.nodeJose.nodeJoseStrings.compact
import typingsSlinky.nodeJose.nodeJoseStrings.flattened
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Alg extends js.Object {
  var alg: js.UndefOr[String] = js.native
  var compact: js.UndefOr[Boolean] = js.native
  var fields: js.UndefOr[js.Object] = js.native
  var format: js.UndefOr[compact | flattened] = js.native
}

object Alg {
  @scala.inline
  def apply(): Alg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Alg]
  }
  @scala.inline
  implicit class AlgOps[Self <: Alg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alg")(js.undefined)
        ret
    }
    @scala.inline
    def withCompact(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compact")(js.undefined)
        ret
    }
    @scala.inline
    def withFields(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: compact | flattened): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
  }
  
}

