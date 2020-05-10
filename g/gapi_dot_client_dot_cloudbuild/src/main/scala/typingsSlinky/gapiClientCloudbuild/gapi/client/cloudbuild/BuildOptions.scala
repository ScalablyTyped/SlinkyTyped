package typingsSlinky.gapiClientCloudbuild.gapi.client.cloudbuild

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildOptions extends js.Object {
  /** Requested verifiability options. */
  var requestedVerifyOption: js.UndefOr[String] = js.native
  /** Requested hash for SourceProvenance. */
  var sourceProvenanceHash: js.UndefOr[js.Array[String]] = js.native
  /** SubstitutionOption to allow unmatch substitutions. */
  var substitutionOption: js.UndefOr[String] = js.native
}

object BuildOptions {
  @scala.inline
  def apply(): BuildOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildOptions]
  }
  @scala.inline
  implicit class BuildOptionsOps[Self <: BuildOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequestedVerifyOption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestedVerifyOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestedVerifyOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestedVerifyOption")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceProvenanceHash(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceProvenanceHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceProvenanceHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceProvenanceHash")(js.undefined)
        ret
    }
    @scala.inline
    def withSubstitutionOption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("substitutionOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubstitutionOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("substitutionOption")(js.undefined)
        ret
    }
  }
  
}

