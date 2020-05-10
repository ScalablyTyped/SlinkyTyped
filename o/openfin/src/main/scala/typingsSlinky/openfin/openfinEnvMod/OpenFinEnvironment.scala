package typingsSlinky.openfin.openfinEnvMod

import typingsSlinky.openfin.environmentMod.Environment
import typingsSlinky.openfin.frameFrameMod.EntityType
import typingsSlinky.openfin.identityMod.Identity
import typingsSlinky.openfin.wireMod.NewConnectConfig
import typingsSlinky.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenFinEnvironment extends Environment {
  var resolveUrl: js.Any = js.native
}

object OpenFinEnvironment {
  @scala.inline
  def apply(
    createChildWindow: js.Any => js.Promise[_],
    getCurrentEntityIdentity: () => Identity,
    getCurrentEntityType: () => EntityType,
    getNextMessageId: () => js.Any,
    getRandomId: () => String,
    getWebWindow: Identity => Window_,
    isWindowExists: (String, String) => Boolean,
    resolveUrl: js.Any,
    retrievePort: NewConnectConfig => js.Promise[Double],
    writeToken: (String, String) => js.Promise[String]
  ): OpenFinEnvironment = {
    val __obj = js.Dynamic.literal(createChildWindow = js.Any.fromFunction1(createChildWindow), getCurrentEntityIdentity = js.Any.fromFunction0(getCurrentEntityIdentity), getCurrentEntityType = js.Any.fromFunction0(getCurrentEntityType), getNextMessageId = js.Any.fromFunction0(getNextMessageId), getRandomId = js.Any.fromFunction0(getRandomId), getWebWindow = js.Any.fromFunction1(getWebWindow), isWindowExists = js.Any.fromFunction2(isWindowExists), resolveUrl = resolveUrl.asInstanceOf[js.Any], retrievePort = js.Any.fromFunction1(retrievePort), writeToken = js.Any.fromFunction2(writeToken))
    __obj.asInstanceOf[OpenFinEnvironment]
  }
  @scala.inline
  implicit class OpenFinEnvironmentOps[Self <: OpenFinEnvironment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResolveUrl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveUrl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

