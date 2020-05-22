package typingsSlinky.arcgisRestApi.mod

import typingsSlinky.arcgisRestApi.arcgisRestApiStrings.`line-through`
import typingsSlinky.arcgisRestApi.arcgisRestApiStrings.bold
import typingsSlinky.arcgisRestApi.arcgisRestApiStrings.bolder
import typingsSlinky.arcgisRestApi.arcgisRestApiStrings.italic
import typingsSlinky.arcgisRestApi.arcgisRestApiStrings.lighter
import typingsSlinky.arcgisRestApi.arcgisRestApiStrings.none
import typingsSlinky.arcgisRestApi.arcgisRestApiStrings.normal
import typingsSlinky.arcgisRestApi.arcgisRestApiStrings.oblique
import typingsSlinky.arcgisRestApi.arcgisRestApiStrings.underline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Font extends js.Object {
  var decoration: js.UndefOr[`line-through` | underline | none] = js.undefined
  var family: js.UndefOr[String] = js.undefined
   // "<fontFamily>";
  var size: js.UndefOr[Double] = js.undefined
   // <fontSize>;
  var style: js.UndefOr[italic | normal | oblique] = js.undefined
  var weight: js.UndefOr[bold | bolder | lighter | normal] = js.undefined
}

object Font {
  @scala.inline
  def apply(
    decoration: `line-through` | underline | none = null,
    family: String = null,
    size: js.UndefOr[Double] = js.undefined,
    style: italic | normal | oblique = null,
    weight: bold | bolder | lighter | normal = null
  ): Font = {
    val __obj = js.Dynamic.literal()
    if (decoration != null) __obj.updateDynamic("decoration")(decoration.asInstanceOf[js.Any])
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Font]
  }
}

