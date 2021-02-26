package typingsSlinky.googleGax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statusMod {
  
  @js.native
  sealed trait Status extends StObject
  @JSImport("google-gax/build/src/status", "Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status with Double] = js.native
    
    @js.native
    sealed trait ABORTED extends Status
    /* 10 */ val ABORTED: typingsSlinky.googleGax.statusMod.Status.ABORTED with Double = js.native
    
    @js.native
    sealed trait ALREADY_EXISTS extends Status
    /* 6 */ val ALREADY_EXISTS: typingsSlinky.googleGax.statusMod.Status.ALREADY_EXISTS with Double = js.native
    
    @js.native
    sealed trait CANCELLED extends Status
    /* 1 */ val CANCELLED: typingsSlinky.googleGax.statusMod.Status.CANCELLED with Double = js.native
    
    @js.native
    sealed trait DATA_LOSS extends Status
    /* 15 */ val DATA_LOSS: typingsSlinky.googleGax.statusMod.Status.DATA_LOSS with Double = js.native
    
    @js.native
    sealed trait DEADLINE_EXCEEDED extends Status
    /* 4 */ val DEADLINE_EXCEEDED: typingsSlinky.googleGax.statusMod.Status.DEADLINE_EXCEEDED with Double = js.native
    
    @js.native
    sealed trait FAILED_PRECONDITION extends Status
    /* 9 */ val FAILED_PRECONDITION: typingsSlinky.googleGax.statusMod.Status.FAILED_PRECONDITION with Double = js.native
    
    @js.native
    sealed trait INTERNAL extends Status
    /* 13 */ val INTERNAL: typingsSlinky.googleGax.statusMod.Status.INTERNAL with Double = js.native
    
    @js.native
    sealed trait INVALID_ARGUMENT extends Status
    /* 3 */ val INVALID_ARGUMENT: typingsSlinky.googleGax.statusMod.Status.INVALID_ARGUMENT with Double = js.native
    
    @js.native
    sealed trait NOT_FOUND extends Status
    /* 5 */ val NOT_FOUND: typingsSlinky.googleGax.statusMod.Status.NOT_FOUND with Double = js.native
    
    @js.native
    sealed trait OK extends Status
    /* 0 */ val OK: typingsSlinky.googleGax.statusMod.Status.OK with Double = js.native
    
    @js.native
    sealed trait OUT_OF_RANGE extends Status
    /* 11 */ val OUT_OF_RANGE: typingsSlinky.googleGax.statusMod.Status.OUT_OF_RANGE with Double = js.native
    
    @js.native
    sealed trait PERMISSION_DENIED extends Status
    /* 7 */ val PERMISSION_DENIED: typingsSlinky.googleGax.statusMod.Status.PERMISSION_DENIED with Double = js.native
    
    @js.native
    sealed trait RESOURCE_EXHAUSTED extends Status
    /* 8 */ val RESOURCE_EXHAUSTED: typingsSlinky.googleGax.statusMod.Status.RESOURCE_EXHAUSTED with Double = js.native
    
    @js.native
    sealed trait UNAUTHENTICATED extends Status
    /* 16 */ val UNAUTHENTICATED: typingsSlinky.googleGax.statusMod.Status.UNAUTHENTICATED with Double = js.native
    
    @js.native
    sealed trait UNAVAILABLE extends Status
    /* 14 */ val UNAVAILABLE: typingsSlinky.googleGax.statusMod.Status.UNAVAILABLE with Double = js.native
    
    @js.native
    sealed trait UNIMPLEMENTED extends Status
    /* 12 */ val UNIMPLEMENTED: typingsSlinky.googleGax.statusMod.Status.UNIMPLEMENTED with Double = js.native
    
    @js.native
    sealed trait UNKNOWN extends Status
    /* 2 */ val UNKNOWN: typingsSlinky.googleGax.statusMod.Status.UNKNOWN with Double = js.native
  }
}
