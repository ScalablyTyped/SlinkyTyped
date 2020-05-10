package typingsSlinky.rss.mod.NodeRSS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XmlOptions extends js.Object {
  /**
    * What to use as a tab. Defaults to no tabs (compressed).
    * For example you can use '\t' for tab character, or ' '
    * for two-space tabs. If you set it to true it will use
    * four spaces.
    */
  var indent: js.UndefOr[Boolean | String] = js.native
}

object XmlOptions {
  @scala.inline
  def apply(): XmlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XmlOptions]
  }
  @scala.inline
  implicit class XmlOptionsOps[Self <: XmlOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndent(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent")(js.undefined)
        ret
    }
  }
  
}

