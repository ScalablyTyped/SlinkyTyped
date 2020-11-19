package typingsSlinky.nvd3.mod

import typingsSlinky.d3Dispatch.mod.Dispatch_
import typingsSlinky.d3Selection.mod.BaseType
import typingsSlinky.d3Selection.mod.Selection_
import typingsSlinky.d3Transition.mod.Transition_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Nvd3Element extends js.Object {
  
  def apply(
    selection: Selection_[
      _ | js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ _, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ _
    ],
    args: js.Any*
  ): js.Any = js.native
  def apply(
    transition: Transition_[
      _ | js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ _, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ _
    ],
    args: js.Any*
  ): js.Any = js.native
  
  var dispatch: Dispatch_[js.Object] = js.native
  
  def options(options: js.Any): this.type = js.native
  
  def update(): Unit = js.native
}
