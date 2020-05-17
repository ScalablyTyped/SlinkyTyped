package typingsSlinky.lunr.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Boost extends js.Object {
  var boost: js.UndefOr[Double] = js.native
  var extractor: js.UndefOr[js.Function1[/* doc */ js.Object, String | js.Object | js.Array[js.Object]]] = js.native
}

object Boost {
  @scala.inline
  def apply(): Boost = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Boost]
  }
  @scala.inline
  implicit class BoostOps[Self <: Boost] (val x: Self) extends AnyVal {
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

