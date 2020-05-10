package typingsSlinky.nodeDogstatsd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatsDOptions extends js.Object {
  var global_tags: js.UndefOr[js.Array[String]] = js.native
}

object StatsDOptions {
  @scala.inline
  def apply(): StatsDOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatsDOptions]
  }
  @scala.inline
  implicit class StatsDOptionsOps[Self <: StatsDOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGlobal_tags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("global_tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobal_tags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("global_tags")(js.undefined)
        ret
    }
  }
  
}

