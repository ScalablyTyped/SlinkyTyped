package typingsSlinky.primereact.components

import org.scalajs.dom.raw.Event
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.primereact.deferredContentMod.DeferredContentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DeferredContent {
  
  @JSImport("primereact/deferredcontent", "DeferredContent")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.primereact.primereactDeferredcontentMod.DeferredContent] {
    
    @scala.inline
    def onLoad(value: /* event */ Event => Unit): this.type = set("onLoad", js.Any.fromFunction1(value))
  }
  
  implicit def make(companion: DeferredContent.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DeferredContentProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
