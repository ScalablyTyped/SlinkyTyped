package typingsSlinky.handsontable.mod.Handsontable

import org.scalajs.dom.raw.HTMLTableCellElement
import typingsSlinky.handsontable.mod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("handsontable", "Handsontable.renderers")
@js.native
object renderers extends js.Object {
  type Autocomplete = Base
  type Base = js.Function7[
    /* instance */ Core, 
    /* TD */ HTMLTableCellElement, 
    /* row */ Double, 
    /* col */ Double, 
    /* prop */ String | Double, 
    /* value */ CellValue, 
    /* cellProperties */ CellProperties, 
    HTMLTableCellElement | Unit
  ]
  type Checkbox = Base
  type Html = Base
  type Numeric = Base
  type Password = Base
  type Text = Base
}

