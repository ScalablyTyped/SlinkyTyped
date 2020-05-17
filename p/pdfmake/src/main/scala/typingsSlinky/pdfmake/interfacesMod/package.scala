package typingsSlinky.pdfmake

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interfacesMod {
  type Column = typingsSlinky.pdfmake.interfacesMod.Content with typingsSlinky.pdfmake.anon.Width
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
  type OrderedListElement = typingsSlinky.pdfmake.interfacesMod.Content with typingsSlinky.pdfmake.anon.Counter
  type StyleDictionary = org.scalablytyped.runtime.StringDictionary[typingsSlinky.pdfmake.interfacesMod.Style]
  type TFontDictionary = org.scalablytyped.runtime.StringDictionary[typingsSlinky.pdfmake.interfacesMod.TFontFamilyTypes]
  type UnorderedListElement = typingsSlinky.pdfmake.interfacesMod.Content with typingsSlinky.pdfmake.anon.ListType
}
