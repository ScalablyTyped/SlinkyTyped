package typingsSlinky.gapiClientGamesconfiguration.gapi.client.gamesconfiguration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AchievementConfiguration extends js.Object {
  
  /**
    * The type of the achievement.
    * Possible values are:
    * - "STANDARD" - Achievement is either locked or unlocked.
    * - "INCREMENTAL" - Achievement is incremental.
    */
  var achievementType: js.UndefOr[String] = js.native
  
  /** The draft data of the achievement. */
  var draft: js.UndefOr[AchievementConfigurationDetail] = js.native
  
  /** The ID of the achievement. */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The initial state of the achievement.
    * Possible values are:
    * - "HIDDEN" - Achievement is hidden.
    * - "REVEALED" - Achievement is revealed.
    * - "UNLOCKED" - Achievement is unlocked.
    */
  var initialState: js.UndefOr[String] = js.native
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string gamesConfiguration#achievementConfiguration. */
  var kind: js.UndefOr[String] = js.native
  
  /** The read-only published data of the achievement. */
  var published: js.UndefOr[AchievementConfigurationDetail] = js.native
  
  /** Steps to unlock. Only applicable to incremental achievements. */
  var stepsToUnlock: js.UndefOr[Double] = js.native
  
  /** The token for this resource. */
  var token: js.UndefOr[String] = js.native
}
object AchievementConfiguration {
  
  @scala.inline
  def apply(): AchievementConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AchievementConfiguration]
  }
  
  @scala.inline
  implicit class AchievementConfigurationOps[Self <: AchievementConfiguration] (val x: Self) extends AnyVal {
    
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
    def setAchievementType(value: String): Self = this.set("achievementType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAchievementType: Self = this.set("achievementType", js.undefined)
    
    @scala.inline
    def setDraft(value: AchievementConfigurationDetail): Self = this.set("draft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraft: Self = this.set("draft", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setInitialState(value: String): Self = this.set("initialState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialState: Self = this.set("initialState", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setPublished(value: AchievementConfigurationDetail): Self = this.set("published", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublished: Self = this.set("published", js.undefined)
    
    @scala.inline
    def setStepsToUnlock(value: Double): Self = this.set("stepsToUnlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStepsToUnlock: Self = this.set("stepsToUnlock", js.undefined)
    
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
  }
}
