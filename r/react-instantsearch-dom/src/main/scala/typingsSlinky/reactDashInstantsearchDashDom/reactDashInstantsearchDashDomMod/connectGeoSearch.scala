package typingsSlinky.reactDashInstantsearchDashDom.reactDashInstantsearchDashDomMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.reactMod.ComponentType
import typingsSlinky.react.reactMod.StatelessComponent
import typingsSlinky.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod.ConnectedComponentClass
import typingsSlinky.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod.GeoSearchExposed
import typingsSlinky.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod.GeoSearchProvided
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-instantsearch-dom", "connectGeoSearch")
@js.native
object connectGeoSearch extends js.Object {
  def apply(stateless: StatelessComponent[GeoSearchProvided[_]]): ReactComponentClass[GeoSearchExposed] = js.native
  def apply[TProps /* <: Partial[GeoSearchProvided[THit]] */, THit](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, GeoSearchProvided[THit], GeoSearchExposed] = js.native
}

