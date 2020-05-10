package typingsSlinky.graphqlReact

import typingsSlinky.graphqlReact.mod.GraphQLCacheKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonExceptCacheKey extends js.Object {
  var exceptCacheKey: GraphQLCacheKey = js.native
}

object AnonExceptCacheKey {
  @scala.inline
  def apply(exceptCacheKey: GraphQLCacheKey): AnonExceptCacheKey = {
    val __obj = js.Dynamic.literal(exceptCacheKey = exceptCacheKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExceptCacheKey]
  }
  @scala.inline
  implicit class AnonExceptCacheKeyOps[Self <: AnonExceptCacheKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExceptCacheKey(value: GraphQLCacheKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exceptCacheKey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

