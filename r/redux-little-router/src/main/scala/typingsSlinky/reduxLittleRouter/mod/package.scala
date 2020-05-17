package typingsSlinky.reduxLittleRouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BlockCallback = js.Function2[
    /* location */ typingsSlinky.reduxLittleRouter.mod.Location, 
    /* action */ js.UndefOr[typingsSlinky.reduxLittleRouter.mod.HistoryAction], 
    java.lang.String
  ]
  type ListenCallback = js.Function2[
    /* location */ typingsSlinky.reduxLittleRouter.mod.Location, 
    /* action */ js.UndefOr[typingsSlinky.reduxLittleRouter.mod.HistoryAction], 
    scala.Unit
  ]
  type ObjectLiteral[T] = org.scalablytyped.runtime.StringDictionary[T]
  type Params = typingsSlinky.reduxLittleRouter.mod.ObjectLiteral[java.lang.String]
  type Query = typingsSlinky.reduxLittleRouter.mod.ObjectLiteral[java.lang.String]
  type Routes = typingsSlinky.reduxLittleRouter.mod.ObjectLiteral[typingsSlinky.reduxLittleRouter.mod.ObjectLiteral[js.Any]]
  type Unsubscribe = js.Function0[scala.Unit]
}
