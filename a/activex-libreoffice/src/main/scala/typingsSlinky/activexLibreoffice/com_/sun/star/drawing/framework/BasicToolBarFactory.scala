package typingsSlinky.activexLibreoffice.com_.sun.star.drawing.framework

import typingsSlinky.activexLibreoffice.com_.sun.star.frame.XController
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The {@link BasicToolBarFactory} is a resource factory that provides (some of) the tool bars used by the Draw and Impress applications.
  *
  * The factory recognizes the following URLs: `private:resource/toolbar/ViewTabBar` for the tab bar that allows the switching between views. This short
  * list marks the implementation of this service clearly as being in transition.
  *
  * This factory is typically created indirectly by registering it in the configuration and have the {@link XModuleController} create it on demand.
  */
@js.native
trait BasicToolBarFactory extends XResourceFactory {
  /** Give the controller to new instances so that they have access to the drawing framework controllers. */
  def create(xController: XController): Unit = js.native
}

object BasicToolBarFactory {
  @scala.inline
  def apply(
    create: XController => Unit,
    createResource: XResourceId => XResource,
    releaseResource: XResource => Unit
  ): BasicToolBarFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), createResource = js.Any.fromFunction1(createResource), releaseResource = js.Any.fromFunction1(releaseResource))
    __obj.asInstanceOf[BasicToolBarFactory]
  }
  @scala.inline
  implicit class BasicToolBarFactoryOps[Self <: BasicToolBarFactory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: XController => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

