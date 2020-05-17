package typingsSlinky.apolloTracing.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Resolvers extends js.Object {
  var resolvers: js.Array[Duration] = js.native
}

object Resolvers {
  @scala.inline
  def apply(resolvers: js.Array[Duration]): Resolvers = {
    val __obj = js.Dynamic.literal(resolvers = resolvers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resolvers]
  }
  @scala.inline
  implicit class ResolversOps[Self <: Resolvers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResolvers(value: js.Array[Duration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvers")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

