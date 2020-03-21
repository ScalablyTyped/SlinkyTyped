package typingsSlinky.localtunnel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type TunnelCallback = js.Function2[
    /* err */ js.UndefOr[java.lang.String], 
    /* tunnel */ js.UndefOr[typingsSlinky.localtunnel.mod.Tunnel], 
    scala.Unit
  ]
}
