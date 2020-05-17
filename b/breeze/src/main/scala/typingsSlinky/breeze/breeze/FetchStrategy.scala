package typingsSlinky.breeze.breeze

import typingsSlinky.breeze.breeze.core.EnumSymbol
import typingsSlinky.breeze.breeze.core.IEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FetchStrategy extends IEnum {
  var FromLocalCache: FetchStrategySymbol = js.native
  var FromServer: FetchStrategySymbol = js.native
}

object FetchStrategy {
  @scala.inline
  def apply(
    FromLocalCache: FetchStrategySymbol,
    FromServer: FetchStrategySymbol,
    contains: js.Any => Boolean,
    fromName: String => EnumSymbol,
    getNames: () => js.Array[String],
    getSymbols: () => js.Array[EnumSymbol]
  ): FetchStrategy = {
    val __obj = js.Dynamic.literal(FromLocalCache = FromLocalCache.asInstanceOf[js.Any], FromServer = FromServer.asInstanceOf[js.Any], contains = js.Any.fromFunction1(contains), fromName = js.Any.fromFunction1(fromName), getNames = js.Any.fromFunction0(getNames), getSymbols = js.Any.fromFunction0(getSymbols))
    __obj.asInstanceOf[FetchStrategy]
  }
  @scala.inline
  implicit class FetchStrategyOps[Self <: FetchStrategy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFromLocalCache(value: FetchStrategySymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FromLocalCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFromServer(value: FetchStrategySymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FromServer")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

