package typingsSlinky.activexFaxcomexlib.anon

import typingsSlinky.activexStdole.stdole.GUID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CNames extends StObject {
  
  val cNames: Double = js.native
  
  val lcid: Double = js.native
  
  var rgdispid: Double = js.native
  
  val rgszNames: Double = js.native
  
  val riid: GUID = js.native
}
object CNames {
  
  @scala.inline
  def apply(cNames: Double, lcid: Double, rgdispid: Double, rgszNames: Double, riid: GUID): CNames = {
    val __obj = js.Dynamic.literal(cNames = cNames.asInstanceOf[js.Any], lcid = lcid.asInstanceOf[js.Any], rgdispid = rgdispid.asInstanceOf[js.Any], rgszNames = rgszNames.asInstanceOf[js.Any], riid = riid.asInstanceOf[js.Any])
    __obj.asInstanceOf[CNames]
  }
  
  @scala.inline
  implicit class CNamesMutableBuilder[Self <: CNames] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCNames(value: Double): Self = StObject.set(x, "cNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLcid(value: Double): Self = StObject.set(x, "lcid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRgdispid(value: Double): Self = StObject.set(x, "rgdispid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRgszNames(value: Double): Self = StObject.set(x, "rgszNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRiid(value: GUID): Self = StObject.set(x, "riid", value.asInstanceOf[js.Any])
  }
}
