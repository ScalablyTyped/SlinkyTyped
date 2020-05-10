package typingsSlinky.pdfmake

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interfacesMod {
  type Column = typingsSlinky.pdfmake.interfacesMod.Content with typingsSlinky.pdfmake.AnonWidth
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsSlinky.pdfmake.interfacesMod.ArrayOfContent
    - typingsSlinky.pdfmake.interfacesMod.ContentText
    - typingsSlinky.pdfmake.interfacesMod.ContentColumns
    - typingsSlinky.pdfmake.interfacesMod.ContentStack
    - typingsSlinky.pdfmake.interfacesMod.ContentUnorderedList
    - typingsSlinky.pdfmake.interfacesMod.ContentOrderedList
    - typingsSlinky.pdfmake.interfacesMod.ContentTable
    - typingsSlinky.pdfmake.interfacesMod.ContentAnchor
    - typingsSlinky.pdfmake.interfacesMod.ContentPageReference
    - typingsSlinky.pdfmake.interfacesMod.ContentTextReference
    - typingsSlinky.pdfmake.interfacesMod.ContentToc
    - typingsSlinky.pdfmake.interfacesMod.ContentTocItem
    - typingsSlinky.pdfmake.interfacesMod.ContentImage
    - typingsSlinky.pdfmake.interfacesMod.ContentSvg
    - typingsSlinky.pdfmake.interfacesMod.ContentQr
    - typingsSlinky.pdfmake.interfacesMod.ContentCanvas
  */
  type Content = typingsSlinky.pdfmake.interfacesMod._Content | java.lang.String
  type DynamicBackground = js.Function2[
    /* currentPage */ scala.Double, 
    /* pageSize */ typingsSlinky.pdfmake.interfacesMod.ContextPageSize, 
    js.UndefOr[typingsSlinky.pdfmake.interfacesMod.Content | scala.Null]
  ]
  type DynamicContent = js.Function3[
    /* currentPage */ scala.Double, 
    /* pageCount */ scala.Double, 
    /* pageSize */ typingsSlinky.pdfmake.interfacesMod.ContextPageSize, 
    js.UndefOr[typingsSlinky.pdfmake.interfacesMod.Content | scala.Null]
  ]
  type DynamicLayout[T] = js.Function3[
    /* rowIndex */ scala.Double, 
    /* node */ typingsSlinky.pdfmake.interfacesMod.ContentTable, 
    /* columnIndex */ scala.Double, 
    js.UndefOr[T | scala.Null]
  ]
  type DynamicRowSize = js.Function1[/* row */ scala.Double, scala.Double | typingsSlinky.pdfmake.pdfmakeStrings.auto]
  type Margins = scala.Double | (js.Tuple2[scala.Double, scala.Double]) | (js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double])
  type OrderedListElement = typingsSlinky.pdfmake.interfacesMod.Content with typingsSlinky.pdfmake.AnonCounter
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - typingsSlinky.pdfmake.pdfmakeStrings.auto
    - typingsSlinky.pdfmake.pdfmakeStrings.Asterisk
    - java.lang.String
  */
  type Size = typingsSlinky.pdfmake.interfacesMod._Size | scala.Double | java.lang.String
  type StyleDictionary = org.scalablytyped.runtime.StringDictionary[typingsSlinky.pdfmake.interfacesMod.Style]
  type TFontDictionary = org.scalablytyped.runtime.StringDictionary[typingsSlinky.pdfmake.interfacesMod.TFontFamilyTypes]
  type TableCell = js.Object | (typingsSlinky.pdfmake.interfacesMod.Content with typingsSlinky.pdfmake.AnonBorder)
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsSlinky.pdfmake.interfacesMod.PredefinedTableLayout
    - typingsSlinky.pdfmake.interfacesMod.CustomTableLayout
  */
  type TableLayout = typingsSlinky.pdfmake.interfacesMod._TableLayout | java.lang.String
  type UnorderedListElement = typingsSlinky.pdfmake.interfacesMod.Content with typingsSlinky.pdfmake.AnonListType
}
