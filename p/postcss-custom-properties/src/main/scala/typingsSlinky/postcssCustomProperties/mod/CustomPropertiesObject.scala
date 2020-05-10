package typingsSlinky.postcssCustomProperties.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomPropertiesObject extends js.Object {
  var `custom-properties`: js.UndefOr[StringDictionary[String]] = js.native
  var customProperties: js.UndefOr[StringDictionary[String]] = js.native
}

object CustomPropertiesObject {
  @scala.inline
  def apply(): CustomPropertiesObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomPropertiesObject]
  }
  @scala.inline
  implicit class CustomPropertiesObjectOps[Self <: CustomPropertiesObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withCustom-properties`(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom-properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCustom-properties`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom-properties")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomProperties(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customProperties")(js.undefined)
        ret
    }
  }
  
}

