package typingsSlinky.dojo

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.dojo.dijit.Dialog
import typingsSlinky.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dijit/Dialog", JSImport.Namespace)
@js.native
object dijitDialogMod
  extends TopLevel[
      TypeofDialog with (Instantiable2[js.UndefOr[/* params */ js.Object], js.UndefOr[/* srcNodeRef */ HTMLElement], Dialog])
    ] {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/Dialog._DialogBase.html
    *
    * 
    * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
    * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified, replace srcNodeRef with my generated DOM tree.     
    */
  @js.native
  class _DialogBase ()
    extends typingsSlinky.dojo.dijit.Dialog._DialogBase {
    def this(params: js.Object) = this()
    def this(params: js.Object, srcNodeRef: org.scalajs.dom.raw.HTMLElement) = this()
  }
  
}

