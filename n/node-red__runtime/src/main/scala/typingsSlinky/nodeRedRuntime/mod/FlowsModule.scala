package typingsSlinky.nodeRedRuntime.mod

import typingsSlinky.nodeRedRuntime.anon.FlowId
import typingsSlinky.nodeRedRuntime.anon.IdReq
import typingsSlinky.nodeRedRuntime.anon.Req
import typingsSlinky.nodeRedRuntime.anon.Rev
import typingsSlinky.nodeRedRuntime.anon.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlowsModule extends StObject {
  
  /**
    * Adds a flow configuration
    * @param opts
    * @param opts.flow - the flow to add
    * @param opts.req - the request to log (optional)
    * @returns the id of the added flow
    */
  def addFlow(opts: typingsSlinky.nodeRedRuntime.anon.Flow): js.Promise[String] = js.native
  
  /**
    * Deletes a flow
    * @param opts
    * @param opts.id - the id of the flow to delete
    * @param opts.req - the request to log (optional)
    */
  def deleteFlow(opts: IdReq): js.Promise[Unit] = js.native
  
  /**
    * Gets an individual flow configuration
    * @param opts
    * @param opts.id - the id of the flow to retrieve
    * @param opts.req - the request to log (optional)
    */
  def getFlow(opts: IdReq): js.Promise[Flow] = js.native
  
  /**
    * Gets the current flow configuration
    * @param opts
    * @param opts.req - the request to log (optional)
    */
  def getFlows(opts: Req): js.Promise[Flows] = js.native
  
  /**
    * Gets the safe credentials for a node
    * @param opts
    * @param opts.type - the node type to return the credential information for
    * @param opts.id - the node id
    * @param opts.req - the request to log (optional)
    * @returns the safe credentials
    */
  def getNodeCredentials(opts: Type): js.Promise[js.Object] = js.native
  
  /**
    * Sets the current flow configuration
    * @param opts
    * @param opts.flows - the flow configuration: `{flows: [..], credentials: {}}`
    * @param opts.deploymentType - the type of deployment - "full", "nodes", "flows", "reload"
    * @param opts.req - the request to log (optional)
    */
  def setFlows(opts: typingsSlinky.nodeRedRuntime.anon.Flows): js.Promise[Rev] = js.native
  
  /**
    * Updates an existing flow configuration
    * @param opts
    * @param opts.id - the id of the flow to update
    * @param opts.flow - the flow configuration
    * @param opts.req - the request to log (optional)
    * @returns the id of the updated flow
    */
  def updateFlow(opts: FlowId): js.Promise[String] = js.native
}
object FlowsModule {
  
  @scala.inline
  def apply(
    addFlow: typingsSlinky.nodeRedRuntime.anon.Flow => js.Promise[String],
    deleteFlow: IdReq => js.Promise[Unit],
    getFlow: IdReq => js.Promise[Flow],
    getFlows: Req => js.Promise[Flows],
    getNodeCredentials: Type => js.Promise[js.Object],
    setFlows: typingsSlinky.nodeRedRuntime.anon.Flows => js.Promise[Rev],
    updateFlow: FlowId => js.Promise[String]
  ): FlowsModule = {
    val __obj = js.Dynamic.literal(addFlow = js.Any.fromFunction1(addFlow), deleteFlow = js.Any.fromFunction1(deleteFlow), getFlow = js.Any.fromFunction1(getFlow), getFlows = js.Any.fromFunction1(getFlows), getNodeCredentials = js.Any.fromFunction1(getNodeCredentials), setFlows = js.Any.fromFunction1(setFlows), updateFlow = js.Any.fromFunction1(updateFlow))
    __obj.asInstanceOf[FlowsModule]
  }
  
  @scala.inline
  implicit class FlowsModuleMutableBuilder[Self <: FlowsModule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddFlow(value: typingsSlinky.nodeRedRuntime.anon.Flow => js.Promise[String]): Self = StObject.set(x, "addFlow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDeleteFlow(value: IdReq => js.Promise[Unit]): Self = StObject.set(x, "deleteFlow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetFlow(value: IdReq => js.Promise[Flow]): Self = StObject.set(x, "getFlow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetFlows(value: Req => js.Promise[Flows]): Self = StObject.set(x, "getFlows", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNodeCredentials(value: Type => js.Promise[js.Object]): Self = StObject.set(x, "getNodeCredentials", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFlows(value: typingsSlinky.nodeRedRuntime.anon.Flows => js.Promise[Rev]): Self = StObject.set(x, "setFlows", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdateFlow(value: FlowId => js.Promise[String]): Self = StObject.set(x, "updateFlow", js.Any.fromFunction1(value))
  }
}
