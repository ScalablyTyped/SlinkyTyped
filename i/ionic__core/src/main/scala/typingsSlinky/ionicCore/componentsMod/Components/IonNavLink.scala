package typingsSlinky.ionicCore.componentsMod.Components

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.ionicCore.interfaceMod.RouterDirection
import typingsSlinky.ionicCore.mod.ComponentProps
import typingsSlinky.ionicCore.navInterfaceMod.NavComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonNavLink extends js.Object {
  /**
    * Component to navigate to. Only used if the `routerDirection` is `"forward"` or `"root"`.
    */
  var component: js.UndefOr[NavComponent] = js.native
  /**
    * Data you want to pass to the component as props. Only used if the `"routerDirection"` is `"forward"` or `"root"`.
    */
  var componentProps: js.UndefOr[ComponentProps[Null]] = js.native
  /**
    * The transition direction when navigating to another page.
    */
  var routerDirection: RouterDirection = js.native
}

object IonNavLink {
  @scala.inline
  def apply(routerDirection: RouterDirection): IonNavLink = {
    val __obj = js.Dynamic.literal(routerDirection = routerDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonNavLink]
  }
  @scala.inline
  implicit class IonNavLinkOps[Self <: IonNavLink] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRouterDirection(value: RouterDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routerDirection")(value.asInstanceOf[js.Any])
        ret
    }
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

