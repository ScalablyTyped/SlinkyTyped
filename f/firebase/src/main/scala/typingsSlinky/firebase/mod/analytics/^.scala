package typingsSlinky.firebase.mod.analytics

import typingsSlinky.firebase.mod.app.App
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("firebase", "analytics")
@js.native
object ^ extends js.Object {
  
  /**
    * Gets the {@link firebase.analytics.Analytics `Analytics`} service.
    *
    * `firebase.analytics()` can be called with no arguments to access the default
    * app's {@link firebase.analytics.Analytics `Analytics`} service.
    *
    * @webonly
    *
    * @example
    * ```javascript
    * // Get the Analytics service for the default app
    * const defaultAnalytics = firebase.analytics();
    * ```
    *
    * @param app The app to create an analytics service for.
    * If not passed, uses the default app.
    */
  def apply(): Analytics = js.native
  def apply(app: App): Analytics = js.native
}
