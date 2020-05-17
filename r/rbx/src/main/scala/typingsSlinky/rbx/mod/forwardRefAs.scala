package typingsSlinky.rbx.mod

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.rbx.anon.`0`
import typingsSlinky.rbx.exoticMod.ForwardRefAsExoticComponent
import typingsSlinky.rbx.exoticMod.FromReactType
import typingsSlinky.rbx.typesMod.Prefer
import typingsSlinky.react.mod.ComponentPropsWithoutRef
import typingsSlinky.react.mod.PropsWithoutRef
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rbx", "forwardRefAs")
@js.native
object forwardRefAs extends js.Object {
  def apply[TOwnProps, TDefaultComponent /* <: ReactComponentClass[_] */](
    factory: ReactComponentClass[HTMLElement | SVGElement | ReactComponentClass[js.Object]],
    defaultProps: Partial[
      Prefer[
        (PropsWithoutRef[TOwnProps with `0`[TDefaultComponent]]) with RefAttributes[FromReactType[TDefaultComponent]], 
        ComponentPropsWithoutRef[TDefaultComponent]
      ]
    ]
  ): ForwardRefAsExoticComponent[TOwnProps, TDefaultComponent] = js.native
}

