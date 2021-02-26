package typingsSlinky.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IObjectFileAndVersion extends StObject {
  
  val ObjectFile: IObjectFile = js.native
  
  val ObjectVersion: IObjectVersionAndProperties = js.native
}
object IObjectFileAndVersion {
  
  @scala.inline
  def apply(ObjectFile: IObjectFile, ObjectVersion: IObjectVersionAndProperties): IObjectFileAndVersion = {
    val __obj = js.Dynamic.literal(ObjectFile = ObjectFile.asInstanceOf[js.Any], ObjectVersion = ObjectVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObjectFileAndVersion]
  }
  
  @scala.inline
  implicit class IObjectFileAndVersionMutableBuilder[Self <: IObjectFileAndVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectFile(value: IObjectFile): Self = StObject.set(x, "ObjectFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectVersion(value: IObjectVersionAndProperties): Self = StObject.set(x, "ObjectVersion", value.asInstanceOf[js.Any])
  }
}
