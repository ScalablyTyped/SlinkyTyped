package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFolderUIState extends js.Object {
  var BottomPaneBarMinimized: Boolean = js.native
  var HitHighlightingEnabled: Boolean = js.native
  val ListingUIState: IFolderListingUIState = js.native
  var MetadataEditorInRightPane: Boolean = js.native
  var RelativeBottomPaneHeight: Double = js.native
  var RelativeRightPaneWidth: Double = js.native
  var RightPaneBarMinimized: Boolean = js.native
  var ShowBottomPaneBar: Boolean = js.native
  var ShowRightPaneBar: Boolean = js.native
}

object IFolderUIState {
  @scala.inline
  def apply(
    BottomPaneBarMinimized: Boolean,
    HitHighlightingEnabled: Boolean,
    ListingUIState: IFolderListingUIState,
    MetadataEditorInRightPane: Boolean,
    RelativeBottomPaneHeight: Double,
    RelativeRightPaneWidth: Double,
    RightPaneBarMinimized: Boolean,
    ShowBottomPaneBar: Boolean,
    ShowRightPaneBar: Boolean
  ): IFolderUIState = {
    val __obj = js.Dynamic.literal(BottomPaneBarMinimized = BottomPaneBarMinimized.asInstanceOf[js.Any], HitHighlightingEnabled = HitHighlightingEnabled.asInstanceOf[js.Any], ListingUIState = ListingUIState.asInstanceOf[js.Any], MetadataEditorInRightPane = MetadataEditorInRightPane.asInstanceOf[js.Any], RelativeBottomPaneHeight = RelativeBottomPaneHeight.asInstanceOf[js.Any], RelativeRightPaneWidth = RelativeRightPaneWidth.asInstanceOf[js.Any], RightPaneBarMinimized = RightPaneBarMinimized.asInstanceOf[js.Any], ShowBottomPaneBar = ShowBottomPaneBar.asInstanceOf[js.Any], ShowRightPaneBar = ShowRightPaneBar.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFolderUIState]
  }
  @scala.inline
  implicit class IFolderUIStateOps[Self <: IFolderUIState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBottomPaneBarMinimized(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BottomPaneBarMinimized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHitHighlightingEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HitHighlightingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListingUIState(value: IFolderListingUIState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListingUIState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadataEditorInRightPane(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetadataEditorInRightPane")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelativeBottomPaneHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RelativeBottomPaneHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelativeRightPaneWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RelativeRightPaneWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRightPaneBarMinimized(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RightPaneBarMinimized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowBottomPaneBar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowBottomPaneBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowRightPaneBar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowRightPaneBar")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

