package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SceneLoaderProgressEvent extends js.Object {
  /** defines if data length to load can be evaluated */
  val lengthComputable: Boolean = js.native
  /** defines the loaded data length */
  val loaded: Double = js.native
  /** defines the data length to load */
  val total: Double = js.native
}

object SceneLoaderProgressEvent {
  @scala.inline
  def apply(lengthComputable: Boolean, loaded: Double, total: Double): SceneLoaderProgressEvent = {
    val __obj = js.Dynamic.literal(lengthComputable = lengthComputable.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneLoaderProgressEvent]
  }
  @scala.inline
  implicit class SceneLoaderProgressEventOps[Self <: SceneLoaderProgressEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLengthComputable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lengthComputable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoaded(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loaded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

