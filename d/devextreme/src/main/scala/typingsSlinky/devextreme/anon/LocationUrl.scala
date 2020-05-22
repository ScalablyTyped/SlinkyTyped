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

trait LocationUrl extends js.Object {
  var location: js.UndefOr[
    center | centerBottom | centerTop | full | leftBottom | leftCenter | leftTop | rightBottom | rightCenter | rightTop
  ] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object LocationUrl {
  @scala.inline
  def apply(
    location: center | centerBottom | centerTop | full | leftBottom | leftCenter | leftTop | rightBottom | rightCenter | rightTop = null,
    url: String = null
  ): LocationUrl = {
    val __obj = js.Dynamic.literal()
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationUrl]
  }
}

