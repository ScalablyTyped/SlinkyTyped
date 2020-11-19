package typingsSlinky.babelParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DecoratorsPluginOptions extends js.Object {
  
  var decoratorsBeforeExport: js.UndefOr[Boolean] = js.native
}
object DecoratorsPluginOptions {
  
  @scala.inline
  def apply(): DecoratorsPluginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DecoratorsPluginOptions]
  }
  
  @scala.inline
  implicit class DecoratorsPluginOptionsOps[Self <: DecoratorsPluginOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDecoratorsBeforeExport(value: Boolean): Self = this.set("decoratorsBeforeExport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecoratorsBeforeExport: Self = this.set("decoratorsBeforeExport", js.undefined)
  }
}
