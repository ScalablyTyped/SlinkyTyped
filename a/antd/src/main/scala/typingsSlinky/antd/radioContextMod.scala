package typingsSlinky.antd

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.antd.radioInterfaceMod.RadioGroupContextProps
import typingsSlinky.react.mod.Context
import typingsSlinky.react.mod.ProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioContextMod extends Shortcut {
  
  @JSImport("antd/lib/radio/context", JSImport.Default)
  @js.native
  val default: Context[RadioGroupContextProps | Null] = js.native
  
  @JSImport("antd/lib/radio/context", "RadioGroupContextProvider")
  @js.native
  val RadioGroupContextProvider: ReactComponentClass[ProviderProps[RadioGroupContextProps | Null]] = js.native
  
  type _To = Context[RadioGroupContextProps | Null]
  
  /* This means you don't have to write `default`, but can instead just say `radioContextMod.foo` */
  override def _to: Context[RadioGroupContextProps | Null] = default
}
