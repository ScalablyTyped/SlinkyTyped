package typingsSlinky.nextDashServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distLibDynamicMod {
  import org.scalablytyped.runtime.StringDictionary
  import slinky.core.ReactComponentClass
  import typingsSlinky.nextDashServer.Anon_Default
  import typingsSlinky.nextDashServer.Anon_HasErrorIsLoadingPastDelay
  import typingsSlinky.nextDashServer.Anon_Loaded
  import typingsSlinky.nextDashServer.Anon_Loader

  type DynamicOptions[P] = LoadableBaseOptions[P] with Anon_Loaded[P]
  type LoadableBaseOptions[P] = LoadableGeneratedOptions with Anon_HasErrorIsLoadingPastDelay[P]
  type LoadableComponent[P] = ReactComponentClass[P]
  type LoadableFn[P] = js.Function1[/* opts */ LoadableOptions[P], ReactComponentClass[P]]
  type LoadableOptions[P] = LoadableBaseOptions[P] with Anon_Loader
  type Loader[P] = js.Function0[LoaderComponent[P]] | LoaderComponent[P]
  type LoaderComponent[P] = js.Promise[ReactComponentClass[P] | Anon_Default[P]]
  type LoaderMap = StringDictionary[js.Function0[Loader[js.Any]]]
}
