package typingsSlinky.googleapis.androidpublisherV3Mod.androidpublisherV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaBundlesListResponse extends js.Object {
  var bundles: js.UndefOr[js.Array[SchemaBundle]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidpublisher#bundlesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaBundlesListResponse {
  @scala.inline
  def apply(): SchemaBundlesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBundlesListResponse]
  }
  @scala.inline
  implicit class SchemaBundlesListResponseOps[Self <: SchemaBundlesListResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBundles(value: js.Array[SchemaBundle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBundles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundles")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
  }
  
}

