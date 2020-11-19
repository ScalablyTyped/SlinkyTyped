package typingsSlinky.fundamentalReact.mod

import slinky.core.facade.ReactElement
import typingsSlinky.fundamentalReact.anon.FunctionComponentPanelAct
import typingsSlinky.fundamentalReact.anon.FunctionComponentPanelBod
import typingsSlinky.fundamentalReact.anon.FunctionComponentPanelFil
import typingsSlinky.fundamentalReact.anon.FunctionComponentPanelFoo
import typingsSlinky.fundamentalReact.anon.FunctionComponentPanelHea
import typingsSlinky.fundamentalReact.anon.FunctionComponentPanelHeaCall
import typingsSlinky.fundamentalReact.anon.PartialPanelProps
import typingsSlinky.fundamentalReact.anon.WeakValidationMapPanelPro
import typingsSlinky.fundamentalReact.panelMod.PanelProps
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fundamental-react", "Panel")
@js.native
object Panel extends js.Object {
  
  def apply(props: PropsWithChildren[PanelProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[PanelProps], context: js.Any): ReactElement | Null = js.native
  
  var Actions: FunctionComponentPanelAct = js.native
  
  var Body: FunctionComponentPanelBod = js.native
  
  var Filters: FunctionComponentPanelFil = js.native
  
  var Footer: FunctionComponentPanelFoo = js.native
  
  var Head: FunctionComponentPanelHea = js.native
  
  var Header: FunctionComponentPanelHeaCall = js.native
  
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  
  var defaultProps: js.UndefOr[PartialPanelProps] = js.native
  
  var displayName: js.UndefOr[typingsSlinky.fundamentalReact.fundamentalReactStrings.Panel | String] = js.native
  
  var propTypes: js.UndefOr[WeakValidationMapPanelPro] = js.native
}
