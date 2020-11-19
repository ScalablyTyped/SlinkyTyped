package typingsSlinky.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mongodb.mongodbStrings.primary
  - typingsSlinky.mongodb.mongodbStrings.primaryPreferred
  - typingsSlinky.mongodb.mongodbStrings.secondary
  - typingsSlinky.mongodb.mongodbStrings.secondaryPreferred
  - typingsSlinky.mongodb.mongodbStrings.nearest
*/
trait ReadPreferenceMode extends ReadPreferenceOrMode
object ReadPreferenceMode {
  
  @scala.inline
  def nearest: typingsSlinky.mongodb.mongodbStrings.nearest = "nearest".asInstanceOf[typingsSlinky.mongodb.mongodbStrings.nearest]
  
  @scala.inline
  def primary: typingsSlinky.mongodb.mongodbStrings.primary = "primary".asInstanceOf[typingsSlinky.mongodb.mongodbStrings.primary]
  
  @scala.inline
  def primaryPreferred: typingsSlinky.mongodb.mongodbStrings.primaryPreferred = "primaryPreferred".asInstanceOf[typingsSlinky.mongodb.mongodbStrings.primaryPreferred]
  
  @scala.inline
  def secondary: typingsSlinky.mongodb.mongodbStrings.secondary = "secondary".asInstanceOf[typingsSlinky.mongodb.mongodbStrings.secondary]
  
  @scala.inline
  def secondaryPreferred: typingsSlinky.mongodb.mongodbStrings.secondaryPreferred = "secondaryPreferred".asInstanceOf[typingsSlinky.mongodb.mongodbStrings.secondaryPreferred]
}
