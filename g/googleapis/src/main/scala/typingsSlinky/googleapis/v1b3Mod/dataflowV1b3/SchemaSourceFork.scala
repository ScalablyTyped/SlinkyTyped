package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DEPRECATED in favor of DynamicSourceSplit.
  */
@js.native
trait SchemaSourceFork extends js.Object {
  /**
    * DEPRECATED
    */
  var primary: js.UndefOr[SchemaSourceSplitShard] = js.native
  /**
    * DEPRECATED
    */
  var primarySource: js.UndefOr[SchemaDerivedSource] = js.native
  /**
    * DEPRECATED
    */
  var residual: js.UndefOr[SchemaSourceSplitShard] = js.native
  /**
    * DEPRECATED
    */
  var residualSource: js.UndefOr[SchemaDerivedSource] = js.native
}

object SchemaSourceFork {
  @scala.inline
  def apply(): SchemaSourceFork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSourceFork]
  }
  @scala.inline
  implicit class SchemaSourceForkOps[Self <: SchemaSourceFork] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrimary(value: SchemaSourceSplitShard): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primary")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimarySource(value: SchemaDerivedSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primarySource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimarySource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primarySource")(js.undefined)
        ret
    }
    @scala.inline
    def withResidual(value: SchemaSourceSplitShard): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("residual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResidual: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("residual")(js.undefined)
        ret
    }
    @scala.inline
    def withResidualSource(value: SchemaDerivedSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("residualSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResidualSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("residualSource")(js.undefined)
        ret
    }
  }
  
}

