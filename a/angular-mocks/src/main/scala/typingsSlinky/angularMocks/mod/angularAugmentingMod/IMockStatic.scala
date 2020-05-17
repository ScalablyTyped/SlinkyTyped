package typingsSlinky.angularMocks.mod.angularAugmentingMod

import typingsSlinky.angular.mod.Injectable
import typingsSlinky.angularMocks.anon.Call
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMockStatic extends js.Object {
  @JSName("inject")
  var inject_Original: IInjectStatic = js.native
  // see https://docs.angularjs.org/api/ngMock/function/angular.mock.module
  @JSName("module")
  var module_Original: Call = js.native
  def TzDate(offset: Double, timestamp: String): js.Date = js.native
  // see https://docs.angularjs.org/api/ngMock/type/angular.mock.TzDate
  def TzDate(offset: Double, timestamp: Double): js.Date = js.native
  // see https://docs.angularjs.org/api/ngMock/function/angular.mock.dump
  def dump(obj: js.Any): String = js.native
  def inject(fns: (Injectable[js.Function1[/* repeated */ _, Unit]])*): js.Any = js.native
  // see https://docs.angularjs.org/api/ngMock/function/angular.mock.module
  def module(modules: js.Any*): js.Any = js.native
}

