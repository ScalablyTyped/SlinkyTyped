package typingsSlinky.angularGrowlV2.mod.growl

import typingsSlinky.angular.JQLite
import typingsSlinky.angular.mod.IAttributes
import typingsSlinky.angular.mod.IController
import typingsSlinky.angular.mod.IDirective
import typingsSlinky.angular.mod.IScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * GrowlMessages service.
  */
@js.native
trait IGrowlMessagesService extends js.Object {
  
  /**
    * Add a message
    */
  def addMessage(message: IGrowlMessage): IGrowlMessage = js.native
  
  /**
    * Delete a message
    */
  def deleteMessage(message: IGrowlMessage): Unit = js.native
  
  /**
    * Destroy all messages
    */
  def destroyAllMessages(): Unit = js.native
  def destroyAllMessages(referenceId: Double): Unit = js.native
  
  /**
    * Get current messages
    */
  def getAllMessages(): js.Array[IGrowlMessage] = js.native
  def getAllMessages(referenceId: Double): js.Array[IGrowlMessage] = js.native
  
  /**
    * Initialize a directive
    * We look at the preloaded directive and use this else we
    * create a new blank object
    * @param referenceId
    * @param limitMessages
    */
  def initDirective(referenceId: Double, limitMessages: Double): IDirective[IScope, JQLite, IAttributes, IController] = js.native
}
