package typingsSlinky.awsSdk.docdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tag extends StObject {
  
  /**
    * The required name of the tag. The string value can be from 1 to 128 Unicode characters in length and can't be prefixed with "aws:" or "rds:". The string can contain only the set of Unicode letters, digits, white space, '_', '.', '/', '=', '+', '-' (Java regex: "^([\\p{L}\\p{Z}\\p{N}_.:/=+\\-]*)$").
    */
  var Key: js.UndefOr[String] = js.native
  
  /**
    * The optional value of the tag. The string value can be from 1 to 256 Unicode characters in length and can't be prefixed with "aws:" or "rds:". The string can contain only the set of Unicode letters, digits, white space, '_', '.', '/', '=', '+', '-' (Java regex: "^([\\p{L}\\p{Z}\\p{N}_.:/=+\\-]*)$").
    */
  var Value: js.UndefOr[String] = js.native
}
object Tag {
  
  @scala.inline
  def apply(): Tag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tag]
  }
  
  @scala.inline
  implicit class TagMutableBuilder[Self <: Tag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
