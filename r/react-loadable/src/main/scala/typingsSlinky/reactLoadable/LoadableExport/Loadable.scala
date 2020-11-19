package typingsSlinky.reactLoadable.LoadableExport

import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Loadable extends js.Object {
  
  def apply[Props, Exports /* <: js.Object */](options: Options[Props, Exports]): ReactComponentClass[Props] with LoadableComponent = js.native
  
  var Capture: ReactComponentClass[LoadableCaptureProps] = js.native
  
  def Map[Props, Exports /* <: StringDictionary[js.Any] */](options: OptionsWithMap[Props, Exports]): ReactComponentClass[Props] with LoadableComponent = js.native
  
  /**
    * This will call all of the LoadableComponent.preload methods recursively until they are all
    * resolved. Allowing you to preload all of your dynamic modules in environments like the server.
    * ```ts
    * Loadable.preloadAll().then(() => {
    *   app.listen(3000, () => {
    *     console.log('Running on http://localhost:3000/');
    *   });
    * });
    * ```
    */
  def preloadAll(): js.Promise[Unit] = js.native
  
  /**
    * Check for modules that are already loaded in the browser and call the matching
    * `LoadableComponent.preload` methods.
    * ```ts
    * window.main = () => {
    *   Loadable.preloadReady().then(() => {
    *     ReactDOM.hydrate(
    *       <App/>,
    *       document.getElementById('app'),
    *     );
    *   });
    * };
    * ```
    */
  def preloadReady(): js.Promise[Unit] = js.native
}
