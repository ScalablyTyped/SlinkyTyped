package typingsSlinky.kdbxweb.mod

import org.scalajs.dom.raw.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kdbxweb", "Kdbx")
@js.native
class Kdbx () extends StObject {
  
  def addDeletedObject(uuid: KdbxUuid, dt: js.Date): Unit = js.native
  
  var binaries: Binaries = js.native
  
  def cleanup(settings: Settings): Unit = js.native
  
  def createBinary(value: js.typedarray.ArrayBuffer): js.Promise[ProtectedValue | js.typedarray.ArrayBuffer] = js.native
  def createBinary(value: ProtectedValue): js.Promise[ProtectedValue | js.typedarray.ArrayBuffer] = js.native
  
  def createDefaultGroup(): Unit = js.native
  
  def createEntry(group: Group): Entry = js.native
  
  def createGroup(group: Group, name: StringProtected): Group = js.native
  
  def createRecycleBin(): Unit = js.native
  
  var credentials: Credentials = js.native
  
  var deletedObjects: js.Array[KdbxObject] = js.native
  
  def getDefaultGroup(): Group = js.native
  
  def getGroup(uuid: String): js.UndefOr[Group] = js.native
  def getGroup(uuid: String, parentGroup: Group): js.UndefOr[Group] = js.native
  def getGroup(uuid: KdbxUuid): js.UndefOr[Group] = js.native
  def getGroup(uuid: KdbxUuid, parentGroup: Group): js.UndefOr[Group] = js.native
  
  def getLocalEditState(): editingStateDict = js.native
  
  var groups: js.Array[Group] = js.native
  
  var header: Header = js.native
  
  def merge(remote: Kdbx): Unit = js.native
  
  var meta: Meta = js.native
  
  def move(`object`: KdbxObject, toGroup: Group): Unit = js.native
  def move(`object`: KdbxObject, toGroup: Group, atIndex: Double): Unit = js.native
  
  def remove(`object`: KdbxObject): Unit = js.native
  
  def removeLocalEditState(): Unit = js.native
  
  def save(): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  def saveXml(): js.Promise[String] = js.native
  
  def setLocalEditState(editingState: editingStateDict): Unit = js.native
  
  def upgrade(): Unit = js.native
  
  var xml: Document = js.native
}
/* static members */
object Kdbx {
  
  @JSImport("kdbxweb", "Kdbx.create")
  @js.native
  def create(credentials: Credentials, name: String): Kdbx = js.native
  
  @JSImport("kdbxweb", "Kdbx.load")
  @js.native
  def load(data: js.typedarray.ArrayBuffer, credentials: Credentials): js.Promise[Kdbx] = js.native
  
  @JSImport("kdbxweb", "Kdbx.loadXml")
  @js.native
  def loadXml(data: String, credentials: Credentials): js.Promise[Kdbx] = js.native
}
