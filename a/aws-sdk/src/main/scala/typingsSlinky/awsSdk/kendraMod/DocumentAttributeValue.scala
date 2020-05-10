package typingsSlinky.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentAttributeValue extends js.Object {
  /**
    * A date value expressed as seconds from the Unix epoch.
    */
  var DateValue: js.UndefOr[js.Date] = js.native
  /**
    * A long integer value.
    */
  var LongValue: js.UndefOr[Long] = js.native
  /**
    * A list of strings. 
    */
  var StringListValue: js.UndefOr[DocumentAttributeStringListValue] = js.native
  /**
    * A string, such as "department".
    */
  var StringValue: js.UndefOr[DocumentAttributeStringValue] = js.native
}

object DocumentAttributeValue {
  @scala.inline
  def apply(): DocumentAttributeValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentAttributeValue]
  }
  @scala.inline
  implicit class DocumentAttributeValueOps[Self <: DocumentAttributeValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDateValue(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DateValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DateValue")(js.undefined)
        ret
    }
    @scala.inline
    def withLongValue(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LongValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLongValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LongValue")(js.undefined)
        ret
    }
    @scala.inline
    def withStringListValue(value: DocumentAttributeStringListValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StringListValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStringListValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StringListValue")(js.undefined)
        ret
    }
    @scala.inline
    def withStringValue(value: DocumentAttributeStringValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StringValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStringValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StringValue")(js.undefined)
        ret
    }
  }
  
}

