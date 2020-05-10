package typingsSlinky.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a third party application verification response
  * resource.
  */
@js.native
trait SchemaApplicationVerifyResponse extends js.Object {
  /**
    * An alternate ID that was once used for the player that was issued the
    * auth token used in this request. (This field is not normally populated.)
    */
  var alternate_player_id: js.UndefOr[String] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#applicationVerifyResponse.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The ID of the player that was issued the auth token used in this request.
    */
  var player_id: js.UndefOr[String] = js.native
}

object SchemaApplicationVerifyResponse {
  @scala.inline
  def apply(): SchemaApplicationVerifyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApplicationVerifyResponse]
  }
  @scala.inline
  implicit class SchemaApplicationVerifyResponseOps[Self <: SchemaApplicationVerifyResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlternate_player_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternate_player_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlternate_player_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternate_player_id")(js.undefined)
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
    @scala.inline
    def withPlayer_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("player_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlayer_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("player_id")(js.undefined)
        ret
    }
  }
  
}

