package typingsSlinky.antd

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.antd.checkboxCheckboxMod.AbstractCheckboxProps
import typingsSlinky.antd.radioInterfaceMod.RadioChangeEvent
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioButtonMod extends Shortcut {
  
  @JSImport("antd/lib/radio/radioButton", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[RadioButtonProps with RefAttributes[_]] = js.native
  
  type RadioButtonProps = AbstractCheckboxProps[RadioChangeEvent]
  
  type _To = ForwardRefExoticComponent[RadioButtonProps with RefAttributes[_]]
  
  /* This means you don't have to write `default`, but can instead just say `radioButtonMod.foo` */
  override def _to: ForwardRefExoticComponent[RadioButtonProps with RefAttributes[_]] = default
}
