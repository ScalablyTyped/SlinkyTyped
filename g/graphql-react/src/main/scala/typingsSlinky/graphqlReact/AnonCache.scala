package typingsSlinky.graphqlReact

import typingsSlinky.graphqlReact.mod.GraphQLCache
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCache extends js.Object {
  var cache: js.UndefOr[GraphQLCache] = js.native
}

object AnonCache {
  @scala.inline
  def apply(): AnonCache = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCache]
  }
  @scala.inline
  implicit class AnonCacheOps[Self <: AnonCache] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCache(value: GraphQLCache): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(js.undefined)
        ret
    }
  }
  
}

