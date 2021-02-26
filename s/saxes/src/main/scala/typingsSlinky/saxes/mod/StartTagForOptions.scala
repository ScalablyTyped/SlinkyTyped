package typingsSlinky.saxes.mod

import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.saxes.mod.SaxesStartTag
  - typingsSlinky.saxes.mod.SaxesStartTagPlain
  - typingsSlinky.saxes.mod.SaxesStartTagNS
*/
trait StartTagForOptions[O /* <: SaxesOptions */] extends StObject
object StartTagForOptions {
  
  @scala.inline
  def SaxesStartTag(attributes: Record[String, SaxesAttributeNS | String], name: String): typingsSlinky.saxes.mod.SaxesStartTag = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.saxes.mod.SaxesStartTag]
  }
  
  @scala.inline
  def SaxesStartTagNS(attributes: Record[String, SaxesAttributeNS | String], name: String, ns: Record[String, String]): typingsSlinky.saxes.mod.SaxesStartTagNS = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.saxes.mod.SaxesStartTagNS]
  }
  
  @scala.inline
  def SaxesStartTagPlain(attributes: Record[String, SaxesAttributeNS | String], name: String): typingsSlinky.saxes.mod.SaxesStartTagPlain = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.saxes.mod.SaxesStartTagPlain]
  }
}
