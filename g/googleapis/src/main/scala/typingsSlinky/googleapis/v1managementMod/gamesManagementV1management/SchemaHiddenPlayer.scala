package typingsSlinky.googleapis.v1managementMod.gamesManagementV1management

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for the HiddenPlayer resource.
  */
@js.native
trait SchemaHiddenPlayer extends js.Object {
  /**
    * The time this player was hidden.
    */
  var hiddenTimeMillis: js.UndefOr[String] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string gamesManagement#hiddenPlayer.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The player information.
    */
  var player: js.UndefOr[SchemaPlayer] = js.native
}

object SchemaHiddenPlayer {
  @scala.inline
  def apply(): SchemaHiddenPlayer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHiddenPlayer]
  }
  @scala.inline
  implicit class SchemaHiddenPlayerOps[Self <: SchemaHiddenPlayer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHiddenTimeMillis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenTimeMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHiddenTimeMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenTimeMillis")(js.undefined)
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
    def withPlayer(value: SchemaPlayer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("player")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlayer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("player")(js.undefined)
        ret
    }
  }
  
}

