package typingsSlinky.builderUtilRuntime.publishOptionsMod

import typingsSlinky.builderUtilRuntime.builderUtilRuntimeStrings.spaces
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpacesOptions
  extends BaseS3Options
     with _AllPublishOptions {
  /**
    * The space name.
    */
  val name: String = js.native
  /**
    * The provider. Must be `spaces`.
    */
  @JSName("provider")
  val provider_SpacesOptions: spaces = js.native
  /**
    * The region (e.g. `nyc3`).
    */
  val region: String = js.native
}

object SpacesOptions {
  @scala.inline
  def apply(name: String, provider: spaces, region: String): SpacesOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpacesOptions]
  }
  @scala.inline
  implicit class SpacesOptionsOps[Self <: SpacesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProvider(value: spaces): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

