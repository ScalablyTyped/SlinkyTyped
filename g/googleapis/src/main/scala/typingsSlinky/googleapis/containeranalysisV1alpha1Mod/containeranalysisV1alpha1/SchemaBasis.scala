package typingsSlinky.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Basis describes the base image portion (Note) of the DockerImage
  * relationship.  Linked occurrences are derived from this or an equivalent
  * image via:   FROM &lt;Basis.resource_url&gt; Or an equivalent reference,
  * e.g. a tag of the resource_url.
  */
@js.native
trait SchemaBasis extends js.Object {
  /**
    * The fingerprint of the base image.
    */
  var fingerprint: js.UndefOr[SchemaFingerprint] = js.native
  /**
    * The resource_url for the resource representing the basis of associated
    * occurrence images.
    */
  var resourceUrl: js.UndefOr[String] = js.native
}

object SchemaBasis {
  @scala.inline
  def apply(): SchemaBasis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBasis]
  }
  @scala.inline
  implicit class SchemaBasisOps[Self <: SchemaBasis] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFingerprint(value: SchemaFingerprint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFingerprint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerprint")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceUrl")(js.undefined)
        ret
    }
  }
  
}

