package typingsSlinky.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPresetsResponse extends js.Object {
  /**
    * A value that you use to access the second and subsequent pages of results, if any. When the presets fit on one page or when you've reached the last page of results, the value of NextPageToken is null.
    */
  var NextPageToken: js.UndefOr[Id] = js.native
  /**
    * An array of Preset objects.
    */
  var Presets: js.UndefOr[typingsSlinky.awsSdk.elastictranscoderMod.Presets] = js.native
}

object ListPresetsResponse {
  @scala.inline
  def apply(): ListPresetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPresetsResponse]
  }
  @scala.inline
  implicit class ListPresetsResponseOps[Self <: ListPresetsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextPageToken(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextPageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withPresets(value: Presets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Presets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPresets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Presets")(js.undefined)
        ret
    }
  }
  
}

