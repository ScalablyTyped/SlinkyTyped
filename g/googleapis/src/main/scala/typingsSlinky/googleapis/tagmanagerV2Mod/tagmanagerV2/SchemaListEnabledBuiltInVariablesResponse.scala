package typingsSlinky.googleapis.tagmanagerV2Mod.tagmanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of enabled built-in variables.
  */
@js.native
trait SchemaListEnabledBuiltInVariablesResponse extends js.Object {
  /**
    * All GTM BuiltInVariables of a GTM container.
    */
  var builtInVariable: js.UndefOr[js.Array[SchemaBuiltInVariable]] = js.native
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListEnabledBuiltInVariablesResponse {
  @scala.inline
  def apply(): SchemaListEnabledBuiltInVariablesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListEnabledBuiltInVariablesResponse]
  }
  @scala.inline
  implicit class SchemaListEnabledBuiltInVariablesResponseOps[Self <: SchemaListEnabledBuiltInVariablesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuiltInVariable(value: js.Array[SchemaBuiltInVariable]): Self = {
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

