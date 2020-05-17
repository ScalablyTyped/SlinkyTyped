package typingsSlinky.gapiClientCompute.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerType extends js.Object {
  /**
    * The format used to encode and transmit the block device, which should be TAR. This is just a container and transmission format and not a runtime
    * format. Provided by the client when the disk image is created.
    */
  var containerType: js.UndefOr[String] = js.native
  /** An optional SHA1 checksum of the disk image before unpackaging; provided by the client when the disk image is created. */
  var sha1Checksum: js.UndefOr[String] = js.native
  /** The full Google Cloud Storage URL where the disk image is stored. You must provide either this property or the sourceDisk property but not both. */
  var source: js.UndefOr[String] = js.native
}

object ContainerType {
  @scala.inline
  def apply(): ContainerType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerType]
  }
  @scala.inline
  implicit class ContainerTypeOps[Self <: ContainerType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainerType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerType")(js.undefined)
        ret
    }
    @scala.inline
    def withSha1Checksum(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha1Checksum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSha1Checksum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha1Checksum")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
  }
  
}

