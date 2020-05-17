package typingsSlinky.next.utilsMod

import typingsSlinky.next.anon.EnhanceApp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.next.anon.EnhanceApp
  - typingsSlinky.next.utilsMod.Enhancer[
typingsSlinky.next.utilsMod.NextComponentType[typingsSlinky.next.utilsMod.NextPageContext, js.Object, js.Object]]
*/
trait ComponentsEnhancer extends js.Object

object ComponentsEnhancer {
  @scala.inline
  implicit def apply(value: EnhanceApp): ComponentsEnhancer = value.asInstanceOf[ComponentsEnhancer]
  @scala.inline
  implicit def apply(value: Enhancer[NextComponentType[NextPageContext, js.Object, js.Object]]): ComponentsEnhancer = value.asInstanceOf[ComponentsEnhancer]
}

