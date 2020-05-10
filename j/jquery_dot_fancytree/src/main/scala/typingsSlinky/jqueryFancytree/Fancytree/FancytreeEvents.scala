package typingsSlinky.jqueryFancytree.Fancytree

import typingsSlinky.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The `this` context of any event function is set to tree's the HTMLDivElement  */
@js.native
trait FancytreeEvents extends js.Object {
  /** 'data.node' was deactivated. */
  var activate: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Unit]] = js.native
  /** Return false to prevent default processing */
  var beforeActivate: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Boolean]] = js.native
  /** Return `false` to prevent default processing */
  var beforeExpand: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Boolean]] = js.native
  /** Return `false` to prevent default processing */
  var beforeSelect: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Boolean]] = js.native
  /** `data.node` lost keyboard focus */
  var blur: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Unit]] = js.native
  /** `data.tree` lost keyboard focus */
  var blurTree: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Unit]] = js.native
  /** `data.node` was clicked. `data.targetType` contains the region ("title", "expander", ...). Return `false` to prevent default processing, i.e. activating, etc. */
  var click: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Boolean]] = js.native
  /** `data.node` was collapsed */
  var collapse: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Unit]] = js.native
  /** Widget was created (called only once, even if re-initialized). */
  var create: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Unit]] = js.native
  /** Allow tweaking and binding, after node was created for the first time (NOTE: this event is only available as callback, but not for bind()) */
  var createNode: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Unit]] = js.native
  /** `data.node` was double-clicked. `data.targetType` contains the region ("title", "expander", ...). Return `false` to prevent default processing, i.e. expanding, etc. */
  var dblclick: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Boolean]] = js.native
  /** `data.node` was deactivated */
  var deactivate: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Unit]] = js.native
  /** `data.node` was expanded */
  var expand: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Unit]] = js.native
  /** `data.node` received keyboard focus */
  var focus: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Unit]] = js.native
  /**`data.tree` received keyboard focus */
  var focusTree: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Unit]] = js.native
  /** Widget was (re-)initialized. */
  var init: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Unit]] = js.native
  /** `data.node` received key. `event.which` contains the key. Return `false` to prevent default processing, i.e. navigation. Call `data.result = "preventNav";` to prevent navigation but still allow default handling inside embedded input controls. */
  var keydown: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Boolean]] = js.native
  /** (currently unused) */
  var keypress: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Unit]] = js.native
  /** `data.node` is a lazy node that is expanded for the first time. The new child data must be returned in the `data.result` property (see `source` option for available formats). */
  var lazyLoad: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Unit]] = js.native
  /** Node data was loaded, i.e. `node.nodeLoadChildren()` finished */
  var loadChildren: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Unit]] = js.native
  /** A load error occured. Return `false` to prevent default processing. */
  var loadError: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Boolean]] = js.native
  /** Allows to modify the ajax response. */
  var postProcess: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Unit]] = js.native
  /** `data.node` was removed (NOTE: this event is only available as callback, but not for bind()) */
  var removeNode: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Unit]] = js.native
  /** (used by table extension) */
  var renderColumns: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Unit]] = js.native
  /** Allow tweaking after node state was rendered (NOTE: this event is only available as callback, but not for bind()) */
  var renderNode: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Unit]] = js.native
  /** Allow replacing the `<span class='fancytree-title'>` markup (NOTE: this event is only available as callback, but not for bind()) */
  var renderTitle: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Unit]] = js.native
  /** ext-persist has expanded, selected, and activated the previous state */
  var restore: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Unit]] = js.native
  /** Enable RTL version, default is false */
  var rtl: js.UndefOr[Boolean] = js.native
  /** `data.node` was selected */
  var select: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Unit]] = js.native
}

object FancytreeEvents {
  @scala.inline
  def apply(): FancytreeEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FancytreeEvents]
  }
  @scala.inline
  implicit class FancytreeEventsOps[Self <: FancytreeEvents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivate(value: (/* event */ JQueryEventObject, /* data */ EventData) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutActivate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activate")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeActivate(value: (/* event */ JQueryEventObject, /* data */ EventData) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeActivate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforeActivate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeActivate")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeExpand(value: (/* event */ JQueryEventObject, /* data */ EventData) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeExpand")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforeExpand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeExpand")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeSelect(value: (/* event */ JQueryEventObject, /* data */ EventData) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSelect")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforeSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withBlur(value: (/* event */ JQueryEventObject, /* data */ EventData) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blur")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blur")(js.undefined)
        ret
    }
    @scala.inline
    def withBlurTree(value: (/* event */ JQueryEventObject, /* data */ EventData) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blurTree")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBlurTree: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blurTree")(js.undefined)
        ret
    }
    @scala.inline
    def withClick(value: (/* event */ JQueryEventObject, /* data */ EventData) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapse(value: (/* event */ JQueryEventObject, /* data */ EventData) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapse")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCollapse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapse")(js.undefined)
        ret
    }
    @scala.inline
    def withCreate(value: (/* event */ JQueryEventObject, /* data */ EventData) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateNode(value: (/* event */ JQueryEventObject, /* data */ EventData) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createNode")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCreateNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createNode")(js.undefined)
        ret
    }
    @scala.inline
    def withDblclick(value: (/* event */ JQueryEventObject, /* data */ EventData) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dblclick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDblclick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dblclick")(js.undefined)
        ret
    }
    @scala.inline
    def withDeactivate(value: (/* event */ JQueryEventObject, /* data */ EventData) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deactivate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDeactivate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deactivate")(js.undefined)
        ret
    }
    @scala.inline
    def withExpand(value: (/* event */ JQueryEventObject, /* data */ EventData) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutExpand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(js.undefined)
        ret
    }
    @scala.inline
    def withFocus(value: (/* event */ JQueryEventObject, /* data */ EventData) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusTree(value: (/* event */ JQueryEventObject, /* data */ EventData) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusTree")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFocusTree: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusTree")(js.undefined)
        ret
    }
    @scala.inline
    def withInit(value: (/* event */ JQueryEventObject, /* data */ EventData) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.undefined)
        ret
    }
    @scala.inline
    def withKeydown(value: (/* event */ JQueryEventObject, /* data */ EventData) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keydown")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutKeydown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keydown")(js.undefined)
        ret
    }
    @scala.inline
    def withKeypress(value: (/* event */ JQueryEventObject, /* data */ EventData) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keypress")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutKeypress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keypress")(js.undefined)
        ret
    }
    @scala.inline
    def withLazyLoad(value: (/* event */ JQueryEventObject, /* data */ EventData) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazyLoad")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutLazyLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazyLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadChildren(value: (/* event */ JQueryEventObject, /* data */ EventData) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadChildren")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutLoadChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadChildren")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadError(value: (/* event */ JQueryEventObject, /* data */ EventData) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadError")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutLoadError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadError")(js.undefined)
        ret
    }
    @scala.inline
    def withPostProcess(value: (/* event */ JQueryEventObject, /* data */ EventData) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postProcess")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPostProcess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postProcess")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveNode(value: (/* event */ JQueryEventObject, /* data */ EventData) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeNode")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRemoveNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeNode")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderColumns(value: (/* event */ JQueryEventObject, /* data */ EventData) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderColumns")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRenderColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderNode(value: (/* event */ JQueryEventObject, /* data */ EventData) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderNode")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRenderNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderNode")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderTitle(value: (/* event */ JQueryEventObject, /* data */ EventData) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTitle")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRenderTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withRestore(value: (/* event */ JQueryEventObject, /* data */ EventData) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restore")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRestore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restore")(js.undefined)
        ret
    }
    @scala.inline
    def withRtl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRtl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtl")(js.undefined)
        ret
    }
    @scala.inline
    def withSelect(value: (/* event */ JQueryEventObject, /* data */ EventData) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.undefined)
        ret
    }
  }
  
}

