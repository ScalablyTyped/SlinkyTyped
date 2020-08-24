package typingsSlinky.progressbarJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type StepFunction = js.Function3[
    /* state */ org.scalablytyped.runtime.StringDictionary[js.Any], 
    /* path */ typingsSlinky.progressbarJs.pathMod.^[org.scalajs.dom.raw.SVGPathElement], 
    /* attachement */ org.scalajs.dom.raw.SVGPathElement, 
    scala.Unit
  ]
  /** Inline CSS styles for the created SVG element */
  type SvgInlineStyle = org.scalablytyped.runtime.StringDictionary[js.Any | scala.Null]
  type SvgSelector = org.scalajs.dom.raw.SVGPathElement | java.lang.String
  /** Inline CSS styles for the text element */
  type TextInlineStyle = org.scalablytyped.runtime.StringDictionary[js.Any]
}
