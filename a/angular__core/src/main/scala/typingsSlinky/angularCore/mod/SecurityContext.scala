package typingsSlinky.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SecurityContext extends StObject
@JSImport("@angular/core", "SecurityContext")
@js.native
object SecurityContext extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SecurityContext with Double] = js.native
  
  @js.native
  sealed trait HTML extends SecurityContext
  /* 1 */ val HTML: typingsSlinky.angularCore.mod.SecurityContext.HTML with Double = js.native
  
  @js.native
  sealed trait NONE extends SecurityContext
  /* 0 */ val NONE: typingsSlinky.angularCore.mod.SecurityContext.NONE with Double = js.native
  
  @js.native
  sealed trait RESOURCE_URL extends SecurityContext
  /* 5 */ val RESOURCE_URL: typingsSlinky.angularCore.mod.SecurityContext.RESOURCE_URL with Double = js.native
  
  @js.native
  sealed trait SCRIPT extends SecurityContext
  /* 3 */ val SCRIPT: typingsSlinky.angularCore.mod.SecurityContext.SCRIPT with Double = js.native
  
  @js.native
  sealed trait STYLE extends SecurityContext
  /* 2 */ val STYLE: typingsSlinky.angularCore.mod.SecurityContext.STYLE with Double = js.native
  
  @js.native
  sealed trait URL extends SecurityContext
  /* 4 */ val URL: typingsSlinky.angularCore.mod.SecurityContext.URL with Double = js.native
}
