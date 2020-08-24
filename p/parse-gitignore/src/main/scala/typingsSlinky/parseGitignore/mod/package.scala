package typingsSlinky.parseGitignore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type FormatLine = js.Function3[
    /* line */ java.lang.String, 
    /* section */ js.UndefOr[typingsSlinky.parseGitignore.mod.Section], 
    /* state */ js.UndefOr[typingsSlinky.parseGitignore.mod.State], 
    java.lang.String
  ]
}
