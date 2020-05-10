package typingsSlinky.dojo.dojox.dtl.tag

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dtl/tag/loop.html
  *
  *
  */
@js.native
trait loop extends js.Object {
  /**
    *
    * @param cyclevars
    * @param name
    * @param text
    * @param shared
    */
  def CycleNode(cyclevars: js.Any, name: js.Any, text: js.Any, shared: js.Any): Unit = js.native
  /**
    *
    * @param nodes
    * @param vars
    * @param shared
    */
  def IfChangedNode(nodes: js.Any, vars: js.Any, shared: js.Any): Unit = js.native
  /**
    *
    * @param expression
    * @param key
    * @param alias
    */
  def RegroupNode(expression: js.Any, key: js.Any, alias: js.Any): Unit = js.native
  /**
    * Cycle among the given strings each time this tag is encountered
    *
    * @param parser
    * @param token
    */
  def cycle(parser: js.Any, token: js.Any): js.Any = js.native
  /**
    *
    * @param parser
    * @param token
    */
  def ifchanged(parser: js.Any, token: js.Any): js.Any = js.native
  /**
    *
    * @param parser
    * @param token
    */
  def regroup(parser: js.Any, token: js.Any): js.Any = js.native
}

object loop {
  @scala.inline
  def apply(
    CycleNode: (js.Any, js.Any, js.Any, js.Any) => Unit,
    IfChangedNode: (js.Any, js.Any, js.Any) => Unit,
    RegroupNode: (js.Any, js.Any, js.Any) => Unit,
    cycle: (js.Any, js.Any) => js.Any,
    ifchanged: (js.Any, js.Any) => js.Any,
    regroup: (js.Any, js.Any) => js.Any
  ): loop = {
    val __obj = js.Dynamic.literal(CycleNode = js.Any.fromFunction4(CycleNode), IfChangedNode = js.Any.fromFunction3(IfChangedNode), RegroupNode = js.Any.fromFunction3(RegroupNode), cycle = js.Any.fromFunction2(cycle), ifchanged = js.Any.fromFunction2(ifchanged), regroup = js.Any.fromFunction2(regroup))
    __obj.asInstanceOf[loop]
  }
  @scala.inline
  implicit class loopOps[Self <: loop] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCycleNode(value: (js.Any, js.Any, js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CycleNode")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withIfChangedNode(value: (js.Any, js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IfChangedNode")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withRegroupNode(value: (js.Any, js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegroupNode")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withCycle(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cycle")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIfchanged(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifchanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRegroup(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regroup")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

