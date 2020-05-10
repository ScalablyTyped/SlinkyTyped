package typingsSlinky.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageTestsConfiguration extends js.Object {
  /**
    * Defines if tests should be executed when building this image.
    */
  var imageTestsEnabled: js.UndefOr[NullableBoolean] = js.native
  /**
    * The maximum time in minutes that tests are permitted to run.
    */
  var timeoutMinutes: js.UndefOr[ImageTestsTimeoutMinutes] = js.native
}

object ImageTestsConfiguration {
  @scala.inline
  def apply(): ImageTestsConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageTestsConfiguration]
  }
  @scala.inline
  implicit class ImageTestsConfigurationOps[Self <: ImageTestsConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImageTestsEnabled(value: NullableBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageTestsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageTestsEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageTestsEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeoutMinutes(value: ImageTestsTimeoutMinutes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutMinutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeoutMinutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutMinutes")(js.undefined)
        ret
    }
  }
  
}

