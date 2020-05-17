package typingsSlinky.jqueryPjax

import org.scalajs.dom.raw.EventTarget
import typingsSlinky.jquery.JQuery.AjaxSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PjaxSettings
  extends AjaxSettings[js.Any] {
  /**
    * A jQuery selector indicates where to stick the response body. E.g., $(container).html(xhr.responseBody).
    * If it is not defined, the `data-pjax` attribute of the link will be treated as container.
    * If such an attribute is not defined too, the context will be treated as container.
    */
  var container: js.UndefOr[String] = js.native
  /**
    * CSS selector for the fragment to extract from ajax response.
    */
  var fragment: js.UndefOr[String] = js.native
  /**
    * How many requests to cache. Defaults to 20.
    */
  var maxCacheLength: js.UndefOr[Double] = js.native
  /**
    * Whether to pushState the URL. Defaults to true.
    */
  var push: js.UndefOr[Boolean] = js.native
  /**
    * Whether to replaceState the URL. Defaults to false.
    */
  var replace: js.UndefOr[Boolean] = js.native
  /**
    * Vertical position to scroll to after navigation.
    * To avoid changing scroll position, pass false.
    */
  var scrollTo: js.UndefOr[Double | Boolean] = js.native
  /**
    * Eventually the relatedTarget value for pjax events.
    */
  var target: js.UndefOr[EventTarget] = js.native
  /**
    * A string or function returning the current pjax version
    */
  var version: js.UndefOr[String | js.Function0[String]] = js.native
}

object PjaxSettings {
  @scala.inline
  def apply(): PjaxSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PjaxSettings]
  }
  @scala.inline
  implicit class PjaxSettingsOps[Self <: PjaxSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
    @scala.inline
    def withFragment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFragment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragment")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxCacheLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxCacheLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxCacheLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxCacheLength")(js.undefined)
        ret
    }
    @scala.inline
    def withPush(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push")(js.undefined)
        ret
    }
    @scala.inline
    def withReplace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replace")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollTo(value: Double | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollTo")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: EventTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
    @scala.inline
    def withVersionFunction0(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withVersion(value: String | js.Function0[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

