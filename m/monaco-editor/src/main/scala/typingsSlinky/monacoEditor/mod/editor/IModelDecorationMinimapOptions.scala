package typingsSlinky.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IModelDecorationMinimapOptions extends IDecorationOptions {
  /**
    * The position in the overview ruler.
    */
  var position: MinimapPosition = js.native
}

object IModelDecorationMinimapOptions {
  @scala.inline
  def apply(position: MinimapPosition): IModelDecorationMinimapOptions = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModelDecorationMinimapOptions]
  }
  @scala.inline
  implicit class IModelDecorationMinimapOptionsOps[Self <: IModelDecorationMinimapOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPosition(value: MinimapPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

