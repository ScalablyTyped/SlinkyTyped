package typingsSlinky.fridaGum.global

import typingsSlinky.fridaGum.NativePointerValue
import typingsSlinky.fridaGum.WindowsStreamOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Input stream backed by a Windows file handle.
  *
  * Only available on Windows.
  */
@JSGlobal("Win32InputStream")
@js.native
class Win32InputStream protected ()
  extends typingsSlinky.fridaGum.InputStream {
  /**
    * Creates a new input stream from the specified Windows file handle.
    *
    * @param handle Windows file `HANDLE` to read from.
    * @param options Options to customize the stream.
    */
  def this(handle: NativePointerValue) = this()
  def this(handle: NativePointerValue, options: WindowsStreamOptions) = this()
}
