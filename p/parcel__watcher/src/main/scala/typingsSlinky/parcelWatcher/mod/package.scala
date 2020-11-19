package typingsSlinky.parcelWatcher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ParcelWatcherCallback = js.Function2[
    /* error */ js.UndefOr[js.Error], 
    /* events */ js.UndefOr[js.Array[typingsSlinky.parcelWatcher.mod.ParcelWatcherEvent]], 
    js.Any
  ]
}
