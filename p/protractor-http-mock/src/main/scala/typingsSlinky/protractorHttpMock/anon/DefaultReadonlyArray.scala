package typingsSlinky.protractorHttpMock.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultReadonlyArray extends js.Object {
  /**
    * Collection of default plugins to load for every test.
    * Default: []
    */
  var default: js.UndefOr[js.Array[String]] = js.native
}

object DefaultReadonlyArray {
  @scala.inline
  def apply(): DefaultReadonlyArray = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultReadonlyArray]
  }
  @scala.inline
  implicit class DefaultReadonlyArrayOps[Self <: DefaultReadonlyArray] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefault(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(js.undefined)
        ret
    }
  }
  
}

