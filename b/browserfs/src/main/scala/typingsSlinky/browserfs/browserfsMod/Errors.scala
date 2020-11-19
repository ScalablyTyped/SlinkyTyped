package typingsSlinky.browserfs.browserfsMod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.browserfs.apiErrorMod.ErrorCode
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("browserfs/dist/node/core/browserfs", "Errors")
@js.native
object Errors extends js.Object {
  
  @js.native
  class ApiError protected ()
    extends typingsSlinky.browserfs.apiErrorMod.ApiError {
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
  }
  /* static members */
  @js.native
  object ApiError extends js.Object {
    
    def EEXIST(path: String): typingsSlinky.browserfs.apiErrorMod.ApiError = js.native
    
    def EISDIR(path: String): typingsSlinky.browserfs.apiErrorMod.ApiError = js.native
    
    def ENOENT(path: String): typingsSlinky.browserfs.apiErrorMod.ApiError = js.native
    
    def ENOTDIR(path: String): typingsSlinky.browserfs.apiErrorMod.ApiError = js.native
    
    def ENOTEMPTY(path: String): typingsSlinky.browserfs.apiErrorMod.ApiError = js.native
    
    def EPERM(path: String): typingsSlinky.browserfs.apiErrorMod.ApiError = js.native
    
    def FileError(code: ErrorCode, p: String): typingsSlinky.browserfs.apiErrorMod.ApiError = js.native
    
    /**
      * Creates an ApiError object from a buffer.
      */
    def fromBuffer(buffer: Buffer): typingsSlinky.browserfs.apiErrorMod.ApiError = js.native
    def fromBuffer(buffer: Buffer, i: Double): typingsSlinky.browserfs.apiErrorMod.ApiError = js.native
    
    def fromJSON(json: js.Any): typingsSlinky.browserfs.apiErrorMod.ApiError = js.native
  }
  
  @js.native
  object ErrorCode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.browserfs.apiErrorMod.ErrorCode with Double] = js.native
    
    /* 13 */ val EACCES: typingsSlinky.browserfs.apiErrorMod.ErrorCode.EACCES with Double = js.native
    
    /* 9 */ val EBADF: typingsSlinky.browserfs.apiErrorMod.ErrorCode.EBADF with Double = js.native
    
    /* 16 */ val EBUSY: typingsSlinky.browserfs.apiErrorMod.ErrorCode.EBUSY with Double = js.native
    
    /* 17 */ val EEXIST: typingsSlinky.browserfs.apiErrorMod.ErrorCode.EEXIST with Double = js.native
    
    /* 27 */ val EFBIG: typingsSlinky.browserfs.apiErrorMod.ErrorCode.EFBIG with Double = js.native
    
    /* 22 */ val EINVAL: typingsSlinky.browserfs.apiErrorMod.ErrorCode.EINVAL with Double = js.native
    
    /* 5 */ val EIO: typingsSlinky.browserfs.apiErrorMod.ErrorCode.EIO with Double = js.native
    
    /* 21 */ val EISDIR: typingsSlinky.browserfs.apiErrorMod.ErrorCode.EISDIR with Double = js.native
    
    /* 2 */ val ENOENT: typingsSlinky.browserfs.apiErrorMod.ErrorCode.ENOENT with Double = js.native
    
    /* 28 */ val ENOSPC: typingsSlinky.browserfs.apiErrorMod.ErrorCode.ENOSPC with Double = js.native
    
    /* 20 */ val ENOTDIR: typingsSlinky.browserfs.apiErrorMod.ErrorCode.ENOTDIR with Double = js.native
    
    /* 39 */ val ENOTEMPTY: typingsSlinky.browserfs.apiErrorMod.ErrorCode.ENOTEMPTY with Double = js.native
    
    /* 95 */ val ENOTSUP: typingsSlinky.browserfs.apiErrorMod.ErrorCode.ENOTSUP with Double = js.native
    
    /* 1 */ val EPERM: typingsSlinky.browserfs.apiErrorMod.ErrorCode.EPERM with Double = js.native
    
    /* 30 */ val EROFS: typingsSlinky.browserfs.apiErrorMod.ErrorCode.EROFS with Double = js.native
  }
  
  @js.native
  object ErrorStrings
    extends /* code */ NumberDictionary[String]
       with /* code */ StringDictionary[String]
}
