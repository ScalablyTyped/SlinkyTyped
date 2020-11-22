package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.ArgumentComments
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.RestProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestPropertyBuilder extends js.Object {
  
  def apply(argument: ExpressionKind): RestProperty = js.native
  
  def from(params: ArgumentComments): RestProperty = js.native
}
