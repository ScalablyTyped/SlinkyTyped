package typingsSlinky.antd

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import typingsSlinky.antd.radioButtonMod.RadioButtonProps
import typingsSlinky.antd.radioInterfaceMod.RadioGroupProps
import typingsSlinky.antd.radioInterfaceMod.RadioProps
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioMod extends Shortcut {
  
  @JSImport("antd/lib/radio", JSImport.Default)
  @js.native
  val default: CompoundedComponent = js.native
  
  @JSImport("antd/lib/radio", "Button")
  @js.native
  val Button: ForwardRefExoticComponent[RadioButtonProps with RefAttributes[_]] = js.native
  
  @JSImport("antd/lib/radio", "Group")
  @js.native
  val Group: ReactComponentClass[ForwardRefExoticComponent[RadioGroupProps with RefAttributes[HTMLDivElement]]] = js.native
  
  @js.native
  trait CompoundedComponent extends ForwardRefExoticComponent[RadioProps with RefAttributes[HTMLElement]] {
    
    var Button: ForwardRefExoticComponent[RadioButtonProps with RefAttributes[_]] = js.native
    
    var Group: ReactComponentClass[ForwardRefExoticComponent[RadioGroupProps with RefAttributes[HTMLDivElement]]] = js.native
  }
  
  type _To = CompoundedComponent
  
  /* This means you don't have to write `default`, but can instead just say `radioMod.foo` */
  override def _to: CompoundedComponent = default
}
