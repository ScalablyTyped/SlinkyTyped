package typingsSlinky.jstree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSTreeStaticDefaultsCore extends js.Object {
  /**
    * the open / close animation duration in milliseconds - set this to `false` to disable the animation (default is `200`)
    * @name $.jstree.defaults.core.animation
    */
  var animation: js.UndefOr[js.Any] = js.native
  /**
    * determines what happens when a user tries to modify the structure of the tree
    * If left as `false` all operations like create, rename, delete, move or copy are prevented.
    * You can set this to `true` to allow all interactions or use a function to have better control.
    *
    * __Examples__
    *
    *  $('#tree').jstree({
    *      'core' : {
    *          'check_callback' : function (operation, node, node_parent, node_position, more) {
    *              // operation can be 'create_node', 'rename_node', 'delete_node', 'move_node', 'copy_node' or 'edit'
    *              // in case of 'rename_node' node_position is filled with the new node name
    *              return operation === 'rename_node' ? true : false;
    *          }
    *      }
    *  });
    *
    * @name $.jstree.defaults.core.check_callback
    */
  var check_callback: js.UndefOr[js.Any] = js.native
  /**
    * data configuration
    *
    * If left as `false` the HTML inside the jstree container element is used to populate the tree
    * (that should be an unordered list with list items).
    *
    * You can also pass in a HTML string or a JSON array here.
    *
    * It is possible to pass in a standard jQuery-like AJAX config and jstree will automatically determine
    * if the response is JSON or HTML and use that to populate the tree.
    * In addition to the standard jQuery ajax options here you can suppy functions for `data` and `url`,
    * the functions will be run in the current instance's scope and a param will be passed indicating which node is being loaded,
    * the return value of those functions will be used.
    *
    * The last option is to specify a function, that function will receive the node being loaded as argument
    * and a second param which is a function which should be called with the result.
    *
    * __Examples__
    *
    *  // AJAX
    *  $('#tree').jstree({
    *      'core' : {
    *          'data' : {
    *              'url' : '/get/children/',
    *              'data' : function (node) {
    *                  return { 'id' : node.id };
    *              }
    *          }
    *      });
    *
    *  // direct data
    *  $('#tree').jstree({
    *      'core' : {
    *          'data' : [
    *              'Simple root node',
    *              {
    *                  'id' : 'node_2',
    *                  'text' : 'Root node with options',
    *                  'state' : { 'opened' : true, 'selected' : true },
    *                  'children' : [ { 'text' : 'Child 1' }, 'Child 2']
    *              }
    *          ]
    *      });
    *
    *  // function
    *  $('#tree').jstree({
    *      'core' : {
    *          'data' : function (obj, callback) {
    *              callback.call(this, ['Root 1', 'Root 2']);
    *          }
    *      });
    *
    * @name $.jstree.defaults.core.data
    */
  var data: js.UndefOr[js.Any] = js.native
  /**
    * Should the node be toggled if the text is double clicked. Defaults to `true`
    * @name $.jstree.defaults.core.dblclick_toggle
    */
  var dblclick_toggle: js.UndefOr[Boolean] = js.native
  /**
    * if left as `true` all parents of all selected nodes will be opened once the tree loads
    * (so that all selected nodes are visible to the user)
    * @name $.jstree.defaults.core.expand_selected_onload
    */
  var expand_selected_onload: js.UndefOr[Boolean] = js.native
  /**
    * Force node text to plain text (and escape HTML). Defaults to `false`
    * @name $.jstree.defaults.core.force_text
    */
  var force_text: js.UndefOr[Boolean] = js.native
  /**
    * Default keyboard shortcuts (an object where each key is the button name or combo - like 'enter', 'ctrl-space', 'p', etc
    * and the value is the function to execute in the instance's scope)
    * @name $.jstree.defaults.core.keyboard
    */
  var keyboard: js.UndefOr[JSTreeStaticDefaultsCoreKeyboard] = js.native
  /**
    * Should the loaded nodes be part of the state. Defaults to `false`
    * @name $.jstree.defaults.core.dblclick_toggle
    */
  var loaded_state: js.UndefOr[Boolean] = js.native
  /**
    * a boolean indicating if multiple nodes can be selected
    * @name $.jstree.defaults.core.multiple
    */
  var multiple: js.UndefOr[Boolean] = js.native
  /**
    * Should the last active node be focused when the tree container is blurred and the focused again.
    * This helps working with screen readers. Defaults to `true`
    * @name $.jstree.defaults.core.restore_focus
    */
  var restore_focus: js.UndefOr[Boolean] = js.native
  /**
    * configure the various strings used throughout the tree
    *
    * You can use an object where the key is the string you need to replace and the value is your replacement.
    * Another option is to specify a function which will be called with an argument of the needed string and should return the replacement.
    * If left as `false` no replacement is made.
    *
    * __Examples__
    *
    *  $('#tree').jstree({
    *      'core' : {
    *          'strings' : {
    *              'Loading ...' : 'Please wait ...'
    *          }
    *      }
    *  });
    *
    * @name $.jstree.defaults.core.strings
    */
  var strings: js.UndefOr[js.Any] = js.native
  /**
    * theme configuration object
    * @name $.jstree.defaults.core.themes
    */
  var themes: js.UndefOr[JSTreeStaticDefaultsCoreThemes] = js.native
  /**
    * if left as `true` web workers will be used to parse incoming JSON data where possible,
    * so that the UI will not be blocked by large requests.
    * Workers are however about 30% slower. Defaults to `true`
    * @name $.jstree.defaults.core.worker
    */
  var worker: js.UndefOr[Boolean] = js.native
  /**
    * a callback called with a single object parameter in the instance's scope when something goes wrong
    * (operation prevented, ajax failed, etc)
    * @name $.jstree.defaults.core.error
    */
  def error(): js.Any = js.native
}

object JSTreeStaticDefaultsCore {
  @scala.inline
  def apply(error: () => js.Any): JSTreeStaticDefaultsCore = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction0(error))
    __obj.asInstanceOf[JSTreeStaticDefaultsCore]
  }
  @scala.inline
  implicit class JSTreeStaticDefaultsCoreOps[Self <: JSTreeStaticDefaultsCore] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAnimation(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(js.undefined)
        ret
    }
    @scala.inline
    def withCheck_callback(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("check_callback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheck_callback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("check_callback")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDblclick_toggle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dblclick_toggle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDblclick_toggle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dblclick_toggle")(js.undefined)
        ret
    }
    @scala.inline
    def withExpand_selected_onload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand_selected_onload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpand_selected_onload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand_selected_onload")(js.undefined)
        ret
    }
    @scala.inline
    def withForce_text(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force_text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForce_text: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force_text")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboard(value: JSTreeStaticDefaultsCoreKeyboard): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboard")(js.undefined)
        ret
    }
    @scala.inline
    def withLoaded_state(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loaded_state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoaded_state: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loaded_state")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiple(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple")(js.undefined)
        ret
    }
    @scala.inline
    def withRestore_focus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restore_focus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestore_focus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restore_focus")(js.undefined)
        ret
    }
    @scala.inline
    def withStrings(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strings")(js.undefined)
        ret
    }
    @scala.inline
    def withThemes(value: JSTreeStaticDefaultsCoreThemes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("themes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThemes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("themes")(js.undefined)
        ret
    }
    @scala.inline
    def withWorker(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worker")(js.undefined)
        ret
    }
  }
  
}

