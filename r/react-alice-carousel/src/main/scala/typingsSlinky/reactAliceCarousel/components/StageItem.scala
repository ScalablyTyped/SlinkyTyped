package typingsSlinky.reactAliceCarousel.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactAliceCarousel.anon.ClassName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StageItem {
  
  @JSImport("react-alice-carousel/lib/views", "StageItem")
  @js.native
  object component extends js.Object
  
  def withProps(p: ClassName): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(className: js.Any, item: js.Any, styles: js.Any): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(className = className.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ClassName]))
  }
}
