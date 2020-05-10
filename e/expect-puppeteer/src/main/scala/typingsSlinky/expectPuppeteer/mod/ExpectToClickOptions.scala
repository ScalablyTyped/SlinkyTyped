package typingsSlinky.expectPuppeteer.mod

import typingsSlinky.expectPuppeteer.expectPuppeteerStrings.left
import typingsSlinky.expectPuppeteer.expectPuppeteerStrings.middle
import typingsSlinky.expectPuppeteer.expectPuppeteerStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpectToClickOptions extends ExpectTimingActions {
  /**
    * Defaults to left.
    */
  var button: js.UndefOr[left | right | middle] = js.native
  /**
    * defaults to 1. See UIEvent.detail.
    */
  var clickCount: js.UndefOr[Double] = js.native
  /**
    * A text or a RegExp to match in element textContent.
    */
  var text: js.UndefOr[String | js.RegExp] = js.native
  /**
    * wait for element to be present in DOM and to be visible, i.e. to not have display: none or visibility: hidden CSS properties. Defaults to false.
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object ExpectToClickOptions {
  @scala.inline
  def apply(): ExpectToClickOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpectToClickOptions]
  }
  @scala.inline
  implicit class ExpectToClickOptionsOps[Self <: ExpectToClickOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButton(value: left | right | middle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button")(js.undefined)
        ret
    }
    @scala.inline
    def withClickCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickCount")(js.undefined)
        ret
    }
    @scala.inline
    def withTextRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String | js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
  }
  
}

