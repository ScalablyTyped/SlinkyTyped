package typingsSlinky.bearcatEs6.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceLoader extends js.Object {
  var loadPathMap: js.Object = js.native
  var loadPaths: String = js.native
  /**
    * ResourceLoader add context load path.
    *
    * @param   cpath context load path
    * @api     public
    */
  def addLoadPath(cpath: String): Unit = js.native
  /**
    * ResourceLoader get config loader.
    *
    * @return  config loader
    * @api     public
    */
  def getConfigLoader(): ConfigLoader = js.native
  /**
    * ResourceLoader load metaObjects from context path.
    *
    * @param   cpath context load path
    * @return  metaObjects
    * @api     public
    */
  def load(cpath: String): js.Object = js.native
}

object ResourceLoader {
  @scala.inline
  def apply(
    addLoadPath: String => Unit,
    getConfigLoader: () => ConfigLoader,
    load: String => js.Object,
    loadPathMap: js.Object,
    loadPaths: String
  ): ResourceLoader = {
    val __obj = js.Dynamic.literal(addLoadPath = js.Any.fromFunction1(addLoadPath), getConfigLoader = js.Any.fromFunction0(getConfigLoader), load = js.Any.fromFunction1(load), loadPathMap = loadPathMap.asInstanceOf[js.Any], loadPaths = loadPaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceLoader]
  }
  @scala.inline
  implicit class ResourceLoaderOps[Self <: ResourceLoader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddLoadPath(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addLoadPath")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetConfigLoader(value: () => ConfigLoader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getConfigLoader")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLoad(value: String => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLoadPathMap(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadPathMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadPaths(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadPaths")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

