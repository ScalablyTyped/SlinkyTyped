package typingsSlinky.rollup.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderedModule extends js.Object {
  var originalLength: Double = js.native
  var removedExports: js.Array[String] = js.native
  var renderedExports: js.Array[String] = js.native
  var renderedLength: Double = js.native
}

object RenderedModule {
  @scala.inline
  def apply(
    originalLength: Double,
    removedExports: js.Array[String],
    renderedExports: js.Array[String],
    renderedLength: Double
  ): RenderedModule = {
    val __obj = js.Dynamic.literal(originalLength = originalLength.asInstanceOf[js.Any], removedExports = removedExports.asInstanceOf[js.Any], renderedExports = renderedExports.asInstanceOf[js.Any], renderedLength = renderedLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderedModule]
  }
  @scala.inline
  implicit class RenderedModuleOps[Self <: RenderedModule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOriginalLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemovedExports(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removedExports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderedExports(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderedExports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderedLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderedLength")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

