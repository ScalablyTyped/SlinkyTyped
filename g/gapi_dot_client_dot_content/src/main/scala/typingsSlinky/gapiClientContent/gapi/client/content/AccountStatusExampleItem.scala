package typingsSlinky.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountStatusExampleItem extends js.Object {
  /** Unique item ID as specified in the uploaded product data. */
  var itemId: js.UndefOr[String] = js.native
  /** Landing page of the item. */
  var link: js.UndefOr[String] = js.native
  /** The item value that was submitted. */
  var submittedValue: js.UndefOr[String] = js.native
  /** Title of the item. */
  var title: js.UndefOr[String] = js.native
  /** The actual value on the landing page. */
  var valueOnLandingPage: js.UndefOr[String] = js.native
}

object AccountStatusExampleItem {
  @scala.inline
  def apply(): AccountStatusExampleItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountStatusExampleItem]
  }
  @scala.inline
  implicit class AccountStatusExampleItemOps[Self <: AccountStatusExampleItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItemId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemId")(js.undefined)
        ret
    }
    @scala.inline
    def withLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(js.undefined)
        ret
    }
    @scala.inline
    def withSubmittedValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submittedValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubmittedValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submittedValue")(js.undefined)
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
    def withValueOnLandingPage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueOnLandingPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueOnLandingPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueOnLandingPage")(js.undefined)
        ret
    }
  }
  
}

