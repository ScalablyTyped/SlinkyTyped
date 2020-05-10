package typingsSlinky.jstree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSTreeStaticDefaults extends js.Object {
  /**
    * stores all defaults for the checkbox plugin
    */
  var checkbox: js.UndefOr[JSTreeStaticDefaultsCheckbox] = js.native
  /**
    * a callback (function) which is invoked in the instance's scope and receives two arguments
    * - the node and the event that triggered the `close_node` call.
    * Returning false prevents working with the node, returning true allows invoking close_node.
    * Defaults to returning `true`.
    * @name $.jstree.defaults.conditionalclose
    * @plugin conditionalclose
    */
  var conditionalclose: js.UndefOr[js.Function0[Boolean]] = js.native
  /**
    * a callback (function) which is invoked in the instance's scope and receives two arguments
    * - the node and the event that triggered the `activate_node` call.
    * Returning false prevents working with the node, returning true allows invoking activate_node.
    * Defaults to returning `true`.
    * @name $.jstree.defaults.conditionalselect
    * @plugin conditionalselect
    */
  var conditionalselect: js.UndefOr[js.Function0[Boolean]] = js.native
  /**
    * stores all defaults for the contextmenu plugin
    */
  var contextmenu: js.UndefOr[JSTreeStaticDefaultsContextMenu] = js.native
  /**
    * stores all defaults for the core
    * @name $.jstree.defaults.core
    */
  var core: JSTreeStaticDefaultsCore = js.native
  /**
    * stores all defaults for the drag'n'drop plugin
    */
  var dnd: js.UndefOr[JSTreeStaticDefaultsDragNDrop] = js.native
  /**
    * Adds massload functionality to jsTree, so that multiple nodes can be loaded in a single request (only useful with lazy loading).
    */
  var massload: js.UndefOr[JSTreeStaticDefaultsMassload] = js.native
  /**
    * configure which plugins will be active on an instance.
    * Should be an array of strings, where each element is a plugin name.
    * The default is `[]`
    * @name $.jstree.defaults.plugins
    */
  var plugins: js.Array[String] = js.native
  /**
    * stores all defaults for the search plugin
    */
  var search: js.UndefOr[JSTreeStaticDefaultsSearch] = js.native
  /**
    * the settings function used to sort the nodes.
    * It is executed in the tree's context, accepts two nodes as arguments and should return `1` or `-1`.
    * @name $.jstree.defaults.sort
    * @plugin sort
    */
  var sort: js.UndefOr[js.Function2[/* x */ js.Any, /* y */ js.Any, Double]] = js.native
  /**
    * stores all defaults for the state plugin
    */
  var state: js.UndefOr[JSTreeStaticDefaultsState] = js.native
  /**
    * An object storing all types as key value pairs,
    * where the key is the type name and the value is an object
    * that could contain following keys (all optional).
    * max_children the maximum number of immediate children this node type can have.
    * Do not specify or set to -1 for unlimited.
    * max_depth the maximum number of nesting this node type can have.
    * A value of 1 would mean that the node can have children, but no grandchildren.
    * Do not specify or set to -1 for unlimited.
    * valid_children an array of node type strings, that nodes of this type can have as children.
    * Do not specify or set to -1 for no limits.
    * icon a string - can be a path to an icon or a className, if using an image
    * that is in the current directory use a ./ prefix, otherwise it will be detected as a class.
    * Omit to use the default icon from your theme.
    * There are two predefined types:
    * # represents the root of the tree, for example max_children would control the maximum number of root nodes.
    * default represents the default node - any settings here will be applied to all nodes that do not have a type specified.
    */
  var types: js.UndefOr[js.Any] = js.native
  /**
    * stores all defaults for the unique plugin
    * @name $.jstree.defaults.unique
    * @plugin unique
    */
  var unique: js.UndefOr[JSTreeStaticDefaultsUnique] = js.native
}

object JSTreeStaticDefaults {
  @scala.inline
  def apply(core: JSTreeStaticDefaultsCore, plugins: js.Array[String]): JSTreeStaticDefaults = {
    val __obj = js.Dynamic.literal(core = core.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSTreeStaticDefaults]
  }
  @scala.inline
  implicit class JSTreeStaticDefaultsOps[Self <: JSTreeStaticDefaults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCore(value: JSTreeStaticDefaultsCore): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("core")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlugins(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckbox(value: JSTreeStaticDefaultsCheckbox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckbox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkbox")(js.undefined)
        ret
    }
    @scala.inline
    def withConditionalclose(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditionalclose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutConditionalclose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditionalclose")(js.undefined)
        ret
    }
    @scala.inline
    def withConditionalselect(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditionalselect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutConditionalselect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditionalselect")(js.undefined)
        ret
    }
    @scala.inline
    def withContextmenu(value: JSTreeStaticDefaultsContextMenu): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextmenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextmenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextmenu")(js.undefined)
        ret
    }
    @scala.inline
    def withDnd(value: JSTreeStaticDefaultsDragNDrop): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnd")(js.undefined)
        ret
    }
    @scala.inline
    def withMassload(value: JSTreeStaticDefaultsMassload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("massload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMassload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("massload")(js.undefined)
        ret
    }
    @scala.inline
    def withSearch(value: JSTreeStaticDefaultsSearch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(js.undefined)
        ret
    }
    @scala.inline
    def withSort(value: (/* x */ js.Any, /* y */ js.Any) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: JSTreeStaticDefaultsState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withTypes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(js.undefined)
        ret
    }
    @scala.inline
    def withUnique(value: JSTreeStaticDefaultsUnique): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unique")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnique: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unique")(js.undefined)
        ret
    }
  }
  
}

