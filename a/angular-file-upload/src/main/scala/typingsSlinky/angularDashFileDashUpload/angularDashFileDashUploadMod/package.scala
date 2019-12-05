package typingsSlinky.angularDashFileDashUpload

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object angularDashFileDashUploadMod {
  import org.scalajs.dom.raw.File
  import typingsSlinky.angular.angularMod.IDeferred

  type AsyncFilter = js.Function3[
    /* item */ File | FileLikeObject, 
    /* options */ js.UndefOr[js.Object], 
    /* deferred */ IDeferred[js.Any], 
    Unit
  ]
  type SyncFilter = js.Function2[/* item */ File | FileLikeObject, /* options */ js.UndefOr[js.Object], Boolean]
}
