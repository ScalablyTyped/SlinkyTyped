package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThingTypeProperties extends js.Object {
  /**
    * A list of searchable thing attribute names.
    */
  var searchableAttributes: js.UndefOr[SearchableAttributes] = js.native
  /**
    * The description of the thing type.
    */
  var thingTypeDescription: js.UndefOr[ThingTypeDescription] = js.native
}

object ThingTypeProperties {
  @scala.inline
  def apply(): ThingTypeProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThingTypeProperties]
  }
  @scala.inline
  implicit class ThingTypePropertiesOps[Self <: ThingTypeProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSearchableAttributes(value: SearchableAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchableAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchableAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchableAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withThingTypeDescription(value: ThingTypeDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingTypeDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThingTypeDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingTypeDescription")(js.undefined)
        ret
    }
  }
  
}

