package typingsSlinky.babylonjs.packerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITexturePackerJSON extends js.Object {
  /**
    * The frame data of the Packer
    */
  var frames: js.Array[Double] = js.native
  /**
    * The frame ID
    */
  var name: String = js.native
  /**
    * The options of the Packer
    */
  var options: ITexturePackerOptions = js.native
  /**
    * The base64 channel data
    */
  var sets: js.Any = js.native
}

object ITexturePackerJSON {
  @scala.inline
  def apply(frames: js.Array[Double], name: String, options: ITexturePackerOptions, sets: js.Any): ITexturePackerJSON = {
    val __obj = js.Dynamic.literal(frames = frames.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], sets = sets.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITexturePackerJSON]
  }
  @scala.inline
  implicit class ITexturePackerJSONOps[Self <: ITexturePackerJSON] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrames(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: ITexturePackerOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSets(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sets")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

