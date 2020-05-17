package typingsSlinky.relayRuntime.anon

import typingsSlinky.relayRuntime.relayRuntimeStrings.PageInfo
import typingsSlinky.relayRuntime.relayRuntimeStrings.clientMutationId
import typingsSlinky.relayRuntime.relayRuntimeStrings.cursor
import typingsSlinky.relayRuntime.relayRuntimeStrings.edges
import typingsSlinky.relayRuntime.relayRuntimeStrings.endCursor
import typingsSlinky.relayRuntime.relayRuntimeStrings.hasNextPage
import typingsSlinky.relayRuntime.relayRuntimeStrings.hasPreviousPage
import typingsSlinky.relayRuntime.relayRuntimeStrings.node
import typingsSlinky.relayRuntime.relayRuntimeStrings.pageInfo_
import typingsSlinky.relayRuntime.relayRuntimeStrings.startCursor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CLIENTMUTATIONID extends js.Object {
  var CLIENT_MUTATION_ID: clientMutationId = js.native
  var CURSOR: cursor = js.native
  var EDGES: edges = js.native
  var EDGES_HAVE_SOURCE_FIELD: Boolean = js.native
  var END_CURSOR: endCursor = js.native
  var HAS_NEXT_PAGE: hasNextPage = js.native
  var HAS_PREV_PAGE: hasPreviousPage = js.native
  var NODE: node = js.native
  var PAGE_INFO: pageInfo_ = js.native
  var PAGE_INFO_TYPE: PageInfo = js.native
  var START_CURSOR: startCursor = js.native
}

object CLIENTMUTATIONID {
  @scala.inline
  def apply(
    CLIENT_MUTATION_ID: clientMutationId,
    CURSOR: cursor,
    EDGES: edges,
    EDGES_HAVE_SOURCE_FIELD: Boolean,
    END_CURSOR: endCursor,
    HAS_NEXT_PAGE: hasNextPage,
    HAS_PREV_PAGE: hasPreviousPage,
    NODE: node,
    PAGE_INFO: pageInfo_,
    PAGE_INFO_TYPE: PageInfo,
    START_CURSOR: startCursor
  ): CLIENTMUTATIONID = {
    val __obj = js.Dynamic.literal(CLIENT_MUTATION_ID = CLIENT_MUTATION_ID.asInstanceOf[js.Any], CURSOR = CURSOR.asInstanceOf[js.Any], EDGES = EDGES.asInstanceOf[js.Any], EDGES_HAVE_SOURCE_FIELD = EDGES_HAVE_SOURCE_FIELD.asInstanceOf[js.Any], END_CURSOR = END_CURSOR.asInstanceOf[js.Any], HAS_NEXT_PAGE = HAS_NEXT_PAGE.asInstanceOf[js.Any], HAS_PREV_PAGE = HAS_PREV_PAGE.asInstanceOf[js.Any], NODE = NODE.asInstanceOf[js.Any], PAGE_INFO = PAGE_INFO.asInstanceOf[js.Any], PAGE_INFO_TYPE = PAGE_INFO_TYPE.asInstanceOf[js.Any], START_CURSOR = START_CURSOR.asInstanceOf[js.Any])
    __obj.asInstanceOf[CLIENTMUTATIONID]
  }
  @scala.inline
  implicit class CLIENTMUTATIONIDOps[Self <: CLIENTMUTATIONID] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCLIENT_MUTATION_ID(value: clientMutationId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CLIENT_MUTATION_ID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCURSOR(value: cursor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CURSOR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEDGES(value: edges): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EDGES")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEDGES_HAVE_SOURCE_FIELD(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EDGES_HAVE_SOURCE_FIELD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEND_CURSOR(value: endCursor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("END_CURSOR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHAS_NEXT_PAGE(value: hasNextPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HAS_NEXT_PAGE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHAS_PREV_PAGE(value: hasPreviousPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HAS_PREV_PAGE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNODE(value: node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NODE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPAGE_INFO(value: pageInfo_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PAGE_INFO")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPAGE_INFO_TYPE(value: PageInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PAGE_INFO_TYPE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSTART_CURSOR(value: startCursor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("START_CURSOR")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

