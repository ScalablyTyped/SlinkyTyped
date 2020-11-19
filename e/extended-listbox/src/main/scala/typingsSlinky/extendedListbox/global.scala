package typingsSlinky.extendedListbox

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  class MultiSelectListBox protected () extends BaseListBox {
    def this(domElement: HTMLElement) = this()
    def this(domElement: HTMLElement, options: ListBoxSettings) = this()
  }
  @js.native
  object MultiSelectListBox
    extends Instantiable1[/* domElement */ HTMLElement, typingsSlinky.extendedListbox.MultiSelectListBox]
       with Instantiable2[
          /* domElement */ HTMLElement, 
          /* options */ ListBoxSettings, 
          typingsSlinky.extendedListbox.MultiSelectListBox
        ]
  
  @js.native
  class SingleSelectListBox protected () extends BaseListBox {
    def this(domElement: HTMLElement) = this()
    def this(domElement: HTMLElement, options: ListBoxSettings) = this()
  }
  @js.native
  object SingleSelectListBox
    extends Instantiable1[/* domElement */ HTMLElement, typingsSlinky.extendedListbox.SingleSelectListBox]
       with Instantiable2[
          /* domElement */ HTMLElement, 
          /* options */ ListBoxSettings, 
          typingsSlinky.extendedListbox.SingleSelectListBox
        ]
}
