package typingsSlinky.googleAppsScript.global.GoogleAppsScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ConferenceData {
  
  /**
    * Enum that defines the types of errors that you can specify in a ConferenceError.
    */
  @JSGlobal("GoogleAppsScript.Conference_Data.ConferenceErrorType")
  @js.native
  object ConferenceErrorType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.googleAppsScript.GoogleAppsScript.ConferenceData.ConferenceErrorType with Double
      ] = js.native
    
    /* 0 */ val AUTHENTICATION: typingsSlinky.googleAppsScript.GoogleAppsScript.ConferenceData.ConferenceErrorType.AUTHENTICATION with Double = js.native
    
    /* 1 */ val CONFERENCE_SOLUTION_FORBIDDEN: typingsSlinky.googleAppsScript.GoogleAppsScript.ConferenceData.ConferenceErrorType.CONFERENCE_SOLUTION_FORBIDDEN with Double = js.native
    
    /* 2 */ val PERMANENT: typingsSlinky.googleAppsScript.GoogleAppsScript.ConferenceData.ConferenceErrorType.PERMANENT with Double = js.native
    
    /* 3 */ val PERMISSION_DENIED: typingsSlinky.googleAppsScript.GoogleAppsScript.ConferenceData.ConferenceErrorType.PERMISSION_DENIED with Double = js.native
    
    /* 4 */ val TEMPORARY: typingsSlinky.googleAppsScript.GoogleAppsScript.ConferenceData.ConferenceErrorType.TEMPORARY with Double = js.native
    
    /* 5 */ val UNKNOWN: typingsSlinky.googleAppsScript.GoogleAppsScript.ConferenceData.ConferenceErrorType.UNKNOWN with Double = js.native
  }
  
  /**
    * Enum that defines the features of the entry point that can be created by a conferencing add-on.
    */
  @JSGlobal("GoogleAppsScript.Conference_Data.EntryPointFeature")
  @js.native
  object EntryPointFeature extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.googleAppsScript.GoogleAppsScript.ConferenceData.EntryPointFeature with Double
      ] = js.native
    
    /* 1 */ val TOLL: typingsSlinky.googleAppsScript.GoogleAppsScript.ConferenceData.EntryPointFeature.TOLL with Double = js.native
    
    /* 2 */ val TOLL_FREE: typingsSlinky.googleAppsScript.GoogleAppsScript.ConferenceData.EntryPointFeature.TOLL_FREE with Double = js.native
    
    /* 0 */ val UNKNOWN_FEATURE: typingsSlinky.googleAppsScript.GoogleAppsScript.ConferenceData.EntryPointFeature.UNKNOWN_FEATURE with Double = js.native
  }
  
  /**
    * Enum that defines the types of entry points that can be created by a conferencing add-on.
    */
  @JSGlobal("GoogleAppsScript.Conference_Data.EntryPointType")
  @js.native
  object EntryPointType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.googleAppsScript.GoogleAppsScript.ConferenceData.EntryPointType with Double
      ] = js.native
    
    /* 2 */ val MORE: typingsSlinky.googleAppsScript.GoogleAppsScript.ConferenceData.EntryPointType.MORE with Double = js.native
    
    /* 1 */ val PHONE: typingsSlinky.googleAppsScript.GoogleAppsScript.ConferenceData.EntryPointType.PHONE with Double = js.native
    
    /* 3 */ val SIP: typingsSlinky.googleAppsScript.GoogleAppsScript.ConferenceData.EntryPointType.SIP with Double = js.native
    
    /* 0 */ val VIDEO: typingsSlinky.googleAppsScript.GoogleAppsScript.ConferenceData.EntryPointType.VIDEO with Double = js.native
  }
}
