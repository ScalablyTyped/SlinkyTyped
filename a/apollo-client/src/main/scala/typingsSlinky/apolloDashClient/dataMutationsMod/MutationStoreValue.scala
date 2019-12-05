package typingsSlinky.apolloDashClient.dataMutationsMod

import typingsSlinky.graphql.languageAstMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MutationStoreValue extends js.Object {
  var error: js.Error | Null
  var loading: Boolean
  var mutation: DocumentNode
  var variables: js.Object
}

object MutationStoreValue {
  @scala.inline
  def apply(loading: Boolean, mutation: DocumentNode, variables: js.Object, error: js.Error = null): MutationStoreValue = {
    val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any], mutation = mutation.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutationStoreValue]
  }
}

