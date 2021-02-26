package typingsSlinky.clearbladejsServer.CbServer

import typingsSlinky.clearbladejsServer.anon.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClearBladeInt extends StObject {
  
  def Code(): typingsSlinky.clearbladejsServer.CbServer.Code = js.native
  
  def Collection(options: String): typingsSlinky.clearbladejsServer.CbServer.Collection = js.native
  def Collection(options: CollectionOptionsWithCollection): typingsSlinky.clearbladejsServer.CbServer.Collection = js.native
  def Collection(options: CollectionOptionsWithID): typingsSlinky.clearbladejsServer.CbServer.Collection = js.native
  def Collection(options: CollectionOptionsWithName): typingsSlinky.clearbladejsServer.CbServer.Collection = js.native
  
  def Deployment(): typingsSlinky.clearbladejsServer.CbServer.Deployment = js.native
  
  def Device(): typingsSlinky.clearbladejsServer.CbServer.Device = js.native
  
  def Item(data: js.Object, options: String): typingsSlinky.clearbladejsServer.CbServer.Item = js.native
  def Item(data: js.Object, options: ItemOptions): typingsSlinky.clearbladejsServer.CbServer.Item = js.native
  
  def Messaging(options: MessagingOptions, callback: CbCallback): typingsSlinky.clearbladejsServer.CbServer.Messaging = js.native
  
  def Query(options: QueryOptionsWithCollection): QueryObj = js.native
  def Query(options: QueryOptionsWithID): QueryObj = js.native
  def Query(options: QueryOptionsWithName): QueryObj = js.native
  
  var Timer: TimerClass = js.native
  
  var Trigger: TriggerClass = js.native
  
  def User(): AppUser = js.native
  
  def about(): String = js.native
  
  def addFilterToQuery(queryObj: QueryObj, condition: QueryConditions, key: String, value: QueryValue): Unit = js.native
  
  def addSortToQuery(queryObj: QueryObj, direction: QuerySortDirections, column: String): Unit = js.native
  
  def addToQuery(queryObj: QueryObj, key: String, value: String): Unit = js.native
  
  def createDevice(name: String, data: js.Object, causeTrigger: Boolean, callback: CbCallback): Unit = js.native
  
  def deleteDevice(name: String, causeTrigger: Boolean, callback: CbCallback): Unit = js.native
  
  def edgeId(): String = js.native
  
  def execute(error: js.Object, response: js.Object, callback: CbCallback): js.Any = js.native
  
  def getAllCollections(callback: CbCallback): Unit = js.native
  
  def getAllDevicesForSystem(callback: CbCallback): Unit = js.native
  
  def getDeviceByName(name: String, callback: CbCallback): Unit = js.native
  
  def http(): js.Object = js.native
  
  def init(options: InitOptions): Unit = js.native
  def init(options: Request): Unit = js.native
  
  def isCurrentUserAuthenticated(callback: CbCallback): Unit = js.native
  
  def isEdge(callback: CbCallback): Boolean = js.native
  
  def isObjectEmpty(obj: js.Object): Boolean = js.native
  
  def logger(message: String): Unit = js.native
  
  def loginAnon(callback: CbCallback): Unit = js.native
  
  def loginUser(email: String, password: String, callback: CbCallback): Unit = js.native
  
  def logoutUser(callback: CbCallback): Unit = js.native
  
  def makeKVPair(key: String, value: String): KeyValuePair = js.native
  
  def newCollection(name: String, callback: CbCallback): Unit = js.native
  
  def parseOperationQuery(query: Query): String = js.native
  
  def parseQuery(query: Query): String = js.native
  def parseQuery(query: QueryObj): String = js.native
  
  def registerUser(email: String, password: String, callback: CbCallback): Unit = js.native
  
  def setUser(email: String, authToken: String, userId: String): Unit = js.native
  
  def updateDevice(name: String, data: js.Object, causeTrigger: Boolean, callback: CbCallback): Unit = js.native
  
  def validateEmailPassword(email: String, password: String): Unit = js.native
}
