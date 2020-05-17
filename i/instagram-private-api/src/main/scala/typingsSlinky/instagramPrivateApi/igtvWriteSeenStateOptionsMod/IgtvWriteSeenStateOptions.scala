package typingsSlinky.instagramPrivateApi.igtvWriteSeenStateOptionsMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.instagramPrivateApi.anon.Viewprogresss
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgtvWriteSeenStateOptions extends js.Object {
  var grid_impressions: js.UndefOr[js.Array[String]] = js.native
  var impressions: js.UndefOr[StringDictionary[Viewprogresss]] = js.native
}

object IgtvWriteSeenStateOptions {
  @scala.inline
  def apply(): IgtvWriteSeenStateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgtvWriteSeenStateOptions]
  }
  @scala.inline
  implicit class IgtvWriteSeenStateOptionsOps[Self <: IgtvWriteSeenStateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGrid_impressions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid_impressions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrid_impressions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid_impressions")(js.undefined)
        ret
    }
    @scala.inline
    def withImpressions(value: StringDictionary[Viewprogresss]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("impressions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImpressions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("impressions")(js.undefined)
        ret
    }
  }
  
}

