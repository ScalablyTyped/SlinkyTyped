package typingsSlinky.nextServer.libUtilsMod

import typingsSlinky.nextServer.anon.EnhanceApp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nextServer.anon.EnhanceApp
  - typingsSlinky.nextServer.libUtilsMod.Enhancer[
typingsSlinky.nextServer.libUtilsMod.NextComponentType[typingsSlinky.nextServer.libUtilsMod.NextPageContext, js.Object, js.Object]]
*/
trait ComponentsEnhancer extends js.Object

object ComponentsEnhancer {
  @scala.inline
  implicit def apply(value: EnhanceApp): ComponentsEnhancer = value.asInstanceOf[ComponentsEnhancer]
  @scala.inline
  implicit def apply(value: Enhancer[NextComponentType[NextPageContext, js.Object, js.Object]]): ComponentsEnhancer = value.asInstanceOf[ComponentsEnhancer]
}

