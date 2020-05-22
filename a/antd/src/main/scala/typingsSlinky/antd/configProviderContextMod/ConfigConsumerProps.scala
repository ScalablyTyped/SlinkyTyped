package typingsSlinky.antd.configProviderContextMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.antd.anon.AutoComplete
import typingsSlinky.antd.anon.Ghost
import typingsSlinky.antd.anon.Size
import typingsSlinky.antd.antdStrings.ltr
import typingsSlinky.antd.antdStrings.rtl
import typingsSlinky.antd.localeProviderMod.Locale
import typingsSlinky.antd.renderEmptyMod.RenderEmptyHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigConsumerProps extends js.Object {
  var autoInsertSpaceInButton: js.UndefOr[Boolean] = js.native
  var csp: js.UndefOr[CSPConfig] = js.native
  var direction: js.UndefOr[ltr | rtl] = js.native
  var getPopupContainer: js.UndefOr[js.Function1[/* triggerNode */ HTMLElement, HTMLElement]] = js.native
  var getTargetContainer: js.UndefOr[js.Function0[HTMLElement]] = js.native
  var input: js.UndefOr[AutoComplete] = js.native
  var locale: js.UndefOr[Locale] = js.native
  var pageHeader: js.UndefOr[Ghost] = js.native
  var renderEmpty: RenderEmptyHandler = js.native
  var rootPrefixCls: js.UndefOr[String] = js.native
  var space: js.UndefOr[Size] = js.native
  def getPrefixCls(suffixCls: String): String = js.native
  def getPrefixCls(suffixCls: String, customizePrefixCls: String): String = js.native
}

