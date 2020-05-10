package typingsSlinky.fetchMock.mod

import typingsSlinky.fetchMock.fetchMockStrings.PUT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MockOptionsMethodPut extends MockOptions {
  @JSName("method")
  var method_MockOptionsMethodPut: js.UndefOr[PUT] = js.native
}

object MockOptionsMethodPut {
  @scala.inline
  def apply(): MockOptionsMethodPut = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MockOptionsMethodPut]
  }
  @scala.inline
  implicit class MockOptionsMethodPutOps[Self <: MockOptionsMethodPut] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMethod(value: PUT): Self = {
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

