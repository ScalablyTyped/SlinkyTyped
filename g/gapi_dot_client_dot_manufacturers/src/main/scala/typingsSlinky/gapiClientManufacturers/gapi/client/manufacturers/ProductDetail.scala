package typingsSlinky.gapiClientManufacturers.gapi.client.manufacturers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductDetail extends js.Object {
  /** The name of the attribute. */
  var attributeName: js.UndefOr[String] = js.native
  /** The value of the attribute. */
  var attributeValue: js.UndefOr[String] = js.native
  /** A short section name that can be reused between multiple product details. */
  var sectionName: js.UndefOr[String] = js.native
}

object ProductDetail {
  @scala.inline
  def apply(): ProductDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductDetail]
  }
  @scala.inline
  implicit class ProductDetailOps[Self <: ProductDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributeName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeName")(js.undefined)
        ret
    }
    @scala.inline
    def withAttributeValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributeValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeValue")(js.undefined)
        ret
    }
    @scala.inline
    def withSectionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sectionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSectionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sectionName")(js.undefined)
        ret
    }
  }
  
}

