package typingsSlinky.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for an event definition resource.
  */
@js.native
trait SchemaEventDefinition extends js.Object {
  /**
    * A list of events that are a child of this event.
    */
  var childEvents: js.UndefOr[js.Array[SchemaEventChild]] = js.native
  /**
    * Description of what this event represents.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The name to display for the event.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The ID of the event.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The base URL for the image that represents the event.
    */
  var imageUrl: js.UndefOr[String] = js.native
  /**
    * Indicates whether the icon image being returned is a default image, or is
    * game-provided.
    */
  var isDefaultImageUrl: js.UndefOr[Boolean] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#eventDefinition.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The visibility of event being tracked in this definition. Possible values
    * are:   - &quot;REVEALED&quot;: This event should be visible to all users.
    * - &quot;HIDDEN&quot;: This event should only be shown to users that have
    * recorded this event at least once.
    */
  var visibility: js.UndefOr[String] = js.native
}

object SchemaEventDefinition {
  @scala.inline
  def apply(): SchemaEventDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEventDefinition]
  }
  @scala.inline
  implicit class SchemaEventDefinitionOps[Self <: SchemaEventDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildEvents(value: js.Array[SchemaEventChild]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDefaultImageUrl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDefaultImageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDefaultImageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDefaultImageUrl")(js.undefined)
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
    def withVisibility(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(js.undefined)
        ret
    }
  }
  
}

