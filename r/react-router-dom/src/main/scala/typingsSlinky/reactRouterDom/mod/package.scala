package typingsSlinky.reactRouterDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Link[S] = typingsSlinky.react.mod.ForwardRefExoticComponent[
    typingsSlinky.react.mod.PropsWithoutRef[typingsSlinky.reactRouterDom.mod.LinkProps[S]] with typingsSlinky.react.mod.RefAttributes[org.scalajs.dom.raw.HTMLAnchorElement]
  ]
  type NavLink[S] = typingsSlinky.react.mod.ForwardRefExoticComponent[
    typingsSlinky.react.mod.PropsWithoutRef[typingsSlinky.reactRouterDom.mod.NavLinkProps[S]] with typingsSlinky.react.mod.RefAttributes[org.scalajs.dom.raw.HTMLAnchorElement]
  ]
}
