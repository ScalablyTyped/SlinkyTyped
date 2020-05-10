package typingsSlinky.dojo.dojox.dtl.contrib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dtl/contrib/data.html
  *
  *
  */
@js.native
trait data extends js.Object {
  /**
    *
    * @param items
    * @param query
    * @param store
    * @param alias
    */
  def BindDataNode(items: js.Any, query: js.Any, store: js.Any, alias: js.Any): Unit = js.native
  /**
    * Turns a list of data store items into DTL compatible items
    *
    * @param parser
    * @param token
    */
  def bind_data(parser: js.Any, token: js.Any): js.Any = js.native
  /**
    * Queries a data store and makes the returned items DTL compatible
    *
    * @param parser
    * @param token
    */
  def bind_query(parser: js.Any, token: js.Any): js.Any = js.native
}

object data {
  @scala.inline
  def apply(
    BindDataNode: (js.Any, js.Any, js.Any, js.Any) => Unit,
    bind_data: (js.Any, js.Any) => js.Any,
    bind_query: (js.Any, js.Any) => js.Any
  ): data = {
    val __obj = js.Dynamic.literal(BindDataNode = js.Any.fromFunction4(BindDataNode), bind_data = js.Any.fromFunction2(bind_data), bind_query = js.Any.fromFunction2(bind_query))
    __obj.asInstanceOf[data]
  }
  @scala.inline
  implicit class dataOps[Self <: data] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBindDataNode(value: (js.Any, js.Any, js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BindDataNode")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withBind_data(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bind_data")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withBind_query(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bind_query")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

