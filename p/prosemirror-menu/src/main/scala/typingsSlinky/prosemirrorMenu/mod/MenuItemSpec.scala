package typingsSlinky.prosemirrorMenu.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Node
import typingsSlinky.prosemirrorModel.mod.Schema
import typingsSlinky.prosemirrorState.mod.EditorState
import typingsSlinky.prosemirrorState.mod.Transaction
import typingsSlinky.prosemirrorView.mod.EditorView
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuItemSpec[S /* <: Schema[_, _] */] extends js.Object {
  /**
    * A predicate function to determine whether the item is 'active' (for
    * example, the item for toggling the strong mark might be active then
    * the cursor is in strong text).
    */
  var active: js.UndefOr[(js.Function1[/* p */ EditorState[S], Boolean]) | Null] = js.native
  /**
    * Optionally adds a CSS class to the item's DOM representation.
    */
  var `class`: String = js.native
  /**
    * Optionally adds a string of inline CSS to the item's DOM
    * representation.
    */
  var css: String = js.native
  /**
    * Function that is used to determine if the item is enabled. If
    * given and returning false, the item will be given a disabled
    * styling.
    */
  var enable: js.UndefOr[(js.Function1[/* p */ EditorState[S], Boolean]) | Null] = js.native
  /**
    * Defines which event on the command's DOM representation should
    * trigger the execution of the command. Defaults to mousedown.
    */
  var execEvent: String = js.native
  /**
    * Describes an icon to show for this item. The object may specify
    * an SVG icon, in which case its `path` property should be an [SVG
    * path
    * spec](https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/d),
    * and `width` and `height` should provide the viewbox in which that
    * path exists. Alternatively, it may have a `text` property
    * specifying a string of text that makes up the icon, with an
    * optional `css` property giving additional CSS styling for the
    * text. _Or_ it may contain `dom` property containing a DOM node.
    */
  var icon: js.UndefOr[StringDictionary[js.Any] | Null] = js.native
  /**
    * Makes the item show up as a text label. Mostly useful for items
    * wrapped in a [drop-down](#menu.Dropdown) or similar menu. The object
    * should have a `label` property providing the text to display.
    */
  var label: js.UndefOr[String | Null] = js.native
  /**
    * A function that renders the item. You must provide either this,
    * [`icon`](#menu.MenuItemSpec.icon), or [`label`](#MenuItemSpec.label).
    */
  var render: js.UndefOr[(js.Function1[/* p */ EditorView[S], Node]) | Null] = js.native
  /**
    * Optional function that is used to determine whether the item is
    * appropriate at the moment. Deselected items will be hidden.
    */
  var select: js.UndefOr[(js.Function1[/* p */ EditorState[S], Boolean]) | Null] = js.native
  /**
    * Defines DOM title (mouseover) text for the item.
    */
  var title: js.UndefOr[String | (js.Function1[/* p */ EditorState[S], String]) | Null] = js.native
  /**
    * The function to execute when the menu item is activated.
    */
  def run(p1: EditorState[S], p2: js.Function1[/* p */ Transaction[S], Unit], p3: EditorView[S], p4: Event_): Unit = js.native
}

object MenuItemSpec {
  @scala.inline
  def apply[S](
    `class`: String,
    css: String,
    execEvent: String,
    run: (EditorState[S], js.Function1[/* p */ Transaction[S], Unit], EditorView[S], Event_) => Unit
  ): MenuItemSpec[S] = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], execEvent = execEvent.asInstanceOf[js.Any], run = js.Any.fromFunction4(run))
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuItemSpec[S]]
  }
  @scala.inline
  implicit class MenuItemSpecOps[Self[s] <: MenuItemSpec[s], S] (val x: Self[S]) extends AnyVal {
    @scala.inline
    def duplicate: Self[S] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[S]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[S] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[S] with Other]
    @scala.inline
    def withClass(value: String): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCss(value: String): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExecEvent(value: String): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRun(value: (EditorState[S], js.Function1[/* p */ Transaction[S], Unit], EditorView[S], Event_) => Unit): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withActive(value: /* p */ EditorState[S] => Boolean): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutActive: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(js.undefined)
        ret
    }
    @scala.inline
    def withActiveNull: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(null)
        ret
    }
    @scala.inline
    def withEnable(value: /* p */ EditorState[S] => Boolean): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEnable: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableNull: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(null)
        ret
    }
    @scala.inline
    def withIcon(value: StringDictionary[js.Any]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withIconNull: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(null)
        ret
    }
    @scala.inline
    def withLabel(value: String): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelNull: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(null)
        ret
    }
    @scala.inline
    def withRender(value: /* p */ EditorView[S] => Node): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRender: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderNull: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(null)
        ret
    }
    @scala.inline
    def withSelect(value: /* p */ EditorState[S] => Boolean): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSelect: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectNull: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(null)
        ret
    }
    @scala.inline
    def withTitleFunction1(value: /* p */ EditorState[S] => String): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTitle(value: String | (js.Function1[/* p */ EditorState[S], String])): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleNull: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(null)
        ret
    }
  }
  
}

