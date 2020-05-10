package typingsSlinky.fetchMock.mod

import typingsSlinky.fetchMock.fetchMockStrings.POST
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MockOptionsMethodPost extends MockOptions {
  @JSName("method")
  var method_MockOptionsMethodPost: js.UndefOr[POST] = js.native
}

object MockOptionsMethodPost {
  @scala.inline
  def apply(): MockOptionsMethodPost = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MockOptionsMethodPost]
  }
  @scala.inline
  implicit class MockOptionsMethodPostOps[Self <: MockOptionsMethodPost] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMethod(value: POST): Self = {
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

