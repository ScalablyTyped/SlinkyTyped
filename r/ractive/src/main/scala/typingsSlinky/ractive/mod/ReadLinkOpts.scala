package typingsSlinky.ractive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadLinkOpts extends StObject {
  
  /** Whether or not to follow through any upstream links when resolving the source. */
  var canonical: js.UndefOr[Boolean] = js.native
}
object ReadLinkOpts {
  
  @scala.inline
  def apply(): ReadLinkOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadLinkOpts]
  }
  
  @scala.inline
  implicit class ReadLinkOptsMutableBuilder[Self <: ReadLinkOpts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanonical(value: Boolean): Self = StObject.set(x, "canonical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanonicalUndefined: Self = StObject.set(x, "canonical", js.undefined)
  }
}
