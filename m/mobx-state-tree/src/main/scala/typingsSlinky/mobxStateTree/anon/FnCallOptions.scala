package typingsSlinky.mobxStateTree.anon

import typingsSlinky.mobxStateTree.customMod.CustomTypeOptions
import typingsSlinky.mobxStateTree.typeMod.IType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallOptions extends js.Object {
  
  def apply[S, T](options: CustomTypeOptions[S, T]): IType[S | T, S, T] = js.native
}
