package typingsSlinky.jqueryFancytree.Fancytree

import typingsSlinky.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Context object passed to events and hook functions. */
@js.native
trait EventData extends js.Object {
  /** The node that this call applies to (`null` for tree events) */
  var node: FancytreeNode = js.native
      // JQueryUI.Widget;
  /** Shortcut to tree.options */
  var options: FancytreeOptions = js.native
  /** The jQuery Event that initially triggered this call */
  var originalEvent: JQueryEventObject = js.native
  /** (only for postProcess event) Original ajax response */
  var response: js.Any = js.native
  /** (output parameter) Event handlers can return values back to the
    * caller. Used by `lazyLoad`, `postProcess`, ... */
  var result: js.Any = js.native
  /** (only for click and dblclick events) 'title' | 'prefix' | 'expander' | 'checkbox' | 'icon' */
  var targetType: String = js.native
  /** The tree instance */
  var tree: typingsSlinky.jqueryFancytree.Fancytree.Fancytree = js.native
  /** The jQuery UI tree widget */
  var widget: js.Any = js.native
}

object EventData {
  @scala.inline
  def apply(
    node: FancytreeNode,
    options: FancytreeOptions,
    originalEvent: JQueryEventObject,
    response: js.Any,
    result: js.Any,
    targetType: String,
    tree: typingsSlinky.jqueryFancytree.Fancytree.Fancytree,
    widget: js.Any
  ): EventData = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], targetType = targetType.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], widget = widget.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventData]
  }
  @scala.inline
  implicit class EventDataOps[Self <: EventData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNode(value: FancytreeNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: FancytreeOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginalEvent(value: JQueryEventObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponse(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResult(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTree(value: typingsSlinky.jqueryFancytree.Fancytree.Fancytree): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tree")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidget(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widget")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

