package typingsSlinky.ionicReact.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.ionicReact.ionRouteMod.IonRouteProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object IonRoute {
  @JSImport("@ionic/react", "IonRoute")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.ionicReact.mod.IonRoute] {
    @scala.inline
    def disableIonPageManagement(value: Boolean): this.type = set("disableIonPageManagement", value.asInstanceOf[js.Any])
    @scala.inline
    def exact(value: Boolean): this.type = set("exact", value.asInstanceOf[js.Any])
    @scala.inline
    def path(value: String): this.type = set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def show(value: Boolean): this.type = set("show", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IonRouteProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(render: js.UndefOr[js.Any] => ReactElement): Builder = {
    val __props = js.Dynamic.literal(render = js.Any.fromFunction1(render))
    new Builder(js.Array(this.component, __props.asInstanceOf[IonRouteProps]))
  }
}

