package typingsSlinky.rollup

import typingsSlinky.rollup.mod._SourceMapInput
import typingsSlinky.rollup.rollupStrings._empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMappings extends _SourceMapInput {
  var mappings: _empty = js.native
}

object AnonMappings {
  @scala.inline
  def apply(mappings: _empty): AnonMappings = {
    val __obj = js.Dynamic.literal(mappings = mappings.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMappings]
  }
  @scala.inline
  implicit class AnonMappingsOps[Self <: AnonMappings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMappings(value: _empty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mappings")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

