package typingsSlinky.saxes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XMLDecl extends StObject {
  
  /** The encoding specified by the XML declaration. */
  var encoding: js.UndefOr[String] = js.native
  
  /** The value of the standalone parameter */
  var standalone: js.UndefOr[String] = js.native
  
  /** The version specified by the XML declaration. */
  var version: js.UndefOr[String] = js.native
}
object XMLDecl {
  
  @scala.inline
  def apply(): XMLDecl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XMLDecl]
  }
  
  @scala.inline
  implicit class XMLDeclMutableBuilder[Self <: XMLDecl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    @scala.inline
    def setStandalone(value: String): Self = StObject.set(x, "standalone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandaloneUndefined: Self = StObject.set(x, "standalone", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
