package typingsSlinky.openfin.environmentMod

import org.scalajs.dom.raw.Window
import typingsSlinky.openfin.frameFrameMod.EntityType
import typingsSlinky.openfin.identityMod.Identity
import typingsSlinky.openfin.wireMod.NewConnectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Environment extends js.Object {
  def createChildWindow(options: js.Any): js.Promise[_] = js.native
  def getCurrentEntityIdentity(): Identity = js.native
  def getCurrentEntityType(): EntityType = js.native
  def getNextMessageId(): js.Any = js.native
  def getRandomId(): String = js.native
  def getWebWindow(identity: Identity): Window = js.native
  def isWindowExists(uuid: String, name: String): Boolean = js.native
  def retrievePort(config: NewConnectConfig): js.Promise[Double] = js.native
  def writeToken(path: String, token: String): js.Promise[String] = js.native
}

object Environment {
  @scala.inline
  def apply(
    createChildWindow: js.Any => js.Promise[_],
    getCurrentEntityIdentity: () => Identity,
    getCurrentEntityType: () => EntityType,
    getNextMessageId: () => js.Any,
    getRandomId: () => String,
    getWebWindow: Identity => Window,
    isWindowExists: (String, String) => Boolean,
    retrievePort: NewConnectConfig => js.Promise[Double],
    writeToken: (String, String) => js.Promise[String]
  ): Environment = {
    val __obj = js.Dynamic.literal(createChildWindow = js.Any.fromFunction1(createChildWindow), getCurrentEntityIdentity = js.Any.fromFunction0(getCurrentEntityIdentity), getCurrentEntityType = js.Any.fromFunction0(getCurrentEntityType), getNextMessageId = js.Any.fromFunction0(getNextMessageId), getRandomId = js.Any.fromFunction0(getRandomId), getWebWindow = js.Any.fromFunction1(getWebWindow), isWindowExists = js.Any.fromFunction2(isWindowExists), retrievePort = js.Any.fromFunction1(retrievePort), writeToken = js.Any.fromFunction2(writeToken))
    __obj.asInstanceOf[Environment]
  }
  @scala.inline
  implicit class EnvironmentOps[Self <: Environment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateChildWindow(value: js.Any => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createChildWindow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetCurrentEntityIdentity(value: () => Identity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentEntityIdentity")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCurrentEntityType(value: () => EntityType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentEntityType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetNextMessageId(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNextMessageId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRandomId(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRandomId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetWebWindow(value: Identity => Window): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWebWindow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsWindowExists(value: (String, String) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWindowExists")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRetrievePort(value: NewConnectConfig => js.Promise[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retrievePort")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWriteToken(value: (String, String) => js.Promise[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeToken")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

