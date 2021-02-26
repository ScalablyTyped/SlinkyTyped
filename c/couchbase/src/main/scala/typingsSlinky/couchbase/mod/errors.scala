package typingsSlinky.couchbase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait errors extends StObject
/**
  * Enumeration of all error codes. See libcouchbase documentation for more details on what these errors represent.
  */
@JSImport("couchbase", "errors")
@js.native
object errors extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[errors with Double] = js.native
  
  /** Authentication should continue. **/
  @js.native
  sealed trait authContinue extends errors
  /* 1 */ val authContinue: typingsSlinky.couchbase.mod.errors.authContinue with Double = js.native
  
  /** Error authenticating. **/
  @js.native
  sealed trait authError extends errors
  /* 2 */ val authError: typingsSlinky.couchbase.mod.errors.authError with Double = js.native
  
  /** A bad environment variable was specified. **/
  @js.native
  sealed trait badEnvironmentVariable extends errors
  /* 35 */ val badEnvironmentVariable: typingsSlinky.couchbase.mod.errors.badEnvironmentVariable with Double = js.native
  
  /** A bad handle was passed. **/
  @js.native
  sealed trait badHandle extends errors
  /* 29 */ val badHandle: typingsSlinky.couchbase.mod.errors.badHandle with Double = js.native
  
  /** The bucket you request was not found. **/
  @js.native
  sealed trait bukcketNotFound extends errors
  /* 26 */ val bukcketNotFound: typingsSlinky.couchbase.mod.errors.bukcketNotFound with Double = js.native
  
  /** An unknown error occured within libcouchbase. **/
  @js.native
  sealed trait cLibGenericError extends errors
  /* 10 */ val cLibGenericError: typingsSlinky.couchbase.mod.errors.cLibGenericError with Double = js.native
  
  /** Server is too busy to handle your request right now. **/
  @js.native
  sealed trait cLibInternal extends errors
  /* 6 */ val cLibInternal: typingsSlinky.couchbase.mod.errors.cLibInternal with Double = js.native
  
  /** The server is out of memory. **/
  @js.native
  sealed trait cLibOutOfMemory extends errors
  /* 8 */ val cLibOutOfMemory: typingsSlinky.couchbase.mod.errors.cLibOutOfMemory with Double = js.native
  
  /** An invalid arguement was passed. **/
  @js.native
  sealed trait cLinInvalidArgument extends errors
  /* 7 */ val cLinInvalidArgument: typingsSlinky.couchbase.mod.errors.cLinInvalidArgument with Double = js.native
  
  /** Not all operations completed successfully. **/
  @js.native
  sealed trait checkResults extends errors
  /* 39 */ val checkResults: typingsSlinky.couchbase.mod.errors.checkResults with Double = js.native
  
  /** libcouchbase is out of memory. **/
  @js.native
  sealed trait clientOutOfMemory extends errors
  /* 27 */ val clientOutOfMemory: typingsSlinky.couchbase.mod.errors.clientOutOfMemory with Double = js.native
  
  /** A temporary error occured in libcouchbase. Try again. **/
  @js.native
  sealed trait clientTemporaryError extends errors
  /* 28 */ val clientTemporaryError: typingsSlinky.couchbase.mod.errors.clientTemporaryError with Double = js.native
  
  /** Error connecting to the server. **/
  @js.native
  sealed trait connectError extends errors
  /* 25 */ val connectError: typingsSlinky.couchbase.mod.errors.connectError with Double = js.native
  
  /** The passed incr/decr delta was invalid. **/
  @js.native
  sealed trait deltaBadVal extends errors
  /* 3 */ val deltaBadVal: typingsSlinky.couchbase.mod.errors.deltaBadVal with Double = js.native
  
  /** Duplicate items. **/
  @js.native
  sealed trait duplicateItems extends errors
  /* 33 */ val duplicateItems: typingsSlinky.couchbase.mod.errors.duplicateItems with Double = js.native
  
  /** The specified durability requirements could not be satisfied. **/
  @js.native
  sealed trait durabilityFailed extends errors
  /* 41 */ val durabilityFailed: typingsSlinky.couchbase.mod.errors.durabilityFailed with Double = js.native
  
  /** Failed to find expected symbol in library. **/
  @js.native
  sealed trait failedToFindSymbol extends errors
  /* 15 */ val failedToFindSymbol: typingsSlinky.couchbase.mod.errors.failedToFindSymbol with Double = js.native
  
  /** Failed to open library. **/
  @js.native
  sealed trait failedToOpenLibrary extends errors
  /* 14 */ val failedToOpenLibrary: typingsSlinky.couchbase.mod.errors.failedToOpenLibrary with Double = js.native
  
  /** A generic error occured in Couchnode. **/
  @js.native
  sealed trait genericError extends errors
  /* 40 */ val genericError: typingsSlinky.couchbase.mod.errors.genericError with Double = js.native
  
  /** Invalid arguements were passed. **/
  @js.native
  sealed trait invalidArguments extends errors
  /* 37 */ val invalidArguments: typingsSlinky.couchbase.mod.errors.invalidArguments with Double = js.native
  
  /** The host format specified is invalid. **/
  @js.native
  sealed trait invalidHostFormat extends errors
  /* 31 */ val invalidHostFormat: typingsSlinky.couchbase.mod.errors.invalidHostFormat with Double = js.native
  
  /** An invalid range was specified. **/
  @js.native
  sealed trait invalidRange extends errors
  /* 9 */ val invalidRange: typingsSlinky.couchbase.mod.errors.invalidRange with Double = js.native
  
  /** The key already exists on the server. **/
  @js.native
  sealed trait keyAlreadyExists extends errors
  /* 12 */ val keyAlreadyExists: typingsSlinky.couchbase.mod.errors.keyAlreadyExists with Double = js.native
  
  /** The key does not exist on the server. **/
  @js.native
  sealed trait keyNotFound extends errors
  /* 13 */ val keyNotFound: typingsSlinky.couchbase.mod.errors.keyNotFound with Double = js.native
  
  /** A network error occured. **/
  @js.native
  sealed trait networkError extends errors
  /* 16 */ val networkError: typingsSlinky.couchbase.mod.errors.networkError with Double = js.native
  
  /** Key mapping failed and could not match a server. **/
  @js.native
  sealed trait noMatchingServerForKey extends errors
  /* 34 */ val noMatchingServerForKey: typingsSlinky.couchbase.mod.errors.noMatchingServerForKey with Double = js.native
  
  /**  Not enough nodes to meet the operations durability requirements. **/
  @js.native
  sealed trait notEnoughNodes extends errors
  /* 32 */ val notEnoughNodes: typingsSlinky.couchbase.mod.errors.notEnoughNodes with Double = js.native
  
  /** Operations were performed on the incorrect server. **/
  @js.native
  sealed trait notMyVBucket extends errors
  /* 18 */ val notMyVBucket: typingsSlinky.couchbase.mod.errors.notMyVBucket with Double = js.native
  
  /** The document was not stored. **/
  @js.native
  sealed trait notSorted extends errors
  /* 19 */ val notSorted: typingsSlinky.couchbase.mod.errors.notSorted with Double = js.native
  
  /** An unsupported operation was sent to the server. **/
  @js.native
  sealed trait notSupported extends errors
  /* 20 */ val notSupported: typingsSlinky.couchbase.mod.errors.notSupported with Double = js.native
  
  /** Object is too large to be stored on the cluster. **/
  @js.native
  sealed trait objectTooBig extends errors
  /* 4 */ val objectTooBig: typingsSlinky.couchbase.mod.errors.objectTooBig with Double = js.native
  
  /** Couchnode is out of memory. **/
  @js.native
  sealed trait outOfMemory extends errors
  /* 36 */ val outOfMemory: typingsSlinky.couchbase.mod.errors.outOfMemory with Double = js.native
  
  /** A protocol error occured. **/
  @js.native
  sealed trait protocolError extends errors
  /* 23 */ val protocolError: typingsSlinky.couchbase.mod.errors.protocolError with Double = js.native
  
  /** An error occured during a RESTful operation. **/
  @js.native
  sealed trait restError extends errors
  /* 42 */ val restError: typingsSlinky.couchbase.mod.errors.restError with Double = js.native
  
  /** An error occured while trying to schedule the operation. **/
  @js.native
  sealed trait schedulingError extends errors
  /* 38 */ val schedulingError: typingsSlinky.couchbase.mod.errors.schedulingError with Double = js.native
  
  /** A server bug caused the operation to fail. **/
  @js.native
  sealed trait serverBug extends errors
  /* 30 */ val serverBug: typingsSlinky.couchbase.mod.errors.serverBug with Double = js.native
  
  /** Operation was successful. **/
  @js.native
  sealed trait serverBusy extends errors
  /* 5 */ val serverBusy: typingsSlinky.couchbase.mod.errors.serverBusy with Double = js.native
  
  /** Operation was successful. **/
  @js.native
  sealed trait success extends errors
  /* 0 */ val success: typingsSlinky.couchbase.mod.errors.success with Double = js.native
  
  /** A temporary error occured. Try again. **/
  @js.native
  sealed trait temporaryError extends errors
  /* 11 */ val temporaryError: typingsSlinky.couchbase.mod.errors.temporaryError with Double = js.native
  
  /** The operation timed out. **/
  @js.native
  sealed trait timedOut extends errors
  /* 24 */ val timedOut: typingsSlinky.couchbase.mod.errors.timedOut with Double = js.native
  
  /** An unknown command was sent to the server. **/
  @js.native
  sealed trait unknownCommand extends errors
  /* 21 */ val unknownCommand: typingsSlinky.couchbase.mod.errors.unknownCommand with Double = js.native
  
  /** An unknown host was specified. **/
  @js.native
  sealed trait unknownHost extends errors
  /* 22 */ val unknownHost: typingsSlinky.couchbase.mod.errors.unknownHost with Double = js.native
  
  /** Operations were performed on the incorrect server. **/
  @js.native
  sealed trait wrongServer extends errors
  /* 17 */ val wrongServer: typingsSlinky.couchbase.mod.errors.wrongServer with Double = js.native
}
