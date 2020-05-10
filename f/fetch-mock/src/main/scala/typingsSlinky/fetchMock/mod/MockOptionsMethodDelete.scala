package typingsSlinky.fetchMock.mod

import typingsSlinky.fetchMock.fetchMockStrings.DELETE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MockOptionsMethodDelete extends MockOptions {
  @JSName("method")
  var method_MockOptionsMethodDelete: js.UndefOr[DELETE] = js.native
}

object MockOptionsMethodDelete {
  @scala.inline
  def apply(): MockOptionsMethodDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MockOptionsMethodDelete]
  }
  @scala.inline
  implicit class MockOptionsMethodDeleteOps[Self <: MockOptionsMethodDelete] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMethod(value: DELETE): Self = {
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

