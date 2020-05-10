package typingsSlinky.dojo.dijit._editor.range

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/_editor/range.ie.html
  *
  * 
  */
@js.native
trait ie extends js.Object {
  /**
    * 
    */
  var cachedSelection: js.Object = js.native
  /**
    * 
    * @param range             
    */
  def decomposeControlRange(range: js.Any): js.Array[_] = js.native
  /**
    * 
    * @param range             
    */
  def decomposeTextRange(range: js.Any): js.Array[_] = js.native
  /**
    * 
    * @param range             
    * @param end             
    */
  def getEndPoint(range: js.Any, end: js.Any): js.Array[_] = js.native
  /**
    * 
    * @param window             
    */
  def selection(window: js.Any): Unit = js.native
  /**
    * 
    * @param range             
    * @param container             
    * @param offset             
    */
  def setEndPoint(range: js.Any, container: js.Any, offset: js.Any): js.Any = js.native
  /**
    * 
    * @param range             
    * @param startContainer             
    * @param startOffset             
    * @param endContainer             
    * @param endOffset             
    * @param collapsed             
    */
  def setRange(
    range: js.Any,
    startContainer: js.Any,
    startOffset: js.Any,
    endContainer: js.Any,
    endOffset: js.Any,
    collapsed: js.Any
  ): js.Any = js.native
}

object ie {
  @scala.inline
  def apply(
    cachedSelection: js.Object,
    decomposeControlRange: js.Any => js.Array[_],
    decomposeTextRange: js.Any => js.Array[_],
    getEndPoint: (js.Any, js.Any) => js.Array[_],
    selection: js.Any => Unit,
    setEndPoint: (js.Any, js.Any, js.Any) => js.Any,
    setRange: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any
  ): ie = {
    val __obj = js.Dynamic.literal(cachedSelection = cachedSelection.asInstanceOf[js.Any], decomposeControlRange = js.Any.fromFunction1(decomposeControlRange), decomposeTextRange = js.Any.fromFunction1(decomposeTextRange), getEndPoint = js.Any.fromFunction2(getEndPoint), selection = js.Any.fromFunction1(selection), setEndPoint = js.Any.fromFunction3(setEndPoint), setRange = js.Any.fromFunction6(setRange))
    __obj.asInstanceOf[ie]
  }
  @scala.inline
  implicit class ieOps[Self <: ie] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCachedSelection(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cachedSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDecomposeControlRange(value: js.Any => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decomposeControlRange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDecomposeTextRange(value: js.Any => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decomposeTextRange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetEndPoint(value: (js.Any, js.Any) => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEndPoint")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSelection(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetEndPoint(value: (js.Any, js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEndPoint")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSetRange(value: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRange")(js.Any.fromFunction6(value))
        ret
    }
  }
  
}

