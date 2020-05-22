package typingsSlinky.antdMobileRn.listPropsTypeMod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.antdMobileRn.antdMobileRnBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPropsType extends js.Object {
  var children: js.UndefOr[`false` | ReactElement | js.Array[ReactElement]] = js.undefined
  var renderFooter: js.UndefOr[js.Function0[ReactComponentClass[_]] | String | ReactElement] = js.undefined
  var renderHeader: js.UndefOr[js.Function0[ReactComponentClass[_]] | String | ReactElement] = js.undefined
}

object ListPropsType {
  @scala.inline
  def apply(
    children: `false` | ReactElement | js.Array[ReactElement] = null,
    renderFooter: js.Function0[ReactComponentClass[_]] | String | ReactElement = null,
    renderHeader: js.Function0[ReactComponentClass[_]] | String | ReactElement = null
  ): ListPropsType = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (renderFooter != null) __obj.updateDynamic("renderFooter")(renderFooter.asInstanceOf[js.Any])
    if (renderHeader != null) __obj.updateDynamic("renderHeader")(renderHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPropsType]
  }
}

