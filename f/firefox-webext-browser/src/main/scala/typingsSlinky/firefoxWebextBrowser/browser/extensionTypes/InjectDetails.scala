package typingsSlinky.firefoxWebextBrowser.browser.extensionTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details of the script or CSS to inject. Either the code or the file property must be set, but both may not be
  * set at the same time.
  */
@js.native
trait InjectDetails extends js.Object {
  /**
    * If allFrames is `true`, implies that the JavaScript or CSS should be injected into all frames of current
    * page. By default, it's `false` and is only injected into the top frame.
    */
  var allFrames: js.UndefOr[Boolean] = js.native
  /**
    * JavaScript or CSS code to inject.
    *
    * **Warning:**
    * Be careful using the `code` parameter. Incorrect use of it may open your extension to [cross site
    * scripting](https://en.wikipedia.org/wiki/Cross-site_scripting) attacks.
    */
  var code: js.UndefOr[String] = js.native
  /** The css origin of the stylesheet to inject. Defaults to "author". */
  var cssOrigin: js.UndefOr[CSSOrigin] = js.native
  /** JavaScript or CSS file to inject. */
  var file: js.UndefOr[String] = js.native
  /** The ID of the frame to inject the script into. This may not be used in combination with `allFrames`. */
  var frameId: js.UndefOr[Double] = js.native
  /**
    * If matchAboutBlank is true, then the code is also injected in about:blank and about:srcdoc frames if your
    * extension has access to its parent document. Code cannot be inserted in top-level about:-frames. By default
    * it is `false`.
    */
  var matchAboutBlank: js.UndefOr[Boolean] = js.native
  /** The soonest that the JavaScript or CSS will be injected into the tab. Defaults to "document_idle". */
  var runAt: js.UndefOr[RunAt] = js.native
}

object InjectDetails {
  @scala.inline
  def apply(): InjectDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InjectDetails]
  }
  @scala.inline
  implicit class InjectDetailsOps[Self <: InjectDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(js.undefined)
        ret
    }
    @scala.inline
    def withCssOrigin(value: CSSOrigin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssOrigin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssOrigin")(js.undefined)
        ret
    }
    @scala.inline
    def withFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(js.undefined)
        ret
    }
    @scala.inline
    def withFrameId(value: Double): Self = {
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
    @scala.inline
    def withRunAt(value: RunAt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRunAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runAt")(js.undefined)
        ret
    }
  }
  
}

