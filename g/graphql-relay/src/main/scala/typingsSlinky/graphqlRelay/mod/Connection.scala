package typingsSlinky.graphqlRelay.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connection[T] extends js.Object {
  var edges: js.Array[Edge[T]] = js.native
  var pageInfo: PageInfo = js.native
}

object Connection {
  @scala.inline
  def apply[T](edges: js.Array[Edge[T]], pageInfo: PageInfo): Connection[T] = {
    val __obj = js.Dynamic.literal(edges = edges.asInstanceOf[js.Any], pageInfo = pageInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Connection[T]]
  }
  @scala.inline
  implicit class ConnectionOps[Self[t] <: Connection[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withEdges(value: js.Array[Edge[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageInfo(value: PageInfo): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageInfo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

