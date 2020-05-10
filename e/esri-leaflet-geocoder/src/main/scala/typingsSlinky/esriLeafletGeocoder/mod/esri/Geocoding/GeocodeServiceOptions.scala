package typingsSlinky.esriLeafletGeocoder.mod.esri.Geocoding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServiceOptions * / any */ @js.native
trait GeocodeServiceOptions extends js.Object {
  var supportsSuggest: js.UndefOr[Boolean] = js.native
}

object GeocodeServiceOptions {
  @scala.inline
  def apply(): GeocodeServiceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeocodeServiceOptions]
  }
  @scala.inline
  implicit class GeocodeServiceOptionsOps[Self <: GeocodeServiceOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSupportsSuggest(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsSuggest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportsSuggest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsSuggest")(js.undefined)
        ret
    }
  }
  
}

