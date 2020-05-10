package typingsSlinky.apolloReactHoc.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataProps[TData, TGraphQLVariables] extends js.Object {
  var data: DataValue[TData, TGraphQLVariables] = js.native
}

object DataProps {
  @scala.inline
  def apply[TData, TGraphQLVariables](data: DataValue[TData, TGraphQLVariables]): DataProps[TData, TGraphQLVariables] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataProps[TData, TGraphQLVariables]]
  }
  @scala.inline
  implicit class DataPropsOps[Self[tdata, tgraphqlvariables] <: DataProps[tdata, tgraphqlvariables], TData, TGraphQLVariables] (val x: Self[TData, TGraphQLVariables]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TData, TGraphQLVariables] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TData, TGraphQLVariables]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TData, TGraphQLVariables]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TData, TGraphQLVariables]) with Other]
    @scala.inline
    def withData(value: DataValue[TData, TGraphQLVariables]): Self[TData, TGraphQLVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

