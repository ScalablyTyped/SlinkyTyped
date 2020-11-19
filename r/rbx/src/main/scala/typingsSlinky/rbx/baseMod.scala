package typingsSlinky.rbx

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.rbx.anon.PreferHelpersPropsOverrid
import typingsSlinky.rbx.anon.`0`
import typingsSlinky.rbx.exoticMod.ForwardRefAsExoticComponent
import typingsSlinky.rbx.exoticMod.FromReactType
import typingsSlinky.rbx.typesMod.Prefer
import typingsSlinky.react.mod.ComponentPropsWithoutRef
import typingsSlinky.react.mod.PropsWithoutRef
import typingsSlinky.react.mod.ReactType
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rbx/base", JSImport.Namespace)
@js.native
object baseMod extends js.Object {
  
  val Generic: ForwardRefAsExoticComponent[PreferHelpersPropsOverrid, ReactElement] = js.native
  
  def forwardRefAs[TOwnProps, TDefaultComponent /* <: ReactType[_] */](
    factory: ReactComponentClass[HTMLElement | SVGElement | ReactComponentClass[js.Object]],
    defaultProps: Partial[
      Prefer[
        (PropsWithoutRef[TOwnProps with `0`[TDefaultComponent]]) with RefAttributes[FromReactType[TDefaultComponent]], 
        ComponentPropsWithoutRef[TDefaultComponent]
      ]
    ]
  ): ForwardRefAsExoticComponent[TOwnProps, TDefaultComponent] = js.native
}
