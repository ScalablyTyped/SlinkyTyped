package typingsSlinky.next

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nextMod {
  import typingsSlinky.next.distNextDashServerLibUtilsMod.NextComponentType
  import typingsSlinky.next.distNextDashServerLibUtilsMod.NextPageContext

  type NextPage[P, IP] = NextComponentType[NextPageContext, IP, P]
}
