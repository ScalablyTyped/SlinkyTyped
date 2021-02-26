package typingsSlinky.maximMazurokGapiClientScript.gapi.client.script

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientScript.anon.Fields
import typingsSlinky.maximMazurokGapiClientScript.anon.MetricsFilterdeploymentId
import typingsSlinky.maximMazurokGapiClientScript.anon.Resource
import typingsSlinky.maximMazurokGapiClientScript.anon.ScriptId
import typingsSlinky.maximMazurokGapiClientScript.anon.UploadType
import typingsSlinky.maximMazurokGapiClientScript.anon.Uploadprotocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectsResource extends StObject {
  
  /** Creates a new, empty script project with no script files and a base manifest file. */
  def create(request: Resource): Request[Project] = js.native
  def create(request: UploadType, body: CreateProjectRequest): Request[Project] = js.native
  
  var deployments: DeploymentsResource = js.native
  
  /** Gets a script project's metadata. */
  def get(): Request[Project] = js.native
  def get(request: Fields): Request[Project] = js.native
  
  /** Gets the content of the script project, including the code source and metadata for each script file. */
  def getContent(): Request[Content] = js.native
  def getContent(request: ScriptId): Request[Content] = js.native
  
  /** Get metrics data for scripts, such as number of executions and active users. */
  def getMetrics(): Request[Metrics] = js.native
  def getMetrics(request: MetricsFilterdeploymentId): Request[Metrics] = js.native
  
  def updateContent(request: Fields, body: Content): Request[Content] = js.native
  /**
    * Updates the content of the specified script project. This content is stored as the HEAD version, and is used when the script is executed as a trigger, in the script editor, in
    * add-on preview mode, or as a web app or Apps Script API in development mode. This clears all the existing files in the project.
    */
  def updateContent(request: Uploadprotocol): Request[Content] = js.native
  
  var versions: VersionsResource = js.native
}
