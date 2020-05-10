package typingsSlinky.apolloClient.observableQueryMod

import typingsSlinky.apolloClient.AnonFetchMoreResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FetchMoreOptions[TData, TVariables] extends js.Object {
  def updateQuery(previousQueryResult: TData, options: AnonFetchMoreResult[TData, TVariables]): TData = js.native
}

object FetchMoreOptions {
  @scala.inline
  def apply[TData, TVariables](updateQuery: (TData, AnonFetchMoreResult[TData, TVariables]) => TData): FetchMoreOptions[TData, TVariables] = {
    val __obj = js.Dynamic.literal(updateQuery = js.Any.fromFunction2(updateQuery))
    __obj.asInstanceOf[FetchMoreOptions[TData, TVariables]]
  }
  @scala.inline
  implicit class FetchMoreOptionsOps[Self[tdata, tvariables] <: FetchMoreOptions[tdata, tvariables], TData, TVariables] (val x: Self[TData, TVariables]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TData, TVariables] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TData, TVariables]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TData, TVariables]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TData, TVariables]) with Other]
    @scala.inline
    def withUpdateQuery(value: (TData, AnonFetchMoreResult[TData, TVariables]) => TData): Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateQuery")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

