package typingsSlinky.notyf

import typingsSlinky.notyf.anon.DeepPartialINotyfNotifica
import typingsSlinky.notyf.anon.PartialINotyfOptions
import typingsSlinky.notyf.notyfMod.default
import typingsSlinky.notyf.notyfOptionsMod.INotyfOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("notyf", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val DEFAULT_OPTIONS: INotyfOptions = js.native
  
  @js.native
  class Notyf () extends default {
    def this(opts: PartialINotyfOptions) = this()
  }
  
  @js.native
  class NotyfArray[T] ()
    extends typingsSlinky.notyf.notyfModelsMod.NotyfArray[T]
  
  @js.native
  object NotyfArrayEvent extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.notyf.notyfModelsMod.NotyfArrayEvent with Double] = js.native
    
    /* 0 */ val Add: typingsSlinky.notyf.notyfModelsMod.NotyfArrayEvent.Add with Double = js.native
    
    /* 1 */ val Remove: typingsSlinky.notyf.notyfModelsMod.NotyfArrayEvent.Remove with Double = js.native
  }
  
  @js.native
  object NotyfEvent extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.notyf.notyfOptionsMod.NotyfEvent with String] = js.native
    
    /* "click" */ val Click: typingsSlinky.notyf.notyfOptionsMod.NotyfEvent.Click with String = js.native
    
    /* "dismiss" */ val Dismiss: typingsSlinky.notyf.notyfOptionsMod.NotyfEvent.Dismiss with String = js.native
  }
  
  @js.native
  class NotyfNotification protected ()
    extends typingsSlinky.notyf.notyfModelsMod.NotyfNotification {
    def this(options: DeepPartialINotyfNotifica) = this()
  }
  
  @js.native
  class NotyfView ()
    extends typingsSlinky.notyf.notyfViewMod.NotyfView
}
