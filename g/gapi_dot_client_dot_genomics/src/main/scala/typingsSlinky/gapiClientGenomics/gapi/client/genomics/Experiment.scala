package typingsSlinky.gapiClientGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Experiment extends js.Object {
  /**
    * The instrument model used as part of this experiment. This maps to
    * sequencing technology in the SAM spec.
    */
  var instrumentModel: js.UndefOr[String] = js.native
  /**
    * A client-supplied library identifier; a library is a collection of DNA
    * fragments which have been prepared for sequencing from a sample. This
    * field is important for quality control as error or bias can be introduced
    * during sample preparation.
    */
  var libraryId: js.UndefOr[String] = js.native
  /**
    * The platform unit used as part of this experiment, for example
    * flowcell-barcode.lane for Illumina or slide for SOLiD. Corresponds to the
    * @RG PU field in the SAM spec.
    */
  var platformUnit: js.UndefOr[String] = js.native
  /** The sequencing center used as part of this experiment. */
  var sequencingCenter: js.UndefOr[String] = js.native
}

object Experiment {
  @scala.inline
  def apply(): Experiment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Experiment]
  }
  @scala.inline
  implicit class ExperimentOps[Self <: Experiment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstrumentModel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instrumentModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstrumentModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instrumentModel")(js.undefined)
        ret
    }
    @scala.inline
    def withLibraryId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("libraryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLibraryId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("libraryId")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatformUnit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platformUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatformUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platformUnit")(js.undefined)
        ret
    }
    @scala.inline
    def withSequencingCenter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequencingCenter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSequencingCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequencingCenter")(js.undefined)
        ret
    }
  }
  
}

