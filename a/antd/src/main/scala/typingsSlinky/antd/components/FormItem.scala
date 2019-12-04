package typingsSlinky.antd.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.antd.antdStrings.error
import typingsSlinky.antd.antdStrings.success
import typingsSlinky.antd.antdStrings.validating
import typingsSlinky.antd.antdStrings.warning
import typingsSlinky.antd.libFormFormItemMod.FormItemProps
import typingsSlinky.antd.libFormFormItemMod.FormLabelAlign
import typingsSlinky.antd.libFormFormItemMod.default
import typingsSlinky.antd.libGridColMod.ColProps
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FormItem
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("antd/lib/form/FormItem", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, htmlFor, id, required */
  def apply(
    colon: js.UndefOr[Boolean] = js.undefined,
    extra: TagMod[Any] = null,
    hasFeedback: js.UndefOr[Boolean] = js.undefined,
    help: TagMod[Any] = null,
    label: TagMod[Any] = null,
    labelAlign: FormLabelAlign = null,
    labelCol: ColProps = null,
    prefixCls: String = null,
    style: CSSProperties = null,
    validateStatus: success | warning | error | validating | typingsSlinky.antd.antdStrings.Empty = null,
    wrapperCol: ColProps = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(colon)) __obj.updateDynamic("colon")(colon.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (!js.isUndefined(hasFeedback)) __obj.updateDynamic("hasFeedback")(hasFeedback.asInstanceOf[js.Any])
    if (help != null) __obj.updateDynamic("help")(help.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelAlign != null) __obj.updateDynamic("labelAlign")(labelAlign.asInstanceOf[js.Any])
    if (labelCol != null) __obj.updateDynamic("labelCol")(labelCol.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (validateStatus != null) __obj.updateDynamic("validateStatus")(validateStatus.asInstanceOf[js.Any])
    if (wrapperCol != null) __obj.updateDynamic("wrapperCol")(wrapperCol.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = FormItemProps
}

