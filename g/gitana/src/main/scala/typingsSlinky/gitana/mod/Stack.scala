package typingsSlinky.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "Stack")
@js.native
class Stack protected () extends AbstractPlatformObject {
  def this(platform: js.Any, `object`: js.Any) = this()
  
  def assignDataStore(datastore: js.Any, key: js.Any, args: js.Any*): js.Any = js.native
  
  def attach(attachmentId: js.Any, contentType: js.Any, data: js.Any): js.Any = js.native
  
  def attachment(attachmentId: js.Any): js.Any = js.native
  
  def createRole(roleKey: js.Any, `object`: js.Any): js.Any = js.native
  
  def createTeam(teamKey: js.Any, `object`: js.Any): js.Any = js.native
  
  def existsDataStore(key: js.Any, callback: js.Any): js.Any = js.native
  
  def getKey(): js.Any = js.native
  
  def getPreviewUri(name: js.Any, config: js.Any): js.Any = js.native
  
  def listAttachments(local: js.Any): js.Any = js.native
  
  def listDataStores(pagination: js.Any): js.Any = js.native
  
  def listRoles(inherited: js.Any): js.Any = js.native
  
  def listTeams(pagination: js.Any): js.Any = js.native
  
  def queryDataStores(query: js.Any, pagination: js.Any): PlatformDataStoreMap = js.native
  
  def queryLogEntries(query: js.Any, pagination: js.Any): LogEntryMap = js.native
  
  def readDataStore(key: js.Any, callback: js.Any): Stack = js.native
  
  def readLog(callback: js.Any): this.type = js.native
  
  def readLogEntry(logEntryId: js.Any): LogEntry = js.native
  
  def readOwnersTeam(): js.Any = js.native
  
  def readRole(roleKeyOrId: js.Any, inherited: js.Any): js.Any = js.native
  
  def readTeam(teamKey: js.Any): js.Any = js.native
  
  def unassignDataStore(key: js.Any): js.Any = js.native
  
  def unattach(attachmentId: js.Any): js.Any = js.native
}
object Stack {
  
  /* static member */
  @JSImport("gitana", "Stack.extend")
  @js.native
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "Stack.forEach")
  @js.native
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = js.native
  
  /* static member */
  @JSImport("gitana", "Stack.implement")
  @js.native
  def implement(args: js.Any*): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "Stack.toString")
  @js.native
  def toString_(): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "Stack.valueOf")
  @js.native
  def valueOf_(`type`: js.Any): js.Any = js.native
}
