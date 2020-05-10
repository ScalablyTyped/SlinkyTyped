package typingsSlinky.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Floodlight Activity GenerateTag Response
  */
@js.native
trait SchemaFloodlightActivitiesGenerateTagResponse extends js.Object {
  /**
    * Generated tag for this Floodlight activity. For global site tags, this is
    * the event snippet.
    */
  var floodlightActivityTag: js.UndefOr[String] = js.native
  /**
    * The global snippet section of a global site tag. The global site tag sets
    * new cookies on your domain, which will store a unique identifier for a
    * user or the ad click that brought the user to your site. Learn more.
    */
  var globalSiteTagGlobalSnippet: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#floodlightActivitiesGenerateTagResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaFloodlightActivitiesGenerateTagResponse {
  @scala.inline
  def apply(): SchemaFloodlightActivitiesGenerateTagResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFloodlightActivitiesGenerateTagResponse]
  }
  @scala.inline
  implicit class SchemaFloodlightActivitiesGenerateTagResponseOps[Self <: SchemaFloodlightActivitiesGenerateTagResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFloodlightActivityTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floodlightActivityTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloodlightActivityTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floodlightActivityTag")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalSiteTagGlobalSnippet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalSiteTagGlobalSnippet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalSiteTagGlobalSnippet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalSiteTagGlobalSnippet")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
  }
  
}

