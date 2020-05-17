package typingsSlinky.objectFitImages.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkipTest extends js.Object {
  var skipTest: js.UndefOr[Boolean] = js.native
  var watchMQ: js.UndefOr[Boolean] = js.native
}

object SkipTest {
  @scala.inline
  def apply(): SkipTest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SkipTest]
  }
  @scala.inline
  implicit class SkipTestOps[Self <: SkipTest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSkipTest(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipTest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipTest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipTest")(js.undefined)
        ret
    }
    @scala.inline
    def withWatchMQ(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchMQ")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWatchMQ: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchMQ")(js.undefined)
        ret
    }
  }
  
}

