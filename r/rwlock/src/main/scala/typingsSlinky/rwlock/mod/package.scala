package typingsSlinky.rwlock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AsyncCallback = js.Function2[/* err */ js.Error, /* release */ typingsSlinky.rwlock.mod.Release, scala.Unit]
  
  type Callback = js.Function1[/* release */ typingsSlinky.rwlock.mod.Release, scala.Unit]
  
  type Release = js.Function0[scala.Unit]
}
