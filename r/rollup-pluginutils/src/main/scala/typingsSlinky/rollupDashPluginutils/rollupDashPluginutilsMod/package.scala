package typingsSlinky.rollupDashPluginutils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object rollupDashPluginutilsMod {
  import typingsSlinky.estreeDashWalker.estreeDashWalkerMod.Node
  import typingsSlinky.rollupDashPluginutils.Anon_False

  type AddExtension = js.Function2[/* filename */ String, /* ext */ js.UndefOr[String], String]
  type AttachScopes = js.Function2[/* ast */ Node, /* propertyName */ js.UndefOr[String], AttachedScope]
  type CreateFilter = js.Function3[
    /* include */ js.UndefOr[(js.Array[String | js.RegExp]) | String | js.RegExp | Null], 
    /* exclude */ js.UndefOr[(js.Array[String | js.RegExp]) | String | js.RegExp | Null], 
    /* options */ js.UndefOr[Anon_False], 
    js.Function1[/* id */ String | js.Any, Boolean]
  ]
  type DataToEsm = js.Function2[/* data */ js.Any, /* options */ js.UndefOr[DataToEsmOptions], String]
  type ExtractAssignedNames = js.Function1[/* param */ Node, js.Array[String]]
  type MakeLegalIdentifier = js.Function1[/* str */ String, String]
}
