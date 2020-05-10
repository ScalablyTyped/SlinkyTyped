package typingsSlinky.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOrdersCreateTestOrderRequest extends js.Object {
  /**
    * The  CLDR territory code of the country of the test order to create.
    * Affects the currency and addresses of orders created via template_name,
    * or the addresses of orders created via test_order.  Acceptable values
    * are:   - &quot;US&quot;  - &quot;FR&quot;  Defaults to US.
    */
  var country: js.UndefOr[String] = js.native
  /**
    * The test order template to use. Specify as an alternative to testOrder as
    * a shortcut for retrieving a template and then creating an order using
    * that template.
    */
  var templateName: js.UndefOr[String] = js.native
  /**
    * The test order to create.
    */
  var testOrder: js.UndefOr[SchemaTestOrder] = js.native
}

object SchemaOrdersCreateTestOrderRequest {
  @scala.inline
  def apply(): SchemaOrdersCreateTestOrderRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrdersCreateTestOrderRequest]
  }
  @scala.inline
  implicit class SchemaOrdersCreateTestOrderRequestOps[Self <: SchemaOrdersCreateTestOrderRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateName")(js.undefined)
        ret
    }
    @scala.inline
    def withTestOrder(value: SchemaTestOrder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testOrder")(js.undefined)
        ret
    }
  }
  
}

