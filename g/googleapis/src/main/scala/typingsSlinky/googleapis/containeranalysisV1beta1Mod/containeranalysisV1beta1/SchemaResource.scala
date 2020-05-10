package typingsSlinky.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An entity that can have metadata. For example, a Docker image.
  */
@js.native
trait SchemaResource extends js.Object {
  /**
    * The hash of the resource content. For example, the Docker digest.
    */
  var contentHash: js.UndefOr[SchemaHash] = js.native
  /**
    * The name of the resource. For example, the name of a Docker image -
    * &quot;Debian&quot;.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Required. The unique URI of the resource. For example,
    * `https://gcr.io/project/image@sha256:foo` for a Docker image.
    */
  var uri: js.UndefOr[String] = js.native
}

object SchemaResource {
  @scala.inline
  def apply(): SchemaResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResource]
  }
  @scala.inline
  implicit class SchemaResourceOps[Self <: SchemaResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentHash(value: SchemaHash): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentHash")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(js.undefined)
        ret
    }
  }
  
}

