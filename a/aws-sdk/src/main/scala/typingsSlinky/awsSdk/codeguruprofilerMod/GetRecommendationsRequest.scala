package typingsSlinky.awsSdk.codeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRecommendationsRequest extends StObject {
  
  /**
    *  The start time of the profile to get analysis data about. You must specify startTime and endTime. This is specified using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC. 
    */
  var endTime: js.Date = js.native
  
  /**
    *  The language used to provide analysis. Specify using a string that is one of the following BCP 47 language codes.     de-DE - German, Germany     en-GB - English, United Kingdom     en-US - English, United States     es-ES - Spanish, Spain     fr-FR - French, France     it-IT - Italian, Italy     ja-JP - Japanese, Japan     ko-KR - Korean, Republic of Korea     pt-BR - Portugese, Brazil     zh-CN - Chinese, China     zh-TW - Chinese, Taiwan   
    */
  var locale: js.UndefOr[Locale] = js.native
  
  /**
    *  The name of the profiling group to get analysis data about. 
    */
  var profilingGroupName: ProfilingGroupName = js.native
  
  /**
    *  The end time of the profile to get analysis data about. You must specify startTime and endTime. This is specified using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC. 
    */
  var startTime: js.Date = js.native
}
object GetRecommendationsRequest {
  
  @scala.inline
  def apply(endTime: js.Date, profilingGroupName: ProfilingGroupName, startTime: js.Date): GetRecommendationsRequest = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], profilingGroupName = profilingGroupName.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRecommendationsRequest]
  }
  
  @scala.inline
  implicit class GetRecommendationsRequestMutableBuilder[Self <: GetRecommendationsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndTime(value: js.Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setProfilingGroupName(value: ProfilingGroupName): Self = StObject.set(x, "profilingGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
  }
}
