package typingsSlinky.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOrderMerchantProvidedAnnotation extends js.Object {
  /**
    * Key for additional merchant provided (as key-value pairs) annotation
    * about the line item.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * Value for additional merchant provided (as key-value pairs) annotation
    * about the line item.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaOrderMerchantProvidedAnnotation {
  @scala.inline
  def apply(): SchemaOrderMerchantProvidedAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderMerchantProvidedAnnotation]
  }
  @scala.inline
  implicit class SchemaOrderMerchantProvidedAnnotationOps[Self <: SchemaOrderMerchantProvidedAnnotation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
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

