package typingsSlinky.googleapis.v1configurationMod.gamesConfigurationV1configuration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for a leaderboard configuration detail.
  */
@js.native
trait SchemaLeaderboardConfigurationDetail extends StObject {
  
  /**
    * The icon url of this leaderboard. Writes to this field are ignored.
    */
  var iconUrl: js.UndefOr[String] = js.native
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string gamesConfiguration#leaderboardConfigurationDetail.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Localized strings for the leaderboard name.
    */
  var name: js.UndefOr[SchemaLocalizedStringBundle] = js.native
  
  /**
    * The score formatting for the leaderboard.
    */
  var scoreFormat: js.UndefOr[SchemaGamesNumberFormatConfiguration] = js.native
  
  /**
    * The sort rank of this leaderboard. Writes to this field are ignored.
    */
  var sortRank: js.UndefOr[Double] = js.native
}
object SchemaLeaderboardConfigurationDetail {
  
  @scala.inline
  def apply(): SchemaLeaderboardConfigurationDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLeaderboardConfigurationDetail]
  }
  
  @scala.inline
  implicit class SchemaLeaderboardConfigurationDetailMutableBuilder[Self <: SchemaLeaderboardConfigurationDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: SchemaLocalizedStringBundle): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setScoreFormat(value: SchemaGamesNumberFormatConfiguration): Self = StObject.set(x, "scoreFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoreFormatUndefined: Self = StObject.set(x, "scoreFormat", js.undefined)
    
    @scala.inline
    def setSortRank(value: Double): Self = StObject.set(x, "sortRank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortRankUndefined: Self = StObject.set(x, "sortRank", js.undefined)
  }
}
