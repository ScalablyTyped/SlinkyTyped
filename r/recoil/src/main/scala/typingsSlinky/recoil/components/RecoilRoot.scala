package typingsSlinky.recoil.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.recoil.anon.Set
import typingsSlinky.recoil.mod.RecoilRootProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RecoilRoot {
  
  @JSImport("recoil", "RecoilRoot")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def initializeState(value: /* options */ Set => Unit): this.type = set("initializeState", js.Any.fromFunction1(value))
  }
  
  implicit def make(companion: RecoilRoot.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: RecoilRootProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
