package typingsSlinky.activexLibreoffice.com_.sun.star.ui

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface enables an object to get interceptors registered that change context menus or prevent them from being executed. */
@js.native
trait XContextMenuInterception extends XInterface {
  /** registers an {@link XContextMenuInterceptor} , which will become the first interceptor in the chain of registered interceptors. */
  def registerContextMenuInterceptor(Interceptor: XContextMenuInterceptor): Unit = js.native
  /**
    * removes an {@link XContextMenuInterceptor} which was previously registered using {@link XContextMenuInterception.registerContextMenuInterceptor()} .
    *
    * The order of removals is arbitrary. It is not necessary to remove the last registered interceptor first.
    */
  def releaseContextMenuInterceptor(Interceptor: XContextMenuInterceptor): Unit = js.native
}

object XContextMenuInterception {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    registerContextMenuInterceptor: XContextMenuInterceptor => Unit,
    release: () => Unit,
    releaseContextMenuInterceptor: XContextMenuInterceptor => Unit
  ): XContextMenuInterception = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), registerContextMenuInterceptor = js.Any.fromFunction1(registerContextMenuInterceptor), release = js.Any.fromFunction0(release), releaseContextMenuInterceptor = js.Any.fromFunction1(releaseContextMenuInterceptor))
    __obj.asInstanceOf[XContextMenuInterception]
  }
  @scala.inline
  implicit class XContextMenuInterceptionOps[Self <: XContextMenuInterception] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRegisterContextMenuInterceptor(value: XContextMenuInterceptor => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerContextMenuInterceptor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReleaseContextMenuInterceptor(value: XContextMenuInterceptor => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseContextMenuInterceptor")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

