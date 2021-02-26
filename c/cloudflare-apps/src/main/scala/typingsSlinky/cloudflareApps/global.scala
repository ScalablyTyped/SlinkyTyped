package typingsSlinky.cloudflareApps

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.cloudflareApps.CloudflareApps.InstallOptions
import typingsSlinky.cloudflareApps.CloudflareApps.InstallProduct
import typingsSlinky.cloudflareApps.CloudflareApps.InstallScope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object CloudflareApps extends Shortcut {
    
    @JSGlobal("CloudflareApps")
    @js.native
    val ^ : typingsSlinky.cloudflareApps.CloudflareApps.CloudflareApps = js.native
    
    type _To = typingsSlinky.cloudflareApps.CloudflareApps.CloudflareApps
    
    /* This means you don't have to write `^`, but can instead just say `CloudflareApps.foo` */
    override def _to: typingsSlinky.cloudflareApps.CloudflareApps.CloudflareApps = ^
  }
  
  /**
    * It's the same as CloudflareApps variable.
    *
    * DON'T use this variable directly.
    * BAD Example:
    * ```ts
    * const apps: cloudflareApps.CloudflareApps = INSTALL;
    * ```
    * -------------------------------------------------
    * Use directly properties and methods.
    * GOOD Example:
    * ```ts
    * const siteId: string = INSTALL.siteId;
    * ```
    */
  @JSGlobal("INSTALL")
  @js.native
  val INSTALL: typingsSlinky.cloudflareApps.CloudflareApps.CloudflareApps = js.native
  
  /**
    * A string ID which is equal to the ID of this install.
    * Its primary purpose is to allow you to easily distinguish between your app being loaded
    * in the Cloudflare Preview or the installer’s live website.
    */
  @JSGlobal("INSTALL_ID")
  @js.native
  val INSTALL_ID: String = js.native
  
  @JSGlobal("INSTALL_OPTIONS")
  @js.native
  val INSTALL_OPTIONS: InstallOptions = js.native
  
  /**
    * This object is specific to paid apps. It allows you to know which product the user has purchased.
    * When you create a paid app you will be given product ids for each of the plans you wish to sell the product for.
    * `INSTALL_PRODUCT.id` will then be that id for the plan the user has purchased.
    * This value is absent for free apps and will always be set for paid apps even if the user is on a free plan.
    */
  @JSGlobal("INSTALL_PRODUCT")
  @js.native
  val INSTALL_PRODUCT: js.UndefOr[InstallProduct] = js.native
  
  /**
    * An object which you can use to store arbitrary values
    * which you would like to be accessable from other Cloudflare scripts,
    * without polluting the global scope.
    * For example, it’s commonly used to share an update function with its update handler.
    */
  @JSGlobal("INSTALL_SCOPE")
  @js.native
  val INSTALL_SCOPE: InstallScope = js.native
}
