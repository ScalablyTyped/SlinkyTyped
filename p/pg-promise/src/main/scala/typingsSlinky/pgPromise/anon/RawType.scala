package typingsSlinky.pgPromise.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RawType extends js.Object {
  var rawType: js.Symbol = js.native
  var toPostgres: js.Symbol = js.native
}

object RawType {
  @scala.inline
  def apply(rawType: js.Symbol, toPostgres: js.Symbol): RawType = {
    val __obj = js.Dynamic.literal(rawType = rawType.asInstanceOf[js.Any], toPostgres = toPostgres.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawType]
  }
  @scala.inline
  implicit class RawTypeOps[Self <: RawType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRawType(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToPostgres(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toPostgres")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

