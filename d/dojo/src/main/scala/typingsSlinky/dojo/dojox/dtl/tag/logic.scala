package typingsSlinky.dojo.dojox.dtl.tag

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dtl/tag/logic.html
  *
  *
  */
@js.native
trait logic extends js.Object {
  /**
    *
    * @param assign
    * @param loop
    * @param reversed
    * @param nodelist
    */
  def ForNode(assign: js.Any, loop: js.Any, reversed: js.Any, nodelist: js.Any): Unit = js.native
  /**
    *
    * @param var1
    * @param var2
    * @param trues
    * @param falses
    * @param negate
    */
  def IfEqualNode(var1: js.Any, var2: js.Any, trues: js.Any, falses: js.Any, negate: js.Any): Unit = js.native
  /**
    *
    * @param bools
    * @param trues
    * @param falses
    * @param type
    */
  def IfNode(bools: js.Any, trues: js.Any, falses: js.Any, `type`: js.Any): Unit = js.native
  /**
    *
    * @param parser
    * @param token
    */
  def for_(parser: js.Any, token: js.Any): js.Any = js.native
  /**
    *
    * @param parser
    * @param token
    */
  def if_(parser: js.Any, token: js.Any): js.Any = js.native
  /**
    *
    * @param parser
    * @param token
    */
  def ifequal(parser: js.Any, token: js.Any): js.Any = js.native
  /**
    *
    * @param parser
    * @param token
    */
  def ifnotequal(parser: js.Any, token: js.Any): js.Any = js.native
}

object logic {
  @scala.inline
  def apply(
    ForNode: (js.Any, js.Any, js.Any, js.Any) => Unit,
    IfEqualNode: (js.Any, js.Any, js.Any, js.Any, js.Any) => Unit,
    IfNode: (js.Any, js.Any, js.Any, js.Any) => Unit,
    for_ : (js.Any, js.Any) => js.Any,
    if_ : (js.Any, js.Any) => js.Any,
    ifequal: (js.Any, js.Any) => js.Any,
    ifnotequal: (js.Any, js.Any) => js.Any
  ): logic = {
    val __obj = js.Dynamic.literal(ForNode = js.Any.fromFunction4(ForNode), IfEqualNode = js.Any.fromFunction5(IfEqualNode), IfNode = js.Any.fromFunction4(IfNode), for_ = js.Any.fromFunction2(for_), if_ = js.Any.fromFunction2(if_), ifequal = js.Any.fromFunction2(ifequal), ifnotequal = js.Any.fromFunction2(ifnotequal))
    __obj.asInstanceOf[logic]
  }
  @scala.inline
  implicit class logicOps[Self <: logic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForNode(value: (js.Any, js.Any, js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForNode")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withIfEqualNode(value: (js.Any, js.Any, js.Any, js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IfEqualNode")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withIfNode(value: (js.Any, js.Any, js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IfNode")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withFor_(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("for_")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIf_(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("if_")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIfequal(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifequal")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIfnotequal(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifnotequal")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

