package typingsSlinky.chromeApps.chrome.runtime

import typingsSlinky.chromeApps.anon.CHROMEUPDATE
import typingsSlinky.chromeApps.chrome.ToStringLiteral
import typingsSlinky.chromeApps.chromeAppsStrings.CHROME_UPDATE
import typingsSlinky.chromeApps.chromeAppsStrings.INSTALL
import typingsSlinky.chromeApps.chromeAppsStrings.SHARED_MODULE_UPDATE
import typingsSlinky.chromeApps.chromeAppsStrings.UPDATE
import typingsSlinky.chromeApps.chromeAppsStrings.chrome_update_
import typingsSlinky.chromeApps.chromeAppsStrings.install_
import typingsSlinky.chromeApps.chromeAppsStrings.shared_module_update_
import typingsSlinky.chromeApps.chromeAppsStrings.update_
import typingsSlinky.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstalledDetails extends StObject {
  
  /**
    * Optional.
    * Indicates the ID of the imported shared module extension which updated. This is present only if 'reason' is 'shared_module_update'.
    * @since Chrome 29.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Optional.
    * Indicates the previous version of the extension, which has just been updated. This is present only if 'reason' is 'update'.
    */
  var previousVersion: js.UndefOr[String] = js.native
  
  /**
    * The reason that this event is being dispatched.
    * @see enum OnInstalledReason
    */
  var reason: ToStringLiteral[
    CHROMEUPDATE, 
    /* keyof chrome-apps.anon.CHROMEUPDATE */ INSTALL | UPDATE | CHROME_UPDATE | SHARED_MODULE_UPDATE, 
    Exclude[
      /* keyof chrome-apps.anon.CHROMEUPDATE */ INSTALL | UPDATE | CHROME_UPDATE | SHARED_MODULE_UPDATE, 
      install_ | update_ | chrome_update_ | shared_module_update_
    ]
  ] = js.native
}
object InstalledDetails {
  
  @scala.inline
  def apply(
    reason: ToStringLiteral[
      CHROMEUPDATE, 
      /* keyof chrome-apps.anon.CHROMEUPDATE */ INSTALL | UPDATE | CHROME_UPDATE | SHARED_MODULE_UPDATE, 
      Exclude[
        /* keyof chrome-apps.anon.CHROMEUPDATE */ INSTALL | UPDATE | CHROME_UPDATE | SHARED_MODULE_UPDATE, 
        install_ | update_ | chrome_update_ | shared_module_update_
      ]
    ]
  ): InstalledDetails = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstalledDetails]
  }
  
  @scala.inline
  implicit class InstalledDetailsMutableBuilder[Self <: InstalledDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setPreviousVersion(value: String): Self = StObject.set(x, "previousVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousVersionUndefined: Self = StObject.set(x, "previousVersion", js.undefined)
    
    @scala.inline
    def setReason(
      value: ToStringLiteral[
          CHROMEUPDATE, 
          /* keyof chrome-apps.anon.CHROMEUPDATE */ INSTALL | UPDATE | CHROME_UPDATE | SHARED_MODULE_UPDATE, 
          Exclude[
            /* keyof chrome-apps.anon.CHROMEUPDATE */ INSTALL | UPDATE | CHROME_UPDATE | SHARED_MODULE_UPDATE, 
            install_ | update_ | chrome_update_ | shared_module_update_
          ]
        ]
    ): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
