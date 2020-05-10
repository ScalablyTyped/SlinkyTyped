package typingsSlinky.angularMocks.mod.angularAugmentingMod

import typingsSlinky.angular.mod.IServiceProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

///////////////////////////////////////////////////////////////////////////
// ExceptionHandlerService
// see https://docs.angularjs.org/api/ngMock/service/$exceptionHandler
// see https://docs.angularjs.org/api/ngMock/provider/$exceptionHandlerProvider
///////////////////////////////////////////////////////////////////////////
@js.native
trait IExceptionHandlerProvider extends IServiceProvider {
  def mode(mode: String): Unit = js.native
}

object IExceptionHandlerProvider {
  @scala.inline
  def apply($get: js.Any, mode: String => Unit): IExceptionHandlerProvider = {
    val __obj = js.Dynamic.literal($get = $get.asInstanceOf[js.Any], mode = js.Any.fromFunction1(mode))
    __obj.asInstanceOf[IExceptionHandlerProvider]
  }
  @scala.inline
  implicit class IExceptionHandlerProviderOps[Self <: IExceptionHandlerProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMode(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

