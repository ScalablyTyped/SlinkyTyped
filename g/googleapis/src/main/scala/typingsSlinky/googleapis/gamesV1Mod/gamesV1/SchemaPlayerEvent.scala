package typingsSlinky.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for an event status resource.
  */
@js.native
trait SchemaPlayerEvent extends js.Object {
  /**
    * The ID of the event definition.
    */
  var definitionId: js.UndefOr[String] = js.native
  /**
    * The current number of times this event has occurred, as a string. The
    * formatting of this string depends on the configuration of your event in
    * the Play Games Developer Console.
    */
  var formattedNumEvents: js.UndefOr[String] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#playerEvent.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The current number of times this event has occurred.
    */
  var numEvents: js.UndefOr[String] = js.native
  /**
    * The ID of the player.
    */
  var playerId: js.UndefOr[String] = js.native
}

object SchemaPlayerEvent {
  @scala.inline
  def apply(): SchemaPlayerEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlayerEvent]
  }
  @scala.inline
  implicit class SchemaPlayerEventOps[Self <: SchemaPlayerEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefinitionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definitionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefinitionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definitionId")(js.undefined)
        ret
    }
    @scala.inline
    def withFormattedNumEvents(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattedNumEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormattedNumEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattedNumEvents")(js.undefined)
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
    def withNumEvents(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withPlayerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlayerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playerId")(js.undefined)
        ret
    }
  }
  
}

