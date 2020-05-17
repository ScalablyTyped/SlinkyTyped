package typingsSlinky.graphqlReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Variables[V] extends js.Object {
  var variables: V = js.native
}

object Variables {
  @scala.inline
  def apply[V](variables: V): Variables[V] = {
    val __obj = js.Dynamic.literal(variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Variables[V]]
  }
  @scala.inline
  implicit class VariablesOps[Self[v] <: Variables[v], V] (val x: Self[V]) extends AnyVal {
    @scala.inline
    def duplicate: Self[V] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[V]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[V] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[V] with Other]
    @scala.inline
    def withVariables(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

