package typingsSlinky.babylonjs.indexMod

import org.scalajs.dom.raw.Worker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/index", "WorkerPool")
@js.native
class WorkerPool protected ()
  extends typingsSlinky.babylonjs.miscIndexMod.WorkerPool {
  /**
    * Constructor
    * @param workers Array of workers to use for actions
    */
  def this(workers: js.Array[Worker]) = this()
}

