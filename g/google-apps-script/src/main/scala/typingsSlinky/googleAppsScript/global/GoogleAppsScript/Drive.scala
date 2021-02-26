package typingsSlinky.googleAppsScript.global.GoogleAppsScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Drive {
  
  /**
    * An enum representing classes of users who can access a file or folder, besides any individual
    * users who have been explicitly given access. These properties can be accessed from DriveApp.Access.
    *
    *     // Creates a folder that anyone on the Internet can read from and write to. (Domain
    *     // administrators can prohibit this setting for users of a G Suite domain.)
    *     var folder = DriveApp.createFolder('Shared Folder');
    *     folder.setSharing(DriveApp.Access.ANYONE, DriveApp.Permission.EDIT);
    */
  @JSGlobal("GoogleAppsScript.Drive.Access")
  @js.native
  object Access extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.Access with Double] = js.native
    
    /* 0 */ val ANYONE: typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.Access.ANYONE with Double = js.native
    
    /* 1 */ val ANYONE_WITH_LINK: typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.Access.ANYONE_WITH_LINK with Double = js.native
    
    /* 2 */ val DOMAIN: typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.Access.DOMAIN with Double = js.native
    
    /* 3 */ val DOMAIN_WITH_LINK: typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.Access.DOMAIN_WITH_LINK with Double = js.native
    
    /* 4 */ val PRIVATE: typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.Access.PRIVATE with Double = js.native
  }
  
  /**
    * An enum representing the permissions granted to users who can access a file or folder, besides
    * any individual users who have been explicitly given access. These properties can be accessed from
    * DriveApp.Permission.
    *
    *     // Creates a folder that anyone on the Internet can read from and write to. (Domain
    *     // administrators can prohibit this setting for G Suite users.)
    *     var folder = DriveApp.createFolder('Shared Folder');
    *     folder.setSharing(DriveApp.Access.ANYONE, DriveApp.Permission.EDIT);
    */
  @JSGlobal("GoogleAppsScript.Drive.Permission")
  @js.native
  object Permission extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.Permission with Double] = js.native
    
    /* 2 */ val COMMENT: typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.Permission.COMMENT with Double = js.native
    
    /* 1 */ val EDIT: typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.Permission.EDIT with Double = js.native
    
    /* 5 */ val NONE: typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.Permission.NONE with Double = js.native
    
    /* 4 */ val ORGANIZER: typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.Permission.ORGANIZER with Double = js.native
    
    /* 3 */ val OWNER: typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.Permission.OWNER with Double = js.native
    
    /* 0 */ val VIEW: typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.Permission.VIEW with Double = js.native
  }
}
