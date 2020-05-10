package typingsSlinky.reactCodemirror.ReactCodeMirror

import typingsSlinky.codemirror.mod.Editor
import typingsSlinky.codemirror.mod.EditorChange
import typingsSlinky.codemirror.mod.EditorConfiguration
import typingsSlinky.codemirror.mod.ScrollInfo
import typingsSlinky.react.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactCodeMirrorProps
  extends Props[typingsSlinky.reactCodemirror.ReactCodeMirror.ReactCodeMirror] {
  /** Automatically focuses the editor when it is mounted (default false) */
  var autoFocus: js.UndefOr[Boolean] = js.native
  /** Automatically persist changes to underlying textarea (default false) */
  var autoSave: js.UndefOr[Boolean] = js.native
  /** Adds a custom CSS class to the editor */
  var className: js.UndefOr[String] = js.native
  /** Provides a specific CodeMirror instance (defaults to `require('codemirror')`) */
  var codeMirrorInstance: js.UndefOr[
    js.Function2[/* host */ js.Any, /* options */ js.UndefOr[EditorConfiguration], Editor]
  ] = js.native
  /** Provides the default (not changed tracked) value to the editor */
  var defaultValue: js.UndefOr[String] = js.native
  /** Set the name of the editor input field */
  var name: js.UndefOr[String] = js.native
  /** Called when a change is made */
  var onChange: js.UndefOr[js.Function2[/* newValue */ String, /* change */ EditorChange, _]] = js.native
  /** Called when the cursor is moved */
  var onCursorActivity: js.UndefOr[js.Function1[/* codemirror */ Editor, _]] = js.native
  /** Called when the editor is focused or loses focus */
  var onFocusChange: js.UndefOr[js.Function1[/* focused */ Boolean, _]] = js.native
  /** Called when the editor is scrolled */
  var onScroll: js.UndefOr[js.Function1[/* scrollInfo */ ScrollInfo, _]] = js.native
  /** Options passed to the CodeMirror instance */
  var options: js.UndefOr[EditorConfiguration] = js.native
  /** (DEPRECATED), use `name` */
  var path: js.UndefOr[String] = js.native
  /** Preserve previous scroll position after updating value */
  var preserveScrollPosition: js.UndefOr[Boolean] = js.native
  /** The editor value */
  var value: js.UndefOr[String] = js.native
}

object ReactCodeMirrorProps {
  @scala.inline
  def apply(): ReactCodeMirrorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactCodeMirrorProps]
  }
  @scala.inline
  implicit class ReactCodeMirrorPropsOps[Self <: ReactCodeMirrorProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoSave(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoSave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSave")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withCodeMirrorInstance(value: (/* host */ js.Any, /* options */ js.UndefOr[EditorConfiguration]) => Editor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeMirrorInstance")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCodeMirrorInstance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeMirrorInstance")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: (/* newValue */ String, /* change */ EditorChange) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCursorActivity(value: /* codemirror */ Editor => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCursorActivity")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCursorActivity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCursorActivity")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFocusChange(value: /* focused */ Boolean => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocusChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFocusChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocusChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnScroll(value: /* scrollInfo */ ScrollInfo => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScroll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: EditorConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveScrollPosition(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveScrollPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveScrollPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveScrollPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

