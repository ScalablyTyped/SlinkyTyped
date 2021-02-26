package typingsSlinky.rockset.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkspacesApi extends StObject {
  
  def child(workspace: String): ListWorkspacesResponse = js.native
  def child(workspace: String, callback: RequestCallback): ListWorkspacesResponse = js.native
  
  def create(body: CreateWorkspaceRequest): CreateWorkspaceRequest = js.native
  def create(body: CreateWorkspaceRequest, callback: RequestCallback): CreateWorkspaceRequest = js.native
  
  def get(workspace: String): GetWorkspaceResponse = js.native
  def get(workspace: String, callback: RequestCallback): GetWorkspaceResponse = js.native
  
  def list(): ListWorkspacesResponse = js.native
  def list(callback: RequestCallback): ListWorkspacesResponse = js.native
  
  def remove(workspace: String): DeleteWorkspaceResponse = js.native
  def remove(workspace: String, callback: RequestCallback): DeleteWorkspaceResponse = js.native
}
