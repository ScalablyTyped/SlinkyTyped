package typingsSlinky.ionicCore.componentsMod.LocalJSX

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.ionicCore.mod.ComponentProps
import typingsSlinky.ionicCore.navInterfaceMod.NavComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonNavSetRoot extends js.Object {
  /**
    * Component you want to make root for the navigation stack
    */
  var component: js.UndefOr[NavComponent] = js.native
  /**
    * Data you want to pass to the component as props
    */
  var componentProps: js.UndefOr[ComponentProps[Null]] = js.native
}

object IonNavSetRoot {
  @scala.inline
  def apply(): IonNavSetRoot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonNavSetRoot]
  }
  @scala.inline
  implicit class IonNavSetRootOps[Self <: IonNavSetRoot] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponentHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponent(value: NavComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(null)
        ret
    }
    @scala.inline
    def withComponentProps(value: ComponentProps[Null]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentProps")(js.undefined)
        ret
    }
  }
  
}

