package typingsSlinky.antd.esFormFormItemMod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.antd.antdStrings.Empty
import typingsSlinky.antd.antdStrings.error
import typingsSlinky.antd.antdStrings.success
import typingsSlinky.antd.antdStrings.validating
import typingsSlinky.antd.esConfigDashProviderContextMod.ConfigConsumerProps
import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormItem
  extends Component[FormItemProps, js.Any, js.Any] {
  var helpShow: Boolean = js.native
  @JSName("componentDidMount")
  def componentDidMount_MFormItem(): Unit = js.native
  def getChildProp(prop: String): js.Any = js.native
  def getControls(children: TagMod[Any], recursively: Boolean): js.Array[ReactElement] = js.native
  def getField(): js.Any = js.native
  def getHelpMessage(): js.UndefOr[js.Object | Null] = js.native
  def getId(): js.Any = js.native
  def getMeta(): js.Any = js.native
  def getOnlyControl(): ReactElement | Null = js.native
  def getValidateStatus(): error | Empty | success | validating = js.native
  def isRequired(): js.Any = js.native
  def onHelpAnimEnd(_key: String, helpShow: Boolean): Unit = js.native
  def onLabelClick(): Unit = js.native
  def renderChildren(prefixCls: String): js.Array[Element] = js.native
  def renderExtra(prefixCls: String): Element | Null = js.native
  def renderFormItem(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
  def renderHelp(prefixCls: String): Element = js.native
  def renderLabel(prefixCls: String): Element = js.native
  def renderValidateWrapper(prefixCls: String, c1: TagMod[Any], c2: TagMod[Any], c3: TagMod[Any]): Element = js.native
  def renderWrapper(prefixCls: String, children: TagMod[Any]): Element = js.native
}

