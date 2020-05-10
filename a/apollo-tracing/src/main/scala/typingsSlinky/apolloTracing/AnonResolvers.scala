package typingsSlinky.apolloTracing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonResolvers extends js.Object {
  var resolvers: js.Array[AnonDuration] = js.native
}

object AnonResolvers {
  @scala.inline
  def apply(resolvers: js.Array[AnonDuration]): AnonResolvers = {
    val __obj = js.Dynamic.literal(resolvers = resolvers.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonResolvers]
  }
  @scala.inline
  implicit class AnonResolversOps[Self <: AnonResolvers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResolvers(value: js.Array[AnonDuration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvers")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

