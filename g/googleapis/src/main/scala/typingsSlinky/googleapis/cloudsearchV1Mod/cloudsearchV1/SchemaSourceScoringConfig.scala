package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Set the scoring configuration. This allows modifying the ranking of results
  * for a source.
  */
@js.native
trait SchemaSourceScoringConfig extends js.Object {
  /**
    * Importance of the source.
    */
  var sourceImportance: js.UndefOr[String] = js.native
}

object SchemaSourceScoringConfig {
  @scala.inline
  def apply(): SchemaSourceScoringConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSourceScoringConfig]
  }
  @scala.inline
  implicit class SchemaSourceScoringConfigOps[Self <: SchemaSourceScoringConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSourceImportance(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceImportance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceImportance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceImportance")(js.undefined)
        ret
    }
  }
  
}

