package typingsSlinky.notyf

import typingsSlinky.notyf.anon.DeepPartialINotyfNotifica
import typingsSlinky.notyf.anon.PartialINotyfOptions
import typingsSlinky.notyf.notyfMod.default
import typingsSlinky.notyf.notyfOptionsMod.INotyfOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("notyf", "DEFAULT_OPTIONS")
  @js.native
  val DEFAULT_OPTIONS: INotyfOptions = js.native
  
  @JSImport("notyf", "Notyf")
  @js.native
  class Notyf () extends default {
    def this(opts: PartialINotyfOptions) = this()
  }
  
  @JSImport("notyf", "NotyfArray")
  @js.native
  class NotyfArray[T] ()
    extends typingsSlinky.notyf.notyfModelsMod.NotyfArray[T]
  
  @JSImport("notyf", "NotyfArrayEvent")
  @js.native
  object NotyfArrayEvent extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.notyf.notyfModelsMod.NotyfArrayEvent with Double] = js.native
    
    /* 0 */ val Add: typingsSlinky.notyf.notyfModelsMod.NotyfArrayEvent.Add with Double = js.native
    
    /* 1 */ val Remove: typingsSlinky.notyf.notyfModelsMod.NotyfArrayEvent.Remove with Double = js.native
  }
  
  @JSImport("notyf", "NotyfEvent")
  @js.native
  object NotyfEvent extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.notyf.notyfOptionsMod.NotyfEvent with String] = js.native
    
    /* "click" */ val Click: typingsSlinky.notyf.notyfOptionsMod.NotyfEvent.Click with String = js.native
    
    /* "dismiss" */ val Dismiss: typingsSlinky.notyf.notyfOptionsMod.NotyfEvent.Dismiss with String = js.native
  }
  
  @JSImport("notyf", "NotyfNotification")
  @js.native
  class NotyfNotification protected ()
    extends typingsSlinky.notyf.notyfModelsMod.NotyfNotification {
    def this(options: DeepPartialINotyfNotifica) = this()
  }
  
  @JSImport("notyf", "NotyfView")
  @js.native
  class NotyfView ()
    extends typingsSlinky.notyf.notyfViewMod.NotyfView
}
