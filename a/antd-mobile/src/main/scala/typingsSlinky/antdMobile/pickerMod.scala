package typingsSlinky.antdMobile

import slinky.core.facade.ReactElement
import typingsSlinky.antdMobile.abstractPickerMod.AbstractPicker
import typingsSlinky.antdMobile.anon.AntLocale
import typingsSlinky.antdMobile.anon.Cascade
import typingsSlinky.antdMobile.anon.MaskTransitionName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd-mobile/lib/picker", JSImport.Namespace)
@js.native
object pickerMod extends js.Object {
  
  val nonsense: ReactElement = js.native
  
  @js.native
  trait Picker extends AbstractPicker {
    
    var popupProps: MaskTransitionName = js.native
  }
  
  @js.native
  class default () extends Picker
  /* static members */
  @js.native
  object default extends js.Object {
    
    var contextTypes: AntLocale = js.native
    
    var defaultProps: Cascade = js.native
  }
}
