package typingsSlinky.fetchMock.mod

import typingsSlinky.fetchMock.fetchMockStrings.GET
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MockOptionsMethodGet extends MockOptions {
  @JSName("method")
  var method_MockOptionsMethodGet: js.UndefOr[GET] = js.native
}

object MockOptionsMethodGet {
  @scala.inline
  def apply(): MockOptionsMethodGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MockOptionsMethodGet]
  }
  @scala.inline
  implicit class MockOptionsMethodGetOps[Self <: MockOptionsMethodGet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMethod(value: GET): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
        ret
    }
  }
  
}

