package typingsSlinky.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExclusionPreview extends js.Object {
  /**
    * The system-defined attributes for the exclusion preview.
    */
  var attributes: js.UndefOr[AttributeList] = js.native
  /**
    * The description of the exclusion preview.
    */
  var description: Text = js.native
  /**
    * The recommendation for the exclusion preview.
    */
  var recommendation: Text = js.native
  /**
    * The AWS resources for which the exclusion preview pertains.
    */
  var scopes: ScopeList = js.native
  /**
    * The name of the exclusion preview.
    */
  var title: Text = js.native
}

object ExclusionPreview {
  @scala.inline
  def apply(description: Text, recommendation: Text, scopes: ScopeList, title: Text): ExclusionPreview = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], recommendation = recommendation.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExclusionPreview]
  }
  @scala.inline
  implicit class ExclusionPreviewOps[Self <: ExclusionPreview] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: Text): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecommendation(value: Text): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recommendation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScopes(value: ScopeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: Text): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttributes(value: AttributeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(js.undefined)
        ret
    }
  }
  
}

