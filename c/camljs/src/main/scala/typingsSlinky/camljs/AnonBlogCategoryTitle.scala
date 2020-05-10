package typingsSlinky.camljs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBlogCategoryTitle extends js.Object {
  var BlogCategoryTitle: String = js.native
  var BlogPostTitle: String = js.native
  var Description: String = js.native
  var RecycleBinEnabled: String = js.native
  var SiteOwnerName: String = js.native
  var SiteUrl: String = js.native
  var Title: String = js.native
  var Url: String = js.native
}

object AnonBlogCategoryTitle {
  @scala.inline
  def apply(
    BlogCategoryTitle: String,
    BlogPostTitle: String,
    Description: String,
    RecycleBinEnabled: String,
    SiteOwnerName: String,
    SiteUrl: String,
    Title: String,
    Url: String
  ): AnonBlogCategoryTitle = {
    val __obj = js.Dynamic.literal(BlogCategoryTitle = BlogCategoryTitle.asInstanceOf[js.Any], BlogPostTitle = BlogPostTitle.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], RecycleBinEnabled = RecycleBinEnabled.asInstanceOf[js.Any], SiteOwnerName = SiteOwnerName.asInstanceOf[js.Any], SiteUrl = SiteUrl.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBlogCategoryTitle]
  }
  @scala.inline
  implicit class AnonBlogCategoryTitleOps[Self <: AnonBlogCategoryTitle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlogCategoryTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlogCategoryTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlogPostTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlogPostTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecycleBinEnabled(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecycleBinEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSiteOwnerName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SiteOwnerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSiteUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SiteUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

