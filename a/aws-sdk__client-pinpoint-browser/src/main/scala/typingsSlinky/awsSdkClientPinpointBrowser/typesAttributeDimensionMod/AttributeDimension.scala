package typingsSlinky.awsSdkClientPinpointBrowser.typesAttributeDimensionMod

import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.EXCLUSIVE
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.INCLUSIVE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttributeDimension extends js.Object {
  /**
    * The type of dimension:
    *
    * INCLUSIVE - Endpoints that match the criteria are included in the segment.
    *
    * EXCLUSIVE - Endpoints that match the criteria are excluded from the segment.
    */
  var AttributeType: js.UndefOr[INCLUSIVE | EXCLUSIVE | String] = js.native
  /**
    * The criteria values for the segment dimension. Endpoints with matching attribute values are included or excluded from the segment, depending on the setting for Type.
    */
  var Values: js.UndefOr[js.Array[String] | js.Iterable[String]] = js.native
}

object AttributeDimension {
  @scala.inline
  def apply(): AttributeDimension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttributeDimension]
  }
  @scala.inline
  implicit class AttributeDimensionOps[Self <: AttributeDimension] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributeType(value: INCLUSIVE | EXCLUSIVE | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeType")(js.undefined)
        ret
    }
    @scala.inline
    def withValuesIterable(value: js.Iterable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: js.Array[String] | js.Iterable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Values")(js.undefined)
        ret
    }
  }
  
}

