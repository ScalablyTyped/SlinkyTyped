package typingsSlinky.antDesignPro.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignPro.authorizedMod.IAuthorizedProps
import typingsSlinky.antDesignPro.authorizedRouteMod.authority
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Authorized {
  
  @scala.inline
  def apply(authority: authority): Builder = {
    val __props = js.Dynamic.literal(authority = authority.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IAuthorizedProps]))
  }
  
  @JSImport("ant-design-pro/lib/Authorized", "Authorized")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antDesignPro.authorizedMod.Authorized] {
    
    @scala.inline
    def noMatch(value: ReactElement): this.type = set("noMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def noMatchReactElement(value: ReactElement): this.type = set("noMatch", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IAuthorizedProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
