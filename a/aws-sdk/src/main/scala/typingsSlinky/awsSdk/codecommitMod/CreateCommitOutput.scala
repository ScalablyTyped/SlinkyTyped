package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCommitOutput extends js.Object {
  /**
    * The full commit ID of the commit that contains your committed file changes.
    */
  var commitId: js.UndefOr[ObjectId] = js.native
  /**
    * The files added as part of the committed file changes.
    */
  var filesAdded: js.UndefOr[FilesMetadata] = js.native
  /**
    * The files deleted as part of the committed file changes.
    */
  var filesDeleted: js.UndefOr[FilesMetadata] = js.native
  /**
    * The files updated as part of the commited file changes.
    */
  var filesUpdated: js.UndefOr[FilesMetadata] = js.native
  /**
    * The full SHA-1 pointer of the tree information for the commit that contains the commited file changes.
    */
  var treeId: js.UndefOr[ObjectId] = js.native
}

object CreateCommitOutput {
  @scala.inline
  def apply(): CreateCommitOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCommitOutput]
  }
  @scala.inline
  implicit class CreateCommitOutputOps[Self <: CreateCommitOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommitId(value: ObjectId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commitId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommitId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commitId")(js.undefined)
        ret
    }
    @scala.inline
    def withFilesAdded(value: FilesMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filesAdded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilesAdded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filesAdded")(js.undefined)
        ret
    }
    @scala.inline
    def withFilesDeleted(value: FilesMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filesDeleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilesDeleted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filesDeleted")(js.undefined)
        ret
    }
    @scala.inline
    def withFilesUpdated(value: FilesMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filesUpdated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilesUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filesUpdated")(js.undefined)
        ret
    }
    @scala.inline
    def withTreeId(value: ObjectId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTreeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeId")(js.undefined)
        ret
    }
  }
  
}

