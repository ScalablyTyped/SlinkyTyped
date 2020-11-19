package typingsSlinky.cswAasJs.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.cswAasJs.checkLoginMod.CheckLoginProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CheckLogin {
  
  @JSImport("csw-aas-js", "CheckLogin")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def error(value: ReactElement): this.type = set("error", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CheckLoginProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: CheckLogin.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
