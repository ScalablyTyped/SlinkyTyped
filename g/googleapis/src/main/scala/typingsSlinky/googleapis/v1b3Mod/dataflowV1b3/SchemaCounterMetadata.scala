package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CounterMetadata includes all static non-name non-value counter attributes.
  */
@js.native
trait SchemaCounterMetadata extends js.Object {
  /**
    * Human-readable description of the counter semantics.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Counter aggregation kind.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * A string referring to the unit type.
    */
  var otherUnits: js.UndefOr[String] = js.native
  /**
    * System defined Units, see above enum.
    */
  var standardUnits: js.UndefOr[String] = js.native
}

object SchemaCounterMetadata {
  @scala.inline
  def apply(): SchemaCounterMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCounterMetadata]
  }
  @scala.inline
  implicit class SchemaCounterMetadataOps[Self <: SchemaCounterMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withOtherUnits(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otherUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOtherUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otherUnits")(js.undefined)
        ret
    }
    @scala.inline
    def withStandardUnits(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standardUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStandardUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standardUnits")(js.undefined)
        ret
    }
  }
  
}

