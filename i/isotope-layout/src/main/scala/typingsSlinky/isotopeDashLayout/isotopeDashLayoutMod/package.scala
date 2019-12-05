package typingsSlinky.isotopeDashLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object isotopeDashLayoutMod {
  import org.scalablytyped.runtime.StringDictionary
  import org.scalajs.dom.raw.HTMLElement
  import org.scalajs.dom.raw.NodeList
  import typingsSlinky.isotopeDashLayout.isotopeDashLayoutMod._Global_.JQuery

  type Elements = js.Array[HTMLElement] | HTMLElement | JQuery | NodeList
  type SortOrder = StringDictionary[Boolean]
  type Sorter = StringDictionary[(js.Function1[/* itemElm */ JQuery, Double | String]) | String]
  type Style = StringDictionary[Double | String]
}
