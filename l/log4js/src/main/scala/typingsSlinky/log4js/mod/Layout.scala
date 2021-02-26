package typingsSlinky.log4js.mod

import typingsSlinky.log4js.log4jsStrings.basic
import typingsSlinky.log4js.log4jsStrings.colored
import typingsSlinky.log4js.log4jsStrings.coloured
import typingsSlinky.log4js.log4jsStrings.dummy
import typingsSlinky.log4js.log4jsStrings.messagePassThrough
import typingsSlinky.log4js.log4jsStrings.pattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.log4js.mod.BaseLayout
  - typingsSlinky.log4js.mod.ColoredLayout
  - typingsSlinky.log4js.mod.MessagePassThroughLayout
  - typingsSlinky.log4js.mod.DummyLayout
  - typingsSlinky.log4js.mod.PatternLayout
  - typingsSlinky.log4js.mod.CustomLayout
*/
trait Layout extends StObject
object Layout {
  
  @scala.inline
  def BaseLayout(`type`: basic): typingsSlinky.log4js.mod.BaseLayout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.log4js.mod.BaseLayout]
  }
  
  @scala.inline
  def ColoredLayout(`type`: colored | coloured): typingsSlinky.log4js.mod.ColoredLayout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.log4js.mod.ColoredLayout]
  }
  
  @scala.inline
  def CustomLayout(`type`: String): typingsSlinky.log4js.mod.CustomLayout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.log4js.mod.CustomLayout]
  }
  
  @scala.inline
  def DummyLayout(`type`: dummy): typingsSlinky.log4js.mod.DummyLayout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.log4js.mod.DummyLayout]
  }
  
  @scala.inline
  def MessagePassThroughLayout(`type`: messagePassThrough): typingsSlinky.log4js.mod.MessagePassThroughLayout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.log4js.mod.MessagePassThroughLayout]
  }
  
  @scala.inline
  def PatternLayout(pattern: String, `type`: pattern): typingsSlinky.log4js.mod.PatternLayout = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.log4js.mod.PatternLayout]
  }
}
