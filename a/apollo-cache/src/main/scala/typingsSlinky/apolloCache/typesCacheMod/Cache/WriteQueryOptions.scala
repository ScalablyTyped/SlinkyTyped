package typingsSlinky.apolloCache.typesCacheMod.Cache

import typingsSlinky.apolloCache.dataProxyMod.DataProxy.Query
import typingsSlinky.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WriteQueryOptions[TData, TVariables] extends Query[TVariables] {
  var data: TData = js.native
}

object WriteQueryOptions {
  @scala.inline
  def apply[TData, TVariables](data: TData, query: DocumentNode): WriteQueryOptions[TData, TVariables] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteQueryOptions[TData, TVariables]]
  }
  @scala.inline
  implicit class WriteQueryOptionsOps[Self[tdata, tvariables] <: WriteQueryOptions[tdata, tvariables], TData, TVariables] (val x: Self[TData, TVariables]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TData, TVariables] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TData, TVariables]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TData, TVariables]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TData, TVariables]) with Other]
    @scala.inline
    def withData(value: TData): Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

