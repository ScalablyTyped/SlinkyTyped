package typingsSlinky.cspHtmlWebpackPlugin.mod.htmlWebpackPluginAugmentingMod

import typingsSlinky.cspHtmlWebpackPlugin.anon.AdditionalOptionspolicyPo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var cspPlugin: js.UndefOr[AdditionalOptionspolicyPo] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setCspPlugin(value: AdditionalOptionspolicyPo): Self = this.set("cspPlugin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCspPlugin: Self = this.set("cspPlugin", js.undefined)
  }
}
