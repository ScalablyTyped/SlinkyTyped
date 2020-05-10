package typingsSlinky.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IConfigurationChangedEvent extends js.Object {
  val accessibilitySupport: Boolean = js.native
  val autoClosingBrackets: Boolean = js.native
  val autoClosingOvertype: Boolean = js.native
  val autoClosingQuotes: Boolean = js.native
  val autoIndent: Boolean = js.native
  val autoSurround: Boolean = js.native
  val canUseLayerHinting: Boolean = js.native
  val contribInfo: Boolean = js.native
  val copyWithSyntaxHighlighting: Boolean = js.native
  val dragAndDrop: Boolean = js.native
  val editorClassName: Boolean = js.native
  val emptySelectionClipboard: Boolean = js.native
  val fontInfo: Boolean = js.native
  val layoutInfo: Boolean = js.native
  val lineHeight: Boolean = js.native
  val multiCursorMergeOverlapping: Boolean = js.native
  val multiCursorModifier: Boolean = js.native
  val pixelRatio: Boolean = js.native
  val readOnly: Boolean = js.native
  val tabFocusMode: Boolean = js.native
  val useTabStops: Boolean = js.native
  val viewInfo: Boolean = js.native
  val wordSeparators: Boolean = js.native
  val wrappingInfo: Boolean = js.native
}

object IConfigurationChangedEvent {
  @scala.inline
  def apply(
    accessibilitySupport: Boolean,
    autoClosingBrackets: Boolean,
    autoClosingOvertype: Boolean,
    autoClosingQuotes: Boolean,
    autoIndent: Boolean,
    autoSurround: Boolean,
    canUseLayerHinting: Boolean,
    contribInfo: Boolean,
    copyWithSyntaxHighlighting: Boolean,
    dragAndDrop: Boolean,
    editorClassName: Boolean,
    emptySelectionClipboard: Boolean,
    fontInfo: Boolean,
    layoutInfo: Boolean,
    lineHeight: Boolean,
    multiCursorMergeOverlapping: Boolean,
    multiCursorModifier: Boolean,
    pixelRatio: Boolean,
    readOnly: Boolean,
    tabFocusMode: Boolean,
    useTabStops: Boolean,
    viewInfo: Boolean,
    wordSeparators: Boolean,
    wrappingInfo: Boolean
  ): IConfigurationChangedEvent = {
    val __obj = js.Dynamic.literal(accessibilitySupport = accessibilitySupport.asInstanceOf[js.Any], autoClosingBrackets = autoClosingBrackets.asInstanceOf[js.Any], autoClosingOvertype = autoClosingOvertype.asInstanceOf[js.Any], autoClosingQuotes = autoClosingQuotes.asInstanceOf[js.Any], autoIndent = autoIndent.asInstanceOf[js.Any], autoSurround = autoSurround.asInstanceOf[js.Any], canUseLayerHinting = canUseLayerHinting.asInstanceOf[js.Any], contribInfo = contribInfo.asInstanceOf[js.Any], copyWithSyntaxHighlighting = copyWithSyntaxHighlighting.asInstanceOf[js.Any], dragAndDrop = dragAndDrop.asInstanceOf[js.Any], editorClassName = editorClassName.asInstanceOf[js.Any], emptySelectionClipboard = emptySelectionClipboard.asInstanceOf[js.Any], fontInfo = fontInfo.asInstanceOf[js.Any], layoutInfo = layoutInfo.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], multiCursorMergeOverlapping = multiCursorMergeOverlapping.asInstanceOf[js.Any], multiCursorModifier = multiCursorModifier.asInstanceOf[js.Any], pixelRatio = pixelRatio.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], tabFocusMode = tabFocusMode.asInstanceOf[js.Any], useTabStops = useTabStops.asInstanceOf[js.Any], viewInfo = viewInfo.asInstanceOf[js.Any], wordSeparators = wordSeparators.asInstanceOf[js.Any], wrappingInfo = wrappingInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConfigurationChangedEvent]
  }
  @scala.inline
  implicit class IConfigurationChangedEventOps[Self <: IConfigurationChangedEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessibilitySupport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilitySupport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoClosingBrackets(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoClosingBrackets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoClosingOvertype(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoClosingOvertype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoClosingQuotes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoClosingQuotes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoIndent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoIndent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoSurround(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSurround")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanUseLayerHinting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canUseLayerHinting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContribInfo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contribInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCopyWithSyntaxHighlighting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyWithSyntaxHighlighting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDragAndDrop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragAndDrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditorClassName(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmptySelectionClipboard(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptySelectionClipboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontInfo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayoutInfo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineHeight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiCursorMergeOverlapping(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiCursorMergeOverlapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiCursorModifier(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiCursorModifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPixelRatio(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabFocusMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabFocusMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseTabStops(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTabStops")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewInfo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordSeparators(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordSeparators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrappingInfo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrappingInfo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

