package typingsSlinky.awsSdkClientXrayNode.typesAnnotationValueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnnotationValue extends js.Object {
  /**
    * <p>Value for a Boolean annotation.</p>
    */
  var BooleanValue: js.UndefOr[Boolean] = js.native
  /**
    * <p>Value for a Number annotation.</p>
    */
  var NumberValue: js.UndefOr[Double] = js.native
  /**
    * <p>Value for a String annotation.</p>
    */
  var StringValue: js.UndefOr[String] = js.native
}

object AnnotationValue {
  @scala.inline
  def apply(): AnnotationValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationValue]
  }
  @scala.inline
  implicit class AnnotationValueOps[Self <: AnnotationValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBooleanValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BooleanValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBooleanValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BooleanValue")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberValue")(js.undefined)
        ret
    }
    @scala.inline
    def withStringValue(value: String): Self = {
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

