package typingsSlinky.angularFileUpload

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AsyncFilter = js.Function3[
    /* item */ org.scalajs.dom.raw.File | typingsSlinky.angularFileUpload.mod.FileLikeObject, 
    /* options */ js.UndefOr[js.Object], 
    /* deferred */ typingsSlinky.angular.mod.IDeferred[js.Any], 
    scala.Unit
  ]
  type SyncFilter = js.Function2[
    /* item */ org.scalajs.dom.raw.File | typingsSlinky.angularFileUpload.mod.FileLikeObject, 
    /* options */ js.UndefOr[js.Object], 
    scala.Boolean
  ]
}
