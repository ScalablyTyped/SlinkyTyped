package typingsSlinky.conventionalChangelogPresetLoader

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Builder = js.Function1[
    /* config */ js.Object with typingsSlinky.conventionalChangelogPresetLoader.mod.Config, 
    typingsSlinky.conventionalChangelogCore.mod.Options.Config[
      typingsSlinky.conventionalCommitsParser.mod.Commit[java.lang.String | scala.Double | js.Symbol], 
      typingsSlinky.conventionalChangelogWriter.mod.Context
    ]
  ]
}
