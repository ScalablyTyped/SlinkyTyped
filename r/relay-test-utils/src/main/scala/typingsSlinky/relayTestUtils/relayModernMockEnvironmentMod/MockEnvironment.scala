package typingsSlinky.relayTestUtils.relayModernMockEnvironmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MockEnvironment extends js.Object {
  var mock: MockFunctions = js.native
  def mockClear(): Unit = js.native
}

object MockEnvironment {
  @scala.inline
  def apply(mock: MockFunctions, mockClear: () => Unit): MockEnvironment = {
    val __obj = js.Dynamic.literal(mock = mock.asInstanceOf[js.Any], mockClear = js.Any.fromFunction0(mockClear))
    __obj.asInstanceOf[MockEnvironment]
  }
  @scala.inline
  implicit class MockEnvironmentOps[Self <: MockEnvironment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMock(value: MockFunctions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMockClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mockClear")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

