package typingsSlinky.electronGet

import typingsSlinky.electronGet.typesMod.ElectronArtifactDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@electron/get/dist/esm/artifact-utils", JSImport.Namespace)
@js.native
object artifactUtilsMod extends js.Object {
  
  def getArtifactFileName(details: ElectronArtifactDetails): String = js.native
  
  def getArtifactRemoteURL(details: ElectronArtifactDetails): js.Promise[String] = js.native
}
