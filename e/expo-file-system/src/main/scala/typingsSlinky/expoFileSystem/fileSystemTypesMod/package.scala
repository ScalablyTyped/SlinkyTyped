package typingsSlinky.expoFileSystem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object fileSystemTypesMod {
  
  type DownloadProgressCallback = js.Function1[
    /* data */ typingsSlinky.expoFileSystem.fileSystemTypesMod.DownloadProgressData, 
    scala.Unit
  ]
  
  type FileSystemUploadOptions = (typingsSlinky.expoFileSystem.anon.UploadType | typingsSlinky.expoFileSystem.anon.FieldName) with typingsSlinky.expoFileSystem.anon.Headers
  
  type PlatformMethod = js.Function1[/* repeated */ js.Any, js.Promise[js.Any]]
}
