package typingsSlinky.jstree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSTreeStaticDefaultsState extends js.Object {
  /**
    * A space separated list of events that trigger a state save. Defaults to `changed.jstree open_node.jstree close_node.jstree`.
    * @name $.jstree.defaults.state.events
    * @plugin state
    */
  var events: String = js.native
  /**
    * A function that will be executed prior to restoring state with one argument - the state object. Can be used to clear unwanted parts of the state.
    * @name $.jstree.defaults.state.filter
    * @plugin state
    */
  var filter: js.Any = js.native
  /**
    * A string for the key to use when saving the current tree (change if using multiple trees in your project). Defaults to `jstree`.
    * @name $.jstree.defaults.state.key
    * @plugin state
    */
  var key: String = js.native
  /**
    * Should loaded nodes be restored (setting this to true means that it is possible that the whole tree will be loaded for some users - use with caution). Defaults to `false`
    * @name $.jstree.defaults.state.preserve_loaded
    * @plugin state
    */
  var preserve_loaded: Boolean = js.native
  /**
    * Time in milliseconds after which the state will expire. Defaults to 'false' meaning - no expire.
    * @name $.jstree.defaults.state.ttl
    * @plugin state
    */
  var ttl: js.Any = js.native
}

object JSTreeStaticDefaultsState {
  @scala.inline
  def apply(events: String, filter: js.Any, key: String, preserve_loaded: Boolean, ttl: js.Any): JSTreeStaticDefaultsState = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], preserve_loaded = preserve_loaded.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSTreeStaticDefaultsState]
  }
  @scala.inline
  implicit class JSTreeStaticDefaultsStateOps[Self <: JSTreeStaticDefaultsState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvents(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilter(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreserve_loaded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserve_loaded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTtl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ttl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

