package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThingDocument extends js.Object {
  /**
    * The attributes.
    */
  var attributes: js.UndefOr[Attributes] = js.native
  /**
    * Indicates whether the thing is connected to the AWS IoT service.
    */
  var connectivity: js.UndefOr[ThingConnectivity] = js.native
  /**
    * The shadow.
    */
  var shadow: js.UndefOr[JsonDocument] = js.native
  /**
    * Thing group names.
    */
  var thingGroupNames: js.UndefOr[ThingGroupNameList] = js.native
  /**
    * The thing ID.
    */
  var thingId: js.UndefOr[ThingId] = js.native
  /**
    * The thing name.
    */
  var thingName: js.UndefOr[ThingName] = js.native
  /**
    * The thing type name.
    */
  var thingTypeName: js.UndefOr[ThingTypeName] = js.native
}

object ThingDocument {
  @scala.inline
  def apply(): ThingDocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThingDocument]
  }
  @scala.inline
  implicit class ThingDocumentOps[Self <: ThingDocument] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: Attributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectivity(value: ThingConnectivity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectivity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectivity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectivity")(js.undefined)
        ret
    }
    @scala.inline
    def withShadow(value: JsonDocument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadow")(js.undefined)
        ret
    }
    @scala.inline
    def withThingGroupNames(value: ThingGroupNameList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingGroupNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThingGroupNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingGroupNames")(js.undefined)
        ret
    }
    @scala.inline
    def withThingId(value: ThingId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThingId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingId")(js.undefined)
        ret
    }
    @scala.inline
    def withThingName(value: ThingName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThingName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingName")(js.undefined)
        ret
    }
    @scala.inline
    def withThingTypeName(value: ThingTypeName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingTypeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThingTypeName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingTypeName")(js.undefined)
        ret
    }
  }
  
}

