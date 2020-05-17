package typingsSlinky.preact.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentClass[P, S]
  extends typingsSlinky.preact.internalMod.ComponentFactory[P]
     with ComponentType[P]
     with Instantiable1[/* props */ P, Component[P, S]]
     with Instantiable2[/* props */ P, /* context */ js.Any, Component[P, S]] {
  var defaultProps: js.UndefOr[Partial[P]] = js.native
  var displayName: js.UndefOr[String] = js.native
  var getDerivedStateFromError: js.UndefOr[js.Function1[/* error */ js.Any, Partial[S] | Null]] = js.native
  var getDerivedStateFromProps: js.UndefOr[js.Function2[/* props */ P, /* state */ S, Partial[S] | Null]] = js.native
}

