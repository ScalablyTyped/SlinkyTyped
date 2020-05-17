package typingsSlinky.babylonjs.anon

import typingsSlinky.babylonjs.BABYLON.Color4
import typingsSlinky.babylonjs.BABYLON.Nullable
import typingsSlinky.babylonjs.BABYLON.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lines extends js.Object {
  var colors: js.UndefOr[Nullable[js.Array[js.Array[Color4]]]] = js.native
  var lines: js.Array[js.Array[Vector3]] = js.native
}

object Lines {
  @scala.inline
  def apply(lines: js.Array[js.Array[Vector3]]): Lines = {
    val __obj = js.Dynamic.literal(lines = lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lines]
  }
  @scala.inline
  implicit class LinesOps[Self <: Lines] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLines(value: js.Array[js.Array[Vector3]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColors(value: Nullable[js.Array[js.Array[Color4]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(js.undefined)
        ret
    }
    @scala.inline
    def withColorsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(null)
        ret
    }
  }
  
}

