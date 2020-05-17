package typingsSlinky.apolloCacheControl.mod.graphqlTypeDefinitionAugmentingMod

import typingsSlinky.apolloCacheControl.anon.CacheHint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLResolveInfo extends js.Object {
  var cacheControl: CacheHint = js.native
}

object GraphQLResolveInfo {
  @scala.inline
  def apply(cacheControl: CacheHint): GraphQLResolveInfo = {
    val __obj = js.Dynamic.literal(cacheControl = cacheControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLResolveInfo]
  }
  @scala.inline
  implicit class GraphQLResolveInfoOps[Self <: GraphQLResolveInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheControl(value: CacheHint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheControl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

