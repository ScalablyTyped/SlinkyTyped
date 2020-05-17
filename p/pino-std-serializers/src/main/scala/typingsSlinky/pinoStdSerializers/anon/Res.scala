package typingsSlinky.pinoStdSerializers.anon

import typingsSlinky.pinoStdSerializers.mod.SerializedResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Res extends js.Object {
  var res: SerializedResponse = js.native
}

object Res {
  @scala.inline
  def apply(res: SerializedResponse): Res = {
    val __obj = js.Dynamic.literal(res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[Res]
  }
  @scala.inline
  implicit class ResOps[Self <: Res] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRes(value: SerializedResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("res")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

