package typingsSlinky.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryOptionsConfiguration extends js.Object {
  var fetchStrategy: js.UndefOr[FetchStrategySymbol] = js.native
  var mergeStrategy: js.UndefOr[MergeStrategySymbol] = js.native
}

object QueryOptionsConfiguration {
  @scala.inline
  def apply(): QueryOptionsConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryOptionsConfiguration]
  }
  @scala.inline
  implicit class QueryOptionsConfigurationOps[Self <: QueryOptionsConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFetchStrategy(value: FetchStrategySymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetchStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchStrategy")(js.undefined)
        ret
    }
    @scala.inline
    def withMergeStrategy(value: MergeStrategySymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMergeStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeStrategy")(js.undefined)
        ret
    }
  }
  
}

