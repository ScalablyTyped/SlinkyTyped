package typingsSlinky.googleapis.webmastersV3Mod.webmastersV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Additional details about the URL, set only when calling get().
  */
@js.native
trait SchemaUrlSampleDetails extends js.Object {
  /**
    * List of sitemaps pointing at this URL.
    */
  var containingSitemaps: js.UndefOr[js.Array[String]] = js.native
  /**
    * A sample set of URLs linking to this URL.
    */
  var linkedFromUrls: js.UndefOr[js.Array[String]] = js.native
}

object SchemaUrlSampleDetails {
  @scala.inline
  def apply(): SchemaUrlSampleDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUrlSampleDetails]
  }
  @scala.inline
  implicit class SchemaUrlSampleDetailsOps[Self <: SchemaUrlSampleDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainingSitemaps(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containingSitemaps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainingSitemaps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containingSitemaps")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkedFromUrls(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkedFromUrls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkedFromUrls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkedFromUrls")(js.undefined)
        ret
    }
  }
  
}

