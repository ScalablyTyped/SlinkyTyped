package typingsSlinky.connectDashAzuretables.connectDashAzuretablesMod

import typingsSlinky.connectDashAzuretables.connectDashAzuretablesStrings.SET
import typingsSlinky.connectDashAzuretables.connectDashAzuretablesStrings.TOUCH
import typingsSlinky.expressDashSession.expressDashSessionMod.Store
import typingsSlinky.expressDashSession.expressDashSessionMod._Global_.Express.SessionData
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

