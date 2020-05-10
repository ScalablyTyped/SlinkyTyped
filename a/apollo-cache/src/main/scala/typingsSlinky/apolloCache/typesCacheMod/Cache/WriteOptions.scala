package typingsSlinky.apolloCache.typesCacheMod.Cache

import typingsSlinky.apolloCache.dataProxyMod.DataProxy.Query
import typingsSlinky.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WriteOptions[TResult, TVariables] extends Query[TVariables] {
  var dataId: String = js.native
  var result: TResult = js.native
}

object WriteOptions {
  @scala.inline
  def apply[TResult, TVariables](dataId: String, query: DocumentNode, result: TResult): WriteOptions[TResult, TVariables] = {
    val __obj = js.Dynamic.literal(dataId = dataId.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteOptions[TResult, TVariables]]
  }
  @scala.inline
  implicit class WriteOptionsOps[Self[tresult, tvariables] <: WriteOptions[tresult, tvariables], TResult, TVariables] (val x: Self[TResult, TVariables]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TResult, TVariables] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TResult, TVariables]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TResult, TVariables]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TResult, TVariables]) with Other]
    @scala.inline
    def withDataId(value: String): Self[TResult, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResult(value: TResult): Self[TResult, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

