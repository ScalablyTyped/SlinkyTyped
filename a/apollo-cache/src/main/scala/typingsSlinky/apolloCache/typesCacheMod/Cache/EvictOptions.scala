package typingsSlinky.apolloCache.typesCacheMod.Cache

import typingsSlinky.apolloCache.dataProxyMod.DataProxy.Query
import typingsSlinky.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EvictOptions[TVariables] extends Query[TVariables] {
  var rootId: js.UndefOr[String] = js.native
}

object EvictOptions {
  @scala.inline
  def apply[TVariables](query: DocumentNode): EvictOptions[TVariables] = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvictOptions[TVariables]]
  }
  @scala.inline
  implicit class EvictOptionsOps[Self[tvariables] <: EvictOptions[tvariables], TVariables] (val x: Self[TVariables]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TVariables] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TVariables]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TVariables] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TVariables] with Other]
    @scala.inline
    def withRootId(value: String): Self[TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootId: Self[TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootId")(js.undefined)
        ret
    }
  }
  
}

