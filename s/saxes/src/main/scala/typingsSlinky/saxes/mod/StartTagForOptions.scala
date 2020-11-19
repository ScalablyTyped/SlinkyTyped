package typingsSlinky.saxes.mod

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.saxes.mod.SaxesStartTag
  - typingsSlinky.saxes.mod.SaxesStartTagPlain
  - typingsSlinky.saxes.mod.SaxesStartTagNS
*/
trait StartTagForOptions[O /* <: SaxesOptions */] extends js.Object
object StartTagForOptions {
  
  @scala.inline
  def SaxesStartTag[O /* <: SaxesOptions */](attributes: Record[String, SaxesAttributeNS | String], name: String): StartTagForOptions[O] = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartTagForOptions[O]]
  }
  
  @scala.inline
  def SaxesStartTagPlain[O /* <: SaxesOptions */](attributes: Record[String, SaxesAttributeNS | String], name: String): StartTagForOptions[O] = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartTagForOptions[O]]
  }
  
  @scala.inline
  def SaxesStartTagNS[O /* <: SaxesOptions */](attributes: Record[String, SaxesAttributeNS | String], name: String, ns: Record[String, String]): StartTagForOptions[O] = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartTagForOptions[O]]
  }
}
