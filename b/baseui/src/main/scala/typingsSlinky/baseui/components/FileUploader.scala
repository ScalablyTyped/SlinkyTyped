package typingsSlinky.baseui.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.File
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.baseui.fileUploaderMod.FileUploaderOverrides
import typingsSlinky.baseui.fileUploaderMod.FileUploaderProps
import typingsSlinky.baseui.fileUploaderMod.StyleProps
import typingsSlinky.react.mod.DragEvent
import typingsSlinky.std.DataTransferItem
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FileUploader
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("baseui/file-uploader", "FileUploader")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: disabled, multiple, name */
  def apply(
    accept: String | js.Array[String] = null,
    disableClick: js.UndefOr[Boolean] = js.undefined,
    errorMessage: String = null,
    getDataTransferItems: /* event */ SyntheticEvent[Event_, js.Any] => js.Promise[js.Array[File | DataTransferItem]] = null,
    maxSize: Int | Double = null,
    minSize: Int | Double = null,
    onBlur: /* event */ SyntheticFocusEvent[HTMLElement] => _ = null,
    onCancel: () => _ = null,
    onClick: /* event */ SyntheticMouseEvent[HTMLElement] => _ = null,
    onDragEnter: /* event */ DragEvent[HTMLElement] => _ = null,
    onDragLeave: /* event */ DragEvent[HTMLElement] => _ = null,
    onDragOver: /* event */ DragEvent[HTMLElement] => _ = null,
    onDragStart: /* event */ DragEvent[HTMLElement] => _ = null,
    onDrop: (/* accepted */ js.Array[File], /* rejected */ js.Array[File], /* event */ SyntheticEvent[Event_, HTMLElement]) => js.Any = null,
    onDropAccepted: (/* acceptedOrRejected */ js.Array[File], /* event */ SyntheticEvent[Event_, HTMLElement]) => js.Any = null,
    onDropRejected: (/* acceptedOrRejected */ js.Array[File], /* event */ SyntheticEvent[Event_, HTMLElement]) => js.Any = null,
    onFileDialogCancel: () => _ = null,
    onFocus: /* event */ SyntheticFocusEvent[HTMLElement] => _ = null,
    onKeyDown: /* event */ SyntheticKeyboardEvent[HTMLElement] => _ = null,
    onRetry: () => _ = null,
    overrides: FileUploaderOverrides[StyleProps] = null,
    preventDropOnDocument: js.UndefOr[Boolean] = js.undefined,
    progressAmount: Int | Double = null,
    progressMessage: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    if (accept != null) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
    if (!js.isUndefined(disableClick)) __obj.updateDynamic("disableClick")(disableClick.asInstanceOf[js.Any])
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (getDataTransferItems != null) __obj.updateDynamic("getDataTransferItems")(js.Any.fromFunction1(getDataTransferItems))
    if (maxSize != null) __obj.updateDynamic("maxSize")(maxSize.asInstanceOf[js.Any])
    if (minSize != null) __obj.updateDynamic("minSize")(minSize.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction0(onCancel))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction1(onDragEnter))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction1(onDragLeave))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction1(onDragOver))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1(onDragStart))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction3(onDrop))
    if (onDropAccepted != null) __obj.updateDynamic("onDropAccepted")(js.Any.fromFunction2(onDropAccepted))
    if (onDropRejected != null) __obj.updateDynamic("onDropRejected")(js.Any.fromFunction2(onDropRejected))
    if (onFileDialogCancel != null) __obj.updateDynamic("onFileDialogCancel")(js.Any.fromFunction0(onFileDialogCancel))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onRetry != null) __obj.updateDynamic("onRetry")(js.Any.fromFunction0(onRetry))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(preventDropOnDocument)) __obj.updateDynamic("preventDropOnDocument")(preventDropOnDocument.asInstanceOf[js.Any])
    if (progressAmount != null) __obj.updateDynamic("progressAmount")(progressAmount.asInstanceOf[js.Any])
    if (progressMessage != null) __obj.updateDynamic("progressMessage")(progressMessage.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, js.Object] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, js.Object](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = FileUploaderProps
}

