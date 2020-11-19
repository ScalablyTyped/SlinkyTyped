package typingsSlinky.reactJss.mod

import typingsSlinky.jss.mod.Jss
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WithStylesOptions extends BaseOptions[DefaultTheme] {
  
  var injectTheme: js.UndefOr[Boolean] = js.native
  
  var jss: js.UndefOr[Jss] = js.native
}
object WithStylesOptions {
  
  @scala.inline
  def apply(): WithStylesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WithStylesOptions]
  }
  
  @scala.inline
  implicit class WithStylesOptionsOps[Self <: WithStylesOptions] (val x: Self) extends AnyVal {
    
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
    def setInjectTheme(value: Boolean): Self = this.set("injectTheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInjectTheme: Self = this.set("injectTheme", js.undefined)
    
    @scala.inline
    def setJss(value: Jss): Self = this.set("jss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJss: Self = this.set("jss", js.undefined)
  }
}
