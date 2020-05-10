package typingsSlinky.googleCloudStorage.bucketMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateNotificationOptions extends js.Object {
  var customAttributes: js.UndefOr[StringDictionary[String]] = js.native
  var eventTypes: js.UndefOr[js.Array[String]] = js.native
  var objectNamePrefix: js.UndefOr[String] = js.native
  var payloadFormat: js.UndefOr[String] = js.native
  var userProject: js.UndefOr[String] = js.native
}

object CreateNotificationOptions {
  @scala.inline
  def apply(): CreateNotificationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNotificationOptions]
  }
  @scala.inline
  implicit class CreateNotificationOptionsOps[Self <: CreateNotificationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomAttributes(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withEventTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectNamePrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectNamePrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectNamePrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectNamePrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withPayloadFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payloadFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayloadFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payloadFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withUserProject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userProject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserProject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userProject")(js.undefined)
        ret
    }
  }
  
}

