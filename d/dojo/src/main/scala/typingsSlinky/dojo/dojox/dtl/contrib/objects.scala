package typingsSlinky.dojo.dojox.dtl.contrib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dtl/contrib/objects.html
  *
  *
  */
@js.native
trait objects extends js.Object {
  /**
    *
    * @param value
    * @param arg
    */
  def key(value: js.Any, arg: js.Any): js.Any = js.native
}

object objects {
  @scala.inline
  def apply(key: (js.Any, js.Any) => js.Any): objects = {
    val __obj = js.Dynamic.literal(key = js.Any.fromFunction2(key))
    __obj.asInstanceOf[objects]
  }
  @scala.inline
  implicit class objectsOps[Self <: objects] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

