package typingsSlinky.antd.formItemInputMod

import slinky.core.TagMod
import typingsSlinky.antd.gridColMod.ColProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormItemInputProps extends js.Object {
  var extra: js.UndefOr[TagMod[Any]] = js.undefined
  var help: js.UndefOr[TagMod[Any]] = js.undefined
  var wrapperCol: js.UndefOr[ColProps] = js.undefined
}

object FormItemInputProps {
  @scala.inline
  def apply(extra: TagMod[Any] = null, help: TagMod[Any] = null, wrapperCol: ColProps = null): FormItemInputProps = {
    val __obj = js.Dynamic.literal()
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (help != null) __obj.updateDynamic("help")(help.asInstanceOf[js.Any])
    if (wrapperCol != null) __obj.updateDynamic("wrapperCol")(wrapperCol.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormItemInputProps]
  }
}

