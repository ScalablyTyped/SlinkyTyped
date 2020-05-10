package typingsSlinky.apolloClient

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.apolloCache.dataProxyMod.DataProxy
import typingsSlinky.apolloClient.storeMod.QueryWithUpdater
import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.graphql.executeMod.ExecutionResult
import typingsSlinky.graphql.executeMod.ExecutionResultDataDefault
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonResult extends js.Object {
  var document: DocumentNode = js.native
  var mutationId: String = js.native
  var result: ExecutionResult[ExecutionResultDataDefault] = js.native
  var update: js.UndefOr[js.Function2[/* proxy */ DataProxy, /* mutationResult */ js.Object, Unit]] = js.native
  var updateQueries: StringDictionary[QueryWithUpdater] = js.native
  var variables: js.Any = js.native
}

object AnonResult {
  @scala.inline
  def apply(
    document: DocumentNode,
    mutationId: String,
    result: ExecutionResult[ExecutionResultDataDefault],
    updateQueries: StringDictionary[QueryWithUpdater],
    variables: js.Any
  ): AnonResult = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], mutationId = mutationId.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], updateQueries = updateQueries.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonResult]
  }
  @scala.inline
  implicit class AnonResultOps[Self <: AnonResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocument(value: DocumentNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMutationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResult(value: ExecutionResult[ExecutionResultDataDefault]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateQueries(value: StringDictionary[QueryWithUpdater]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateQueries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariables(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdate(value: (/* proxy */ DataProxy, /* mutationResult */ js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.undefined)
        ret
    }
  }
  
}

