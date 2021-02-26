package typingsSlinky.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoCampaignTargeting extends StObject {
  
  def adSchedules(): AdWordsSelector[AdSchedule] = js.native
  
  def excludedContentLabels(): AdWordsSelector[ExcludedContentLabel] = js.native
  
  def excludedLocations(): AdWordsSelector[ExcludedLocation] = js.native
  
  def languages(): AdWordsSelector[Language] = js.native
  
  def platforms(): AdWordsSelector[Platform] = js.native
  
  def targetedLocations(): AdWordsSelector[TargetedLocation] = js.native
  
  def targetedProximities(): AdWordsSelector[TargetedProximity] = js.native
}
object VideoCampaignTargeting {
  
  @scala.inline
  def apply(
    adSchedules: () => AdWordsSelector[AdSchedule],
    excludedContentLabels: () => AdWordsSelector[ExcludedContentLabel],
    excludedLocations: () => AdWordsSelector[ExcludedLocation],
    languages: () => AdWordsSelector[Language],
    platforms: () => AdWordsSelector[Platform],
    targetedLocations: () => AdWordsSelector[TargetedLocation],
    targetedProximities: () => AdWordsSelector[TargetedProximity]
  ): VideoCampaignTargeting = {
    val __obj = js.Dynamic.literal(adSchedules = js.Any.fromFunction0(adSchedules), excludedContentLabels = js.Any.fromFunction0(excludedContentLabels), excludedLocations = js.Any.fromFunction0(excludedLocations), languages = js.Any.fromFunction0(languages), platforms = js.Any.fromFunction0(platforms), targetedLocations = js.Any.fromFunction0(targetedLocations), targetedProximities = js.Any.fromFunction0(targetedProximities))
    __obj.asInstanceOf[VideoCampaignTargeting]
  }
  
  @scala.inline
  implicit class VideoCampaignTargetingMutableBuilder[Self <: VideoCampaignTargeting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdSchedules(value: () => AdWordsSelector[AdSchedule]): Self = StObject.set(x, "adSchedules", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExcludedContentLabels(value: () => AdWordsSelector[ExcludedContentLabel]): Self = StObject.set(x, "excludedContentLabels", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExcludedLocations(value: () => AdWordsSelector[ExcludedLocation]): Self = StObject.set(x, "excludedLocations", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLanguages(value: () => AdWordsSelector[Language]): Self = StObject.set(x, "languages", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPlatforms(value: () => AdWordsSelector[Platform]): Self = StObject.set(x, "platforms", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTargetedLocations(value: () => AdWordsSelector[TargetedLocation]): Self = StObject.set(x, "targetedLocations", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTargetedProximities(value: () => AdWordsSelector[TargetedProximity]): Self = StObject.set(x, "targetedProximities", js.Any.fromFunction0(value))
  }
}
