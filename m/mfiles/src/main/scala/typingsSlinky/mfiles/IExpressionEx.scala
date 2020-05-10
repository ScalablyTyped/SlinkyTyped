package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFFolderListingAlgorithm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IExpressionEx extends js.Object {
  var Conditions: ISearchConditions = js.native
  var Expression: IExpression = js.native
  var FolderListingAlgorithm: MFFolderListingAlgorithm = js.native
  var NULLFolderName: String = js.native
  var ShowContentsAsJITFolders: Boolean = js.native
  var ShowEmptyFolders: Boolean = js.native
  var ShowMatchingObjectsOnThisLevel: Boolean = js.native
  var ShowNULLFolder: Boolean = js.native
  var ShowNULLFolderContentsOnThisLevel: Boolean = js.native
  def Clone(): IExpressionEx = js.native
}

object IExpressionEx {
  @scala.inline
  def apply(
    Clone: () => IExpressionEx,
    Conditions: ISearchConditions,
    Expression: IExpression,
    FolderListingAlgorithm: MFFolderListingAlgorithm,
    NULLFolderName: String,
    ShowContentsAsJITFolders: Boolean,
    ShowEmptyFolders: Boolean,
    ShowMatchingObjectsOnThisLevel: Boolean,
    ShowNULLFolder: Boolean,
    ShowNULLFolderContentsOnThisLevel: Boolean
  ): IExpressionEx = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Conditions = Conditions.asInstanceOf[js.Any], Expression = Expression.asInstanceOf[js.Any], FolderListingAlgorithm = FolderListingAlgorithm.asInstanceOf[js.Any], NULLFolderName = NULLFolderName.asInstanceOf[js.Any], ShowContentsAsJITFolders = ShowContentsAsJITFolders.asInstanceOf[js.Any], ShowEmptyFolders = ShowEmptyFolders.asInstanceOf[js.Any], ShowMatchingObjectsOnThisLevel = ShowMatchingObjectsOnThisLevel.asInstanceOf[js.Any], ShowNULLFolder = ShowNULLFolder.asInstanceOf[js.Any], ShowNULLFolderContentsOnThisLevel = ShowNULLFolderContentsOnThisLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExpressionEx]
  }
  @scala.inline
  implicit class IExpressionExOps[Self <: IExpressionEx] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClone(value: () => IExpressionEx): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withConditions(value: ISearchConditions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Conditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpression(value: IExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Expression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFolderListingAlgorithm(value: MFFolderListingAlgorithm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FolderListingAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNULLFolderName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NULLFolderName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowContentsAsJITFolders(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowContentsAsJITFolders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowEmptyFolders(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowEmptyFolders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowMatchingObjectsOnThisLevel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowMatchingObjectsOnThisLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowNULLFolder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowNULLFolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowNULLFolderContentsOnThisLevel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowNULLFolderContentsOnThisLevel")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

