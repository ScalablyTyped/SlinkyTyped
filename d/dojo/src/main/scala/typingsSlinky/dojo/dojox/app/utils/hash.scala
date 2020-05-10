package typingsSlinky.dojo.dojox.app.utils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/app/utils/hash.html
  *
  * This module contains the hash
  *
  */
@js.native
trait hash extends js.Object {
  /**
    * add the view specific params to the hash for example (view1&param1=value1)
    *
    * @param hash the url hash
    * @param view the view name
    * @param params the params for this view
    */
  def addViewParams(hash: String, view: String, params: js.Object): js.Any = js.native
  /**
    * build up the url hash adding the params
    *
    * @param hash the url hash
    * @param params the params object
    */
  def buildWithParams(hash: String, params: js.Object): js.Any = js.native
  /**
    * called to handle a view specific params object
    *
    * @param params the view specific params object
    * @param viewPart the part of the view with the params for the view
    */
  def getParamObj(params: js.Object, viewPart: String): js.Any = js.native
  /**
    * return the param string
    *
    * @param params the params object
    */
  def getParamString(params: js.Object): js.Any = js.native
  /**
    * get the params from the hash
    *
    * @param hash the url hash
    */
  def getParams(hash: String): js.Any = js.native
  /**
    * return the target string
    *
    * @param hash the hash string
    * @param defaultView               Optionalthe optional defaultView string
    */
  def getTarget(hash: String, defaultView: String): js.Any = js.native
}

object hash {
  @scala.inline
  def apply(
    addViewParams: (String, String, js.Object) => js.Any,
    buildWithParams: (String, js.Object) => js.Any,
    getParamObj: (js.Object, String) => js.Any,
    getParamString: js.Object => js.Any,
    getParams: String => js.Any,
    getTarget: (String, String) => js.Any
  ): hash = {
    val __obj = js.Dynamic.literal(addViewParams = js.Any.fromFunction3(addViewParams), buildWithParams = js.Any.fromFunction2(buildWithParams), getParamObj = js.Any.fromFunction2(getParamObj), getParamString = js.Any.fromFunction1(getParamString), getParams = js.Any.fromFunction1(getParams), getTarget = js.Any.fromFunction2(getTarget))
    __obj.asInstanceOf[hash]
  }
  @scala.inline
  implicit class hashOps[Self <: hash] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddViewParams(value: (String, String, js.Object) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addViewParams")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withBuildWithParams(value: (String, js.Object) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildWithParams")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetParamObj(value: (js.Object, String) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParamObj")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetParamString(value: js.Object => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParamString")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetParams(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParams")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetTarget(value: (String, String) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTarget")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

