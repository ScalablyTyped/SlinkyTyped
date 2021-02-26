package typingsSlinky.firebase.mod.default

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object analytics {
  
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
  @scala.inline
  def apply(): typingsSlinky.firebase.mod.firebase.analytics.Analytics = typingsSlinky.firebase.mod.default.analytics.^.asInstanceOf[js.Dynamic].applyDynamic("analytics")().asInstanceOf[typingsSlinky.firebase.mod.firebase.analytics.Analytics]
  @scala.inline
  def apply(app: typingsSlinky.firebase.mod.firebase.app.App): typingsSlinky.firebase.mod.firebase.analytics.Analytics = typingsSlinky.firebase.mod.default.analytics.^.asInstanceOf[js.Dynamic].applyDynamic("analytics")(app.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.firebase.mod.firebase.analytics.Analytics]
  
  type Currency = java.lang.String | scala.Double
  
  type CustomEventName[T] = T
  
  type CustomParams = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  /**
    * An async function that returns true if current browser context supports initialization of analytics module
    * (`firebase.analytics()`).
    *
    * Returns false otherwise.
    *
    *
    */
  @scala.inline
  def isSupported(): js.Promise[scala.Boolean] = typingsSlinky.firebase.mod.default.analytics.^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")().asInstanceOf[js.Promise[scala.Boolean]]
  
  @scala.inline
  def settings(settings: typingsSlinky.firebase.mod.firebase.analytics.SettingsOptions): scala.Unit = typingsSlinky.firebase.mod.default.analytics.^.asInstanceOf[js.Dynamic].applyDynamic("settings")(settings.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
}
