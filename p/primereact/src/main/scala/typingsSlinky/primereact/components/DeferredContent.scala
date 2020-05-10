package typingsSlinky.primereact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.primereact.deferredContentMod.DeferredContentProps
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DeferredContent {
  @JSImport("primereact/deferredcontent", "DeferredContent")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.primereact.primereactDeferredcontentMod.DeferredContent] {
    @scala.inline
    def onLoad(value: /* event */ Event_ => Unit): this.type = set("onLoad", js.Any.fromFunction1(value))
  }
  
  def withProps(p: DeferredContentProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: DeferredContent.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

