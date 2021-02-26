package typingsSlinky.agGrid

import typingsSlinky.agGrid.anon.InstantiableICellRendererComp
import typingsSlinky.agGrid.componentResolverMod.ComponentHolder
import typingsSlinky.agGrid.iCellEditorMod.ICellEditorParams
import typingsSlinky.agGrid.iCellRendererMod.ICellRendererFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iRichCellEditorParamsMod {
  
  @js.native
  trait IRichCellEditorParams
    extends ICellEditorParams
       with ComponentHolder {
    
    var cellHeight: Double = js.native
    
    var cellRenderer: InstantiableICellRendererComp | ICellRendererFunc | String = js.native
    
    var values: js.Array[String] = js.native
  }
}
