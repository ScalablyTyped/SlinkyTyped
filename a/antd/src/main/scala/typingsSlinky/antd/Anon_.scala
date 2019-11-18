package typingsSlinky.antd

import typingsSlinky.antd.antdStrings.Empty
import typingsSlinky.antd.antdStrings.error
import typingsSlinky.antd.antdStrings.success
import typingsSlinky.antd.antdStrings.validating
import typingsSlinky.antd.antdStrings.warning
import typingsSlinky.propDashTypes.propDashTypesMod.ReactElementLike
import typingsSlinky.propDashTypes.propDashTypesMod.ReactNodeArray
import typingsSlinky.propDashTypes.propDashTypesMod.ReactNodeLike
import typingsSlinky.propDashTypes.propDashTypesMod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ extends js.Object {
  var children: Requireable[ReactNodeLike]
  var className: Requireable[String]
  var colon: Requireable[Boolean]
  var hasFeedback: Requireable[Boolean]
  var help: Requireable[String | Double | Boolean | js.Object | ReactElementLike | ReactNodeArray]
  var id: Requireable[String]
  var label: Requireable[String | Double | Boolean | js.Object | ReactElementLike | ReactNodeArray]
  var labelAlign: Requireable[String]
  var labelCol: Requireable[js.Object]
  var prefixCls: Requireable[String]
  var validateStatus: Requireable[Empty | error | success | warning | validating]
  var wrapperCol: Requireable[js.Object]
}

object Anon_ {
  @scala.inline
  def apply(
    children: Requireable[ReactNodeLike],
    className: Requireable[String],
    colon: Requireable[Boolean],
    hasFeedback: Requireable[Boolean],
    help: Requireable[String | Double | Boolean | js.Object | ReactElementLike | ReactNodeArray],
    id: Requireable[String],
    label: Requireable[String | Double | Boolean | js.Object | ReactElementLike | ReactNodeArray],
    labelAlign: Requireable[String],
    labelCol: Requireable[js.Object],
    prefixCls: Requireable[String],
    validateStatus: Requireable[Empty | error | success | warning | validating],
    wrapperCol: Requireable[js.Object]
  ): Anon_ = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], colon = colon.asInstanceOf[js.Any], hasFeedback = hasFeedback.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelAlign = labelAlign.asInstanceOf[js.Any], labelCol = labelCol.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], validateStatus = validateStatus.asInstanceOf[js.Any], wrapperCol = wrapperCol.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_]
  }
}

