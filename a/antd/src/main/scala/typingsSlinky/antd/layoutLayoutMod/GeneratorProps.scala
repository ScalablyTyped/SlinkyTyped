package typingsSlinky.antd.layoutLayoutMod

import typingsSlinky.antd.antdStrings.footer
import typingsSlinky.antd.antdStrings.header
import typingsSlinky.antd.antdStrings.main
import typingsSlinky.antd.antdStrings.section
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeneratorProps extends js.Object {
  var displayName: String
  var suffixCls: String
  var tagName: header | footer | main | section
}

object GeneratorProps {
  @scala.inline
  def apply(displayName: String, suffixCls: String, tagName: header | footer | main | section): GeneratorProps = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], suffixCls = suffixCls.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneratorProps]
  }
}

