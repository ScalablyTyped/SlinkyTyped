package typingsSlinky.baseui.components

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.File
import org.scalajs.dom.raw.HTMLElement
import slinky.core.SyntheticEvent
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.fileUploaderMod.FileUploaderOverrides
import typingsSlinky.baseui.fileUploaderMod.FileUploaderProps
import typingsSlinky.baseui.fileUploaderMod.StyleProps
import typingsSlinky.react.mod.DragEvent
import typingsSlinky.std.DataTransferItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FileUploader {
  @JSImport("baseui/file-uploader", "FileUploader")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def acceptVarargs(value: String*): this.type = set("accept", js.Array(value :_*))
    @scala.inline
    def accept(value: String | js.Array[String]): this.type = set("accept", value.asInstanceOf[js.Any])
    @scala.inline
    def disableClick(value: Boolean): this.type = set("disableClick", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def errorMessage(value: String): this.type = set("errorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def getDataTransferItems(value: /* event */ SyntheticEvent[Event, js.Any] => js.Promise[js.Array[File | DataTransferItem]]): this.type = set("getDataTransferItems", js.Any.fromFunction1(value))
    @scala.inline
    def maxSize(value: Double): this.type = set("maxSize", value.asInstanceOf[js.Any])
    @scala.inline
    def minSize(value: Double): this.type = set("minSize", value.asInstanceOf[js.Any])
    @scala.inline
    def multiple(value: Boolean): this.type = set("multiple", value.asInstanceOf[js.Any])
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def onBlur(value: /* event */ SyntheticFocusEvent[HTMLElement] => _): this.type = set("onBlur", js.Any.fromFunction1(value))
    @scala.inline
    def onCancel(value: () => _): this.type = set("onCancel", js.Any.fromFunction0(value))
    @scala.inline
    def onClick(value: /* event */ SyntheticMouseEvent[HTMLElement] => _): this.type = set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def onDragEnter(value: /* event */ DragEvent[HTMLElement] => _): this.type = set("onDragEnter", js.Any.fromFunction1(value))
    @scala.inline
    def onDragLeave(value: /* event */ DragEvent[HTMLElement] => _): this.type = set("onDragLeave", js.Any.fromFunction1(value))
    @scala.inline
    def onDragOver(value: /* event */ DragEvent[HTMLElement] => _): this.type = set("onDragOver", js.Any.fromFunction1(value))
    @scala.inline
    def onDragStart(value: /* event */ DragEvent[HTMLElement] => _): this.type = set("onDragStart", js.Any.fromFunction1(value))
    @scala.inline
    def onDrop(
      value: (/* accepted */ js.Array[File], /* rejected */ js.Array[File], /* event */ SyntheticEvent[Event, HTMLElement]) => js.Any
    ): this.type = set("onDrop", js.Any.fromFunction3(value))
    @scala.inline
    def onDropAccepted(
      value: (/* acceptedOrRejected */ js.Array[File], /* event */ SyntheticEvent[Event, HTMLElement]) => js.Any
    ): this.type = set("onDropAccepted", js.Any.fromFunction2(value))
    @scala.inline
    def onDropRejected(
      value: (/* acceptedOrRejected */ js.Array[File], /* event */ SyntheticEvent[Event, HTMLElement]) => js.Any
    ): this.type = set("onDropRejected", js.Any.fromFunction2(value))
    @scala.inline
    def onFileDialogCancel(value: () => _): this.type = set("onFileDialogCancel", js.Any.fromFunction0(value))
    @scala.inline
    def onFocus(value: /* event */ SyntheticFocusEvent[HTMLElement] => _): this.type = set("onFocus", js.Any.fromFunction1(value))
    @scala.inline
    def onKeyDown(value: /* event */ SyntheticKeyboardEvent[HTMLElement] => _): this.type = set("onKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def onRetry(value: () => _): this.type = set("onRetry", js.Any.fromFunction0(value))
    @scala.inline
    def overrides(value: FileUploaderOverrides[StyleProps]): this.type = set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def preventDropOnDocument(value: Boolean): this.type = set("preventDropOnDocument", value.asInstanceOf[js.Any])
    @scala.inline
    def progressAmount(value: Double): this.type = set("progressAmount", value.asInstanceOf[js.Any])
    @scala.inline
    def progressMessage(value: String): this.type = set("progressMessage", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: FileUploaderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: FileUploader.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

