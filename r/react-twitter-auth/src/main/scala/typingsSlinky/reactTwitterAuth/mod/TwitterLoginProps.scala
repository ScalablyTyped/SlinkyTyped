package typingsSlinky.reactTwitterAuth.mod

import slinky.core.ReactComponentClass
import slinky.core.TagMod
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactTwitterAuth.reactTwitterAuthStrings.`same-origin`
import typingsSlinky.reactTwitterAuth.reactTwitterAuthStrings.include
import typingsSlinky.reactTwitterAuth.reactTwitterAuthStrings.omit
import typingsSlinky.std.HeadersInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TwitterLoginProps extends js.Object {
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  var credentials: js.UndefOr[omit | `same-origin` | include] = js.undefined
  var customHeaders: js.UndefOr[HeadersInit] = js.undefined
  var dialogHeight: js.UndefOr[Double] = js.undefined
  var dialogWidth: js.UndefOr[Double] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var forceLogin: js.UndefOr[Boolean] = js.undefined
  var loginUrl: String
  var requestTokenUrl: String
  var showIcon: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var tag: js.UndefOr[ReactComponentClass[_]] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  def onFailure(msg: String): Unit
  def onSuccess(response: String): Unit
}

object TwitterLoginProps {
  @scala.inline
  def apply(
    loginUrl: String,
    onFailure: String => Unit,
    onSuccess: String => Unit,
    requestTokenUrl: String,
    children: TagMod[Any] = null,
    credentials: omit | `same-origin` | include = null,
    customHeaders: HeadersInit = null,
    dialogHeight: js.UndefOr[Double] = js.undefined,
    dialogWidth: js.UndefOr[Double] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    forceLogin: js.UndefOr[Boolean] = js.undefined,
    showIcon: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    tag: ReactComponentClass[_] = null,
    text: String = null
  ): TwitterLoginProps = {
    val __obj = js.Dynamic.literal(loginUrl = loginUrl.asInstanceOf[js.Any], onFailure = js.Any.fromFunction1(onFailure), onSuccess = js.Any.fromFunction1(onSuccess), requestTokenUrl = requestTokenUrl.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(dialogHeight)) __obj.updateDynamic("dialogHeight")(dialogHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dialogWidth)) __obj.updateDynamic("dialogWidth")(dialogWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forceLogin)) __obj.updateDynamic("forceLogin")(forceLogin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showIcon)) __obj.updateDynamic("showIcon")(showIcon.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TwitterLoginProps]
  }
}

