package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TopicBidding extends AdWordsBidding {
  def clearCpc(): Unit = js.native
  def clearCpm(): Unit = js.native
  def getCpc(): Double = js.native
  def getCpm(): Double = js.native
  def setCpc(cpc: Double): Unit = js.native
  def setCpm(cpm: Double): Unit = js.native
}

object TopicBidding {
  @scala.inline
  def apply(
    clearCpc: () => Unit,
    clearCpm: () => Unit,
    getCpc: () => Double,
    getCpm: () => Double,
    getStrategy: () => BiddingStrategy,
    getStrategySource: () => BiddingStrategySource,
    getStrategyType: () => String,
    setCpc: Double => Unit,
    setCpm: Double => Unit
  ): TopicBidding = {
    val __obj = js.Dynamic.literal(clearCpc = js.Any.fromFunction0(clearCpc), clearCpm = js.Any.fromFunction0(clearCpm), getCpc = js.Any.fromFunction0(getCpc), getCpm = js.Any.fromFunction0(getCpm), getStrategy = js.Any.fromFunction0(getStrategy), getStrategySource = js.Any.fromFunction0(getStrategySource), getStrategyType = js.Any.fromFunction0(getStrategyType), setCpc = js.Any.fromFunction1(setCpc), setCpm = js.Any.fromFunction1(setCpm))
    __obj.asInstanceOf[TopicBidding]
  }
  @scala.inline
  implicit class TopicBiddingOps[Self <: TopicBidding] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearCpc(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearCpc")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withClearCpm(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearCpm")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCpc(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCpc")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCpm(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCpm")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetCpc(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCpc")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetCpm(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCpm")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

