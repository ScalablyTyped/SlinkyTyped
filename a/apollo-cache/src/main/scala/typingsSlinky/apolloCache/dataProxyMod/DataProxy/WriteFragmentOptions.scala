package typingsSlinky.apolloCache.dataProxyMod.DataProxy

import typingsSlinky.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WriteFragmentOptions[TData, TVariables] extends Fragment[TVariables] {
  var data: TData = js.native
}

object WriteFragmentOptions {
  @scala.inline
  def apply[TData, TVariables](data: TData, fragment: DocumentNode, id: String): WriteFragmentOptions[TData, TVariables] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], fragment = fragment.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteFragmentOptions[TData, TVariables]]
  }
  @scala.inline
  implicit class WriteFragmentOptionsOps[Self[tdata, tvariables] <: WriteFragmentOptions[tdata, tvariables], TData, TVariables] (val x: Self[TData, TVariables]) extends AnyVal {
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

