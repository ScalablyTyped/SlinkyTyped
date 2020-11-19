package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCrowdingConfig(value: SchemaSourceCrowdingConfig): Self = this.set("crowdingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrowdingConfig: Self = this.set("crowdingConfig", js.undefined)
    
    @scala.inline
    def setScoringConfig(value: SchemaSourceScoringConfig): Self = this.set("scoringConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScoringConfig: Self = this.set("scoringConfig", js.undefined)
    
    @scala.inline
    def setSource(value: SchemaSource): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
}
