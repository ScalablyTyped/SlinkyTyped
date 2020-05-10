package typingsSlinky.phaser.Phaser.Types.Animations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONAnimations extends js.Object {
  /**
    * An array of all Animations added to the Animation Manager.
    */
  var anims: js.Array[JSONAnimation] = js.native
  /**
    * The global time scale of the Animation Manager.
    */
  var globalTimeScale: Double = js.native
}

object JSONAnimations {
  @scala.inline
  def apply(anims: js.Array[JSONAnimation], globalTimeScale: Double): JSONAnimations = {
    val __obj = js.Dynamic.literal(anims = anims.asInstanceOf[js.Any], globalTimeScale = globalTimeScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONAnimations]
  }
  @scala.inline
  implicit class JSONAnimationsOps[Self <: JSONAnimations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnims(value: js.Array[JSONAnimation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anims")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlobalTimeScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalTimeScale")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

