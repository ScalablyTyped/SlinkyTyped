package typingsSlinky.reactInstantsearchCore.mod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.ComponentType
import typingsSlinky.react.mod.FunctionComponent
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-instantsearch-core", "connectGeoSearch")
@js.native
object connectGeoSearch extends js.Object {
  
  def apply(stateless: FunctionComponent[GeoSearchProvided[_]]): ReactComponentClass[GeoSearchExposed] = js.native
  def apply[TProps /* <: Partial[GeoSearchProvided[THit]] */, THit](ctor: ComponentType[TProps]): ReactComponentClass[(Omit[TProps, GeoSearchProvided[THit]]) with GeoSearchExposed] = js.native
}
