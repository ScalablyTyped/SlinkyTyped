package typingsSlinky.antd

import typingsSlinky.antd.antdStrings.`circle-outline`
import typingsSlinky.antd.antdStrings.button
import typingsSlinky.antd.antdStrings.circle
import typingsSlinky.antd.antdStrings.default
import typingsSlinky.antd.antdStrings.large
import typingsSlinky.antd.antdStrings.reset
import typingsSlinky.antd.antdStrings.round
import typingsSlinky.antd.antdStrings.small
import typingsSlinky.antd.antdStrings.submit
import typingsSlinky.propDashTypes.propDashTypesMod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args extends js.Object {
  var block: Requireable[Boolean]
  var className: Requireable[String]
  var htmlType: Requireable[button | reset | submit]
  var icon: Requireable[String]
  var loading: Requireable[Boolean | js.Object]
  var onClick: Requireable[js.Function1[/* repeated */ _, _]]
  var shape: Requireable[round | circle | `circle-outline`]
  var size: Requireable[small | default | large]
  var title: Requireable[String]
  var `type`: Requireable[String]
}

object Anon_Args {
  @scala.inline
  def apply(
    block: Requireable[Boolean],
    className: Requireable[String],
    htmlType: Requireable[button | reset | submit],
    icon: Requireable[String],
    loading: Requireable[Boolean | js.Object],
    onClick: Requireable[js.Function1[/* repeated */ _, _]],
    shape: Requireable[round | circle | `circle-outline`],
    size: Requireable[small | default | large],
    title: Requireable[String],
    `type`: Requireable[String]
  ): Anon_Args = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], htmlType = htmlType.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], onClick = onClick.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Args]
  }
}

