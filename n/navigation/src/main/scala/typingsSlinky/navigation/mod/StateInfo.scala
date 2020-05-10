package typingsSlinky.navigation.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateInfo
  extends /**
  * Gets the additional state attributes
  */
/* extras */ StringDictionary[js.Any] {
  /**
    * Gets the default NavigationData Types for  this State
    */
  var defaultTypes: js.UndefOr[js.Any] = js.native
  /**
    * Gets the default NavigationData for this State
    */
  var defaults: js.UndefOr[js.Any] = js.native
  /**
    * Gets the unique key
    */
  var key: String = js.native
  /**
    * Gets the route Url patterns
    */
  var route: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * Gets the textual description of the state
    */
  var title: js.UndefOr[String] = js.native
  /**
    * Gets a value that indicates whether to maintain the crumb trail
    */
  var trackCrumbTrail: js.UndefOr[Boolean | String] = js.native
  /**
    * Gets a value that indicates whether NavigationData Types are
    * preserved when navigating
    */
  var trackTypes: js.UndefOr[Boolean] = js.native
}

object StateInfo {
  @scala.inline
  def apply(key: String): StateInfo = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateInfo]
  }
  @scala.inline
  implicit class StateInfoOps[Self <: StateInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultTypes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaults(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaults")(js.undefined)
        ret
    }
    @scala.inline
    def withRoute(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("route")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("route")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackCrumbTrail(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackCrumbTrail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackCrumbTrail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackCrumbTrail")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackTypes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackTypes")(js.undefined)
        ret
    }
  }
  
}

