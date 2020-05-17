package typingsSlinky.mustache

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type COMMENT = typingsSlinky.mustache.mustacheStrings.Exclamationmark
  type EQUAL = typingsSlinky.mustache.mustacheStrings.Equalssign
  type ESCAPED_VALUE = typingsSlinky.mustache.mustacheStrings.name
  type INVERTED = typingsSlinky.mustache.mustacheStrings.^
  /**
    * An array of two strings, representing the opening and closing tags respectively, to be used in the templates being rendered.
    */
  type OpeningAndClosingTags = js.Tuple2[java.lang.String, java.lang.String]
  type PARTIAL = typingsSlinky.mustache.mustacheStrings.Greaterthansign
  type PartialLookupFn = js.Function1[/* partialName */ java.lang.String, js.UndefOr[java.lang.String]]
  type RAW_VALUE = typingsSlinky.mustache.mustacheStrings.text
  type SECTION = typingsSlinky.mustache.mustacheStrings.Numbersign
  type TemplateSpans = js.Array[
    (js.Tuple4[
      typingsSlinky.mustache.mod.TemplateSpanType, 
      java.lang.String, 
      scala.Double, 
      scala.Double
    ]) | (js.Tuple6[
      typingsSlinky.mustache.mod.TemplateSpanType, 
      java.lang.String, 
      scala.Double, 
      scala.Double, 
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias mustache.mustache.TemplateSpans */ js.Object, 
      scala.Double
    ]) | (js.Tuple7[
      typingsSlinky.mustache.mod.TemplateSpanType, 
      java.lang.String, 
      scala.Double, 
      scala.Double, 
      java.lang.String, 
      scala.Double, 
      scala.Boolean
    ])
  ]
  type UNESCAPED_VALUE = typingsSlinky.mustache.mustacheStrings.Ampersand
}
