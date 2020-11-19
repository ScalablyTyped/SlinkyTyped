package typingsSlinky.googleAppsScript.global.GoogleAppsScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("GoogleAppsScript.Sites")
@js.native
object Sites extends js.Object {
  
  /**
    * A typesafe enum for sites attachment type.
    * A rebuilt
    * version of Sites was launched on November 22, 2016. Apps Script cannot currently access or
    * modify Sites made with this version, but script can still access
    * classic Sites.
    */
  @js.native
  object AttachmentType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Sites.AttachmentType with Double] = js.native
    
    /* 1 */ val HOSTED: typingsSlinky.googleAppsScript.GoogleAppsScript.Sites.AttachmentType.HOSTED with Double = js.native
    
    /* 0 */ val WEB: typingsSlinky.googleAppsScript.GoogleAppsScript.Sites.AttachmentType.WEB with Double = js.native
  }
  
  /**
    * A typesafe enum for sites page type.
    * A rebuilt
    * version of Sites was launched on November 22, 2016. Apps Script cannot currently access or
    * modify Sites made with this version, but script can still access
    * classic Sites.
    */
  @js.native
  object PageType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Sites.PageType with Double] = js.native
    
    /* 2 */ val ANNOUNCEMENT: typingsSlinky.googleAppsScript.GoogleAppsScript.Sites.PageType.ANNOUNCEMENT with Double = js.native
    
    /* 3 */ val ANNOUNCEMENTS_PAGE: typingsSlinky.googleAppsScript.GoogleAppsScript.Sites.PageType.ANNOUNCEMENTS_PAGE with Double = js.native
    
    /* 4 */ val FILE_CABINET_PAGE: typingsSlinky.googleAppsScript.GoogleAppsScript.Sites.PageType.FILE_CABINET_PAGE with Double = js.native
    
    /* 1 */ val LIST_PAGE: typingsSlinky.googleAppsScript.GoogleAppsScript.Sites.PageType.LIST_PAGE with Double = js.native
    
    /* 0 */ val WEB_PAGE: typingsSlinky.googleAppsScript.GoogleAppsScript.Sites.PageType.WEB_PAGE with Double = js.native
  }
}
