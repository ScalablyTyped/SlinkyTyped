package typingsSlinky.antd

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.ReactComponentClass
import typingsSlinky.antd.checkboxCheckboxMod.CheckboxProps
import typingsSlinky.antd.checkboxGroupMod.CheckboxGroupProps
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkboxMod extends Shortcut {
  
  @JSImport("antd/lib/checkbox", JSImport.Default)
  @js.native
  val default: CompoundedComponent = js.native
  
  @js.native
  trait CompoundedComponent extends ForwardRefExoticComponent[CheckboxProps with RefAttributes[HTMLInputElement]] {
    
    var Group: ReactComponentClass[CheckboxGroupProps] = js.native
    
    var __ANT_CHECKBOX: Boolean = js.native
  }
  
  type _To = CompoundedComponent
  
  /* This means you don't have to write `default`, but can instead just say `checkboxMod.foo` */
  override def _to: CompoundedComponent = default
}
