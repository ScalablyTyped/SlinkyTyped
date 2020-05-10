package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configurations for a source while processing a Search or Suggest request.
  */
@js.native
trait SchemaSourceConfig extends js.Object {
  /**
    * The crowding configuration for the source.
    */
  var crowdingConfig: js.UndefOr[SchemaSourceCrowdingConfig] = js.native
  /**
    * The scoring configuration for the source.
    */
  var scoringConfig: js.UndefOr[SchemaSourceScoringConfig] = js.native
  /**
    * The source for which this configuration is to be used.
    */
  var source: js.UndefOr[SchemaSource] = js.native
}

object SchemaSourceConfig {
  @scala.inline
  def apply(): SchemaSourceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSourceConfig]
  }
  @scala.inline
  implicit class SchemaSourceConfigOps[Self <: SchemaSourceConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCrowdingConfig(value: SchemaSourceCrowdingConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crowdingConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrowdingConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crowdingConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withScoringConfig(value: SchemaSourceScoringConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scoringConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScoringConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scoringConfig")(js.undefined)
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

