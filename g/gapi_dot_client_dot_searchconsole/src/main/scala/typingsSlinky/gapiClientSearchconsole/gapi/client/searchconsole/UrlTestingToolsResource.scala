package typingsSlinky.gapiClientSearchconsole.gapi.client.searchconsole

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UrlTestingToolsResource extends js.Object {
  var mobileFriendlyTest: MobileFriendlyTestResource = js.native
}

object UrlTestingToolsResource {
  @scala.inline
  def apply(mobileFriendlyTest: MobileFriendlyTestResource): UrlTestingToolsResource = {
    val __obj = js.Dynamic.literal(mobileFriendlyTest = mobileFriendlyTest.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlTestingToolsResource]
  }
  @scala.inline
  implicit class UrlTestingToolsResourceOps[Self <: UrlTestingToolsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMobileFriendlyTest(value: MobileFriendlyTestResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileFriendlyTest")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

