package typingsSlinky.rcSelect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object interfaceMod {
  
  type OnActiveValue = js.Function3[
    /* active */ typingsSlinky.rcSelect.generatorMod.RawValueType, 
    /* index */ scala.Double, 
    /* info */ js.UndefOr[typingsSlinky.rcSelect.anon.Source], 
    scala.Unit
  ]
  
  type OptionsType = js.Array[
    typingsSlinky.rcSelect.interfaceMod.OptionData | typingsSlinky.rcSelect.interfaceMod.OptionGroupData
  ]
  
  type RenderDOMFunc = js.Function1[/* props */ js.Any, org.scalajs.dom.raw.HTMLElement]
  
  type RenderNode = slinky.core.facade.ReactElement | (js.Function1[/* props */ js.Any, slinky.core.facade.ReactElement])
}
