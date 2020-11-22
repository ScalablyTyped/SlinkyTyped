package typingsSlinky.realm.Realm.Services.MongoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An operation performed on a document.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.realm.realmStrings.insert
  - typingsSlinky.realm.realmStrings.delete
  - typingsSlinky.realm.realmStrings.replace
  - typingsSlinky.realm.realmStrings.update
  - typingsSlinky.realm.realmStrings.drop
  - typingsSlinky.realm.realmStrings.rename
  - typingsSlinky.realm.realmStrings.dropDatabase
  - typingsSlinky.realm.realmStrings.invalidate
*/
trait OperationType extends js.Object
object OperationType {
  
  @scala.inline
  def delete: typingsSlinky.realm.realmStrings.delete = "delete".asInstanceOf[typingsSlinky.realm.realmStrings.delete]
  
  @scala.inline
  def drop: typingsSlinky.realm.realmStrings.drop = "drop".asInstanceOf[typingsSlinky.realm.realmStrings.drop]
  
  @scala.inline
  def dropDatabase: typingsSlinky.realm.realmStrings.dropDatabase = "dropDatabase".asInstanceOf[typingsSlinky.realm.realmStrings.dropDatabase]
  
  @scala.inline
  def insert: typingsSlinky.realm.realmStrings.insert = "insert".asInstanceOf[typingsSlinky.realm.realmStrings.insert]
  
  @scala.inline
  def invalidate: typingsSlinky.realm.realmStrings.invalidate = "invalidate".asInstanceOf[typingsSlinky.realm.realmStrings.invalidate]
  
  @scala.inline
  def rename: typingsSlinky.realm.realmStrings.rename = "rename".asInstanceOf[typingsSlinky.realm.realmStrings.rename]
  
  @scala.inline
  def replace: typingsSlinky.realm.realmStrings.replace = "replace".asInstanceOf[typingsSlinky.realm.realmStrings.replace]
  
  @scala.inline
  def update: typingsSlinky.realm.realmStrings.update = "update".asInstanceOf[typingsSlinky.realm.realmStrings.update]
}
