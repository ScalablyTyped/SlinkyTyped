package typingsSlinky.reactSketchapp.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SketchPage extends js.Object {
  def layers(): js.Array[SketchLayer] = js.native
  def name(): NSString = js.native
  def setName(name: String): Unit = js.native
}

object SketchPage {
  @scala.inline
  def apply(layers: () => js.Array[SketchLayer], name: () => NSString, setName: String => Unit): SketchPage = {
    val __obj = js.Dynamic.literal(layers = js.Any.fromFunction0(layers), name = js.Any.fromFunction0(name), setName = js.Any.fromFunction1(setName))
    __obj.asInstanceOf[SketchPage]
  }
  @scala.inline
  implicit class SketchPageOps[Self <: SketchPage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLayers(value: () => js.Array[SketchLayer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layers")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withName(value: () => NSString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetName(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setName")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

