package typingsSlinky.ckeditor.CKEDITOR.editor

import typingsSlinky.ckeditor.CKEDITOR.eventInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait eventObject extends js.Object {
  var activeEnterModeChange: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var activeFilterChange: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var afterCommandExec: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var afterInsertHtml: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var afterPaste: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var afterPasteFromWord: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var afterSetData: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var afterUndoImage: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var ariaEditorHelpLabel: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var ariaWidget: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var autogrow: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var beforeCommandExec: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var beforeDestroy: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var beforeGetData: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var beforeModeUnload: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var beforeSetMode: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var beforeUndoImage: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var blur: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var change: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var configLoaded: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var contentDirChanged: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var contentDom: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var contentDomInvalidated: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var contentDomUnload: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var customConfigLoaded: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var dataFiltered: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var dataReady: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var destroy: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var dialogHide: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var dialogShow: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var dirChanged: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var doubleclick: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var dragend: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var dragstart: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var drop: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var elementsPathUpdate: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var fileUploadRequest: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var fileUploadResponse: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var floatingSpaceLayout: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var focus: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var getData: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var getSnapshot: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var insertElement: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var insertHtml: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var insertText: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var instanceReady: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var key: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var langLoaded: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var loadSnapshot: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var loaded: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var lockSnapshot: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var maximize: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var menuShow: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var mode: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var notificationHide: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var notificationShow: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var notificationUpdate: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var paste: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var pasteFromWord: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var pluginsLoaded: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var readOnly: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var removeFormatCleanup: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var required: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var resize: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var save: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var saveSnapshot: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var selectionChange: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var setData: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var stylesSet: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var template: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var toDataFormat: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var toHtml: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var unlockSnapshot: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var updateSnapshot: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var widgetDefinition: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
}

object eventObject {
  @scala.inline
  def apply(): eventObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[eventObject]
  }
  @scala.inline
  implicit class eventObjectOps[Self <: eventObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveEnterModeChange(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeEnterModeChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutActiveEnterModeChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeEnterModeChange")(js.undefined)
        ret
    }
    @scala.inline
    def withActiveFilterChange(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeFilterChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutActiveFilterChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeFilterChange")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterCommandExec(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterCommandExec")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterCommandExec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterCommandExec")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterInsertHtml(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterInsertHtml")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterInsertHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterInsertHtml")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterPaste(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterPaste")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterPaste: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterPaste")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterPasteFromWord(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterPasteFromWord")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterPasteFromWord: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterPasteFromWord")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterSetData(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSetData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterSetData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSetData")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterUndoImage(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterUndoImage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterUndoImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterUndoImage")(js.undefined)
        ret
    }
    @scala.inline
    def withAriaEditorHelpLabel(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaEditorHelpLabel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAriaEditorHelpLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaEditorHelpLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withAriaWidget(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaWidget")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAriaWidget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaWidget")(js.undefined)
        ret
    }
    @scala.inline
    def withAutogrow(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autogrow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAutogrow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autogrow")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeCommandExec(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeCommandExec")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeCommandExec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeCommandExec")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeDestroy(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeDestroy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeDestroy")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeGetData(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeGetData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeGetData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeGetData")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeModeUnload(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeModeUnload")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeModeUnload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeModeUnload")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeSetMode(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSetMode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeSetMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSetMode")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeUndoImage(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeUndoImage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeUndoImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeUndoImage")(js.undefined)
        ret
    }
    @scala.inline
    def withBlur(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blur")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blur")(js.undefined)
        ret
    }
    @scala.inline
    def withChange(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigLoaded(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configLoaded")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutConfigLoaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configLoaded")(js.undefined)
        ret
    }
    @scala.inline
    def withContentDirChanged(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentDirChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutContentDirChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentDirChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withContentDom(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentDom")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutContentDom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentDom")(js.undefined)
        ret
    }
    @scala.inline
    def withContentDomInvalidated(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentDomInvalidated")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutContentDomInvalidated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentDomInvalidated")(js.undefined)
        ret
    }
    @scala.inline
    def withContentDomUnload(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentDomUnload")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutContentDomUnload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentDomUnload")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomConfigLoaded(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customConfigLoaded")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCustomConfigLoaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customConfigLoaded")(js.undefined)
        ret
    }
    @scala.inline
    def withDataFiltered(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataFiltered")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDataFiltered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataFiltered")(js.undefined)
        ret
    }
    @scala.inline
    def withDataReady(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataReady")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDataReady: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataReady")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroy(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.undefined)
        ret
    }
    @scala.inline
    def withDialogHide(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogHide")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDialogHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogHide")(js.undefined)
        ret
    }
    @scala.inline
    def withDialogShow(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogShow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDialogShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogShow")(js.undefined)
        ret
    }
    @scala.inline
    def withDirChanged(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDirChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withDoubleclick(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleclick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDoubleclick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleclick")(js.undefined)
        ret
    }
    @scala.inline
    def withDragend(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragend")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDragend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragend")(js.undefined)
        ret
    }
    @scala.inline
    def withDragstart(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragstart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDragstart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragstart")(js.undefined)
        ret
    }
    @scala.inline
    def withDrop(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drop")(js.undefined)
        ret
    }
    @scala.inline
    def withElementsPathUpdate(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementsPathUpdate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutElementsPathUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementsPathUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withFileUploadRequest(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileUploadRequest")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFileUploadRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileUploadRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withFileUploadResponse(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileUploadResponse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFileUploadResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileUploadResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withFloatingSpaceLayout(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatingSpaceLayout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFloatingSpaceLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatingSpaceLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withFocus(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(js.undefined)
        ret
    }
    @scala.inline
    def withGetData(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getData")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSnapshot(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSnapshot")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetSnapshot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSnapshot")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertElement(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertElement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInsertElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertElement")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertHtml(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertHtml")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInsertHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertHtml")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertText(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInsertText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertText")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceReady(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceReady")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInstanceReady: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceReady")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withLangLoaded(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("langLoaded")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLangLoaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("langLoaded")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadSnapshot(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadSnapshot")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLoadSnapshot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadSnapshot")(js.undefined)
        ret
    }
    @scala.inline
    def withLoaded(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loaded")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLoaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loaded")(js.undefined)
        ret
    }
    @scala.inline
    def withLockSnapshot(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockSnapshot")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLockSnapshot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockSnapshot")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximize(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMaximize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximize")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuShow(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuShow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMenuShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuShow")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withNotificationHide(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationHide")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNotificationHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationHide")(js.undefined)
        ret
    }
    @scala.inline
    def withNotificationShow(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationShow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNotificationShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationShow")(js.undefined)
        ret
    }
    @scala.inline
    def withNotificationUpdate(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationUpdate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNotificationUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withPaste(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paste")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPaste: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paste")(js.undefined)
        ret
    }
    @scala.inline
    def withPasteFromWord(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pasteFromWord")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPasteFromWord: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pasteFromWord")(js.undefined)
        ret
    }
    @scala.inline
    def withPluginsLoaded(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pluginsLoaded")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPluginsLoaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pluginsLoaded")(js.undefined)
        ret
    }
    @scala.inline
    def withReadOnly(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutReadOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveFormatCleanup(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeFormatCleanup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRemoveFormatCleanup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeFormatCleanup")(js.undefined)
        ret
    }
    @scala.inline
    def withRequired(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(js.undefined)
        ret
    }
    @scala.inline
    def withResize(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(js.undefined)
        ret
    }
    @scala.inline
    def withSave(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save")(js.undefined)
        ret
    }
    @scala.inline
    def withSaveSnapshot(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveSnapshot")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSaveSnapshot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveSnapshot")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionChange(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSelectionChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionChange")(js.undefined)
        ret
    }
    @scala.inline
    def withSetData(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setData")(js.undefined)
        ret
    }
    @scala.inline
    def withStylesSet(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stylesSet")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutStylesSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stylesSet")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplate(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.undefined)
        ret
    }
    @scala.inline
    def withToDataFormat(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toDataFormat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutToDataFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toDataFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withToHtml(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toHtml")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutToHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toHtml")(js.undefined)
        ret
    }
    @scala.inline
    def withUnlockSnapshot(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlockSnapshot")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUnlockSnapshot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlockSnapshot")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateSnapshot(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateSnapshot")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUpdateSnapshot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateSnapshot")(js.undefined)
        ret
    }
    @scala.inline
    def withWidgetDefinition(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widgetDefinition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutWidgetDefinition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widgetDefinition")(js.undefined)
        ret
    }
  }
  
}

