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
  /**
    * Whenever partials are provided, it can either be an object that contains the names and templates of partials that are used in tempaltes
    *
    * -- or --
    *
    * A function that is used to load partial template on the fly that takes a single argument: the name of the partial.
    */
  type PartialsOrLookupFn = (typingsSlinky.std.Record[java.lang.String, java.lang.String]) | typingsSlinky.mustache.mod.PartialLookupFn
  type RAW_VALUE = typingsSlinky.mustache.mustacheStrings.text
  type SECTION = typingsSlinky.mustache.mustacheStrings.Numbersign
  type TemplateSpanType = typingsSlinky.mustache.mod.RAW_VALUE | typingsSlinky.mustache.mod.ESCAPED_VALUE | typingsSlinky.mustache.mod.SECTION | typingsSlinky.mustache.mod.UNESCAPED_VALUE | typingsSlinky.mustache.mod.INVERTED | typingsSlinky.mustache.mod.COMMENT | typingsSlinky.mustache.mod.PARTIAL | typingsSlinky.mustache.mod.EQUAL
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
