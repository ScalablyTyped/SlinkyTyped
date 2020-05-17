package typingsSlinky.blocks

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.blocks.anon.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/////////////////////////////////////////
// App.View
/////////////////////////////////////////
@js.native
trait ViewPrototype
  extends /* propertyName */ StringDictionary[js.Any] {
  /**
  	 * Override the init method to perform actions when the View is first created and shown on the page
  	 */
  var init: js.UndefOr[js.Function] = js.native
  /**
  	 * Determines if the view is visible
  	 */
  var isActive: js.UndefOr[js.Function0[Boolean]] = js.native
  var navigateTo: js.UndefOr[js.Function] = js.native
  var options: js.UndefOr[Route] = js.native
  var parentView: js.UndefOr[js.Any] = js.native
  /**
    * Override the ready method to perform actions when the DOM is ready and
    * all data-query have been executed.
  	 */
  var ready: js.UndefOr[js.Function] = js.native
  /**
  	 * Routes to a specific URL and actives the appropriate views associated with the URL
  	 * 
  	 * @param name Name of the route
  	 */
  var route: js.UndefOr[js.Function1[/* name */ String, this.type]] = js.native
  /**
  	 * Override the routed method to perform actions when the View have routing and routing mechanism actives it.
  	 */
  var routed: js.UndefOr[js.Function] = js.native
}

object ViewPrototype {
  @scala.inline
  def apply(): ViewPrototype = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewPrototype]
  }
  @scala.inline
  implicit class ViewPrototypeOps[Self <: ViewPrototype] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInit(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.undefined)
        ret
    }
    @scala.inline
    def withIsActive(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isActive")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isActive")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigateTo(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigateTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigateTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigateTo")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: Route): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withParentView(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentView")(js.undefined)
        ret
    }
    @scala.inline
    def withReady(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ready")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReady: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ready")(js.undefined)
        ret
    }
    @scala.inline
    def withRoute(value: /* name */ String => ViewPrototype): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("route")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRoute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("route")(js.undefined)
        ret
    }
    @scala.inline
    def withRouted(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRouted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routed")(js.undefined)
        ret
    }
  }
  
}

