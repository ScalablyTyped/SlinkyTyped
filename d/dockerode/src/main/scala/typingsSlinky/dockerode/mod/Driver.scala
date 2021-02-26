package typingsSlinky.dockerode.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Driver extends StObject {
  
  var Name: String = js.native
  
  var Options: js.UndefOr[StringDictionary[String]] = js.native
}
object Driver {
  
  @scala.inline
  def apply(Name: String): Driver = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Driver]
  }
  
  @scala.inline
  implicit class DriverMutableBuilder[Self <: Driver] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: StringDictionary[String]): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "Options", js.undefined)
  }
}
