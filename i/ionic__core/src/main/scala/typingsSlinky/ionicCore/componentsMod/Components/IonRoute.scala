package typingsSlinky.ionicCore.componentsMod.Components

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonRoute extends js.Object {
  /**
    * Name of the component to load/select in the navigation outlet (`ion-tabs`, `ion-nav`) when the route matches.  The value of this property is not always the tagname of the component to load, in `ion-tabs` it actually refers to the name of the `ion-tab` to select.
    */
  var component: String = js.native
  /**
    * A key value `{ 'red': true, 'blue': 'white'}` containing props that should be passed to the defined component when rendered.
    */
  var componentProps: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Relative path that needs to match in order for this route to apply.  Accepts paths similar to expressjs so that you can define parameters in the url /foo/:bar where bar would be available in incoming props.
    */
  var url: String = js.native
}

object IonRoute {
  @scala.inline
  def apply(component: String, url: String): IonRoute = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonRoute]
  }
  @scala.inline
  implicit class IonRouteOps[Self <: IonRoute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentProps(value: StringDictionary[js.Any]): Self = {
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

