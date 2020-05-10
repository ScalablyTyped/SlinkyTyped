package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeletextDestinationSettings extends js.Object {
  /**
    * Set pageNumber to the Teletext page number for the destination captions for this output. This value must be a three-digit hexadecimal string; strings ending in -FF are invalid. If you are passing through the entire set of Teletext data, do not use this field.
    */
  var PageNumber: js.UndefOr[stringMin3Max3Pattern1809aFAF09aEAE] = js.native
  /**
    * Specify the page types for this Teletext page. If you don't specify a value here, the service sets the page type to the default value Subtitle (PAGE_TYPE_SUBTITLE). If you pass through the entire set of Teletext data, don't use this field. When you pass through a set of Teletext pages, your output has the same page types as your input.
    */
  var PageTypes: js.UndefOr[listOfTeletextPageType] = js.native
}

object TeletextDestinationSettings {
  @scala.inline
  def apply(): TeletextDestinationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeletextDestinationSettings]
  }
  @scala.inline
  implicit class TeletextDestinationSettingsOps[Self <: TeletextDestinationSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPageNumber(value: stringMin3Max3Pattern1809aFAF09aEAE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withPageTypes(value: listOfTeletextPageType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageTypes")(js.undefined)
        ret
    }
  }
  
}

