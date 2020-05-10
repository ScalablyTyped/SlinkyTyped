package typingsSlinky.camljs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCreated extends js.Object {
  var Created: String = js.native
  var DefaultViewUrl: String = js.native
  var Description: String = js.native
  var EnableSyndication: String = js.native
  var ItemCount: String = js.native
  var LinkTitle: String = js.native
  var MajorVersionLimit: String = js.native
  var MajorWithMinorVersionsLimit: String = js.native
  var RelativeFolderPath: String = js.native
  var Title: String = js.native
  var ViewSelector: String = js.native
}

object AnonCreated {
  @scala.inline
  def apply(
    Created: String,
    DefaultViewUrl: String,
    Description: String,
    EnableSyndication: String,
    ItemCount: String,
    LinkTitle: String,
    MajorVersionLimit: String,
    MajorWithMinorVersionsLimit: String,
    RelativeFolderPath: String,
    Title: String,
    ViewSelector: String
  ): AnonCreated = {
    val __obj = js.Dynamic.literal(Created = Created.asInstanceOf[js.Any], DefaultViewUrl = DefaultViewUrl.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], EnableSyndication = EnableSyndication.asInstanceOf[js.Any], ItemCount = ItemCount.asInstanceOf[js.Any], LinkTitle = LinkTitle.asInstanceOf[js.Any], MajorVersionLimit = MajorVersionLimit.asInstanceOf[js.Any], MajorWithMinorVersionsLimit = MajorWithMinorVersionsLimit.asInstanceOf[js.Any], RelativeFolderPath = RelativeFolderPath.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], ViewSelector = ViewSelector.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCreated]
  }
  @scala.inline
  implicit class AnonCreatedOps[Self <: AnonCreated] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultViewUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultViewUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableSyndication(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableSyndication")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ItemCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinkTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LinkTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMajorVersionLimit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MajorVersionLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMajorWithMinorVersionsLimit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MajorWithMinorVersionsLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelativeFolderPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RelativeFolderPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ViewSelector")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

