package typingsSlinky.jdenticon.mod._Global_

import typingsSlinky.jdenticon.jdenticonStrings.`2d`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a subset of `HTMLCanvasElement` to allow using incomplete canvas implementations, 
  * like `canvas-renderer`.
  */
@js.native
trait JdenticonCompatibleCanvas extends js.Object {
  // HTMLCanvasElement
  val height: Double = js.native
  val width: Double = js.native
  @JSName("getContext")
  def getContext_2d(contextId: `2d`): JdenticonCompatibleCanvasRenderingContext2D | Null = js.native
}

object JdenticonCompatibleCanvas {
  @scala.inline
  def apply(
    getContext: `2d` => JdenticonCompatibleCanvasRenderingContext2D | Null,
    height: Double,
    width: Double
  ): JdenticonCompatibleCanvas = {
    val __obj = js.Dynamic.literal(getContext = js.Any.fromFunction1(getContext), height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[JdenticonCompatibleCanvas]
  }
  @scala.inline
  implicit class JdenticonCompatibleCanvasOps[Self <: JdenticonCompatibleCanvas] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetContext(value: `2d` => JdenticonCompatibleCanvasRenderingContext2D | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContext")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

