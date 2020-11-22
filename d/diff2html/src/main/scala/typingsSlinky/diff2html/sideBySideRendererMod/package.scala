package typingsSlinky.diff2html

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object sideBySideRendererMod {
  
  type DiffLineGroups = js.Array[
    js.Tuple3[
      js.Array[
        typingsSlinky.diff2html.typesMod.DiffLineContext with typingsSlinky.diff2html.typesMod.DiffLineContent
      ], 
      js.Array[
        typingsSlinky.diff2html.typesMod.DiffLineDeleted with typingsSlinky.diff2html.typesMod.DiffLineContent
      ], 
      js.Array[
        typingsSlinky.diff2html.typesMod.DiffLineInserted with typingsSlinky.diff2html.typesMod.DiffLineContent
      ]
    ]
  ]
}
