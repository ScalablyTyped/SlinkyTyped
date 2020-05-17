package typingsSlinky.enzyme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type EnzymePropSelector = org.scalablytyped.runtime.StringDictionary[js.Any]
  type HTMLAttributes = typingsSlinky.react.mod.AllHTMLAttributes[js.Object] with typingsSlinky.react.mod.SVGAttributes[js.Object]
  type Intercepter[T] = js.Function1[/* intercepter */ T, scala.Unit]
  type Parameters[T] = js.Any
  type StatelessComponent[Props] = js.Function2[
    /* props */ Props, 
    /* context */ js.UndefOr[js.Any], 
    slinky.core.facade.ReactElement | scala.Null
  ]
}
