package typingsSlinky.jsrsasign.anon

import typingsSlinky.jsrsasign.jsrsasignStrings.gen
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined jsrsasign.jsrsasign.KJUR.asn1.StringParam & {  type :'gen' | undefined} */
@js.native
trait StringParamtypegenundefin extends StObject {
  
  var str: String = js.native
  
  var `type`: js.UndefOr[gen] = js.native
}
object StringParamtypegenundefin {
  
  @scala.inline
  def apply(str: String): StringParamtypegenundefin = {
    val __obj = js.Dynamic.literal(str = str.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringParamtypegenundefin]
  }
  
  @scala.inline
  implicit class StringParamtypegenundefinMutableBuilder[Self <: StringParamtypegenundefin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStr(value: String): Self = StObject.set(x, "str", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: gen): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
