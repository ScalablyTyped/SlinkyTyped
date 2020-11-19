package typingsSlinky.bullBoard.mod

import typingsSlinky.bull.mod.Queue
import typingsSlinky.express.mod.Express
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  def UI(): Express = js.native
  
  def createQueues(redisURL: String): CreateQueue = js.native
  
  def setQueues(bullQueues: js.Array[Queue[_]]): Queue[_] = js.native
  def setQueues(bullQueues: Queue[_]): Queue[_] = js.native
}
