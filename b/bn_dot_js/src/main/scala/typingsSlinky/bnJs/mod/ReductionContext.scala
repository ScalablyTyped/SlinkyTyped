package typingsSlinky.bnJs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReductionContext
  extends /* key */ StringDictionary[js.Any] {
  var m: Double = js.native
  var prime: MPrime = js.native
}

object ReductionContext {
  @scala.inline
  def apply(m: Double, prime: MPrime): ReductionContext = {
    val __obj = js.Dynamic.literal(m = m.asInstanceOf[js.Any], prime = prime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReductionContext]
  }
  @scala.inline
  implicit class ReductionContextOps[Self <: ReductionContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withM(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrime(value: MPrime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prime")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

