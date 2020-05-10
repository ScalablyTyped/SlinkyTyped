package typingsSlinky.lunr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBoost extends js.Object {
  var boost: js.UndefOr[Double] = js.native
  var extractor: js.UndefOr[js.Function1[/* doc */ js.Object, String | js.Object | js.Array[js.Object]]] = js.native
}

object AnonBoost {
  @scala.inline
  def apply(): AnonBoost = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonBoost]
  }
  @scala.inline
  implicit class AnonBoostOps[Self <: AnonBoost] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoost(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boost")(js.undefined)
        ret
    }
    @scala.inline
    def withExtractor(value: /* doc */ js.Object => String | js.Object | js.Array[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extractor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutExtractor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extractor")(js.undefined)
        ret
    }
  }
  
}

