package typingsSlinky.cassandraDriver.typesMod.types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait responseErrorCodes extends StObject
@JSImport("cassandra-driver/lib/types", "types.responseErrorCodes")
@js.native
object responseErrorCodes extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[responseErrorCodes with Double] = js.native
  
  @js.native
  sealed trait alreadyExists extends responseErrorCodes
  /* 0x2400 */ val alreadyExists: typingsSlinky.cassandraDriver.typesMod.types.responseErrorCodes.alreadyExists with Double = js.native
  
  @js.native
  sealed trait badCredentials extends responseErrorCodes
  /* 0x0100 */ val badCredentials: typingsSlinky.cassandraDriver.typesMod.types.responseErrorCodes.badCredentials with Double = js.native
  
  @js.native
  sealed trait clientWriteFailure extends responseErrorCodes
  /* 0x8000 */ val clientWriteFailure: typingsSlinky.cassandraDriver.typesMod.types.responseErrorCodes.clientWriteFailure with Double = js.native
  
  @js.native
  sealed trait configError extends responseErrorCodes
  /* 0x2300 */ val configError: typingsSlinky.cassandraDriver.typesMod.types.responseErrorCodes.configError with Double = js.native
  
  @js.native
  sealed trait functionFailure extends responseErrorCodes
  /* 0x1400 */ val functionFailure: typingsSlinky.cassandraDriver.typesMod.types.responseErrorCodes.functionFailure with Double = js.native
  
  @js.native
  sealed trait invalid extends responseErrorCodes
  /* 0x2200 */ val invalid: typingsSlinky.cassandraDriver.typesMod.types.responseErrorCodes.invalid with Double = js.native
  
  @js.native
  sealed trait isBootstrapping extends responseErrorCodes
  /* 0x1002 */ val isBootstrapping: typingsSlinky.cassandraDriver.typesMod.types.responseErrorCodes.isBootstrapping with Double = js.native
  
  @js.native
  sealed trait overloaded extends responseErrorCodes
  /* 0x1001 */ val overloaded: typingsSlinky.cassandraDriver.typesMod.types.responseErrorCodes.overloaded with Double = js.native
  
  @js.native
  sealed trait protocolError extends responseErrorCodes
  /* 0x000A */ val protocolError: typingsSlinky.cassandraDriver.typesMod.types.responseErrorCodes.protocolError with Double = js.native
  
  @js.native
  sealed trait readFailure extends responseErrorCodes
  /* 0x1300 */ val readFailure: typingsSlinky.cassandraDriver.typesMod.types.responseErrorCodes.readFailure with Double = js.native
  
  @js.native
  sealed trait readTimeout extends responseErrorCodes
  /* 0x1200 */ val readTimeout: typingsSlinky.cassandraDriver.typesMod.types.responseErrorCodes.readTimeout with Double = js.native
  
  @js.native
  sealed trait serverError extends responseErrorCodes
  /* 0x0000 */ val serverError: typingsSlinky.cassandraDriver.typesMod.types.responseErrorCodes.serverError with Double = js.native
  
  @js.native
  sealed trait syntaxError extends responseErrorCodes
  /* 0x2000 */ val syntaxError: typingsSlinky.cassandraDriver.typesMod.types.responseErrorCodes.syntaxError with Double = js.native
  
  @js.native
  sealed trait truncateError extends responseErrorCodes
  /* 0x1003 */ val truncateError: typingsSlinky.cassandraDriver.typesMod.types.responseErrorCodes.truncateError with Double = js.native
  
  @js.native
  sealed trait unauthorized extends responseErrorCodes
  /* 0x2100 */ val unauthorized: typingsSlinky.cassandraDriver.typesMod.types.responseErrorCodes.unauthorized with Double = js.native
  
  @js.native
  sealed trait unavailableException extends responseErrorCodes
  /* 0x1000 */ val unavailableException: typingsSlinky.cassandraDriver.typesMod.types.responseErrorCodes.unavailableException with Double = js.native
  
  @js.native
  sealed trait unprepared extends responseErrorCodes
  /* 0x2500 */ val unprepared: typingsSlinky.cassandraDriver.typesMod.types.responseErrorCodes.unprepared with Double = js.native
  
  @js.native
  sealed trait writeFailure extends responseErrorCodes
  /* 0x1500 */ val writeFailure: typingsSlinky.cassandraDriver.typesMod.types.responseErrorCodes.writeFailure with Double = js.native
  
  @js.native
  sealed trait writeTimeout extends responseErrorCodes
  /* 0x1100 */ val writeTimeout: typingsSlinky.cassandraDriver.typesMod.types.responseErrorCodes.writeTimeout with Double = js.native
}
