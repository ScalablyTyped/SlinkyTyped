package typingsSlinky.dojo.dojox.validate.regexp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/validate/regexp.us.html
  *
  *
  */
@js.native
trait us extends js.Object {
  /**
    * A regular expression to match US state and territory abbreviations
    *
    * @param flags               Optionalflags.allowTerritories  Allow Guam, Puerto Rico, etc.  Default is true.flags.allowMilitary  Allow military 'states', e.g. Armed Forces Europe (AE).  Default is true.
    */
  def state(flags: js.Object): String = js.native
}

object us {
  @scala.inline
  def apply(state: js.Object => String): us = {
    val __obj = js.Dynamic.literal(state = js.Any.fromFunction1(state))
    __obj.asInstanceOf[us]
  }
  @scala.inline
  implicit class usOps[Self <: us] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withState(value: js.Object => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

