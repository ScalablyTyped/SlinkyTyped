package typingsSlinky.eggCore.mod

import typingsSlinky.eggCore.anon.Exports
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileLoaderBase extends js.Object {
  
  /**
    * attach items to target object. Mapping the directory to properties.
    * `app/controller/group/repository.js` => `target.group.repository`
    * @return {Object} target
    * @since 1.0.0
    */
  def load(): js.Object = js.native
  
  /**
    * Parse files from given directories, then return an items list, each item contains properties and exports.
    *
    * For example, parse `app/controller/group/repository.js`
    *
    * ```js
    * module.exports = app => {
    *   return class RepositoryController extends app.Controller {};
    * }
    * ```
    *
    * It returns a item
    *
    * ```js
    * {
    *   properties: [ 'group', 'repository' ],
    *   exports: app => { ... },
    * }
    * ```
    *
    * `Properties` is an array that contains the directory of a filepath.
    *
    * `Exports` depends on type, if exports is a function, it will be called. if initializer is specified, it will be called with exports for customizing.
    * @return {Array} items
    * @since 1.0.0
    */
  def parse(): js.Array[Exports] = js.native
}
object FileLoaderBase {
  
  @scala.inline
  def apply(load: () => js.Object, parse: () => js.Array[Exports]): FileLoaderBase = {
    val __obj = js.Dynamic.literal(load = js.Any.fromFunction0(load), parse = js.Any.fromFunction0(parse))
    __obj.asInstanceOf[FileLoaderBase]
  }
  
  @scala.inline
  implicit class FileLoaderBaseOps[Self <: FileLoaderBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLoad(value: () => js.Object): Self = this.set("load", js.Any.fromFunction0(value))
    
    @scala.inline
    def setParse(value: () => js.Array[Exports]): Self = this.set("parse", js.Any.fromFunction0(value))
  }
}
