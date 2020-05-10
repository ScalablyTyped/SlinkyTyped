package typingsSlinky.bearcatEs6.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigLoader extends js.Object {
  /**
    * ConfigLoader get meta loader.
    *
    * @return  meta loader
    * @api     public
    */
  def getMetaLoader(): MetaLoader = js.native
  /**
    * ConfigLoader get recursive scan paths and metaObjects in context.json.
    *
    * @param   cpath context path
    * @param   scanPaths scan paths
    * @param   metaObjects
    * @api     public
    */
  def getRecursiveScanPath(cpath: String, scanPaths: js.Array[String], metaObjects: js.Object): Unit = js.native
  /**
    * ConfigLoader get meta objects from context path.
    *
    * @param   cpath context path
    * @return  meta objects
    * @api     public
    */
  def getResources(cpath: String): js.Object = js.native
}

object ConfigLoader {
  @scala.inline
  def apply(
    getMetaLoader: () => MetaLoader,
    getRecursiveScanPath: (String, js.Array[String], js.Object) => Unit,
    getResources: String => js.Object
  ): ConfigLoader = {
    val __obj = js.Dynamic.literal(getMetaLoader = js.Any.fromFunction0(getMetaLoader), getRecursiveScanPath = js.Any.fromFunction3(getRecursiveScanPath), getResources = js.Any.fromFunction1(getResources))
    __obj.asInstanceOf[ConfigLoader]
  }
  @scala.inline
  implicit class ConfigLoaderOps[Self <: ConfigLoader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetMetaLoader(value: () => MetaLoader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMetaLoader")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRecursiveScanPath(value: (String, js.Array[String], js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRecursiveScanPath")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetResources(value: String => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getResources")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

