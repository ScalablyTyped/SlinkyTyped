package typingsSlinky

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object node {
  import typingsSlinky.node.NodeJS.Module
  import typingsSlinky.node.NodeJS.Require

  type NodeModule = Module
  /*-----------------------------------------------*
    *                                               *
    *                   GLOBAL                      *
    *                                               *
    ------------------------------------------------*/
  // For backwards compability
  type NodeRequire = Require
  type RequireResolve = typingsSlinky.node.NodeJS.RequireResolve
}
