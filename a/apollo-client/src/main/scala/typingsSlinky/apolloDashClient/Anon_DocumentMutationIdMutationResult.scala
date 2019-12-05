package typingsSlinky.apolloDashClient

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.apolloDashCache.libTypesDataProxyMod.DataProxy
import typingsSlinky.apolloDashClient.dataStoreMod.QueryWithUpdater
import typingsSlinky.graphql.executionExecuteMod.ExecutionResult
import typingsSlinky.graphql.executionExecuteMod.ExecutionResultDataDefault
import typingsSlinky.graphql.languageAstMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DocumentMutationIdMutationResult extends js.Object {
  var document: DocumentNode
  var mutationId: String
  var result: ExecutionResult[ExecutionResultDataDefault]
  var update: js.UndefOr[js.Function2[/* proxy */ DataProxy, /* mutationResult */ js.Object, Unit]] = js.undefined
  var updateQueries: StringDictionary[QueryWithUpdater]
  var variables: js.Any
}

object Anon_DocumentMutationIdMutationResult {
  @scala.inline
  def apply(
    document: DocumentNode,
    mutationId: String,
    result: ExecutionResult[ExecutionResultDataDefault],
    updateQueries: StringDictionary[QueryWithUpdater],
    variables: js.Any,
    update: (/* proxy */ DataProxy, /* mutationResult */ js.Object) => Unit = null
  ): Anon_DocumentMutationIdMutationResult = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], mutationId = mutationId.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], updateQueries = updateQueries.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction2(update))
    __obj.asInstanceOf[Anon_DocumentMutationIdMutationResult]
  }
}

