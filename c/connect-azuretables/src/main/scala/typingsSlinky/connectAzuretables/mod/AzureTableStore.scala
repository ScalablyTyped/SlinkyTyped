package typingsSlinky.connectAzuretables.mod

import typingsSlinky.connectAzuretables.connectAzuretablesStrings.SET
import typingsSlinky.connectAzuretables.connectAzuretablesStrings.TOUCH
import typingsSlinky.expressSession.mod.Store
import typingsSlinky.expressSession.mod.global.Express.SessionData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AzureTableStore extends Store {
  def cleanUp(): Unit = js.native
  def startBackgroundCleanUp(): Unit = js.native
  @JSName("update")
  def update_SET(method: SET, sid: String, session: SessionData): Unit = js.native
  @JSName("update")
  def update_SET(method: SET, sid: String, session: SessionData, callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  @JSName("update")
  def update_TOUCH(method: TOUCH, sid: String, session: SessionData): Unit = js.native
  @JSName("update")
  def update_TOUCH(method: TOUCH, sid: String, session: SessionData, callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
}

