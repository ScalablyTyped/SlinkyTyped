package typingsSlinky.nightwatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Function2[
/ * browser * / typingsSlinky.nightwatch.mod.NightwatchBrowser, 
/ * done * / js.Function1[/ * err * / js.UndefOr[js.Any], scala.Unit], 
scala.Unit]
  - js.Function1[/ * done * / js.Function1[/ * err * / js.UndefOr[js.Any], scala.Unit], scala.Unit]
*/
trait NightwatchTestHook extends js.Object

object NightwatchTestHook {
  @scala.inline
  implicit def apply(value: js.Function1[/* done */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], Unit]): NightwatchTestHook = value.asInstanceOf[NightwatchTestHook]
  @scala.inline
  implicit def apply(
    value: js.Function2[
      /* browser */ NightwatchBrowser, 
      /* done */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ): NightwatchTestHook = value.asInstanceOf[NightwatchTestHook]
}

