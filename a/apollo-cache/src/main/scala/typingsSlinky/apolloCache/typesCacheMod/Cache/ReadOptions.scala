package typingsSlinky.apolloCache.typesCacheMod.Cache

import typingsSlinky.apolloCache.dataProxyMod.DataProxy.Query
import typingsSlinky.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadOptions[TVariables] extends Query[TVariables] {
  var optimistic: Boolean = js.native
  var previousResult: js.UndefOr[js.Any] = js.native
  var rootId: js.UndefOr[String] = js.native
}

object ReadOptions {
  @scala.inline
  def apply[TVariables](optimistic: Boolean, query: DocumentNode): ReadOptions[TVariables] = {
    val __obj = js.Dynamic.literal(optimistic = optimistic.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadOptions[TVariables]]
  }
  @scala.inline
  implicit class ReadOptionsOps[Self[tvariables] <: ReadOptions[tvariables], TVariables] (val x: Self[TVariables]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TVariables] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TVariables]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TVariables] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TVariables] with Other]
    @scala.inline
    def withOptimistic(value: Boolean): Self[TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimistic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousResult(value: js.Any): Self[TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviousResult: Self[TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousResult")(js.undefined)
        ret
    }
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

