package typingsSlinky.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Property_ extends StObject {
  
  val basename: String = js.native
  
  val custom: Boolean = js.native
  
  val hack: String = js.native
  
  val name: String = js.native
  
  val prefix: String = js.native
  
  val vendor: String = js.native
}
object Property_ {
  
  @scala.inline
  def apply(basename: String, custom: Boolean, hack: String, name: String, prefix: String, vendor: String): Property_ = {
    val __obj = js.Dynamic.literal(basename = basename.asInstanceOf[js.Any], custom = custom.asInstanceOf[js.Any], hack = hack.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Property_]
  }
  
  @scala.inline
  implicit class Property_MutableBuilder[Self <: Property_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustom(value: Boolean): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHack(value: String): Self = StObject.set(x, "hack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
  }
}
