package typingsSlinky.openfin.nodeEnvMod

import org.scalajs.dom.raw.Window
import typingsSlinky.openfin.frameFrameMod.EntityType
import typingsSlinky.openfin.identityMod.Identity
import typingsSlinky.openfin.wireMod.NewConnectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openfin/_v2/environment/node-env", JSImport.Default)
@js.native
class default () extends NodeEnvironment {
  /* CompleteClass */
  override var messageCounter: js.Any = js.native
  /* CompleteClass */
  override def createChildWindow(options: js.Any): js.Promise[_] = js.native
  /* CompleteClass */
  override def getCurrentEntityIdentity(): Identity = js.native
  /* CompleteClass */
  override def getCurrentEntityType(): EntityType = js.native
  /* CompleteClass */
  override def getNextMessageId(): js.Any = js.native
  /* CompleteClass */
  override def getRandomId(): String = js.native
  /* CompleteClass */
  override def getWebWindow(identity: Identity): Window = js.native
  /* CompleteClass */
  override def isWindowExists(uuid: String, name: String): Boolean = js.native
  /* CompleteClass */
  override def raiseEvent(eventName: String, eventArgs: js.Any): Unit = js.native
  /* CompleteClass */
  override def retrievePort(config: NewConnectConfig): js.Promise[Double] = js.native
  /* CompleteClass */
  override def writeToken(path: String, token: String): js.Promise[String] = js.native
}

