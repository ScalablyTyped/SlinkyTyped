package typingsSlinky.blueprintjsTable

import org.scalajs.dom.raw.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clipboardMod {
  
  object Clipboard {
    
    /**
      * Overrides the inherited CSS of the element to make sure it is
      * selectable. This method also makes the element pseudo-invisible.
      */
    @JSImport("@blueprintjs/table/lib/esm/common/clipboard", "Clipboard.applySelectableStyles")
    @js.native
    def applySelectableStyles(elem: HTMLElement): HTMLElement = js.native
    
    /**
      * Copies table cells to the clipboard. The parameter is a row-major
      * 2-dimensional `Array` of strings and can contain nulls. We assume all
      * rows are the same length. If not, the cells will still be copied, but
      * the columns may not align. Returns a boolean indicating whether the
      * copy succeeded.
      *
      * See `Clipboard.copy`
      */
    @JSImport("@blueprintjs/table/lib/esm/common/clipboard", "Clipboard.copyCells")
    @js.native
    def copyCells(cells: js.Array[js.Array[String]]): Boolean = js.native
    
    /**
      * Copies the element and its children to the clipboard. Returns a boolean
      * indicating whether the copy succeeded.
      *
      * If a plaintext argument is supplied, we add both the text/html and
      * text/plain mime types to the clipboard. This preserves the built in
      * semantics of copying elements to the clipboard while allowing custom
      * plaintext output for programs that can't cope with HTML data in the
      * clipboard.
      *
      * Verified on Firefox 47, Chrome 51.
      *
      * Note: Sometimes the copy does not succeed. Presumably, in order to
      * prevent memory issues, browsers will limit the total amount of data you
      * can copy to the clipboard. Based on ad hoc testing, we found an
      * inconsistent limit at about 300KB or 40,000 cells. Depending on the on
      * the content of cells, your limits may vary.
      */
    @JSImport("@blueprintjs/table/lib/esm/common/clipboard", "Clipboard.copyElement")
    @js.native
    def copyElement(elem: HTMLElement): Boolean = js.native
    @JSImport("@blueprintjs/table/lib/esm/common/clipboard", "Clipboard.copyElement")
    @js.native
    def copyElement(elem: HTMLElement, plaintext: String): Boolean = js.native
    
    /**
      * Copies the text to the clipboard. Returns a boolean
      * indicating whether the copy succeeded.
      *
      * See `Clipboard.copy`
      */
    @JSImport("@blueprintjs/table/lib/esm/common/clipboard", "Clipboard.copyString")
    @js.native
    def copyString(value: String): Boolean = js.native
    
    /**
      * Returns a boolean indicating whether the current browser nominally
      * supports the `copy` operation using the `execCommand` API.
      */
    @JSImport("@blueprintjs/table/lib/esm/common/clipboard", "Clipboard.isCopySupported")
    @js.native
    def isCopySupported(): Boolean = js.native
  }
}
