package typingsSlinky.angularRouter.mod

import typingsSlinky.angularCore.mod.AfterContentInit
import typingsSlinky.angularCore.mod.ElementRef
import typingsSlinky.angularCore.mod.OnChanges
import typingsSlinky.angularCore.mod.OnDestroy
import typingsSlinky.angularCore.mod.QueryList
import typingsSlinky.angularCore.mod.Renderer2
import typingsSlinky.angularRouter.AnonExact
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router", "RouterLinkActive")
@js.native
class RouterLinkActive protected ()
  extends OnChanges
     with OnDestroy
     with AfterContentInit {
  def this(router: Router, element: ElementRef[_], renderer: Renderer2) = this()
  def this(router: Router, element: ElementRef[_], renderer: Renderer2, link: RouterLink) = this()
  def this(
    router: Router,
    element: ElementRef[_],
    renderer: Renderer2,
    link: js.UndefOr[scala.Nothing],
    linkWithHref: RouterLinkWithHref
  ) = this()
  def this(
    router: Router,
    element: ElementRef[_],
    renderer: Renderer2,
    link: RouterLink,
    linkWithHref: RouterLinkWithHref
  ) = this()
  var classes: js.Any = js.native
  var element: js.Any = js.native
  var hasActiveLinks: js.Any = js.native
  val isActive: Boolean = js.native
  var isLinkActive: js.Any = js.native
  var link: js.UndefOr[js.Any] = js.native
  var linkWithHref: js.UndefOr[js.Any] = js.native
  var links: QueryList[RouterLink] = js.native
  var linksWithHrefs: QueryList[RouterLinkWithHref] = js.native
  var renderer: js.Any = js.native
  var router: js.Any = js.native
  var routerLinkActive: js.Array[String] | String = js.native
  var routerLinkActiveOptions: AnonExact = js.native
  var subscription: js.Any = js.native
  var update: js.Any = js.native
}

