package typingsSlinky.dojo.dijit._editor

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/_editor/range.html
  *
  * W3C range API
  * 
  */
@js.native
trait range_ extends js.Object {
  /**
    * 
    */
  var BlockTagNames: js.RegExp = js.native
  /**
    * 
    */
  var ie: js.Object = js.native
  /**
    * 
    */
  def W3CRange(): Unit = js.native
  /**
    * 
    * @param startnode             
    * @param next             
    */
  def adjacentNoneTextNode(startnode: js.Any, next: js.Any): js.Array[_] = js.native
  /**
    * 
    * @param container             
    * @param node             
    * @param offset             
    */
  def atBeginningOfContainer(container: HTMLElement, node: HTMLElement, offset: Double): Boolean = js.native
  /**
    * 
    * @param container             
    * @param node             
    * @param offset             
    */
  def atEndOfContainer(container: HTMLElement, node: HTMLElement, offset: Double): Boolean = js.native
  /**
    * 
    * @param win               Optional            
    */
  def create(win: Window_): js.Any = js.native
  /**
    * 
    * @param node             
    * @param regex               Optional            
    * @param root               Optional            
    */
  def getAncestor(node: HTMLElement, regex: js.RegExp, root: HTMLElement): HTMLElement = js.native
  /**
    * 
    * @param node             
    * @param regex               Optional            
    * @param root               Optional            
    */
  def getBlockAncestor(node: HTMLElement, regex: js.RegExp, root: HTMLElement): js.Object = js.native
  /**
    * 
    * @param n1             
    * @param n2             
    * @param root             
    */
  def getCommonAncestor(n1: js.Any, n2: js.Any, root: js.Any): js.Any = js.native
  /**
    * 
    * @param node             
    * @param parent             
    */
  def getIndex(node: HTMLElement, parent: HTMLElement): js.Object = js.native
  /**
    * 
    * @param index             
    * @param parent             
    */
  def getNode(index: js.Array[_], parent: HTMLElement): HTMLElement = js.native
  /**
    * 
    * @param window             
    * @param ignoreUpdate               Optional            
    */
  def getSelection(window: Window_, ignoreUpdate: Boolean): js.Any = js.native
}

object range_ {
  @scala.inline
  def apply(
    BlockTagNames: js.RegExp,
    W3CRange: () => Unit,
    adjacentNoneTextNode: (js.Any, js.Any) => js.Array[_],
    atBeginningOfContainer: (HTMLElement, HTMLElement, Double) => Boolean,
    atEndOfContainer: (HTMLElement, HTMLElement, Double) => Boolean,
    create: Window_ => js.Any,
    getAncestor: (HTMLElement, js.RegExp, HTMLElement) => HTMLElement,
    getBlockAncestor: (HTMLElement, js.RegExp, HTMLElement) => js.Object,
    getCommonAncestor: (js.Any, js.Any, js.Any) => js.Any,
    getIndex: (HTMLElement, HTMLElement) => js.Object,
    getNode: (js.Array[_], HTMLElement) => HTMLElement,
    getSelection: (Window_, Boolean) => js.Any,
    ie: js.Object
  ): range_ = {
    val __obj = js.Dynamic.literal(BlockTagNames = BlockTagNames.asInstanceOf[js.Any], W3CRange = js.Any.fromFunction0(W3CRange), adjacentNoneTextNode = js.Any.fromFunction2(adjacentNoneTextNode), atBeginningOfContainer = js.Any.fromFunction3(atBeginningOfContainer), atEndOfContainer = js.Any.fromFunction3(atEndOfContainer), create = js.Any.fromFunction1(create), getAncestor = js.Any.fromFunction3(getAncestor), getBlockAncestor = js.Any.fromFunction3(getBlockAncestor), getCommonAncestor = js.Any.fromFunction3(getCommonAncestor), getIndex = js.Any.fromFunction2(getIndex), getNode = js.Any.fromFunction2(getNode), getSelection = js.Any.fromFunction2(getSelection), ie = ie.asInstanceOf[js.Any])
    __obj.asInstanceOf[range_]
  }
  @scala.inline
  implicit class range_Ops[Self <: range_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlockTagNames(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlockTagNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withW3CRange(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("W3CRange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAdjacentNoneTextNode(value: (js.Any, js.Any) => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjacentNoneTextNode")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAtBeginningOfContainer(value: (HTMLElement, HTMLElement, Double) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atBeginningOfContainer")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withAtEndOfContainer(value: (HTMLElement, HTMLElement, Double) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atEndOfContainer")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withCreate(value: Window_ => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetAncestor(value: (HTMLElement, js.RegExp, HTMLElement) => HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAncestor")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetBlockAncestor(value: (HTMLElement, js.RegExp, HTMLElement) => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBlockAncestor")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetCommonAncestor(value: (js.Any, js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCommonAncestor")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetIndex(value: (HTMLElement, HTMLElement) => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIndex")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetNode(value: (js.Array[_], HTMLElement) => HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNode")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetSelection(value: (Window_, Boolean) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelection")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIe(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ie")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

