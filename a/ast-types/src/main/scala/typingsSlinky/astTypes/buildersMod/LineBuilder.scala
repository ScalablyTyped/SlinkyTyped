package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Leading
import typingsSlinky.astTypes.namedTypesMod.namedTypes.Line
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineBuilder extends js.Object {
  
  def apply(value: String): Line = js.native
  def apply(value: String, leading: js.UndefOr[scala.Nothing], trailing: Boolean): Line = js.native
  def apply(value: String, leading: Boolean): Line = js.native
  def apply(value: String, leading: Boolean, trailing: Boolean): Line = js.native
  
  def from(params: Leading): Line = js.native
}
