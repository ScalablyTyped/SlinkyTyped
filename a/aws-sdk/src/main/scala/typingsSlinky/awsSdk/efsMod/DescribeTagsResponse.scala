package typingsSlinky.awsSdk.efsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTagsResponse extends js.Object {
  /**
    * If the request included a Marker, the response returns that value in this field.
    */
  var Marker: js.UndefOr[typingsSlinky.awsSdk.efsMod.Marker] = js.native
  /**
    * If a value is present, there are more tags to return. In a subsequent request, you can provide the value of NextMarker as the value of the Marker parameter in your next request to retrieve the next set of tags.
    */
  var NextMarker: js.UndefOr[Marker] = js.native
  /**
    * Returns tags associated with the file system as an array of Tag objects. 
    */
  var Tags: typingsSlinky.awsSdk.efsMod.Tags = js.native
}

object DescribeTagsResponse {
  @scala.inline
  def apply(Tags: Tags): DescribeTagsResponse = {
    val __obj = js.Dynamic.literal(Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTagsResponse]
  }
  @scala.inline
  implicit class DescribeTagsResponseOps[Self <: DescribeTagsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTags(value: Tags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarker(value: Marker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(js.undefined)
        ret
    }
    @scala.inline
    def withNextMarker(value: Marker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextMarker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextMarker")(js.undefined)
        ret
    }
  }
  
}

