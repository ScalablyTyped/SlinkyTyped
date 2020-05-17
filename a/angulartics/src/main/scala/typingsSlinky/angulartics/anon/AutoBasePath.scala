package typingsSlinky.angulartics.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoBasePath extends js.Object {
  var autoBasePath: Boolean = js.native
  var autoTrackingFirstPage: Boolean = js.native
  var autoTrackingVirtualPages: Boolean = js.native
  var basePath: String = js.native
  var excludedRoutes: js.Array[String] = js.native
  var queryKeysBlacklisted: js.Array[String] = js.native
  var queryKeysWhitelisted: js.Array[String] = js.native
  var trackRelativePath: Boolean = js.native
  var trackRoutes: Boolean = js.native
  var trackStates: Boolean = js.native
}

object AutoBasePath {
  @scala.inline
  def apply(
    autoBasePath: Boolean,
    autoTrackingFirstPage: Boolean,
    autoTrackingVirtualPages: Boolean,
    basePath: String,
    excludedRoutes: js.Array[String],
    queryKeysBlacklisted: js.Array[String],
    queryKeysWhitelisted: js.Array[String],
    trackRelativePath: Boolean,
    trackRoutes: Boolean,
    trackStates: Boolean
  ): AutoBasePath = {
    val __obj = js.Dynamic.literal(autoBasePath = autoBasePath.asInstanceOf[js.Any], autoTrackingFirstPage = autoTrackingFirstPage.asInstanceOf[js.Any], autoTrackingVirtualPages = autoTrackingVirtualPages.asInstanceOf[js.Any], basePath = basePath.asInstanceOf[js.Any], excludedRoutes = excludedRoutes.asInstanceOf[js.Any], queryKeysBlacklisted = queryKeysBlacklisted.asInstanceOf[js.Any], queryKeysWhitelisted = queryKeysWhitelisted.asInstanceOf[js.Any], trackRelativePath = trackRelativePath.asInstanceOf[js.Any], trackRoutes = trackRoutes.asInstanceOf[js.Any], trackStates = trackStates.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoBasePath]
  }
  @scala.inline
  implicit class AutoBasePathOps[Self <: AutoBasePath] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoBasePath(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoBasePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoTrackingFirstPage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoTrackingFirstPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoTrackingVirtualPages(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoTrackingVirtualPages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBasePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExcludedRoutes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludedRoutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueryKeysBlacklisted(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryKeysBlacklisted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueryKeysWhitelisted(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryKeysWhitelisted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrackRelativePath(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackRelativePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrackRoutes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackRoutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrackStates(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackStates")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

