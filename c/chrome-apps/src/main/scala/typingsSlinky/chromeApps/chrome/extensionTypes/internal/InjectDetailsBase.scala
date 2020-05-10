package typingsSlinky.chromeApps.chrome.extensionTypes.internal

import typingsSlinky.chromeApps.chrome.extensionTypes.CSSOrigin
import typingsSlinky.chromeApps.chrome.extensionTypes.RunAt
import typingsSlinky.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Partial, use these interfaces instead:
  * @see InjectCodeDetails
  * @see InjectFileDetails
  */
@js.native
trait InjectDetailsBase extends js.Object {
  /**
    * If allFrames is true, implies that the JavaScript or CSS should be
    * injected into all frames of current page. By default, it's false
    * and is only injected into the top frame. If true and frameId is set,
    * then the code is inserted in the selected frame and all of its child frames.
    */
  var allFrames: js.UndefOr[Boolean] = js.native
  /**
    * The origin of the CSS to inject.
    * This may only be specified for CSS, not JavaScript.
    * @default 'author'
    * @since Chrome 66.
    */
  var cssOrigin: CSSOrigin = js.native
  /**
    * The frame where the script or CSS should be injected. Defaults to 0 (the top-level frame).
    * @see[frame ref]{@link https://developer.chrome.com/apps/webNavigation#frame_ids}
    * @since Chrome 50.
    */
  var frameId: js.UndefOr[integer] = js.native
  /**
    * If matchAboutBlank is true, then the code is also injected in about:blank
    * and about:srcdoc frames if your extension has access to its parent document.
    * Code cannot be inserted in top-level about:-frames. By default it is false.
    */
  var matchAboutBlank: js.UndefOr[Boolean] = js.native
  /**
    * The soonest that the JavaScript or CSS will be injected into the tab.
    * @default 'document_idle'
    */
  var runAt: RunAt = js.native
}

object InjectDetailsBase {
  @scala.inline
  def apply(cssOrigin: CSSOrigin, runAt: RunAt): InjectDetailsBase = {
    val __obj = js.Dynamic.literal(cssOrigin = cssOrigin.asInstanceOf[js.Any], runAt = runAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[InjectDetailsBase]
  }
  @scala.inline
  implicit class InjectDetailsBaseOps[Self <: InjectDetailsBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCssOrigin(value: CSSOrigin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssOrigin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRunAt(value: RunAt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllFrames(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allFrames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllFrames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allFrames")(js.undefined)
        ret
    }
    @scala.inline
    def withFrameId(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrameId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameId")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchAboutBlank(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchAboutBlank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchAboutBlank: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchAboutBlank")(js.undefined)
        ret
    }
  }
  
}

