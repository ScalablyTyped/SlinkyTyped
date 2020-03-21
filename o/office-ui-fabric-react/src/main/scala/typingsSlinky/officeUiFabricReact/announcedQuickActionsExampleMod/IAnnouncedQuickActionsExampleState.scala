package typingsSlinky.officeUiFabricReact.announcedQuickActionsExampleMod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAnnouncedQuickActionsExampleState extends js.Object {
  var announced: js.UndefOr[ReactElement] = js.undefined
  var dialogContent: js.UndefOr[ReactElement] = js.undefined
  var items: js.Array[IAnnouncedQuickActionsExampleItem]
  var renameDialogOpen: Boolean
}

object IAnnouncedQuickActionsExampleState {
  @scala.inline
  def apply(
    items: js.Array[IAnnouncedQuickActionsExampleItem],
    renameDialogOpen: Boolean,
    announced: ReactElement = null,
    dialogContent: ReactElement = null
  ): IAnnouncedQuickActionsExampleState = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], renameDialogOpen = renameDialogOpen.asInstanceOf[js.Any])
    if (announced != null) __obj.updateDynamic("announced")(announced.asInstanceOf[js.Any])
    if (dialogContent != null) __obj.updateDynamic("dialogContent")(dialogContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAnnouncedQuickActionsExampleState]
  }
}

