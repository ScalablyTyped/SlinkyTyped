package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdWordsBidding extends js.Object {
  def getStrategy(): BiddingStrategy = js.native
  def getStrategySource(): BiddingStrategySource = js.native
  def getStrategyType(): String = js.native
}

object AdWordsBidding {
  @scala.inline
  def apply(
    getStrategy: () => BiddingStrategy,
    getStrategySource: () => BiddingStrategySource,
    getStrategyType: () => String
  ): AdWordsBidding = {
    val __obj = js.Dynamic.literal(getStrategy = js.Any.fromFunction0(getStrategy), getStrategySource = js.Any.fromFunction0(getStrategySource), getStrategyType = js.Any.fromFunction0(getStrategyType))
    __obj.asInstanceOf[AdWordsBidding]
  }
  @scala.inline
  implicit class AdWordsBiddingOps[Self <: AdWordsBidding] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetStrategy(value: () => BiddingStrategy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStrategy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetStrategySource(value: () => BiddingStrategySource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStrategySource")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetStrategyType(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStrategyType")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

