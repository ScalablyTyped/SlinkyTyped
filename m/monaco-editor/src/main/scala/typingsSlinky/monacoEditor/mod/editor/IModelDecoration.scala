package typingsSlinky.monacoEditor.mod.editor

import typingsSlinky.monacoEditor.mod.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IModelDecoration extends js.Object {
  /**
    * Identifier for a decoration.
    */
  val id: String = js.native
  /**
    * Options associated with this decoration.
    */
  val options: IModelDecorationOptions = js.native
  /**
    * Identifier for a decoration's owner.
    */
  val ownerId: Double = js.native
  /**
    * Range that this decoration covers.
    */
  val range: Range = js.native
}

object IModelDecoration {
  @scala.inline
  def apply(id: String, options: IModelDecorationOptions, ownerId: Double, range: Range): IModelDecoration = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], ownerId = ownerId.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModelDecoration]
  }
  @scala.inline
  implicit class IModelDecorationOps[Self <: IModelDecoration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: IModelDecorationOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwnerId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRange(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

