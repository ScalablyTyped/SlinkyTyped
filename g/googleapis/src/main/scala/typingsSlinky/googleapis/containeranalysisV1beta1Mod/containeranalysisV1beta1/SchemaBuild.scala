package typingsSlinky.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Note holding the version of the provider&#39;s builder and the signature of
  * the provenance message in the build details occurrence.
  */
@js.native
trait SchemaBuild extends js.Object {
  /**
    * Required. Immutable. Version of the builder which produced this build.
    */
  var builderVersion: js.UndefOr[String] = js.native
  /**
    * Signature of the build in occurrences pointing to this build note
    * containing build details.
    */
  var signature: js.UndefOr[SchemaBuildSignature] = js.native
}

object SchemaBuild {
  @scala.inline
  def apply(): SchemaBuild = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuild]
  }
  @scala.inline
  implicit class SchemaBuildOps[Self <: SchemaBuild] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuilderVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("builderVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuilderVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("builderVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withSignature(value: SchemaBuildSignature): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignature: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signature")(js.undefined)
        ret
    }
  }
  
}

