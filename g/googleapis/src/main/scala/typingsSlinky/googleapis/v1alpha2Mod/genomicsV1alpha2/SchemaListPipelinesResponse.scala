package typingsSlinky.googleapis.v1alpha2Mod.genomicsV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response of ListPipelines. Contains at most `pageSize` pipelines. If it
  * contains `pageSize` pipelines, and more pipelines exist, then
  * `nextPageToken` will be populated and should be used as the `pageToken`
  * argument to a subsequent ListPipelines request.
  */
@js.native
trait SchemaListPipelinesResponse extends js.Object {
  /**
    * The token to use to get the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The matched pipelines.
    */
  var pipelines: js.UndefOr[js.Array[SchemaPipeline]] = js.native
}

object SchemaListPipelinesResponse {
  @scala.inline
  def apply(): SchemaListPipelinesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListPipelinesResponse]
  }
  @scala.inline
  implicit class SchemaListPipelinesResponseOps[Self <: SchemaListPipelinesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withPipelines(value: js.Array[SchemaPipeline]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipelines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPipelines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipelines")(js.undefined)
        ret
    }
  }
  
}

