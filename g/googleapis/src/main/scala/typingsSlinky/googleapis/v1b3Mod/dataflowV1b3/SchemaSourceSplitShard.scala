package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DEPRECATED in favor of DerivedSource.
  */
@js.native
trait SchemaSourceSplitShard extends js.Object {
  /**
    * DEPRECATED
    */
  var derivationMode: js.UndefOr[String] = js.native
  /**
    * DEPRECATED
    */
  var source: js.UndefOr[SchemaSource] = js.native
}

object SchemaSourceSplitShard {
  @scala.inline
  def apply(): SchemaSourceSplitShard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSourceSplitShard]
  }
  @scala.inline
  implicit class SchemaSourceSplitShardOps[Self <: SchemaSourceSplitShard] (val x: Self) extends AnyVal {
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

