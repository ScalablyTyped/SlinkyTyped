package typingsSlinky.googleCloudCommon.utilMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PackageJson extends StObject {
  
  var name: String = js.native
  
  var version: String = js.native
}
object PackageJson {
  
  @scala.inline
  def apply(name: String, version: String): PackageJson = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageJson]
  }
  
  @scala.inline
  implicit class PackageJsonMutableBuilder[Self <: PackageJson] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
