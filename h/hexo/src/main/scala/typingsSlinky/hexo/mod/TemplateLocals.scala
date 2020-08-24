package typingsSlinky.hexo.mod

import typingsSlinky.hexo.anon.Args
import typingsSlinky.hexo.mod.Locals.Category
import typingsSlinky.hexo.mod.Locals.Page
import typingsSlinky.hexo.mod.Locals.Tag
import typingsSlinky.underscore.mod.TypeOfCollection
import typingsSlinky.underscore.mod.Underscore
import typingsSlinky.underscore.mod.UnderscoreStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateLocals extends js.Object {
  /**
    * Underscore object
    */
  @JSName("_")
  var _underscore_Original: UnderscoreStatic = js.native
  /**
    * Site settings in `_config.yml`
    */
  var config: HexoConfig = js.native
  var env: Args = js.native
  var layout: String = js.native
  var page: typingsSlinky.hexo.mod.Locals.Post | Page | Category | Tag | IndexPage | ArchivePage | CategoryPage | TagPage = js.native
  var path: String = js.native
  var site: js.Any = js.native
  var theme: HexoConfig = js.native
  var url: String = js.native
  var view_dir: String = js.native
  /**
    * Underscore OOP Wrapper, all Underscore functions that take an object
    * as the first parameter can be invoked through this function.
    * @param value First argument to Underscore object functions.
    * @returns An Underscore wrapper around the supplied value.
    **/
  /**
    * Underscore object
    */
  @JSName("_")
  def _underscore[V](value: V): Underscore[TypeOfCollection[V], V] = js.native
}

