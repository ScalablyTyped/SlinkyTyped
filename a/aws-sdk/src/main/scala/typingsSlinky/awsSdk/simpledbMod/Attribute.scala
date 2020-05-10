package typingsSlinky.awsSdk.simpledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attribute extends js.Object {
  /**
    * 
    */
  var AlternateNameEncoding: js.UndefOr[String] = js.native
  /**
    * 
    */
  var AlternateValueEncoding: js.UndefOr[String] = js.native
  /**
    * The name of the attribute.
    */
  var Name: String = js.native
  /**
    * The value of the attribute.
    */
  var Value: String = js.native
}

object Attribute {
  @scala.inline
  def apply(Name: String, Value: String): Attribute = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attribute]
  }
  @scala.inline
  implicit class AttributeOps[Self <: Attribute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlternateNameEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlternateNameEncoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlternateNameEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlternateNameEncoding")(js.undefined)
        ret
    }
    @scala.inline
    def withAlternateValueEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlternateValueEncoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlternateValueEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlternateValueEncoding")(js.undefined)
        ret
    }
  }
  
}

