package typingsSlinky.obsoleteWeb.mod

import typingsSlinky.obsoleteWeb.obsoleteWebStrings.afterbeing
import typingsSlinky.obsoleteWeb.obsoleteWebStrings.beforened
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * If set 'afterbegin', the template will be injected into the start of body.
    * If set 'beforeend', the template will be injected into the end of body
    * @default 'afterbegin'
    */
  var position: js.UndefOr[afterbeing | beforened] = js.native
  /**
    * If the current browser useragent doesn't match one of the target browsers, it's considered as unsupported.
    * Thus, the prompt will be shown.
    * @default false
    */
  var promptOnNonTargetBrowser: js.UndefOr[Boolean] = js.native
  /**
    * If the current browser useragent is unknown, the prompt will be shown
    * @default true
    */
  var promptOnUnknownBrowser: js.UndefOr[Boolean] = js.native
  /**
    * The prompt html template injected to the bottom of body. The default value is:
    * ```html
    * <div>Your browser is not supported. <button id="obsoleteClose">&times;</button></div>
    * ```
    */
  var template: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPosition(value: afterbeing | beforened): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withPromptOnNonTargetBrowser(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promptOnNonTargetBrowser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPromptOnNonTargetBrowser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promptOnNonTargetBrowser")(js.undefined)
        ret
    }
    @scala.inline
    def withPromptOnUnknownBrowser(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promptOnUnknownBrowser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPromptOnUnknownBrowser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promptOnUnknownBrowser")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.undefined)
        ret
    }
  }
  
}

