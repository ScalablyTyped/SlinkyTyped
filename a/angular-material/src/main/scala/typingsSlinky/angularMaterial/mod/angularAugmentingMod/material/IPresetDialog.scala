package typingsSlinky.angularMaterial.mod.angularAugmentingMod.material

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.angular.JQuery
import typingsSlinky.angular.mod.IControllerConstructor
import typingsSlinky.angular.mod.IScope
import typingsSlinky.angular.mod.Injectable
import typingsSlinky.angularMaterial.AnonLeft
import typingsSlinky.std.Element
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPresetDialog[T] extends js.Object {
   // default: root node
  def ariaLabel(ariaLabel: String): T = js.native
  def bindToController(): T = js.native
  def bindToController(bindToController: Boolean): T = js.native
   // default: true
  def clickOutsideToClose(): T = js.native
  def clickOutsideToClose(clickOutsideToClose: Boolean): T = js.native
  def closeTo(to: String): T = js.native
  def closeTo(to: AnonLeft): T = js.native
  def closeTo(to: Element): T = js.native
   // default: true
  def controller(): T = js.native
  def controller(controller: String): T = js.native
  def controller(controller: Injectable[IControllerConstructor]): T = js.native
  def controllerAs(): T = js.native
  def controllerAs(controllerAs: String): T = js.native
   // default: false
  def disableParentScroll(): T = js.native
  def disableParentScroll(disableParentScroll: Boolean): T = js.native
   // default: false
  def escapeToClose(): T = js.native
  def escapeToClose(escapeToClose: Boolean): T = js.native
   // default: true
  def focusOnOpen(): T = js.native
  def focusOnOpen(focusOnOpen: Boolean): T = js.native
   // default: true
  def hasBackdrop(): T = js.native
  def hasBackdrop(hasBackdrop: Boolean): T = js.native
  def htmlContent(htmlContent: String): T = js.native
  def locals(): T = js.native
  def locals(locals: StringDictionary[js.Any]): T = js.native
  def multiple(multiple: Boolean): T = js.native
  def ok(ok: String): T = js.native
  def openFrom(from: String): T = js.native
  def openFrom(from: AnonLeft): T = js.native
  def openFrom(from: Element): T = js.native
  def openFrom(from: Event_): T = js.native
  def parent(): T = js.native
  def parent(parent: String): T = js.native
  def parent(parent: JQuery): T = js.native
  def parent(parent: Element): T = js.native
   // default: new child scope
  def preserveScope(): T = js.native
  def preserveScope(preserveScope: Boolean): T = js.native
   // default: false
  def resolve(): T = js.native
  def resolve(resolve: ResolveObject): T = js.native
  def scope(): T = js.native
  def scope(scope: IScope): T = js.native
  def targetEvent(): T = js.native
  def targetEvent(targetEvent: MouseEvent): T = js.native
  def template(): T = js.native
  def template(template: String): T = js.native
  def templateUrl(): T = js.native
  def templateUrl(templateUrl: String): T = js.native
  def textContent(textContent: String): T = js.native
  def theme(theme: String): T = js.native
  def title(title: String): T = js.native
}

