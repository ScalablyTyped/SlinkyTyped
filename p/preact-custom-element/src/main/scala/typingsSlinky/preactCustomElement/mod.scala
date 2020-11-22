package typingsSlinky.preactCustomElement

import typingsSlinky.preact.mod.ComponentClass
import typingsSlinky.preact.mod.FunctionComponent
import typingsSlinky.preact.mod.FunctionalComponent
import typingsSlinky.preactCustomElement.anon.Shadow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("preact-custom-element", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(componentDefinition: FunctionComponent[_] | FunctionalComponent[_], tagName: String): Unit = js.native
  def apply(
    componentDefinition: FunctionComponent[_] | FunctionalComponent[_],
    tagName: String,
    observedAttributes: js.UndefOr[scala.Nothing],
    options: Shadow
  ): Unit = js.native
  def apply(
    componentDefinition: FunctionComponent[_] | FunctionalComponent[_],
    tagName: String,
    observedAttributes: js.Array[String]
  ): Unit = js.native
  def apply(
    componentDefinition: FunctionComponent[_] | FunctionalComponent[_],
    tagName: String,
    observedAttributes: js.Array[String],
    options: Shadow
  ): Unit = js.native
  def apply(componentDefinition: ComponentClass[_, js.Object], tagName: String): Unit = js.native
  def apply(
    componentDefinition: ComponentClass[_, js.Object],
    tagName: String,
    observedAttributes: js.UndefOr[scala.Nothing],
    options: Shadow
  ): Unit = js.native
  def apply(
    componentDefinition: ComponentClass[_, js.Object],
    tagName: String,
    observedAttributes: js.Array[String]
  ): Unit = js.native
  def apply(
    componentDefinition: ComponentClass[_, js.Object],
    tagName: String,
    observedAttributes: js.Array[String],
    options: Shadow
  ): Unit = js.native
}
