package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagOptionsOutput extends js.Object {
  /**
    * The page token for the next set of results. To retrieve the first set of results, use null.
    */
  var PageToken: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.PageToken] = js.native
  /**
    * Information about the TagOptions.
    */
  var TagOptionDetails: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.TagOptionDetails] = js.native
}

object ListTagOptionsOutput {
  @scala.inline
  def apply(): ListTagOptionsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTagOptionsOutput]
  }
  @scala.inline
  implicit class ListTagOptionsOutputOps[Self <: ListTagOptionsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPageToken(value: PageToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withTagOptionDetails(value: TagOptionDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagOptionDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagOptionDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagOptionDetails")(js.undefined)
        ret
    }
  }
  
}

