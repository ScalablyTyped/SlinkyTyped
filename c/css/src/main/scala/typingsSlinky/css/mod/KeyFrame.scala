package typingsSlinky.css.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyFrame extends Node {
  /** Array of nodes with the types declaration and comment. */
  var declarations: js.UndefOr[js.Array[Declaration | Comment]] = js.native
  /** The list of "selectors" of the keyframe rule, split on commas. Each “selector” is trimmed from whitespace. */
  var values: js.UndefOr[js.Array[String]] = js.native
}

object KeyFrame {
  @scala.inline
  def apply(): KeyFrame = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyFrame]
  }
  @scala.inline
  implicit class KeyFrameOps[Self <: KeyFrame] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeclarations(value: js.Array[Declaration | Comment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declarations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeclarations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declarations")(js.undefined)
        ret
    }
    @scala.inline
    def withValues(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.undefined)
        ret
    }
  }
  
}

