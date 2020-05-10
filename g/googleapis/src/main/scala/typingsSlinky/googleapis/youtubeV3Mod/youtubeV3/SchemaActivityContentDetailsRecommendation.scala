package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information that identifies the recommended resource.
  */
@js.native
trait SchemaActivityContentDetailsRecommendation extends js.Object {
  /**
    * The reason that the resource is recommended to the user.
    */
  var reason: js.UndefOr[String] = js.native
  /**
    * The resourceId object contains information that identifies the
    * recommended resource.
    */
  var resourceId: js.UndefOr[SchemaResourceId] = js.native
  /**
    * The seedResourceId object contains information about the resource that
    * caused the recommendation.
    */
  var seedResourceId: js.UndefOr[SchemaResourceId] = js.native
}

object SchemaActivityContentDetailsRecommendation {
  @scala.inline
  def apply(): SchemaActivityContentDetailsRecommendation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaActivityContentDetailsRecommendation]
  }
  @scala.inline
  implicit class SchemaActivityContentDetailsRecommendationOps[Self <: SchemaActivityContentDetailsRecommendation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceId(value: SchemaResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceId")(js.undefined)
        ret
    }
    @scala.inline
    def withSeedResourceId(value: SchemaResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seedResourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeedResourceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seedResourceId")(js.undefined)
        ret
    }
  }
  
}

