package typingsSlinky.petitDashDom.petitDashDomMod

import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Component
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.ComponentClass
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.ComponentClassNode
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.ComponentNode
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.ComponentProps
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Content
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.FunctionComponent
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.FunctionComponentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h extends js.Object {
  def apply[P /* <: ComponentProps */](`type`: Component[P]): ComponentNode[P] = js.native
  def apply[P /* <: ComponentProps */](`type`: ComponentClass[P]): ComponentClassNode[P] = js.native
  def apply[P /* <: ComponentProps */](`type`: ComponentClass[P], children: Content*): ComponentClassNode[P] = js.native
  def apply[P /* <: ComponentProps */](`type`: ComponentClass[P], props: P, children: Content*): ComponentClassNode[P] = js.native
  def apply[P /* <: ComponentProps */](`type`: Component[P], children: Content*): ComponentNode[P] = js.native
  def apply[P /* <: ComponentProps */](`type`: Component[P], props: P, children: Content*): ComponentNode[P] = js.native
  def apply[P /* <: ComponentProps */](`type`: FunctionComponent[P]): FunctionComponentNode[P] = js.native
  def apply[P /* <: ComponentProps */](`type`: FunctionComponent[P], children: Content*): FunctionComponentNode[P] = js.native
  def apply[P /* <: ComponentProps */](`type`: FunctionComponent[P], props: P, children: Content*): FunctionComponentNode[P] = js.native
}

