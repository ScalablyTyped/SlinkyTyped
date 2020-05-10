package typingsSlinky.ionicCore.menuInterfaceMod

import typingsSlinky.ionicCore.componentsMod._Global_.HTMLIonMenuElement
import typingsSlinky.ionicCore.oldAnimationAnimationInterfaceMod.Animation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuControllerI extends js.Object {
  def _createAnimation(`type`: String, menuCmp: MenuI): js.Promise[Animation] = js.native
  def _register(menu: MenuI): Unit = js.native
  def _setActiveMenu(menu: MenuI): Unit = js.native
  def _setOpen(menu: MenuI, shouldOpen: Boolean, animated: Boolean): js.Promise[Boolean] = js.native
  def _unregister(menu: MenuI): Unit = js.native
  def getMenus(): js.Promise[js.Array[HTMLIonMenuElement]] = js.native
  def getOpenSync(): js.UndefOr[HTMLIonMenuElement] = js.native
}

object MenuControllerI {
  @scala.inline
  def apply(
    _createAnimation: (String, MenuI) => js.Promise[Animation],
    _register: MenuI => Unit,
    _setActiveMenu: MenuI => Unit,
    _setOpen: (MenuI, Boolean, Boolean) => js.Promise[Boolean],
    _unregister: MenuI => Unit,
    getMenus: () => js.Promise[js.Array[HTMLIonMenuElement]],
    getOpenSync: () => js.UndefOr[HTMLIonMenuElement]
  ): MenuControllerI = {
    val __obj = js.Dynamic.literal(_createAnimation = js.Any.fromFunction2(_createAnimation), _register = js.Any.fromFunction1(_register), _setActiveMenu = js.Any.fromFunction1(_setActiveMenu), _setOpen = js.Any.fromFunction3(_setOpen), _unregister = js.Any.fromFunction1(_unregister), getMenus = js.Any.fromFunction0(getMenus), getOpenSync = js.Any.fromFunction0(getOpenSync))
    __obj.asInstanceOf[MenuControllerI]
  }
  @scala.inline
  implicit class MenuControllerIOps[Self <: MenuControllerI] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_createAnimation(value: (String, MenuI) => js.Promise[Animation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_createAnimation")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def with_register(value: MenuI => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_register")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def with_setActiveMenu(value: MenuI => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_setActiveMenu")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def with_setOpen(value: (MenuI, Boolean, Boolean) => js.Promise[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_setOpen")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def with_unregister(value: MenuI => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_unregister")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetMenus(value: () => js.Promise[js.Array[HTMLIonMenuElement]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMenus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetOpenSync(value: () => js.UndefOr[HTMLIonMenuElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOpenSync")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

