package typingsSlinky.saxes.mod

import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.saxes.mod.SaxesTag
  - typingsSlinky.saxes.mod.SaxesTagPlain
  - typingsSlinky.saxes.mod.SaxesTagNS
*/
trait TagForOptions[O /* <: SaxesOptions */] extends StObject
object TagForOptions {
  
  @scala.inline
  def SaxesTag(attributes: Record[String, SaxesAttributeNS | String], isSelfClosing: Boolean, name: String): typingsSlinky.saxes.mod.SaxesTag = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], isSelfClosing = isSelfClosing.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.saxes.mod.SaxesTag]
  }
  
  @scala.inline
  def SaxesTagNS(
    attributes: (Record[String, SaxesAttributeNS | String]) with (Record[String, SaxesAttributeNS]),
    isSelfClosing: Boolean,
    local: String,
    name: String,
    ns: Record[String, String],
    prefix: String,
    uri: String
  ): typingsSlinky.saxes.mod.SaxesTagNS = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], isSelfClosing = isSelfClosing.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.saxes.mod.SaxesTagNS]
  }
  
  @scala.inline
  def SaxesTagPlain(
    attributes: (Record[String, SaxesAttributeNS | String]) with (Record[String, String]),
    isSelfClosing: Boolean,
    name: String
  ): typingsSlinky.saxes.mod.SaxesTagPlain = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], isSelfClosing = isSelfClosing.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.saxes.mod.SaxesTagPlain]
  }
}
