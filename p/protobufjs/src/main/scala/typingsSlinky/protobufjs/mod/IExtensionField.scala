package typingsSlinky.protobufjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IExtensionField
  extends AnyExtensionField
     with IField {
  
  /** Extended type */
  var extend: String = js.native
}
object IExtensionField {
  
  @scala.inline
  def apply(extend: String, id: Double, `type`: String): IExtensionField = {
    val __obj = js.Dynamic.literal(extend = extend.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExtensionField]
  }
  
  @scala.inline
  implicit class IExtensionFieldMutableBuilder[Self <: IExtensionField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: String): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
  }
}
