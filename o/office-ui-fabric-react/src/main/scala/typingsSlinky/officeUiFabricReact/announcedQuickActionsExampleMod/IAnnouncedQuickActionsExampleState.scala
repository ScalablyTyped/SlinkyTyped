package typingsSlinky.officeUiFabricReact.announcedQuickActionsExampleMod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAnnouncedQuickActionsExampleState extends js.Object {
  var announced: js.UndefOr[ReactElement] = js.native
  var dialogContent: js.UndefOr[ReactElement] = js.native
  var items: js.Array[IAnnouncedQuickActionsExampleItem] = js.native
  var renameDialogOpen: Boolean = js.native
}

object IAnnouncedQuickActionsExampleState {
  @scala.inline
  def apply(items: js.Array[IAnnouncedQuickActionsExampleItem], renameDialogOpen: Boolean): IAnnouncedQuickActionsExampleState = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], renameDialogOpen = renameDialogOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAnnouncedQuickActionsExampleState]
  }
  @scala.inline
  implicit class IAnnouncedQuickActionsExampleStateOps[Self <: IAnnouncedQuickActionsExampleState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[IAnnouncedQuickActionsExampleItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenameDialogOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renameDialogOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnnounced(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("announced")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnounced: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("announced")(js.undefined)
        ret
    }
    @scala.inline
    def withDialogContent(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDialogContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogContent")(js.undefined)
        ret
    }
  }
  
}

