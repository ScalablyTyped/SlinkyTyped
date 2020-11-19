package typingsSlinky.browserfs

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("browserfs/dist/node/core/api_error", JSImport.Namespace)
@js.native
object apiErrorMod extends js.Object {
  
  @js.native
  class ApiError protected () extends ErrnoException {
    /**
      * Represents a BrowserFS error. Passed back to applications after a failed
      * call to the BrowserFS API.
      *
      * Error codes mirror those returned by regular Unix file operations, which is
      * what Node returns.
      * @constructor ApiError
      * @param type The type of the error.
      * @param [message] A descriptive error message.
      */
    def this(`type`: ErrorCode) = this()
    def this(`type`: ErrorCode, message: String) = this()
    def this(`type`: ErrorCode, message: js.UndefOr[scala.Nothing], path: String) = this()
    def this(`type`: ErrorCode, message: String, path: String) = this()
    
    /**
      * The size of the API error in buffer-form in bytes.
      */
    def bufferSize(): Double = js.native
    
    @JSName("code")
    var code_ApiError: String = js.native
    
    @JSName("errno")
    var errno_ApiError: ErrorCode = js.native
    
    @JSName("syscall")
    var syscall_ApiError: String = js.native
    
    def toJSON(): js.Any = js.native
    
    /**
      * Writes the API error into a buffer.
      */
    def writeToBuffer(): Buffer = js.native
    def writeToBuffer(buffer: js.UndefOr[scala.Nothing], i: Double): Buffer = js.native
    def writeToBuffer(buffer: Buffer): Buffer = js.native
    def writeToBuffer(buffer: Buffer, i: Double): Buffer = js.native
  }
  /* static members */
  @js.native
  object ApiError extends js.Object {
    
    def EEXIST(path: String): ApiError = js.native
    
    def EISDIR(path: String): ApiError = js.native
    
    def ENOENT(path: String): ApiError = js.native
    
    def ENOTDIR(path: String): ApiError = js.native
    
    def ENOTEMPTY(path: String): ApiError = js.native
    
    def EPERM(path: String): ApiError = js.native
    
    def FileError(code: ErrorCode, p: String): ApiError = js.native
    
    /**
      * Creates an ApiError object from a buffer.
      */
    def fromBuffer(buffer: Buffer): ApiError = js.native
    def fromBuffer(buffer: Buffer, i: Double): ApiError = js.native
    
    def fromJSON(json: js.Any): ApiError = js.native
  }
  
  @js.native
  sealed trait ErrorCode extends js.Object
  @js.native
  object ErrorCode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ErrorCode with Double] = js.native
    
    @js.native
    sealed trait EACCES extends ErrorCode
    /* 13 */ @js.native
    object EACCES extends TopLevel[EACCES with Double]
    
    @js.native
    sealed trait EBADF extends ErrorCode
    /* 9 */ @js.native
    object EBADF extends TopLevel[EBADF with Double]
    
    @js.native
    sealed trait EBUSY extends ErrorCode
    /* 16 */ @js.native
    object EBUSY extends TopLevel[EBUSY with Double]
    
    @js.native
    sealed trait EEXIST extends ErrorCode
    /* 17 */ @js.native
    object EEXIST extends TopLevel[EEXIST with Double]
    
    @js.native
    sealed trait EFBIG extends ErrorCode
    /* 27 */ @js.native
    object EFBIG extends TopLevel[EFBIG with Double]
    
    @js.native
    sealed trait EINVAL extends ErrorCode
    /* 22 */ @js.native
    object EINVAL extends TopLevel[EINVAL with Double]
    
    @js.native
    sealed trait EIO extends ErrorCode
    /* 5 */ @js.native
    object EIO extends TopLevel[EIO with Double]
    
    @js.native
    sealed trait EISDIR extends ErrorCode
    /* 21 */ @js.native
    object EISDIR extends TopLevel[EISDIR with Double]
    
    @js.native
    sealed trait ENOENT extends ErrorCode
    /* 2 */ @js.native
    object ENOENT extends TopLevel[ENOENT with Double]
    
    @js.native
    sealed trait ENOSPC extends ErrorCode
    /* 28 */ @js.native
    object ENOSPC extends TopLevel[ENOSPC with Double]
    
    @js.native
    sealed trait ENOTDIR extends ErrorCode
    /* 20 */ @js.native
    object ENOTDIR extends TopLevel[ENOTDIR with Double]
    
    @js.native
    sealed trait ENOTEMPTY extends ErrorCode
    /* 39 */ @js.native
    object ENOTEMPTY extends TopLevel[ENOTEMPTY with Double]
    
    @js.native
    sealed trait ENOTSUP extends ErrorCode
    /* 95 */ @js.native
    object ENOTSUP extends TopLevel[ENOTSUP with Double]
    
    @js.native
    sealed trait EPERM extends ErrorCode
    /* 1 */ @js.native
    object EPERM extends TopLevel[EPERM with Double]
    
    @js.native
    sealed trait EROFS extends ErrorCode
    /* 30 */ @js.native
    object EROFS extends TopLevel[EROFS with Double]
  }
  
  @js.native
  object ErrorStrings
    extends /* code */ NumberDictionary[String]
       with /* code */ StringDictionary[String]
}
