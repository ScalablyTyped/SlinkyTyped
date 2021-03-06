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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CLIENTMUTATIONID extends StObject {
  
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
  implicit class CLIENTMUTATIONIDMutableBuilder[Self <: CLIENTMUTATIONID] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCLIENT_MUTATION_ID(value: clientMutationId): Self = StObject.set(x, "CLIENT_MUTATION_ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCURSOR(value: cursor): Self = StObject.set(x, "CURSOR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEDGES(value: edges): Self = StObject.set(x, "EDGES", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEDGES_HAVE_SOURCE_FIELD(value: Boolean): Self = StObject.set(x, "EDGES_HAVE_SOURCE_FIELD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEND_CURSOR(value: endCursor): Self = StObject.set(x, "END_CURSOR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHAS_NEXT_PAGE(value: hasNextPage): Self = StObject.set(x, "HAS_NEXT_PAGE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHAS_PREV_PAGE(value: hasPreviousPage): Self = StObject.set(x, "HAS_PREV_PAGE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNODE(value: node): Self = StObject.set(x, "NODE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPAGE_INFO(value: pageInfo_): Self = StObject.set(x, "PAGE_INFO", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPAGE_INFO_TYPE(value: PageInfo): Self = StObject.set(x, "PAGE_INFO_TYPE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSTART_CURSOR(value: startCursor): Self = StObject.set(x, "START_CURSOR", value.asInstanceOf[js.Any])
  }
}
