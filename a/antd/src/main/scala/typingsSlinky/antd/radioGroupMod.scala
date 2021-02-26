package typingsSlinky.antd

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.ReactComponentClass
import typingsSlinky.antd.radioInterfaceMod.RadioGroupProps
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioGroupMod extends Shortcut {
  
  @JSImport("antd/lib/radio/group", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ForwardRefExoticComponent[RadioGroupProps with RefAttributes[HTMLDivElement]]] = js.native
  
  type _To = ReactComponentClass[ForwardRefExoticComponent[RadioGroupProps with RefAttributes[HTMLDivElement]]]
  
  /* This means you don't have to write `default`, but can instead just say `radioGroupMod.foo` */
  override def _to: ReactComponentClass[ForwardRefExoticComponent[RadioGroupProps with RefAttributes[HTMLDivElement]]] = default
}
