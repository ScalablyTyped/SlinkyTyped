package typingsSlinky.couchbase.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait errors extends js.Object
/**
  * Enumeration of all error codes. See libcouchbase documentation for more details on what these errors represent.
  */
@JSImport("couchbase", "errors")
@js.native
object errors extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[errors with Double] = js.native
  
  /** Authentication should continue. **/
  @js.native
  sealed trait authContinue extends errors
  /* 1 */ @js.native
  object authContinue extends TopLevel[authContinue with Double]
  
  /** Error authenticating. **/
  @js.native
  sealed trait authError extends errors
  /* 2 */ @js.native
  object authError extends TopLevel[authError with Double]
  
  /** A bad environment variable was specified. **/
  @js.native
  sealed trait badEnvironmentVariable extends errors
  /* 35 */ @js.native
  object badEnvironmentVariable extends TopLevel[badEnvironmentVariable with Double]
  
  /** A bad handle was passed. **/
  @js.native
  sealed trait badHandle extends errors
  /* 29 */ @js.native
  object badHandle extends TopLevel[badHandle with Double]
  
  /** The bucket you request was not found. **/
  @js.native
  sealed trait bukcketNotFound extends errors
  /* 26 */ @js.native
  object bukcketNotFound extends TopLevel[bukcketNotFound with Double]
  
  /** An unknown error occured within libcouchbase. **/
  @js.native
  sealed trait cLibGenericError extends errors
  /* 10 */ @js.native
  object cLibGenericError extends TopLevel[cLibGenericError with Double]
  
  /** Server is too busy to handle your request right now. **/
  @js.native
  sealed trait cLibInternal extends errors
  /* 6 */ @js.native
  object cLibInternal extends TopLevel[cLibInternal with Double]
  
  /** The server is out of memory. **/
  @js.native
  sealed trait cLibOutOfMemory extends errors
  /* 8 */ @js.native
  object cLibOutOfMemory extends TopLevel[cLibOutOfMemory with Double]
  
  /** An invalid arguement was passed. **/
  @js.native
  sealed trait cLinInvalidArgument extends errors
  /* 7 */ @js.native
  object cLinInvalidArgument extends TopLevel[cLinInvalidArgument with Double]
  
  /** Not all operations completed successfully. **/
  @js.native
  sealed trait checkResults extends errors
  /* 39 */ @js.native
  object checkResults extends TopLevel[checkResults with Double]
  
  /** libcouchbase is out of memory. **/
  @js.native
  sealed trait clientOutOfMemory extends errors
  /* 27 */ @js.native
  object clientOutOfMemory extends TopLevel[clientOutOfMemory with Double]
  
  /** A temporary error occured in libcouchbase. Try again. **/
  @js.native
  sealed trait clientTemporaryError extends errors
  /* 28 */ @js.native
  object clientTemporaryError extends TopLevel[clientTemporaryError with Double]
  
  /** Error connecting to the server. **/
  @js.native
  sealed trait connectError extends errors
  /* 25 */ @js.native
  object connectError extends TopLevel[connectError with Double]
  
  /** The passed incr/decr delta was invalid. **/
  @js.native
  sealed trait deltaBadVal extends errors
  /* 3 */ @js.native
  object deltaBadVal extends TopLevel[deltaBadVal with Double]
  
  /** Duplicate items. **/
  @js.native
  sealed trait duplicateItems extends errors
  /* 33 */ @js.native
  object duplicateItems extends TopLevel[duplicateItems with Double]
  
  /** The specified durability requirements could not be satisfied. **/
  @js.native
  sealed trait durabilityFailed extends errors
  /* 41 */ @js.native
  object durabilityFailed extends TopLevel[durabilityFailed with Double]
  
  /** Failed to find expected symbol in library. **/
  @js.native
  sealed trait failedToFindSymbol extends errors
  /* 15 */ @js.native
  object failedToFindSymbol extends TopLevel[failedToFindSymbol with Double]
  
  /** Failed to open library. **/
  @js.native
  sealed trait failedToOpenLibrary extends errors
  /* 14 */ @js.native
  object failedToOpenLibrary extends TopLevel[failedToOpenLibrary with Double]
  
  /** A generic error occured in Couchnode. **/
  @js.native
  sealed trait genericError extends errors
  /* 40 */ @js.native
  object genericError extends TopLevel[genericError with Double]
  
  /** Invalid arguements were passed. **/
  @js.native
  sealed trait invalidArguments extends errors
  /* 37 */ @js.native
  object invalidArguments extends TopLevel[invalidArguments with Double]
  
  /** The host format specified is invalid. **/
  @js.native
  sealed trait invalidHostFormat extends errors
  /* 31 */ @js.native
  object invalidHostFormat extends TopLevel[invalidHostFormat with Double]
  
  /** An invalid range was specified. **/
  @js.native
  sealed trait invalidRange extends errors
  /* 9 */ @js.native
  object invalidRange extends TopLevel[invalidRange with Double]
  
  /** The key already exists on the server. **/
  @js.native
  sealed trait keyAlreadyExists extends errors
  /* 12 */ @js.native
  object keyAlreadyExists extends TopLevel[keyAlreadyExists with Double]
  
  /** The key does not exist on the server. **/
  @js.native
  sealed trait keyNotFound extends errors
  /* 13 */ @js.native
  object keyNotFound extends TopLevel[keyNotFound with Double]
  
  /** A network error occured. **/
  @js.native
  sealed trait networkError extends errors
  /* 16 */ @js.native
  object networkError extends TopLevel[networkError with Double]
  
  /** Key mapping failed and could not match a server. **/
  @js.native
  sealed trait noMatchingServerForKey extends errors
  /* 34 */ @js.native
  object noMatchingServerForKey extends TopLevel[noMatchingServerForKey with Double]
  
  /**  Not enough nodes to meet the operations durability requirements. **/
  @js.native
  sealed trait notEnoughNodes extends errors
  /* 32 */ @js.native
  object notEnoughNodes extends TopLevel[notEnoughNodes with Double]
  
  /** Operations were performed on the incorrect server. **/
  @js.native
  sealed trait notMyVBucket extends errors
  /* 18 */ @js.native
  object notMyVBucket extends TopLevel[notMyVBucket with Double]
  
  /** The document was not stored. **/
  @js.native
  sealed trait notSorted extends errors
  /* 19 */ @js.native
  object notSorted extends TopLevel[notSorted with Double]
  
  /** An unsupported operation was sent to the server. **/
  @js.native
  sealed trait notSupported extends errors
  /* 20 */ @js.native
  object notSupported extends TopLevel[notSupported with Double]
  
  /** Object is too large to be stored on the cluster. **/
  @js.native
  sealed trait objectTooBig extends errors
  /* 4 */ @js.native
  object objectTooBig extends TopLevel[objectTooBig with Double]
  
  /** Couchnode is out of memory. **/
  @js.native
  sealed trait outOfMemory extends errors
  /* 36 */ @js.native
  object outOfMemory extends TopLevel[outOfMemory with Double]
  
  /** A protocol error occured. **/
  @js.native
  sealed trait protocolError extends errors
  /* 23 */ @js.native
  object protocolError extends TopLevel[protocolError with Double]
  
  /** An error occured during a RESTful operation. **/
  @js.native
  sealed trait restError extends errors
  /* 42 */ @js.native
  object restError extends TopLevel[restError with Double]
  
  /** An error occured while trying to schedule the operation. **/
  @js.native
  sealed trait schedulingError extends errors
  /* 38 */ @js.native
  object schedulingError extends TopLevel[schedulingError with Double]
  
  /** A server bug caused the operation to fail. **/
  @js.native
  sealed trait serverBug extends errors
  /* 30 */ @js.native
  object serverBug extends TopLevel[serverBug with Double]
  
  /** Operation was successful. **/
  @js.native
  sealed trait serverBusy extends errors
  /* 5 */ @js.native
  object serverBusy extends TopLevel[serverBusy with Double]
  
  /** Operation was successful. **/
  @js.native
  sealed trait success extends errors
  /* 0 */ @js.native
  object success extends TopLevel[success with Double]
  
  /** A temporary error occured. Try again. **/
  @js.native
  sealed trait temporaryError extends errors
  /* 11 */ @js.native
  object temporaryError extends TopLevel[temporaryError with Double]
  
  /** The operation timed out. **/
  @js.native
  sealed trait timedOut extends errors
  /* 24 */ @js.native
  object timedOut extends TopLevel[timedOut with Double]
  
  /** An unknown command was sent to the server. **/
  @js.native
  sealed trait unknownCommand extends errors
  /* 21 */ @js.native
  object unknownCommand extends TopLevel[unknownCommand with Double]
  
  /** An unknown host was specified. **/
  @js.native
  sealed trait unknownHost extends errors
  /* 22 */ @js.native
  object unknownHost extends TopLevel[unknownHost with Double]
  
  /** Operations were performed on the incorrect server. **/
  @js.native
  sealed trait wrongServer extends errors
  /* 17 */ @js.native
  object wrongServer extends TopLevel[wrongServer with Double]
}
