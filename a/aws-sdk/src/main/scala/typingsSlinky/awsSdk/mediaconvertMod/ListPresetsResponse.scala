package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPresetsResponse extends js.Object {
  /**
    * Use this string to request the next batch of presets.
    */
  var NextToken: js.UndefOr[string] = js.native
  /**
    * List of presets
    */
  var Presets: js.UndefOr[listOfPreset] = js.native
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
    def withNextToken(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withPresets(value: listOfPreset): Self = {
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

