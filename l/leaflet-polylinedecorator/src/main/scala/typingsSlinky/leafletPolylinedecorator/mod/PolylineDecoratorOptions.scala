package typingsSlinky.leafletPolylinedecorator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolylineDecoratorOptions extends js.Object {
  var patterns: js.Array[Pattern] = js.native
}

object PolylineDecoratorOptions {
  @scala.inline
  def apply(patterns: js.Array[Pattern]): PolylineDecoratorOptions = {
    val __obj = js.Dynamic.literal(patterns = patterns.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolylineDecoratorOptions]
  }
  @scala.inline
  implicit class PolylineDecoratorOptionsOps[Self <: PolylineDecoratorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPatterns(value: js.Array[Pattern]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patterns")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

