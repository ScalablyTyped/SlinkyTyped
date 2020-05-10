package typingsSlinky.dojo.dijit.base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/_base/manager.html
  *
  * Deprecated.  Shim to methods on registry, plus a few other declarations.
  * New code should access dijit/registry directly when possible.
  * 
  */
@js.native
trait manager extends js.Object {
  /**
    * The default fx.animation speed (in ms) to use for all Dijit
    * transitional fx.animations, unless otherwise specified
    * on a per-instance basis. Defaults to 200, overrided by
    * djConfig.defaultDuration
    * 
    */
  var defaultDuration: Double = js.native
}

object manager {
  @scala.inline
  def apply(defaultDuration: Double): manager = {
    val __obj = js.Dynamic.literal(defaultDuration = defaultDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[manager]
  }
  @scala.inline
  implicit class managerOps[Self <: manager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultDuration")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

