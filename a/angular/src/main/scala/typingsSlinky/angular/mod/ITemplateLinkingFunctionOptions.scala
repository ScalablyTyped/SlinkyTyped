package typingsSlinky.angular.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.angular.JQuery
import typingsSlinky.angular.anon.Instance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITemplateLinkingFunctionOptions extends js.Object {
  var futureParentElement: js.UndefOr[JQuery] = js.native
  var parentBoundTranscludeFn: js.UndefOr[ITranscludeFunction] = js.native
  var transcludeControllers: js.UndefOr[StringDictionary[Instance]] = js.native
}

object ITemplateLinkingFunctionOptions {
  @scala.inline
  def apply(): ITemplateLinkingFunctionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITemplateLinkingFunctionOptions]
  }
  @scala.inline
  implicit class ITemplateLinkingFunctionOptionsOps[Self <: ITemplateLinkingFunctionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFutureParentElement(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("futureParentElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFutureParentElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("futureParentElement")(js.undefined)
        ret
    }
    @scala.inline
    def withParentBoundTranscludeFn(value: ITranscludeFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentBoundTranscludeFn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentBoundTranscludeFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentBoundTranscludeFn")(js.undefined)
        ret
    }
    @scala.inline
    def withTranscludeControllers(value: StringDictionary[Instance]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transcludeControllers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranscludeControllers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transcludeControllers")(js.undefined)
        ret
    }
  }
  
}

