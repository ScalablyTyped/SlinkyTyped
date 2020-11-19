package typingsSlinky.rcTable.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.rcTable.bodyContextMod.BodyContextProps
import typingsSlinky.react.mod.ConsumerProps
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Consumer {
  
  @JSImport("rc-table/lib/context/BodyContext", "default.Consumer")
  @js.native
  object component extends js.Object
  
  def withProps(p: ConsumerProps[BodyContextProps[Record[String, js.Any]]]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(children: BodyContextProps[Record[String, js.Any]] => ReactElement): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ConsumerProps[BodyContextProps[Record[String, js.Any]]]]))
  }
}
