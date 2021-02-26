package typingsSlinky.log4js.mod

import typingsSlinky.log4js.log4jsStrings.colored
import typingsSlinky.log4js.log4jsStrings.coloured
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColoredLayout extends Layout {
  
  var `type`: colored | coloured = js.native
}
object ColoredLayout {
  
  @scala.inline
  def apply(`type`: colored | coloured): ColoredLayout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColoredLayout]
  }
  
  @scala.inline
  implicit class ColoredLayoutMutableBuilder[Self <: ColoredLayout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: colored | coloured): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
