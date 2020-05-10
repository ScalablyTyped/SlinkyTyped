package typingsSlinky.apolloClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<{  document  :std.Readonly<graphql.graphql.DocumentNode>,   hasClientExports  :boolean,   hasForcedResolvers  :boolean,   clientQuery  :std.Readonly<graphql.graphql.DocumentNode> | null,   serverQuery  :std.Readonly<graphql.graphql.DocumentNode> | null,   defaultVars  :std.Readonly<apollo-client.apollo-client/core/types.OperationVariables>}> */
@js.native
trait ReadonlydocumentReadonlyD extends js.Object {
  val clientQuery: js.UndefOr[ReadonlyDocumentNode] = js.native
  val document: ReadonlyDocumentNode = js.native
  val hasClientExports: Boolean = js.native
  val hasForcedResolvers: Boolean = js.native
  val serverQuery: js.UndefOr[ReadonlyDocumentNode] = js.native
}

object ReadonlydocumentReadonlyD {
  @scala.inline
  def apply(document: ReadonlyDocumentNode, hasClientExports: Boolean, hasForcedResolvers: Boolean): ReadonlydocumentReadonlyD = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], hasClientExports = hasClientExports.asInstanceOf[js.Any], hasForcedResolvers = hasForcedResolvers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlydocumentReadonlyD]
  }
  @scala.inline
  implicit class ReadonlydocumentReadonlyDOps[Self <: ReadonlydocumentReadonlyD] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocument(value: ReadonlyDocumentNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasClientExports(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasClientExports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasForcedResolvers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasForcedResolvers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientQuery(value: ReadonlyDocumentNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientQuery")(js.undefined)
        ret
    }
    @scala.inline
    def withServerQuery(value: ReadonlyDocumentNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverQuery")(js.undefined)
        ret
    }
  }
  
}

