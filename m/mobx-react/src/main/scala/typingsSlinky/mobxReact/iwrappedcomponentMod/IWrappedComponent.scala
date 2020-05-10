package typingsSlinky.mobxReact.iwrappedcomponentMod

import slinky.core.ReactComponentClass
import typingsSlinky.mobxReact.ireactcomponentMod.IReactComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWrappedComponent[P] extends js.Object {
  var wrappedComponent: IReactComponent[P] = js.native
}

object IWrappedComponent {
  @scala.inline
  def apply[P](wrappedComponent: IReactComponent[P]): IWrappedComponent[P] = {
    val __obj = js.Dynamic.literal(wrappedComponent = wrappedComponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWrappedComponent[P]]
  }
  @scala.inline
  implicit class IWrappedComponentOps[Self[p] <: IWrappedComponent[p], P] (val x: Self[P]) extends AnyVal {
    @scala.inline
    def duplicate: Self[P] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[P]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[P] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[P] with Other]
    @scala.inline
    def withWrappedComponentClassicComponentClass(value: ReactComponentClass[P]): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrappedComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrappedComponentFunctionComponent(value: ReactComponentClass[P]): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrappedComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrappedComponentComponentClass(value: ReactComponentClass[P]): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrappedComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrappedComponent(value: IReactComponent[P]): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrappedComponent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

