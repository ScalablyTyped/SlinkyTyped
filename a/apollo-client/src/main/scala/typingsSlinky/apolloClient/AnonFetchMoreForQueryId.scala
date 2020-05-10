package typingsSlinky.apolloClient

import typingsSlinky.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFetchMoreForQueryId extends js.Object {
  var document: DocumentNode = js.native
  var fetchMoreForQueryId: js.UndefOr[String] = js.native
  var isPoll: Boolean = js.native
  var isRefetch: Boolean = js.native
  var metadata: js.Any = js.native
  var queryId: String = js.native
  var storePreviousVariables: Boolean = js.native
  var variables: js.Object = js.native
}

object AnonFetchMoreForQueryId {
  @scala.inline
  def apply(
    document: DocumentNode,
    isPoll: Boolean,
    isRefetch: Boolean,
    metadata: js.Any,
    queryId: String,
    storePreviousVariables: Boolean,
    variables: js.Object
  ): AnonFetchMoreForQueryId = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], isPoll = isPoll.asInstanceOf[js.Any], isRefetch = isRefetch.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], queryId = queryId.asInstanceOf[js.Any], storePreviousVariables = storePreviousVariables.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFetchMoreForQueryId]
  }
  @scala.inline
  implicit class AnonFetchMoreForQueryIdOps[Self <: AnonFetchMoreForQueryId] (val x: Self) extends AnyVal {
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
    def withIsPoll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPoll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsRefetch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRefetch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueryId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStorePreviousVariables(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storePreviousVariables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariables(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFetchMoreForQueryId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchMoreForQueryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetchMoreForQueryId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchMoreForQueryId")(js.undefined)
        ret
    }
  }
  
}

