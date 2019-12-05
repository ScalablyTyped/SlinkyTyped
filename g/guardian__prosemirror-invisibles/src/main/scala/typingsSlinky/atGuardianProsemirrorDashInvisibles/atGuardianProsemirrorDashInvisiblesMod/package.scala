package typingsSlinky.atGuardianProsemirrorDashInvisibles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atGuardianProsemirrorDashInvisiblesMod {
  import typingsSlinky.prosemirrorDashModel.prosemirrorDashModelMod.Node
  import typingsSlinky.prosemirrorDashView.prosemirrorDashViewMod.DecorationSet

  type Builder = js.Function4[
    /* from */ Double, 
    /* to */ Double, 
    /* doc */ Node[js.Any], 
    /* decos */ DecorationSet[js.Any], 
    DecorationSet[js.Any]
  ]
}
