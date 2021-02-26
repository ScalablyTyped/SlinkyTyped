package typingsSlinky.reactNoSsr.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.ReactChild
import typingsSlinky.reactNoSsr.anon.OnSSR
import typingsSlinky.reactNoSsr.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNoSsr {
  
  @JSImport("react-no-ssr", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def onSSR(value: ReactChild): this.type = set("onSSR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onSSRReactElement(value: ReactElement): this.type = set("onSSR", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactNoSsr.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: OnSSR): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
