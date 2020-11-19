package typingsSlinky.relayRuntime.relayStoreTypesMod

import typingsSlinky.relayRuntime.relayRuntimeTypesMod.DataID
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadOnlyRecordProxy extends js.Object {
  
  def getDataID(): DataID = js.native
  
  def getLinkedRecord(name: String): js.UndefOr[RecordProxy[js.Object] | Null] = js.native
  def getLinkedRecord(name: String, args: Variables): js.UndefOr[RecordProxy[js.Object] | Null] = js.native
  
  def getLinkedRecords(name: String): js.UndefOr[(js.Array[js.UndefOr[RecordProxy[js.Object] | Null]]) | Null] = js.native
  def getLinkedRecords(name: String, args: Variables): js.UndefOr[(js.Array[js.UndefOr[RecordProxy[js.Object] | Null]]) | Null] = js.native
  
  def getType(): String = js.native
  
  def getValue(name: String): js.Any = js.native
  def getValue(name: String, args: Variables): js.Any = js.native
}
