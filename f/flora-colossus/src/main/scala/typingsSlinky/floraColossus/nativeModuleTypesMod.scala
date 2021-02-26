package typingsSlinky.floraColossus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeModuleTypesMod {
  
  @js.native
  sealed trait NativeModuleType extends StObject
  @JSImport("flora-colossus/lib/nativeModuleTypes", "NativeModuleType")
  @js.native
  object NativeModuleType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[NativeModuleType with Double] = js.native
    
    @js.native
    sealed trait NODE_GYP extends NativeModuleType
    /* 1 */ val NODE_GYP: typingsSlinky.floraColossus.nativeModuleTypesMod.NativeModuleType.NODE_GYP with Double = js.native
    
    @js.native
    sealed trait NONE extends NativeModuleType
    /* 0 */ val NONE: typingsSlinky.floraColossus.nativeModuleTypesMod.NativeModuleType.NONE with Double = js.native
    
    @js.native
    sealed trait PREBUILD extends NativeModuleType
    /* 2 */ val PREBUILD: typingsSlinky.floraColossus.nativeModuleTypesMod.NativeModuleType.PREBUILD with Double = js.native
  }
}
