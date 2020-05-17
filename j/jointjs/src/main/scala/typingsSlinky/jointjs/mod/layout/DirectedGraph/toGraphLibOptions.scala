package typingsSlinky.jointjs.mod.layout.DirectedGraph

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait toGraphLibOptions
  extends /* key */ StringDictionary[js.Any] {
  var graphlib: js.UndefOr[js.Any] = js.native
}

object toGraphLibOptions {
  @scala.inline
  def apply(): toGraphLibOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[toGraphLibOptions]
  }
  @scala.inline
  implicit class toGraphLibOptionsOps[Self <: toGraphLibOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGraphlib(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphlib")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGraphlib: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphlib")(js.undefined)
        ret
    }
  }
  
}

