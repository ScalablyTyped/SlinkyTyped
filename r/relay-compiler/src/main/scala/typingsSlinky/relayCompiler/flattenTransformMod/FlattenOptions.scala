package typingsSlinky.relayCompiler.flattenTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlattenOptions extends js.Object {
  var flattenAbstractTypes: js.UndefOr[Boolean] = js.native
}

object FlattenOptions {
  @scala.inline
  def apply(): FlattenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlattenOptions]
  }
  @scala.inline
  implicit class FlattenOptionsOps[Self <: FlattenOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlattenAbstractTypes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flattenAbstractTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlattenAbstractTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flattenAbstractTypes")(js.undefined)
        ret
    }
  }
  
}

