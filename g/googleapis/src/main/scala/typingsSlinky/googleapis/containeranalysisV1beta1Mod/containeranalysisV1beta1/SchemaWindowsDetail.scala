package typingsSlinky.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaWindowsDetail extends js.Object {
  /**
    * Required. The CPE URI in [cpe
    * format](https://cpe.mitre.org/specification/) in which the vulnerability
    * manifests. Examples include distro or storage location for vulnerable
    * jar.
    */
  var cpeUri: js.UndefOr[String] = js.native
  /**
    * The description of the vulnerability.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Required. The names of the KBs which have hotfixes to mitigate this
    * vulnerability. Note that there may be multiple hotfixes (and thus
    * multiple KBs) that mitigate a given vulnerability. Currently any listed
    * kb&#39;s presence is considered a fix.
    */
  var fixingKbs: js.UndefOr[js.Array[SchemaKnowledgeBase]] = js.native
  /**
    * Required. The name of the vulnerability.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaWindowsDetail {
  @scala.inline
  def apply(): SchemaWindowsDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWindowsDetail]
  }
  @scala.inline
  implicit class SchemaWindowsDetailOps[Self <: SchemaWindowsDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCpeUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpeUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCpeUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpeUri")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withFixingKbs(value: js.Array[SchemaKnowledgeBase]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixingKbs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixingKbs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixingKbs")(js.undefined)
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
  }
  
}

