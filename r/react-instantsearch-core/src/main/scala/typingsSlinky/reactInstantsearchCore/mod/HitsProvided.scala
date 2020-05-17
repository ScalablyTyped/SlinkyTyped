package typingsSlinky.reactInstantsearchCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HitsProvided[THit] extends js.Object {
  /** the records that matched the search state */
  var hits: js.Array[Hit[THit]] = js.native
}

object HitsProvided {
  @scala.inline
  def apply[THit](hits: js.Array[Hit[THit]]): HitsProvided[THit] = {
    val __obj = js.Dynamic.literal(hits = hits.asInstanceOf[js.Any])
    __obj.asInstanceOf[HitsProvided[THit]]
  }
  @scala.inline
  implicit class HitsProvidedOps[Self[thit] <: HitsProvided[thit], THit] (val x: Self[THit]) extends AnyVal {
    @scala.inline
    def duplicate: Self[THit] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[THit]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[THit] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[THit] with Other]
    @scala.inline
    def withHits(value: js.Array[Hit[THit]]): Self[THit] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hits")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

