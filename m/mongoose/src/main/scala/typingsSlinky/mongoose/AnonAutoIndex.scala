package typingsSlinky.mongoose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAutoIndex extends js.Object {
  /**
    * set to false to disable automatic index creation for all
    * models associated with this connection.
    */
  var autoIndex: js.UndefOr[Boolean] = js.native
}

object AnonAutoIndex {
  @scala.inline
  def apply(): AnonAutoIndex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAutoIndex]
  }
  @scala.inline
  implicit class AnonAutoIndexOps[Self <: AnonAutoIndex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoIndex(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoIndex")(js.undefined)
        ret
    }
  }
  
}

