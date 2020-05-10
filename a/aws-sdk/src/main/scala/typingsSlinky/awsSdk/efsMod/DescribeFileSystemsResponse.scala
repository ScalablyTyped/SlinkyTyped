package typingsSlinky.awsSdk.efsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeFileSystemsResponse extends js.Object {
  /**
    * An array of file system descriptions.
    */
  var FileSystems: js.UndefOr[FileSystemDescriptions] = js.native
  /**
    * Present if provided by caller in the request (String).
    */
  var Marker: js.UndefOr[typingsSlinky.awsSdk.efsMod.Marker] = js.native
  /**
    * Present if there are more file systems than returned in the response (String). You can use the NextMarker in the subsequent request to fetch the descriptions.
    */
  var NextMarker: js.UndefOr[Marker] = js.native
}

object DescribeFileSystemsResponse {
  @scala.inline
  def apply(): DescribeFileSystemsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFileSystemsResponse]
  }
  @scala.inline
  implicit class DescribeFileSystemsResponseOps[Self <: DescribeFileSystemsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileSystems(value: FileSystemDescriptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileSystems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileSystems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileSystems")(js.undefined)
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

