package typingsSlinky.conventionalChangelogPresetLoader.mod

import typingsSlinky.conventionalChangelogWriter.mod.Context
import typingsSlinky.conventionalCommitsParser.mod.Commit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("conventional-changelog-preset-loader", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * The string that is passed to the preset loader is manipulated by prepending
    * `conventional-changelog` to the name.
    *
    * For example:
    *
    * * `angular` => `conventional-changelog-angular`
    * * `angular/preset/path` => `conventional-changelog-angular/preset/path`
    * * `@scope/angular` => `@scope/conventional-changelog-angular`
    * * `@scope/angular/preset/path` => `@scope/conventional-changelog-angular/preset/path`
    *
    * Will return whatever is exported by the preset package. That may be a
    * configuration object, a function, or a promise.
    *
    * @param path
    */
  def apply(path: String): typingsSlinky.conventionalChangelogCore.mod.Options.Config[Commit[String | Double | js.Symbol], Context] = js.native
  def apply(path: Config): typingsSlinky.conventionalChangelogCore.mod.Options.Config[Commit[String | Double | js.Symbol], Context] = js.native
}
