package typingsSlinky.elementtree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Attributes = org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]]
  type ElementTag = (js.Function1[
    js.UndefOr[typingsSlinky.elementtree.mod.ElementText], 
    typingsSlinky.elementtree.mod.Element
  ]) | (js.Function2[
    /* target */ typingsSlinky.elementtree.mod.ElementText, 
    /* text */ js.UndefOr[typingsSlinky.elementtree.mod.ElementText], 
    typingsSlinky.elementtree.mod.Element
  ]) | java.lang.String
  type ElementText = typingsSlinky.elementtree.AnonToString | java.lang.String
}
