package typingsSlinky.microsoftGraph.mod

import typingsSlinky.microsoftGraph.microsoftGraphStrings.completed_
import typingsSlinky.microsoftGraph.microsoftGraphStrings.notStarted_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.notStarted_
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.inProgress
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.completed_
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.waitingOnOthers
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.deferred
*/
trait TaskStatus extends StObject
object TaskStatus {
  
  @scala.inline
  def completed: completed_ = "completed".asInstanceOf[completed_]
  
  @scala.inline
  def deferred: typingsSlinky.microsoftGraph.microsoftGraphStrings.deferred = "deferred".asInstanceOf[typingsSlinky.microsoftGraph.microsoftGraphStrings.deferred]
  
  @scala.inline
  def inProgress: typingsSlinky.microsoftGraph.microsoftGraphStrings.inProgress = "inProgress".asInstanceOf[typingsSlinky.microsoftGraph.microsoftGraphStrings.inProgress]
  
  @scala.inline
  def notStarted: notStarted_ = "notStarted".asInstanceOf[notStarted_]
  
  @scala.inline
  def waitingOnOthers: typingsSlinky.microsoftGraph.microsoftGraphStrings.waitingOnOthers = "waitingOnOthers".asInstanceOf[typingsSlinky.microsoftGraph.microsoftGraphStrings.waitingOnOthers]
}
