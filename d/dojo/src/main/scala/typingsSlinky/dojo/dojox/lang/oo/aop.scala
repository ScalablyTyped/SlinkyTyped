package typingsSlinky.dojo.dojox.lang.oo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/lang/oo/aop.html
  *
  *
  */
@js.native
trait aop extends js.Object {
  /**
    *
    */
  var after: js.Object = js.native
  /**
    *
    */
  var afterReturning: js.Object = js.native
  /**
    *
    */
  var afterThrowing: js.Object = js.native
  /**
    *
    */
  var around: js.Object = js.native
  /**
    *
    */
  var before: js.Object = js.native
}

object aop {
  @scala.inline
  def apply(
    after: js.Object,
    afterReturning: js.Object,
    afterThrowing: js.Object,
    around: js.Object,
    before: js.Object
  ): aop = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], afterReturning = afterReturning.asInstanceOf[js.Any], afterThrowing = afterThrowing.asInstanceOf[js.Any], around = around.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any])
    __obj.asInstanceOf[aop]
  }
  @scala.inline
  implicit class aopOps[Self <: aop] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfter(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterReturning(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterReturning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterThrowing(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterThrowing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAround(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("around")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBefore(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

