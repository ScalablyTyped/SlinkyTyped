package typingsSlinky.antdMobile

import slinky.core.facade.ReactElement
import typingsSlinky.antdMobile.anon.AntLocale
import typingsSlinky.antdMobile.anon.Cascade
import typingsSlinky.antdMobile.anon.MaskTransitionName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pickerMod {
  
  @JSImport("antd-mobile/lib/picker", JSImport.Default)
  @js.native
  class default () extends Picker
  /* static members */
  object default {
    
    @JSImport("antd-mobile/lib/picker", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/lib/picker", "default.contextTypes")
    @js.native
    def contextTypes: AntLocale = js.native
    @scala.inline
    def contextTypes_=(x: AntLocale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/lib/picker", "default.defaultProps")
    @js.native
    def defaultProps: Cascade = js.native
    @scala.inline
    def defaultProps_=(x: Cascade): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("antd-mobile/lib/picker", "nonsense")
  @js.native
  val nonsense: ReactElement = js.native
  
  @js.native
  trait Picker
    extends typingsSlinky.antdMobile.abstractPickerMod.default {
    
    var popupProps: MaskTransitionName = js.native
  }
}
