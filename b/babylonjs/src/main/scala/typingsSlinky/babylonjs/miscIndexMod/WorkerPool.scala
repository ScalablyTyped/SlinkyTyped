package typingsSlinky.babylonjs.miscIndexMod

import org.scalajs.dom.raw.Worker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Misc/index", "WorkerPool")
@js.native
class WorkerPool protected ()
  extends typingsSlinky.babylonjs.workerPoolMod.WorkerPool {
  /**
    * Constructor
    * @param workers Array of workers to use for actions
    */
  def this(workers: js.Array[Worker]) = this()
}

