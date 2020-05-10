package typingsSlinky.dojo.dojox.treemap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/treemap/_utils.html
  *
  *
  */
@js.native
trait utils extends js.Object {
  /**
    *
    * @param array
    * @param callback
    */
  def find(array: js.Array[_], callback: js.Function): js.Any = js.native
  /**
    *
    * @param items
    * @param groupingFunctions
    * @param measureFunction
    */
  def group(items: js.Array[_], groupingFunctions: js.Array[_], measureFunction: js.Function): js.Object = js.native
  /**
    *
    * @param items
    * @param areaFunc
    */
  def initElements(items: js.Any, areaFunc: js.Any): js.Object = js.native
  /**
    *
    * @param items
    * @param width
    * @param height
    * @param areaFunc
    * @param rtl
    */
  def solve(items: js.Any, width: js.Any, height: js.Any, areaFunc: js.Any, rtl: js.Any): js.Object = js.native
}

object utils {
  @scala.inline
  def apply(
    find: (js.Array[_], js.Function) => js.Any,
    group: (js.Array[_], js.Array[_], js.Function) => js.Object,
    initElements: (js.Any, js.Any) => js.Object,
    solve: (js.Any, js.Any, js.Any, js.Any, js.Any) => js.Object
  ): utils = {
    val __obj = js.Dynamic.literal(find = js.Any.fromFunction2(find), group = js.Any.fromFunction3(group), initElements = js.Any.fromFunction2(initElements), solve = js.Any.fromFunction5(solve))
    __obj.asInstanceOf[utils]
  }
  @scala.inline
  implicit class utilsOps[Self <: utils] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFind(value: (js.Array[_], js.Function) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("find")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGroup(value: (js.Array[_], js.Array[_], js.Function) => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withInitElements(value: (js.Any, js.Any) => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initElements")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSolve(value: (js.Any, js.Any, js.Any, js.Any, js.Any) => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("solve")(js.Any.fromFunction5(value))
        ret
    }
  }
  
}

