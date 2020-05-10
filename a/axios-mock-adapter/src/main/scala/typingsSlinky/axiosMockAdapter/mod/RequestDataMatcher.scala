package typingsSlinky.axiosMockAdapter.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestDataMatcher
  extends /* index */ StringDictionary[js.Any] {
  var params: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object RequestDataMatcher {
  @scala.inline
  def apply(): RequestDataMatcher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestDataMatcher]
  }
  @scala.inline
  implicit class RequestDataMatcherOps[Self <: RequestDataMatcher] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParams(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(js.undefined)
        ret
    }
  }
  
}

