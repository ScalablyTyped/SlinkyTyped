package typingsSlinky.graphqlReact

import typingsSlinky.graphqlReact.mod.GraphQLCacheKey
import typingsSlinky.graphqlReact.mod.GraphQLCacheValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCacheKey extends js.Object {
  var cacheKey: GraphQLCacheKey = js.native
  var cacheValue: GraphQLCacheValue[_] = js.native
}

object AnonCacheKey {
  @scala.inline
  def apply(cacheKey: GraphQLCacheKey, cacheValue: GraphQLCacheValue[_]): AnonCacheKey = {
    val __obj = js.Dynamic.literal(cacheKey = cacheKey.asInstanceOf[js.Any], cacheValue = cacheValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCacheKey]
  }
  @scala.inline
  implicit class AnonCacheKeyOps[Self <: AnonCacheKey] (val x: Self) extends AnyVal {
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
    def withCacheValue(value: GraphQLCacheValue[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheValue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

