package typingsSlinky.reactSketchapp.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SketchAssetCollection extends js.Object {
  def colors(): js.Array[MSColor] = js.native
  def gradients(): js.Array[MSGradient] = js.native
}

object SketchAssetCollection {
  @scala.inline
  def apply(colors: () => js.Array[MSColor], gradients: () => js.Array[MSGradient]): SketchAssetCollection = {
    val __obj = js.Dynamic.literal(colors = js.Any.fromFunction0(colors), gradients = js.Any.fromFunction0(gradients))
    __obj.asInstanceOf[SketchAssetCollection]
  }
  @scala.inline
  implicit class SketchAssetCollectionOps[Self <: SketchAssetCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColors(value: () => js.Array[MSColor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGradients(value: () => js.Array[MSGradient]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradients")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

