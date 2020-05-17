package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.devextremeStrings.center
import typingsSlinky.devextreme.devextremeStrings.centerBottom
import typingsSlinky.devextreme.devextremeStrings.centerTop
import typingsSlinky.devextreme.devextremeStrings.full
import typingsSlinky.devextreme.devextremeStrings.leftBottom
import typingsSlinky.devextreme.devextremeStrings.leftCenter
import typingsSlinky.devextreme.devextremeStrings.leftTop
import typingsSlinky.devextreme.devextremeStrings.rightBottom
import typingsSlinky.devextreme.devextremeStrings.rightCenter
import typingsSlinky.devextreme.devextremeStrings.rightTop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationUrl extends js.Object {
  var location: js.UndefOr[
    center | centerBottom | centerTop | full | leftBottom | leftCenter | leftTop | rightBottom | rightCenter | rightTop
  ] = js.native
  var url: js.UndefOr[String] = js.native
}

object LocationUrl {
  @scala.inline
  def apply(): LocationUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationUrl]
  }
  @scala.inline
  implicit class LocationUrlOps[Self <: LocationUrl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocation(
      value: center | centerBottom | centerTop | full | leftBottom | leftCenter | leftTop | rightBottom | rightCenter | rightTop
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

