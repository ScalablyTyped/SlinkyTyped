package typingsSlinky.nodeRed.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Red extends js.Object {
  var auth: js.Any = js.native
  var comms: js.Any = js.native
  var events: js.Any = js.native
  var httpAdmin: js.Any = js.native
  var httpNode: js.Any = js.native
  var library: js.Any = js.native
  var log: js.Any = js.native
  /** Node lifecycle management api. Used by all nodes. */
  var nodes: Nodes = js.native
  var server: js.Any = js.native
  var settings: js.Any = js.native
  var util: js.Any = js.native
  /** Returns the version of the running Node-RED environment. */
  def version(): String = js.native
}

object Red {
  @scala.inline
  def apply(
    auth: js.Any,
    comms: js.Any,
    events: js.Any,
    httpAdmin: js.Any,
    httpNode: js.Any,
    library: js.Any,
    log: js.Any,
    nodes: Nodes,
    server: js.Any,
    settings: js.Any,
    util: js.Any,
    version: () => String
  ): Red = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], comms = comms.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], httpAdmin = httpAdmin.asInstanceOf[js.Any], httpNode = httpNode.asInstanceOf[js.Any], library = library.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], util = util.asInstanceOf[js.Any], version = js.Any.fromFunction0(version))
    __obj.asInstanceOf[Red]
  }
  @scala.inline
  implicit class RedOps[Self <: Red] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuth(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComms(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvents(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHttpAdmin(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpAdmin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHttpNode(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLibrary(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("library")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLog(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodes(value: Nodes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServer(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSettings(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUtil(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("util")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

