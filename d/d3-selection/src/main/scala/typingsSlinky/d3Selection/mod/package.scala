package typingsSlinky.d3Selection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BaseType = org.scalajs.dom.raw.Element | typingsSlinky.d3Selection.mod.EnterElement | typingsSlinky.std.Document_ | typingsSlinky.std.Window_ | scala.Null
  type ContainerElement = org.scalajs.dom.raw.HTMLElement | org.scalajs.dom.raw.SVGSVGElement | org.scalajs.dom.raw.SVGGElement
  type NamespaceMap = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type SelectionFn = js.Function0[
    typingsSlinky.d3Selection.mod.Selection_[org.scalajs.dom.raw.HTMLElement, js.Any, scala.Null, js.UndefOr[scala.Nothing]]
  ]
  type ValueFn[T /* <: typingsSlinky.d3Selection.mod.BaseType */, Datum, Result] = js.ThisFunction3[
    /* this */ T, 
    /* datum */ Datum, 
    /* index */ scala.Double, 
    /* groups */ js.Array[T] | typingsSlinky.d3Selection.mod.ArrayLike[T], 
    Result
  ]
}
