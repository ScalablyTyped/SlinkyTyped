package typingsSlinky.reactRelay.anon

import typingsSlinky.reactRelay.useRefetchableFragmentNodeMod.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Environment extends Action {
  var environment: typingsSlinky.relayRuntime.relayStoreTypesMod.Environment = js.native
  var fragmentIdentifier: String = js.native
  var `type`: String = js.native
}

object Environment {
  @scala.inline
  def apply(
    environment: typingsSlinky.relayRuntime.relayStoreTypesMod.Environment,
    fragmentIdentifier: String,
    `type`: String
  ): Environment = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], fragmentIdentifier = fragmentIdentifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Environment]
  }
  @scala.inline
  implicit class EnvironmentOps[Self <: Environment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnvironment(value: typingsSlinky.relayRuntime.relayStoreTypesMod.Environment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFragmentIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragmentIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

