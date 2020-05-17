package typingsSlinky.postcss.anon

import typingsSlinky.postcss.mod.SourceMapOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<postcss.postcss.ProcessOptions, 'map' | 'from'> */
@js.native
trait PickProcessOptionsmapfrom extends js.Object {
  var from: js.UndefOr[String] = js.native
  var map: js.UndefOr[SourceMapOptions | Boolean] = js.native
}

object PickProcessOptionsmapfrom {
  @scala.inline
  def apply(): PickProcessOptionsmapfrom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickProcessOptionsmapfrom]
  }
  @scala.inline
  implicit class PickProcessOptionsmapfromOps[Self <: PickProcessOptionsmapfrom] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(js.undefined)
        ret
    }
    @scala.inline
    def withMap(value: SourceMapOptions | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(js.undefined)
        ret
    }
  }
  
}

