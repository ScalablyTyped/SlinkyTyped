package typingsSlinky.petitDom.mod

import typingsSlinky.petitDom.mod.PetitDom.Component
import typingsSlinky.petitDom.mod.PetitDom.ComponentClass
import typingsSlinky.petitDom.mod.PetitDom.ComponentClassNode
import typingsSlinky.petitDom.mod.PetitDom.ComponentNode
import typingsSlinky.petitDom.mod.PetitDom.ComponentProps
import typingsSlinky.petitDom.mod.PetitDom.Content
import typingsSlinky.petitDom.mod.PetitDom.ElementNode
import typingsSlinky.petitDom.mod.PetitDom.FunctionComponent
import typingsSlinky.petitDom.mod.PetitDom.FunctionComponentNode
import typingsSlinky.petitDom.mod.PetitDom.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("petit-dom", "h")
@js.native
object h extends js.Object {
  
  def apply[P /* <: ComponentProps */](`type`: ComponentClass[P], props: P, children: Content*): ComponentClassNode[P] = js.native
  def apply[P /* <: ComponentProps */](`type`: ComponentClass[P], props: js.UndefOr[scala.Nothing], children: Content*): ComponentClassNode[P] = js.native
  def apply[P /* <: ComponentProps */](`type`: ComponentClass[P], props: Null, children: Content*): ComponentClassNode[P] = js.native
  def apply[P /* <: ComponentProps */](`type`: Component[P], props: P, children: Content*): ComponentNode[P] = js.native
  def apply[P /* <: ComponentProps */](`type`: Component[P], props: js.UndefOr[scala.Nothing], children: Content*): ComponentNode[P] = js.native
  def apply[P /* <: ComponentProps */](`type`: Component[P], props: Null, children: Content*): ComponentNode[P] = js.native
  def apply[P /* <: ComponentProps */](`type`: FunctionComponent[P], props: P, children: Content*): FunctionComponentNode[P] = js.native
  def apply[P /* <: ComponentProps */](`type`: FunctionComponent[P], props: js.UndefOr[scala.Nothing], children: Content*): FunctionComponentNode[P] = js.native
  def apply[P /* <: ComponentProps */](`type`: FunctionComponent[P], props: Null, children: Content*): FunctionComponentNode[P] = js.native
  def apply[T /* <: /* keyof petit-dom.anon.ElementTagNameMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 172 */ js.Any */, E /* <: /* import warning: importer.ImportType#apply Failed type conversion: petit-dom.anon.ElementTagNameMap[T] */ js.Any */](`type`: T, props: js.UndefOr[scala.Nothing], children: Content*): ElementNode[T, E] = js.native
  def apply[T /* <: /* keyof petit-dom.anon.ElementTagNameMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 172 */ js.Any */, E /* <: /* import warning: importer.ImportType#apply Failed type conversion: petit-dom.anon.ElementTagNameMap[T] */ js.Any */](`type`: T, props: Null, children: Content*): ElementNode[T, E] = js.native
  def apply[T /* <: /* keyof petit-dom.anon.ElementTagNameMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 172 */ js.Any */, E /* <: /* import warning: importer.ImportType#apply Failed type conversion: petit-dom.anon.ElementTagNameMap[T] */ js.Any */](`type`: T, props: Props[E], children: Content*): ElementNode[T, E] = js.native
}
