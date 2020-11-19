package typingsSlinky.gitana

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type eachCB[T, U] = js.ThisFunction2[/* this */ T, /* docId */ java.lang.String, /* node */ U, scala.Unit]
  
  type gitanaCallback[T] = js.ThisFunction1[/* this */ T, /* error */ js.UndefOr[js.Error], scala.Unit]
  
  type jobCallback[T] = js.ThisFunction1[/* this */ T, /* job */ typingsSlinky.gitana.mod.Job, scala.Unit]
}
