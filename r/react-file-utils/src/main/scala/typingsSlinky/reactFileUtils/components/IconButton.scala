package typingsSlinky.reactFileUtils.components

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import slinky.core.SyntheticEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactFileUtils.anon.OnClick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object IconButton {
  
  @JSImport("react-file-utils", "IconButton")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactFileUtils.mod.IconButton] {
    
    @scala.inline
    def onClick(value: /* e */ SyntheticEvent[Event, Element] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
  }
  
  implicit def make(companion: IconButton.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: OnClick): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
