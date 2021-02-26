package typingsSlinky.microsoftLiveConnect.Microsoft.Live

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Sub object of REST objects that contains information about who the
  * item is shared with.
  */
@js.native
trait ISharedWith extends StObject {
  
  /**
    * A localized string that contains info about who can access the
    * item. The options are:
    * - People I selected
    * - Just me
    * - Everyone (public)
    * - Friends
    * - My friends and their friends
    * - People with a link
    * The default is Just me.
    */
  var access: String = js.native
}
object ISharedWith {
  
  @scala.inline
  def apply(access: String): ISharedWith = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISharedWith]
  }
  
  @scala.inline
  implicit class ISharedWithMutableBuilder[Self <: ISharedWith] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccess(value: String): Self = StObject.set(x, "access", value.asInstanceOf[js.Any])
  }
}
