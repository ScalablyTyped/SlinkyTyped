package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * All configuration data for a particular Computation.
  */
@js.native
trait SchemaComputationTopology extends js.Object {
  /**
    * The ID of the computation.
    */
  var computationId: js.UndefOr[String] = js.native
  /**
    * The inputs to the computation.
    */
  var inputs: js.UndefOr[js.Array[SchemaStreamLocation]] = js.native
  /**
    * The key ranges processed by the computation.
    */
  var keyRanges: js.UndefOr[js.Array[SchemaKeyRangeLocation]] = js.native
  /**
    * The outputs from the computation.
    */
  var outputs: js.UndefOr[js.Array[SchemaStreamLocation]] = js.native
  /**
    * The state family values.
    */
  var stateFamilies: js.UndefOr[js.Array[SchemaStateFamilyConfig]] = js.native
  /**
    * The system stage name.
    */
  var systemStageName: js.UndefOr[String] = js.native
}

object SchemaComputationTopology {
  @scala.inline
  def apply(): SchemaComputationTopology = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaComputationTopology]
  }
  @scala.inline
  implicit class SchemaComputationTopologyOps[Self <: SchemaComputationTopology] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComputationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComputationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computationId")(js.undefined)
        ret
    }
    @scala.inline
    def withInputs(value: js.Array[SchemaStreamLocation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputs")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyRanges(value: js.Array[SchemaKeyRangeLocation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyRanges")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputs(value: js.Array[SchemaStreamLocation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputs")(js.undefined)
        ret
    }
    @scala.inline
    def withStateFamilies(value: js.Array[SchemaStateFamilyConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateFamilies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateFamilies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateFamilies")(js.undefined)
        ret
    }
    @scala.inline
    def withSystemStageName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemStageName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSystemStageName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemStageName")(js.undefined)
        ret
    }
  }
  
}

