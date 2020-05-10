package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specification of one of the bundles produced as a result of splitting a
  * Source (e.g. when executing a SourceSplitRequest, or when splitting an
  * active task using WorkItemStatus.dynamic_source_split), relative to the
  * source being split.
  */
@js.native
trait SchemaDerivedSource extends js.Object {
  /**
    * What source to base the produced source on (if any).
    */
  var derivationMode: js.UndefOr[String] = js.native
  /**
    * Specification of the source.
    */
  var source: js.UndefOr[SchemaSource] = js.native
}

object SchemaDerivedSource {
  @scala.inline
  def apply(): SchemaDerivedSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDerivedSource]
  }
  @scala.inline
  implicit class SchemaDerivedSourceOps[Self <: SchemaDerivedSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDerivationMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("derivationMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDerivationMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("derivationMode")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: SchemaSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
  }
  
}

