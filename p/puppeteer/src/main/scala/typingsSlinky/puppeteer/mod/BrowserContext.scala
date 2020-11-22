package typingsSlinky.puppeteer.mod

import typingsSlinky.puppeteer.puppeteerStrings.targetchanged
import typingsSlinky.puppeteer.puppeteerStrings.targetcreated
import typingsSlinky.puppeteer.puppeteerStrings.targetdestroyed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrowserContext
  extends EventEmitter
     with TargetAwaiter {
  
  /** The browser this browser context belongs to. */
  def browser(): Browser = js.native
  
  /**
    * Clears all permission overrides for the browser context.
    */
  def clearPermissionOverrides(): js.Promise[Unit] = js.native
  
  /** Closes the browser context. All the targets that belong to the browser context will be closed. */
  def close(): js.Promise[Unit] = js.native
  
  /**
    * Returns whether BrowserContext is incognito.
    * The default browser context is the only non-incognito browser context.
    */
  def isIncognito(): Boolean = js.native
  
  /** Creates a new page in the browser context. */
  def newPage(): js.Promise[Page] = js.native
  
  /**
    * Adds the listener function to the end of the listeners array for the event named `eventName`.
    * No checks are made to see if the listener has already been added. Multiple calls passing the same combination of
    * `eventName` and listener will result in the listener being added, and called, multiple times.
    * @param event The name of the event.
    * @param handler The callback function.
    */
  @JSName("on")
  def on_targetchanged(eventName: targetchanged, handler: js.Function2[/* e */ Target, /* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_targetcreated(eventName: targetcreated, handler: js.Function2[/* e */ Target, /* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_targetdestroyed(eventName: targetdestroyed, handler: js.Function2[/* e */ Target, /* repeated */ js.Any, Unit]): this.type = js.native
  
  /**
    * Adds a one time listener function for the event named `eventName`.
    * The next time `eventName` is triggered, this listener is removed and then invoked.
    * @param event The name of the event.
    * @param handler The callback function.
    */
  @JSName("once")
  def once_targetchanged(eventName: targetchanged, handler: js.Function2[/* e */ Target, /* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("once")
  def once_targetcreated(eventName: targetcreated, handler: js.Function2[/* e */ Target, /* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("once")
  def once_targetdestroyed(eventName: targetdestroyed, handler: js.Function2[/* e */ Target, /* repeated */ js.Any, Unit]): this.type = js.native
  
  /**
    *
    * @param origin The origin to grant permissions to, e.g. "https://example.com".
    * @param permissions An array of permissions to grant.
    * All permissions that are not listed here will be automatically denied.
    */
  def overridePermissions(origin: String, permissions: js.Array[Permission]): js.Promise[Unit] = js.native
  
  /** Promise which resolves to an array of all open pages. */
  def pages(): js.Promise[js.Array[Page]] = js.native
  
  /** An array of all active targets inside the browser context. */
  def targets(): js.Array[Target] = js.native
}
