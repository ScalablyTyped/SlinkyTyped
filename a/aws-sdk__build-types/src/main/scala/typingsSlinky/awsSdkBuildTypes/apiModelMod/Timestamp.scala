package typingsSlinky.awsSdkBuildTypes.apiModelMod

import typingsSlinky.awsSdkBuildTypes.awsSdkBuildTypesStrings.timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Timestamp
  extends ShapeDef
     with Shape {
  
  var timestampFormat: js.UndefOr[java.lang.String] = js.native
  
  @JSName("type")
  val type_Timestamp: timestamp = js.native
}
object Timestamp {
  
  @scala.inline
  def apply(`type`: timestamp): Timestamp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Timestamp]
  }
  
  @scala.inline
  implicit class TimestampMutableBuilder[Self <: Timestamp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTimestampFormat(value: java.lang.String): Self = StObject.set(x, "timestampFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampFormatUndefined: Self = StObject.set(x, "timestampFormat", js.undefined)
    
    @scala.inline
    def setType(value: timestamp): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
