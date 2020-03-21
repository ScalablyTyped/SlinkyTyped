package typingsSlinky.hexo.mod

import typingsSlinky.hexo.hexoStrings.categories
import typingsSlinky.hexo.hexoStrings.pages
import typingsSlinky.hexo.hexoStrings.posts
import typingsSlinky.hexo.hexoStrings.tags
import typingsSlinky.hexo.mod.Locals.Category
import typingsSlinky.hexo.mod.Locals.Page
import typingsSlinky.hexo.mod.Locals.Tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Locals_ extends js.Object {
  /**
    * Get a Variable
    */
  def get(`type`: String): js.Any = js.native
  @JSName("get")
  def get_categories(`type`: categories): Model[Category] = js.native
  @JSName("get")
  def get_pages(`type`: pages): Model[Page] = js.native
  @JSName("get")
  def get_posts(`type`: posts): Model[typingsSlinky.hexo.mod.Locals.Post] = js.native
  @JSName("get")
  def get_tags(`type`: tags): Model[Tag] = js.native
  /**
    * Invalidate the cache
    */
  def invalidate(): this.type = js.native
  /**
    * Remove a Variable
    */
  def remove(`type`: String): this.type = js.native
  /**
    * Set a Variable
    */
  def set(`type`: String, fn: js.Function0[_]): this.type = js.native
  /**
    * Get All Variable
    */
  def toObject(): js.Any = js.native
}

