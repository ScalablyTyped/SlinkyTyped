package typingsSlinky.googleapis.storageV1Mod.storageV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A rewrite response.
  */
@js.native
trait SchemaRewriteResponse extends js.Object {
  /**
    * true if the copy is finished; otherwise, false if the copy is in
    * progress. This property is always present in the response.
    */
  var done: js.UndefOr[Boolean] = js.native
  /**
    * The kind of item this is.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The total size of the object being copied in bytes. This property is
    * always present in the response.
    */
  var objectSize: js.UndefOr[String] = js.native
  /**
    * A resource containing the metadata for the copied-to object. This
    * property is present in the response only when copying completes.
    */
  var resource: js.UndefOr[SchemaObject] = js.native
  /**
    * A token to use in subsequent requests to continue copying data. This
    * token is present in the response only when there is more data to copy.
    */
  var rewriteToken: js.UndefOr[String] = js.native
  /**
    * The total bytes written so far, which can be used to provide a waiting
    * user with a progress indicator. This property is always present in the
    * response.
    */
  var totalBytesRewritten: js.UndefOr[String] = js.native
}

object SchemaRewriteResponse {
  @scala.inline
  def apply(): SchemaRewriteResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRewriteResponse]
  }
  @scala.inline
  implicit class SchemaRewriteResponseOps[Self <: SchemaRewriteResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("done")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("done")(js.undefined)
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
    @scala.inline
    def withObjectSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectSize")(js.undefined)
        ret
    }
    @scala.inline
    def withResource(value: SchemaObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(js.undefined)
        ret
    }
    @scala.inline
    def withRewriteToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rewriteToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRewriteToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rewriteToken")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalBytesRewritten(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalBytesRewritten")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalBytesRewritten: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalBytesRewritten")(js.undefined)
        ret
    }
  }
  
}

