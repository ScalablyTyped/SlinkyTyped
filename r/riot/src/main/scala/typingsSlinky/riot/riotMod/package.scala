package typingsSlinky.riot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object riotMod {
  import typingsSlinky.riot.Anon_Attributes
  import typingsSlinky.std.Map
  import typingsSlinky.std.Set

  type ComponentEnhancer = js.Function1[/* component */ RiotComponent[js.Any, js.Any], RiotComponent[js.Any, js.Any]]
  type InstalledPluginsSet = Set[ComponentEnhancer]
  type PureComponentFactoryFunction[InitialProps, Context] = js.Function1[
    /* hasSlotsAttributesProps */ Anon_Attributes[InitialProps], 
    RiotPureComponent[Context]
  ]
  type RegisteredComponentsMap = Map[String, js.Function0[RiotComponent[js.Object, js.Object]]]
}
