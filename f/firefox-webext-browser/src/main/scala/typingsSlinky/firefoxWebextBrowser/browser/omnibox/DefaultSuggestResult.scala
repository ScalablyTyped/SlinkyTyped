package typingsSlinky.firefoxWebextBrowser.browser.omnibox

import typingsSlinky.firefoxWebextBrowser.AnonLength
import typingsSlinky.firefoxWebextBrowser.AnonOffset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A suggest result. */
@js.native
trait DefaultSuggestResult extends js.Object {
  /** The text that is displayed in the URL dropdown. */
  var description: String = js.native
  /**
    * An array of style ranges for the description, as provided by the extension.
    * @deprecated Unsupported on Firefox at this time.
    */
  var descriptionStyles: js.UndefOr[js.Array[AnonLength]] = js.native
  /**
    * An array of style ranges for the description, as provided by ToValue().
    * @deprecated Unsupported on Firefox at this time.
    */
  var descriptionStylesRaw: js.UndefOr[js.Array[AnonOffset]] = js.native
}

object DefaultSuggestResult {
  @scala.inline
  def apply(description: String): DefaultSuggestResult = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultSuggestResult]
  }
  @scala.inline
  implicit class DefaultSuggestResultOps[Self <: DefaultSuggestResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescriptionStyles(value: js.Array[AnonLength]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptionStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescriptionStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptionStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withDescriptionStylesRaw(value: js.Array[AnonOffset]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptionStylesRaw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescriptionStylesRaw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptionStylesRaw")(js.undefined)
        ret
    }
  }
  
}

