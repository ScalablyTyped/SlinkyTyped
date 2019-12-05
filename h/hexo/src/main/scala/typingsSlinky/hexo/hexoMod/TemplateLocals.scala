package typingsSlinky.hexo.hexoMod

import typingsSlinky.hexo.Anon_Args
import typingsSlinky.hexo.hexoMod.Locals.Category
import typingsSlinky.hexo.hexoMod.Locals.Page
import typingsSlinky.hexo.hexoMod.Locals.Tag
import typingsSlinky.underscore.underscoreMod.Dictionary
import typingsSlinky.underscore.underscoreMod.List
import typingsSlinky.underscore.underscoreMod.TypeOfDictionary
import typingsSlinky.underscore.underscoreMod.Underscore
import typingsSlinky.underscore.underscoreMod.UnderscoreStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateLocals extends js.Object {
  /**
    * Underscore object
    */
  @JSName("_")
  var __Original: UnderscoreStatic = js.native
  /**
    * Site settings in `_config.yml`
    */
  var config: HexoConfig = js.native
  var env: Anon_Args = js.native
  var layout: String = js.native
  var page: typingsSlinky.hexo.hexoMod.Locals.Post | Page | Category | Tag | IndexPage | ArchivePage | CategoryPage | TagPage = js.native
  var path: String = js.native
  var site: js.Any = js.native
  var theme: HexoConfig = js.native
  var url: String = js.native
  var view_dir: String = js.native
  /**
    * Underscore object
    */
  def `_`[T](value: T): Underscore[T, T] = js.native
  /**
    * Underscore object
    */
  def `_`[T](value: js.Array[T]): Underscore[T, js.Array[T]] = js.native
  /**
    * Underscore OOP Wrapper, all Underscore functions that take an object
    * as the first parameter can be invoked through this function.
    * @param key First argument to Underscore object functions.
    **/
  /**
    * Underscore object
    */
  def `_`[T](value: List[T]): Underscore[T, List[T]] = js.native
  /**
    * Underscore object
    */
  @JSName("_")
  def __T_TypeOfDictionaryVV_DictionaryWildcard[T /* <: TypeOfDictionary[V] */, V /* <: Dictionary[_] */](value: V): Underscore[T, V] = js.native
}

