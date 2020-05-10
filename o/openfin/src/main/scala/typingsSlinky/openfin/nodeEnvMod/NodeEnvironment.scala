package typingsSlinky.openfin.nodeEnvMod

import typingsSlinky.openfin.environmentMod.Environment
import typingsSlinky.openfin.frameFrameMod.EntityType
import typingsSlinky.openfin.identityMod.Identity
import typingsSlinky.openfin.wireMod.NewConnectConfig
import typingsSlinky.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeEnvironment extends Environment {
  var messageCounter: js.Any = js.native
}

object NodeEnvironment {
  @scala.inline
  def apply(
    createChildWindow: js.Any => js.Promise[_],
    getCurrentEntityIdentity: () => Identity,
    getCurrentEntityType: () => EntityType,
    getNextMessageId: () => js.Any,
    getRandomId: () => String,
    getWebWindow: Identity => Window_,
    isWindowExists: (String, String) => Boolean,
    messageCounter: js.Any,
    retrievePort: NewConnectConfig => js.Promise[Double],
    writeToken: (String, String) => js.Promise[String]
  ): NodeEnvironment = {
    val __obj = js.Dynamic.literal(createChildWindow = js.Any.fromFunction1(createChildWindow), getCurrentEntityIdentity = js.Any.fromFunction0(getCurrentEntityIdentity), getCurrentEntityType = js.Any.fromFunction0(getCurrentEntityType), getNextMessageId = js.Any.fromFunction0(getNextMessageId), getRandomId = js.Any.fromFunction0(getRandomId), getWebWindow = js.Any.fromFunction1(getWebWindow), isWindowExists = js.Any.fromFunction2(isWindowExists), messageCounter = messageCounter.asInstanceOf[js.Any], retrievePort = js.Any.fromFunction1(retrievePort), writeToken = js.Any.fromFunction2(writeToken))
    __obj.asInstanceOf[NodeEnvironment]
  }
  @scala.inline
  implicit class NodeEnvironmentOps[Self <: NodeEnvironment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessageCounter(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageCounter")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

