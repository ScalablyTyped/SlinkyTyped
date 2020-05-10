package typingsSlinky.dompurify.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SanitizeAttributeHookEvent extends _HookEvent {
  var allowedAttributes: StringDictionary[Boolean] = js.native
  var attrName: String = js.native
  var attrValue: String = js.native
  var keepAttr: Boolean = js.native
}

object SanitizeAttributeHookEvent {
  @scala.inline
  def apply(
    allowedAttributes: StringDictionary[Boolean],
    attrName: String,
    attrValue: String,
    keepAttr: Boolean
  ): SanitizeAttributeHookEvent = {
    val __obj = js.Dynamic.literal(allowedAttributes = allowedAttributes.asInstanceOf[js.Any], attrName = attrName.asInstanceOf[js.Any], attrValue = attrValue.asInstanceOf[js.Any], keepAttr = keepAttr.asInstanceOf[js.Any])
    __obj.asInstanceOf[SanitizeAttributeHookEvent]
  }
  @scala.inline
  implicit class SanitizeAttributeHookEventOps[Self <: SanitizeAttributeHookEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowedAttributes(value: StringDictionary[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttrName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttrValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeepAttr(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepAttr")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

