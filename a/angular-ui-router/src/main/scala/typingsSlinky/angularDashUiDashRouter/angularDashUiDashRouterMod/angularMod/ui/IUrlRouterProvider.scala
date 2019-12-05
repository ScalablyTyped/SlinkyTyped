package typingsSlinky.angularDashUiDashRouter.angularDashUiDashRouterMod.angularMod.ui

import typingsSlinky.angular.angularMod.IServiceProvider
import typingsSlinky.angular.angularMod._Global_.Function
import typingsSlinky.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUrlRouterProvider extends IServiceProvider {
  /**
    * Disables (or enables) deferring location change interception.
    *
    * If you wish to customize the behavior of syncing the URL (for example, if you wish to defer a transition but maintain the current URL), call this method at configuration time. Then, at run time, call $urlRouter.listen() after you have configured your own $locationChangeSuccess event handler.
    *
    * @param {boolean} defer Indicates whether to defer location change interception. Passing no parameter is equivalent to true.
    */
  def deferIntercept(): Unit = js.native
  def deferIntercept(defer: Boolean): Unit = js.native
  def otherwise(handler: js.Array[_]): typingsSlinky.angularDashUiDashRouter.angularDashUiDashRouterMod.angularMod.ui.IUrlRouterProvider = js.native
  def otherwise(handler: Function): typingsSlinky.angularDashUiDashRouter.angularDashUiDashRouterMod.angularMod.ui.IUrlRouterProvider = js.native
  def otherwise(path: String): typingsSlinky.angularDashUiDashRouter.angularDashUiDashRouterMod.angularMod.ui.IUrlRouterProvider = js.native
  def rule(handler: js.Array[_]): typingsSlinky.angularDashUiDashRouter.angularDashUiDashRouterMod.angularMod.ui.IUrlRouterProvider = js.native
  def rule(handler: Function): typingsSlinky.angularDashUiDashRouter.angularDashUiDashRouterMod.angularMod.ui.IUrlRouterProvider = js.native
  def when(whenPath: String, handler: js.Array[_]): typingsSlinky.angularDashUiDashRouter.angularDashUiDashRouterMod.angularMod.ui.IUrlRouterProvider = js.native
  def when(whenPath: String, handler: Function): typingsSlinky.angularDashUiDashRouter.angularDashUiDashRouterMod.angularMod.ui.IUrlRouterProvider = js.native
  def when(whenPath: String, toPath: String): typingsSlinky.angularDashUiDashRouter.angularDashUiDashRouterMod.angularMod.ui.IUrlRouterProvider = js.native
  def when(
    whenPath: typingsSlinky.angularDashUiDashRouter.angularDashUiDashRouterMod.angularMod.ui.IUrlMatcher,
    handler: js.Array[_]
  ): typingsSlinky.angularDashUiDashRouter.angularDashUiDashRouterMod.angularMod.ui.IUrlRouterProvider = js.native
  def when(
    whenPath: typingsSlinky.angularDashUiDashRouter.angularDashUiDashRouterMod.angularMod.ui.IUrlMatcher,
    hanlder: Function
  ): typingsSlinky.angularDashUiDashRouter.angularDashUiDashRouterMod.angularMod.ui.IUrlRouterProvider = js.native
  def when(
    whenPath: typingsSlinky.angularDashUiDashRouter.angularDashUiDashRouterMod.angularMod.ui.IUrlMatcher,
    toPath: String
  ): typingsSlinky.angularDashUiDashRouter.angularDashUiDashRouterMod.angularMod.ui.IUrlRouterProvider = js.native
  def when(whenPath: RegExp, handler: js.Array[_]): typingsSlinky.angularDashUiDashRouter.angularDashUiDashRouterMod.angularMod.ui.IUrlRouterProvider = js.native
  def when(whenPath: RegExp, handler: Function): typingsSlinky.angularDashUiDashRouter.angularDashUiDashRouterMod.angularMod.ui.IUrlRouterProvider = js.native
  def when(whenPath: RegExp, toPath: String): typingsSlinky.angularDashUiDashRouter.angularDashUiDashRouterMod.angularMod.ui.IUrlRouterProvider = js.native
}

