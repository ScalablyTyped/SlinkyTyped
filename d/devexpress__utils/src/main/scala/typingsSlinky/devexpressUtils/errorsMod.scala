package typingsSlinky.devexpressUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorsMod {
  
  @JSImport("@devexpress/utils/lib/errors", "Errors")
  @js.native
  class Errors () extends StObject
  /* static members */
  object Errors {
    
    @JSImport("@devexpress/utils/lib/errors", "Errors")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@devexpress/utils/lib/errors", "Errors.InternalException")
    @js.native
    def InternalException: String = js.native
    @scala.inline
    def InternalException_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InternalException")(x.asInstanceOf[js.Any])
    
    @JSImport("@devexpress/utils/lib/errors", "Errors.NotImplemented")
    @js.native
    def NotImplemented: String = js.native
    @scala.inline
    def NotImplemented_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NotImplemented")(x.asInstanceOf[js.Any])
    
    @JSImport("@devexpress/utils/lib/errors", "Errors.ValueCannotBeNull")
    @js.native
    def ValueCannotBeNull: String = js.native
    @scala.inline
    def ValueCannotBeNull_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ValueCannotBeNull")(x.asInstanceOf[js.Any])
    
    @JSImport("@devexpress/utils/lib/errors", "Errors.internalExceptionTemplate")
    @js.native
    def internalExceptionTemplate(str: String): String = js.native
  }
}
