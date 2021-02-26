package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines a table row in the document.
  */
@js.native
trait TableRow extends StObject {
  
  /**
    * Provides information about the table row's cells.
    */
  val cells: js.Array[TableCell] = js.native
  
  /**
    * Gets the text buffer interval occupied by the current table row element.
    */
  val interval: Interval = js.native
  
  /**
    * Gets the table row's character length.
    */
  val length: Double = js.native
  
  /**
    * Gets the table row's start position in the document.
    */
  val start: Double = js.native
}
object TableRow {
  
  @scala.inline
  def apply(cells: js.Array[TableCell], interval: Interval, length: Double, start: Double): TableRow = {
    val __obj = js.Dynamic.literal(cells = cells.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableRow]
  }
  
  @scala.inline
  implicit class TableRowMutableBuilder[Self <: TableRow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCells(value: js.Array[TableCell]): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellsVarargs(value: TableCell*): Self = StObject.set(x, "cells", js.Array(value :_*))
    
    @scala.inline
    def setInterval(value: Interval): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
