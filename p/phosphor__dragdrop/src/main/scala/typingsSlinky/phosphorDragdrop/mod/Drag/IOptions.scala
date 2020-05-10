package typingsSlinky.phosphorDragdrop.mod.Drag

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.phosphorCoreutils.mod.MimeData
import typingsSlinky.phosphorDragdrop.mod.DropAction
import typingsSlinky.phosphorDragdrop.mod.SupportedActions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for initializing a `Drag` object.
  */
@js.native
trait IOptions extends js.Object {
  /**
    * An optional drag image which follows the mouse cursor.
    *
    * #### Notes
    * The drag image can be any DOM element. It is not limited to
    * image or canvas elements as with the native drag-drop APIs.
    *
    * If provided, this will be positioned at the mouse cursor on each
    * mouse move event. A CSS transform can be used to offset the node
    * from its specified position.
    *
    * The drag image will automatically have the `p-mod-drag-image`
    * class name added.
    *
    * The default value is `null`.
    */
  var dragImage: js.UndefOr[HTMLElement] = js.native
  /**
    * The populated mime data for the drag operation.
    */
  var mimeData: MimeData = js.native
  /**
    * The optional proposed drop action for the drag operation.
    *
    * #### Notes
    * This can be provided as a hint to the drop targets as to which
    * drop action is preferred.
    *
    * The default value is `'copy'`.
    */
  var proposedAction: js.UndefOr[DropAction] = js.native
  /**
    * An optional object which indicates the source of the drag.
    *
    * #### Notes
    * For advanced applications, the drag initiator may wish to expose
    * a source object to the drop targets. That object can be specified
    * here and will be carried along with the drag events.
    *
    * The default value is `null`.
    */
  var source: js.UndefOr[js.Any] = js.native
  /**
    * The drop actions supported by the drag initiator.
    *
    * #### Notes
    * A drop target must indicate that it intends to perform one of the
    * supported actions in order to receive a drop event. However, it is
    * not required to *actually* perform that action when handling the
    * drop event. Therefore, the initiator must be prepared to handle
    * any drop action performed by a drop target.
    *
    * The default value is `'all'`.
    */
  var supportedActions: js.UndefOr[SupportedActions] = js.native
}

object IOptions {
  @scala.inline
  def apply(mimeData: MimeData): IOptions = {
    val __obj = js.Dynamic.literal(mimeData = mimeData.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMimeData(value: MimeData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDragImage(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragImage")(js.undefined)
        ret
    }
    @scala.inline
    def withProposedAction(value: DropAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proposedAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProposedAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proposedAction")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: js.Any): Self = {
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
    @scala.inline
    def withSupportedActions(value: SupportedActions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportedActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedActions")(js.undefined)
        ret
    }
  }
  
}

