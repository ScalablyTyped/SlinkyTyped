package typingsSlinky.graphqlReact

import typingsSlinky.graphqlReact.mod.GraphQLCacheKey
import typingsSlinky.graphqlReact.mod.GraphQLCacheValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCacheValuePromise extends js.Object {
  var cacheKey: GraphQLCacheKey = js.native
  var cacheValuePromise: js.Promise[GraphQLCacheValue[_]] = js.native
}

object AnonCacheValuePromise {
  @scala.inline
  def apply(cacheKey: GraphQLCacheKey, cacheValuePromise: js.Promise[GraphQLCacheValue[_]]): AnonCacheValuePromise = {
    val __obj = js.Dynamic.literal(cacheKey = cacheKey.asInstanceOf[js.Any], cacheValuePromise = cacheValuePromise.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCacheValuePromise]
  }
  @scala.inline
  implicit class AnonCacheValuePromiseOps[Self <: AnonCacheValuePromise] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheKey(value: GraphQLCacheKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCacheValuePromise(value: js.Promise[GraphQLCacheValue[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheValuePromise")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

