package typingsSlinky.nodeSpriteGenerator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Compositor extends js.Object {
  def readImages(
    files: js.Array[String],
    callback: js.Function2[/* error */ js.Error, /* images */ js.Array[Image], Unit]
  ): Unit = js.native
  def render(
    layout: Layout,
    spritePath: String,
    options: CompositorOption,
    callback: js.Function1[/* error */ js.Error, Unit]
  ): Unit = js.native
}

object Compositor {
  @scala.inline
  def apply(
    readImages: (js.Array[String], js.Function2[/* error */ js.Error, /* images */ js.Array[Image], Unit]) => Unit,
    render: (Layout, String, CompositorOption, js.Function1[/* error */ js.Error, Unit]) => Unit
  ): Compositor = {
    val __obj = js.Dynamic.literal(readImages = js.Any.fromFunction2(readImages), render = js.Any.fromFunction4(render))
    __obj.asInstanceOf[Compositor]
  }
  @scala.inline
  implicit class CompositorOps[Self <: Compositor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReadImages(
      value: (js.Array[String], js.Function2[/* error */ js.Error, /* images */ js.Array[Image], Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readImages")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRender(value: (Layout, String, CompositorOption, js.Function1[/* error */ js.Error, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.Any.fromFunction4(value))
        ret
    }
  }
  
}

