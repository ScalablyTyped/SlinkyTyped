package typingsSlinky.meteor.anon

import typingsSlinky.meteor.Mongo.CurrentDateModifier
import typingsSlinky.meteor.meteorStrings.date
import typingsSlinky.meteor.meteorStrings.timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Type
  extends CurrentDateModifier
     with typingsSlinky.meteor.mongoMod.Mongo.CurrentDateModifier {
  
  @JSName("$type")
  var $type: timestamp | date = js.native
}
object Type {
  
  @scala.inline
  def apply($type: timestamp | date): Type = {
    val __obj = js.Dynamic.literal($type = $type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  
  @scala.inline
  implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$type(value: timestamp | date): Self = StObject.set(x, "$type", value.asInstanceOf[js.Any])
  }
}
