package typingsSlinky.expoFileSystem.fileSystemTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FileSystemUploadType extends js.Object
@JSImport("expo-file-system/build/FileSystem.types", "FileSystemUploadType")
@js.native
object FileSystemUploadType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileSystemUploadType with Double] = js.native
  
  @js.native
  sealed trait BINARY_CONTENT extends FileSystemUploadType
  /* 0 */ @js.native
  object BINARY_CONTENT extends TopLevel[BINARY_CONTENT with Double]
  
  @js.native
  sealed trait MULTIPART extends FileSystemUploadType
  /* 1 */ @js.native
  object MULTIPART extends TopLevel[MULTIPART with Double]
}
