package typingsSlinky.gapiClientTagmanager.gapi.client.tagmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListEnabledBuiltInVariablesResponse extends js.Object {
  /** All GTM BuiltInVariables of a GTM container. */
  var builtInVariable: js.UndefOr[js.Array[BuiltInVariable]] = js.native
  /** Continuation token for fetching the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
}

object ListEnabledBuiltInVariablesResponse {
  @scala.inline
  def apply(): ListEnabledBuiltInVariablesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEnabledBuiltInVariablesResponse]
  }
  @scala.inline
  implicit class ListEnabledBuiltInVariablesResponseOps[Self <: ListEnabledBuiltInVariablesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuiltInVariable(value: js.Array[BuiltInVariable]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("builtInVariable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuiltInVariable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("builtInVariable")(js.undefined)
        ret
    }
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
  }
  
}

