package typingsSlinky.awsDashSdk.clientsLexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SlotTypeMetadata extends js.Object {
  /**
    * The date that the slot type was created.
    */
  var createdDate: js.UndefOr[js.Date] = js.native
  /**
    * A description of the slot type.
    */
  var description: js.UndefOr[Description] = js.native
  /**
    * The date that the slot type was updated. When you create a resource, the creation date and last updated date are the same. 
    */
  var lastUpdatedDate: js.UndefOr[js.Date] = js.native
  /**
    * The name of the slot type.
    */
  var name: js.UndefOr[SlotTypeName] = js.native
  /**
    * The version of the slot type.
    */
  var version: js.UndefOr[Version] = js.native
}

object SlotTypeMetadata {
  @scala.inline
  def apply(
    createdDate: js.Date = null,
    description: Description = null,
    lastUpdatedDate: js.Date = null,
    name: SlotTypeName = null,
    version: Version = null
  ): SlotTypeMetadata = {
    val __obj = js.Dynamic.literal()
    if (createdDate != null) __obj.updateDynamic("createdDate")(createdDate.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (lastUpdatedDate != null) __obj.updateDynamic("lastUpdatedDate")(lastUpdatedDate.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlotTypeMetadata]
  }
}

