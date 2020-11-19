package typingsSlinky.browserfs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object fileSystemMod {
  
  type BFSCallback[T] = js.Function2[
    /* e */ js.UndefOr[typingsSlinky.browserfs.apiErrorMod.ApiError | scala.Null], 
    /* rv */ js.UndefOr[T], 
    js.Any
  ]
  
  type BFSOneArgCallback = js.Function1[
    /* e */ js.UndefOr[typingsSlinky.browserfs.apiErrorMod.ApiError | scala.Null], 
    js.Any
  ]
  
  type BFSThreeArgCallback[T, U] = js.Function3[
    /* e */ js.UndefOr[typingsSlinky.browserfs.apiErrorMod.ApiError | scala.Null], 
    /* arg1 */ js.UndefOr[T], 
    /* arg2 */ js.UndefOr[U], 
    js.Any
  ]
  
  type FileSystemOptions = org.scalablytyped.runtime.StringDictionary[typingsSlinky.browserfs.fileSystemMod.FileSystemOption[js.Any]]
}
