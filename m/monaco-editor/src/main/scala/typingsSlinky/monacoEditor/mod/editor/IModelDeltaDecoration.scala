package typingsSlinky.monacoEditor.mod.editor

import typingsSlinky.monacoEditor.mod.IRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IModelDeltaDecoration extends js.Object {
  /**
    * Options associated with this decoration.
    */
  var options: IModelDecorationOptions = js.native
  /**
    * Range that this decoration covers.
    */
  var range: IRange = js.native
}

object IModelDeltaDecoration {
  @scala.inline
  def apply(options: IModelDecorationOptions, range: IRange): IModelDeltaDecoration = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModelDeltaDecoration]
  }
  @scala.inline
  implicit class IModelDeltaDecorationOps[Self <: IModelDeltaDecoration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOptions(value: IModelDecorationOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRange(value: IRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

