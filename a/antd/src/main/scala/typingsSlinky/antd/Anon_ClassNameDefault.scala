package typingsSlinky.antd

import typingsSlinky.antd.antdStrings.default
import typingsSlinky.antd.antdStrings.small
import typingsSlinky.propDashTypes.propDashTypesMod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassNameDefault extends js.Object {
  var className: Requireable[String]
  var prefixCls: Requireable[String]
  var size: Requireable[js.UndefOr[small | default]]
}

object Anon_ClassNameDefault {
  @scala.inline
  def apply(
    className: Requireable[String],
    prefixCls: Requireable[String],
    size: Requireable[js.UndefOr[small | default]]
  ): Anon_ClassNameDefault = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ClassNameDefault]
  }
}

