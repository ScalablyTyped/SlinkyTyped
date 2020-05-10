package typingsSlinky.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Per resource and severity counts of fixable and total vulnerabilities.
  */
@js.native
trait SchemaFixableTotalByDigest extends js.Object {
  /**
    * The number of fixable vulnerabilities associated with this resource.
    */
  var fixableCount: js.UndefOr[String] = js.native
  /**
    * The affected resource.
    */
  var resource: js.UndefOr[SchemaResource] = js.native
  /**
    * The severity for this count. SEVERITY_UNSPECIFIED indicates total across
    * all severities.
    */
  var severity: js.UndefOr[String] = js.native
  /**
    * The total number of vulnerabilities associated with this resource.
    */
  var totalCount: js.UndefOr[String] = js.native
}

object SchemaFixableTotalByDigest {
  @scala.inline
  def apply(): SchemaFixableTotalByDigest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFixableTotalByDigest]
  }
  @scala.inline
  implicit class SchemaFixableTotalByDigestOps[Self <: SchemaFixableTotalByDigest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFixableCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixableCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixableCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixableCount")(js.undefined)
        ret
    }
    @scala.inline
    def withResource(value: SchemaResource): Self = {
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
    def withSeverity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("severity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeverity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("severity")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalCount")(js.undefined)
        ret
    }
  }
  
}

