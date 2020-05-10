package typingsSlinky.facebookJsSdk.facebook

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.facebookJsSdk.facebookJsSdkBooleans.`false`
import typingsSlinky.facebookJsSdk.facebookJsSdkStrings.share_open_graph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShareOpenGraphDialogParams extends DialogParams {
  var action_properties: StringDictionary[js.Any] = js.native
  var action_type: String = js.native
  var hashtag: js.UndefOr[String] = js.native
  var href: String = js.native
  var method: share_open_graph = js.native
  var mobile_iframe: js.UndefOr[`false`] = js.native
  var quote: js.UndefOr[String] = js.native
}

object ShareOpenGraphDialogParams {
  @scala.inline
  def apply(
    action_properties: StringDictionary[js.Any],
    action_type: String,
    href: String,
    method: share_open_graph
  ): ShareOpenGraphDialogParams = {
    val __obj = js.Dynamic.literal(action_properties = action_properties.asInstanceOf[js.Any], action_type = action_type.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareOpenGraphDialogParams]
  }
  @scala.inline
  implicit class ShareOpenGraphDialogParamsOps[Self <: ShareOpenGraphDialogParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction_properties(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action_properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAction_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHref(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("href")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethod(value: share_open_graph): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHashtag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashtag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHashtag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashtag")(js.undefined)
        ret
    }
    @scala.inline
    def withMobile_iframe(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobile_iframe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMobile_iframe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobile_iframe")(js.undefined)
        ret
    }
    @scala.inline
    def withQuote(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quote")(js.undefined)
        ret
    }
  }
  
}

