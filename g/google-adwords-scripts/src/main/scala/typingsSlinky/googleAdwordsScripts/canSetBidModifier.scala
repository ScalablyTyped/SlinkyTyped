package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait canSetBidModifier extends js.Object {
  def getBidModifier(): Double = js.native
  def setBidModifier(modifier: Double): Unit = js.native
}

object canSetBidModifier {
  @scala.inline
  def apply(getBidModifier: () => Double, setBidModifier: Double => Unit): canSetBidModifier = {
    val __obj = js.Dynamic.literal(getBidModifier = js.Any.fromFunction0(getBidModifier), setBidModifier = js.Any.fromFunction1(setBidModifier))
    __obj.asInstanceOf[canSetBidModifier]
  }
  @scala.inline
  implicit class canSetBidModifierOps[Self <: canSetBidModifier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetBidModifier(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBidModifier")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetBidModifier(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBidModifier")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

