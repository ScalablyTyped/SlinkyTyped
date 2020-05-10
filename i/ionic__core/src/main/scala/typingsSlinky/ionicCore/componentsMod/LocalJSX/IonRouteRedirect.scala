package typingsSlinky.ionicCore.componentsMod.LocalJSX

import org.scalajs.dom.raw.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonRouteRedirect extends js.Object {
  /**
    * A redirect route, redirects "from" a URL "to" another URL. This property is that "from" URL. It needs to be an exact match of the navigated URL in order to apply.  The path specified in this value is always an absolute path, even if the initial `/` slash is not specified.
    */
  var from: String = js.native
  /**
    * Internal event that fires when any value of this rule is added/removed from the DOM, or any of his public properties changes.  `ion-router` captures this event in order to update his internal registry of router rules.
    */
  var onIonRouteRedirectChanged: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  /**
    * A redirect route, redirects "from" a URL "to" another URL. This property is that "to" URL. When the defined `ion-route-redirect` rule matches, the router will redirect to the path specified in this property.  The value of this property is always an absolute path inside the scope of routes defined in `ion-router` it can't be used with another router or to perform a redirection to a different domain.  Note that this is a virtual redirect, it will not cause a real browser refresh, again, it's a redirect inside the context of ion-router.  When this property is not specified or his value is `undefined` the whole redirect route is noop, even if the "from" value matches.
    */
  var to: js.UndefOr[String | Null] = js.native
}

object IonRouteRedirect {
  @scala.inline
  def apply(from: String): IonRouteRedirect = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonRouteRedirect]
  }
  @scala.inline
  implicit class IonRouteRedirectOps[Self <: IonRouteRedirect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnIonRouteRedirectChanged(value: /* event */ CustomEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonRouteRedirectChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnIonRouteRedirectChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonRouteRedirectChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(js.undefined)
        ret
    }
    @scala.inline
    def withToNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(null)
        ret
    }
  }
  
}

