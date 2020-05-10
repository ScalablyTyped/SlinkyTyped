package typingsSlinky.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `Property` consists of a user-supplied name/value pair.
  */
@js.native
trait SchemaGoogleCloudVisionV1p2beta1Property extends js.Object {
  /**
    * Name of the property.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Value of numeric properties.
    */
  var uint64Value: js.UndefOr[String] = js.native
  /**
    * Value of the property.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudVisionV1p2beta1Property {
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p2beta1Property = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p2beta1Property]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p2beta1PropertyOps[Self <: SchemaGoogleCloudVisionV1p2beta1Property] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withUint64Value(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uint64Value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUint64Value: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uint64Value")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

