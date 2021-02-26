package typingsSlinky.fortawesomeFontawesomeSvgCore.mod

import org.scalajs.dom.raw.HTMLCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Layer_ extends FontawesomeObject {
  
  val `type`: typingsSlinky.fortawesomeFontawesomeSvgCore.fortawesomeFontawesomeSvgCoreStrings.layer = js.native
}
object Layer_ {
  
  @scala.inline
  def apply(
    `abstract`: js.Array[AbstractElement],
    html: js.Array[String],
    node: HTMLCollection,
    `type`: typingsSlinky.fortawesomeFontawesomeSvgCore.fortawesomeFontawesomeSvgCoreStrings.layer
  ): Layer_ = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.updateDynamic("abstract")(`abstract`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layer_]
  }
  
  @scala.inline
  implicit class Layer_MutableBuilder[Self <: Layer_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typingsSlinky.fortawesomeFontawesomeSvgCore.fortawesomeFontawesomeSvgCoreStrings.layer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
