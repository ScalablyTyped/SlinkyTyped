package typingsSlinky.ionicReact.anon

import org.scalablytyped.runtime.StringDictionary
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.ionicCore.animationInterfaceMod.Animation
import typingsSlinky.ionicCore.animationInterfaceMod.AnimationBuilder
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonBackButtonElement
import typingsSlinky.ionicCore.mod.Color
import typingsSlinky.ionicReact.ionicReactStrings.button
import typingsSlinky.ionicReact.ionicReactStrings.ios
import typingsSlinky.ionicReact.ionicReactStrings.md
import typingsSlinky.ionicReact.ionicReactStrings.reset
import typingsSlinky.ionicReact.ionicReactStrings.submit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<@ionic/react.@ionic/react/dist/types/components/navigation/IonBackButton.Props> & std.Readonly<{  children :react.react.ReactNode | undefined}> */
@js.native
trait ReadonlyPropsReadonlychil extends js.Object {
  val children: js.UndefOr[ReactElement] = js.native
  val `class`: js.UndefOr[String] = js.native
  val className: js.UndefOr[String] = js.native
  val color: js.UndefOr[Color] = js.native
  val defaultHref: js.UndefOr[String] = js.native
  val disabled: js.UndefOr[Boolean] = js.native
  val icon: js.UndefOr[Ios | String] = js.native
  val mode: js.UndefOr[ios | md] = js.native
  val ref: js.UndefOr[ReactRef[HTMLIonBackButtonElement]] = js.native
  val routerAnimation: js.UndefOr[AnimationBuilder] = js.native
  val style: js.UndefOr[StringDictionary[js.Any]] = js.native
  val text: js.UndefOr[String | Null] = js.native
  val `type`: js.UndefOr[submit | reset | button] = js.native
}

object ReadonlyPropsReadonlychil {
  @scala.inline
  def apply(): ReadonlyPropsReadonlychil = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyPropsReadonlychil]
  }
  @scala.inline
  implicit class ReadonlyPropsReadonlychilOps[Self <: ReadonlyPropsReadonlychil] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClass(value: String): Self = this.set("class", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClass: Self = this.set("class", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setColor(value: Color): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setDefaultHref(value: String): Self = this.set("defaultHref", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultHref: Self = this.set("defaultHref", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setIcon(value: Ios | String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setMode(value: ios | md): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setRef(value: ReactRef[HTMLIonBackButtonElement]): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    @scala.inline
    def setRouterAnimation(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = this.set("routerAnimation", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRouterAnimation: Self = this.set("routerAnimation", js.undefined)
    @scala.inline
    def setStyle(value: StringDictionary[js.Any]): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setTextNull: Self = this.set("text", null)
    @scala.inline
    def setType(value: submit | reset | button): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

