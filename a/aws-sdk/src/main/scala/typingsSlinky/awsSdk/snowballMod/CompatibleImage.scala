package typingsSlinky.awsSdk.snowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompatibleImage extends StObject {
  
  /**
    * The unique identifier for an individual Snow device AMI.
    */
  var AmiId: js.UndefOr[String] = js.native
  
  /**
    * The optional name of a compatible image.
    */
  var Name: js.UndefOr[String] = js.native
}
object CompatibleImage {
  
  @scala.inline
  def apply(): CompatibleImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompatibleImage]
  }
  
  @scala.inline
  implicit class CompatibleImageMutableBuilder[Self <: CompatibleImage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmiId(value: String): Self = StObject.set(x, "AmiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmiIdUndefined: Self = StObject.set(x, "AmiId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
