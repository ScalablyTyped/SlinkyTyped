package typingsSlinky.awsSdkClientCodecommitNode.typesRepositoryMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledRepositoryMetadata extends RepositoryMetadata {
  /**
    * <p>The date and time the repository was created, in timestamp format.</p>
    */
  @JSName("creationDate")
  var creationDate_UnmarshalledRepositoryMetadata: js.UndefOr[js.Date] = js.native
  /**
    * <p>The date and time the repository was last modified, in timestamp format.</p>
    */
  @JSName("lastModifiedDate")
  var lastModifiedDate_UnmarshalledRepositoryMetadata: js.UndefOr[js.Date] = js.native
}

object UnmarshalledRepositoryMetadata {
  @scala.inline
  def apply(): UnmarshalledRepositoryMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledRepositoryMetadata]
  }
  @scala.inline
  implicit class UnmarshalledRepositoryMetadataOps[Self <: UnmarshalledRepositoryMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDate")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModifiedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedDate")(js.undefined)
        ret
    }
  }
  
}

