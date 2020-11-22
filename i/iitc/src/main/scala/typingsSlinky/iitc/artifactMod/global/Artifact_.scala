package typingsSlinky.iitc.artifactMod.global

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Artifact")
@js.native
class Artifact_ () extends js.Object {
  
    // 60 minutes on success
  var REFRESH_FAILURE: Double = js.native
  
  // private _layer: L.LayerGroup;
  var REFRESH_JITTER: Double = js.native
  
    // 2 minute random period so not all users refresh at once
  var REFRESH_SUCCESS: Double = js.native
  
  var artifactTypes: StringDictionary[js.Any] = js.native
  
  // private handleSuccess(data): void;
  // private handleFailure(data): void;
  // private processData(data): void;
  // private processResult(portals): void;
  def clearData(): Unit = js.native
  
  var entities: js.Array[js.Any] = js.native
  
  /** used to render portals that would otherwise be below the visible level */
  def getArtifactEntities(): js.Array[js.Any] = js.native
  
  def getArtifactTypes(): js.Array[String] = js.native
  
  def getInterestingPortals(): js.Array[String] = js.native
  
  /** get the artifact data for a specified artifact id (e.g. 'jarvis'), if it exists - otherwise returns something 'false' */
  def getPortalData(guid: String, artifactId: js.Any): js.Any = js.native
  
  def idleResume(): Unit = js.native
  
  def isArtifact(`type`: String): Boolean = js.native
  
  /** quick test for portal being relevant to artifacts - of any type */
  def isInterestingPortal(guid: String): Boolean = js.native
  
  def requestData(): Unit = js.native
  
  def setup(): Unit = js.native
  
  /** show artifact dialog */
  def showArtifactList(): Unit = js.native
  
  def updateLayer(): Unit = js.native
}
