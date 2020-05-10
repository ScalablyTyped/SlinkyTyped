package typingsSlinky.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Custom Rich Media Events group.
  */
@js.native
trait SchemaCustomRichMediaEvents extends js.Object {
  /**
    * List of custom rich media event IDs. Dimension values must be all of type
    * dfa:richMediaEventTypeIdAndName.
    */
  var filteredEventIds: js.UndefOr[js.Array[SchemaDimensionValue]] = js.native
  /**
    * The kind of resource this is, in this case
    * dfareporting#customRichMediaEvents.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaCustomRichMediaEvents {
  @scala.inline
  def apply(): SchemaCustomRichMediaEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomRichMediaEvents]
  }
  @scala.inline
  implicit class SchemaCustomRichMediaEventsOps[Self <: SchemaCustomRichMediaEvents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilteredEventIds(value: js.Array[SchemaDimensionValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filteredEventIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilteredEventIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filteredEventIds")(js.undefined)
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

