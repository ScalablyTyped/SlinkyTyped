package typingsSlinky.googleapis.gamesV1Mod.gamesV1

import typingsSlinky.googleapis.AnonApnsdevicetoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a push token ID resource.
  */
@js.native
trait SchemaPushTokenId extends js.Object {
  /**
    * A push token ID for iOS devices.
    */
  var ios: js.UndefOr[AnonApnsdevicetoken] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#pushTokenId.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaPushTokenId {
  @scala.inline
  def apply(): SchemaPushTokenId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPushTokenId]
  }
  @scala.inline
  implicit class SchemaPushTokenIdOps[Self <: SchemaPushTokenId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIos(value: AnonApnsdevicetoken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ios")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ios")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
  }
  
}

