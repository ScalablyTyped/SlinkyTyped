package typingsSlinky.realm.Realm.Sync

import typingsSlinky.realm.Realm
import typingsSlinky.realm.Realm.ObjectSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Adapter extends js.Object {
  
  /**
    * Advance the to the next transaction indicating that you are done processing the current instructions for the given Realm.
    * @param path the path for the Realm to advance
    */
  def advance(path: String): Unit = js.native
  
  def close(): Unit = js.native
  
  def current(path: String): js.Array[Instruction] = js.native
  
  def realmAtPath(path: String): Realm = js.native
  def realmAtPath(path: String, schema: js.Array[ObjectSchema]): Realm = js.native
}
