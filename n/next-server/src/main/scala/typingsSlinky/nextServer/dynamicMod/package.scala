package typingsSlinky.nextServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dynamicMod {
  type LoadableComponent[P] = slinky.core.ReactComponentClass[P]
  type LoadableFn[P] = js.Function1[
    /* opts */ typingsSlinky.nextServer.dynamicMod.LoadableOptions[P], 
    slinky.core.ReactComponentClass[P]
  ]
  type Loader[P] = js.Function0[typingsSlinky.nextServer.dynamicMod.LoaderComponent[P]] | typingsSlinky.nextServer.dynamicMod.LoaderComponent[P]
  type LoaderComponent[P] = js.Promise[slinky.core.ReactComponentClass[P] | typingsSlinky.nextServer.AnonDefault[P]]
  type LoaderMap = org.scalablytyped.runtime.StringDictionary[js.Function0[typingsSlinky.nextServer.dynamicMod.Loader[js.Any]]]
}
