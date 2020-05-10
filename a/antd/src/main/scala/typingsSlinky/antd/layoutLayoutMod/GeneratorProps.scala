package typingsSlinky.antd.layoutLayoutMod

import typingsSlinky.antd.antdStrings.footer
import typingsSlinky.antd.antdStrings.header
import typingsSlinky.antd.antdStrings.main
import typingsSlinky.antd.antdStrings.section
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeneratorProps extends js.Object {
  var displayName: String = js.native
  var suffixCls: String = js.native
  var tagName: header | footer | main | section = js.native
}

object GeneratorProps {
  @scala.inline
  def apply(displayName: String, suffixCls: String, tagName: header | footer | main | section): GeneratorProps = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], suffixCls = suffixCls.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneratorProps]
  }
  @scala.inline
  implicit class GeneratorPropsOps[Self <: GeneratorProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuffixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTagName(value: header | footer | main | section): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

