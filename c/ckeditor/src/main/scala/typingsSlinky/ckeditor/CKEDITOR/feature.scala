package typingsSlinky.ckeditor.CKEDITOR

import typingsSlinky.ckeditor.CKEDITOR.filter.allowedContentRules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait feature extends js.Object {
  var allowedContent: js.UndefOr[allowedContentRules] = js.native
  var contentForms: js.UndefOr[js.Any] = js.native
  var contentTransformations: js.UndefOr[js.Any] = js.native
  var name: js.UndefOr[String] = js.native
  var requiredContent: js.UndefOr[String | style] = js.native
  var toFeature: js.UndefOr[js.Function0[feature]] = js.native
}

object feature {
  @scala.inline
  def apply(): feature = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[feature]
  }
  @scala.inline
  implicit class featureOps[Self <: feature] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowedContent(value: allowedContentRules): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedContent")(js.undefined)
        ret
    }
    @scala.inline
    def withContentForms(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentForms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentForms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentForms")(js.undefined)
        ret
    }
    @scala.inline
    def withContentTransformations(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentTransformations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentTransformations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentTransformations")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withRequiredContent(value: String | style): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiredContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequiredContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiredContent")(js.undefined)
        ret
    }
    @scala.inline
    def withToFeature(value: () => feature): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toFeature")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutToFeature: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toFeature")(js.undefined)
        ret
    }
  }
  
}

