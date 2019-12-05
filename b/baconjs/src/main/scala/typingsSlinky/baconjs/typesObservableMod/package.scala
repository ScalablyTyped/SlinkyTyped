package typingsSlinky.baconjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesObservableMod {
  import typingsSlinky.baconjs.typesDescribeMod.Desc
  import typingsSlinky.baconjs.typesTypesMod.Subscribe

  type ObservableConstructor = js.Function2[/* description */ Desc, /* subscribe */ Subscribe[js.Any], Observable[js.Any]]
}
