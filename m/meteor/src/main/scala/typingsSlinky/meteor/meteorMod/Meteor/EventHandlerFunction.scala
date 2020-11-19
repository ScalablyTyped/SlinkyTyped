package typingsSlinky.meteor.meteorMod.Meteor

import typingsSlinky.meteor.Blaze.TemplateInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventHandlerFunction
  extends js.Function {
  
  def apply(): Unit = js.native
  def apply(event: js.UndefOr[scala.Nothing], templateInstance: TemplateInstance): Unit = js.native
  def apply(event: Event): Unit = js.native
  def apply(event: Event, templateInstance: TemplateInstance): Unit = js.native
}
