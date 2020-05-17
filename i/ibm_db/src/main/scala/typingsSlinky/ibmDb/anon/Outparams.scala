package typingsSlinky.ibmDb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Outparams extends js.Object {
  var outparams: js.Any = js.native
  var result: js.Array[_] = js.native
}

object Outparams {
  @scala.inline
  def apply(outparams: js.Any, result: js.Array[_]): Outparams = {
    val __obj = js.Dynamic.literal(outparams = outparams.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Outparams]
  }
  @scala.inline
  implicit class OutparamsOps[Self <: Outparams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOutparams(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outparams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResult(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

