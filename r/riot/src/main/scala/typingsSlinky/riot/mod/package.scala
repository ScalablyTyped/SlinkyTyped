package typingsSlinky.riot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ComponentEnhancer = js.Function1[
    /* component */ typingsSlinky.riot.mod.RiotComponent[js.Any, js.Any], 
    typingsSlinky.riot.mod.RiotComponent[js.Any, js.Any]
  ]
  type InstalledPluginsSet = typingsSlinky.std.Set[typingsSlinky.riot.mod.ComponentEnhancer]
  type PureComponentFactoryFunction[InitialProps, Context] = js.Function1[
    /* hasSlotsAttributesProps */ typingsSlinky.riot.anon.Attributes[InitialProps], 
    typingsSlinky.riot.mod.RiotPureComponent[Context]
  ]
  type RegisteredComponentsMap = typingsSlinky.std.Map[
    java.lang.String, 
    js.Function0[typingsSlinky.riot.mod.RiotComponent[js.Object, js.Object]]
  ]
}
