package typingsSlinky.dojo.doh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/doh/_parseURLargs.html
  *
  *
  */
@js.native
trait parseURLargs extends js.Object {
  /**
    *
    */
  var isDebug: Boolean = js.native
  /**
    *
    */
  var noGlobals: Boolean = js.native
  /**
    *
    */
  var scopeMap: js.Array[_] = js.native
}

object parseURLargs {
  @scala.inline
  def apply(isDebug: Boolean, noGlobals: Boolean, scopeMap: js.Array[_]): parseURLargs = {
    val __obj = js.Dynamic.literal(isDebug = isDebug.asInstanceOf[js.Any], noGlobals = noGlobals.asInstanceOf[js.Any], scopeMap = scopeMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[parseURLargs]
  }
  @scala.inline
  implicit class parseURLargsOps[Self <: parseURLargs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDebug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoGlobals(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noGlobals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScopeMap(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopeMap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

