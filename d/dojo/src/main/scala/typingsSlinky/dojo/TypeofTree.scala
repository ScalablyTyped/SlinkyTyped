package typingsSlinky.dojo

import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.dojo.dijit.Tree._TreeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofTree extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/Tree._TreeNode.html
    *
    * Single node within a tree.   This class is used internally
    * by Tree and should not be accessed directly.
    * 
    * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
    * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
    */
  var _TreeNode: Instantiable2[
    js.UndefOr[/* params */ js.Object], 
    js.UndefOr[/* srcNodeRef */ HTMLElement], 
    typingsSlinky.dojo.dijit.Tree._TreeNode
  ]
}

object TypeofTree {
  @scala.inline
  def apply(
    _TreeNode: Instantiable2[
      js.UndefOr[/* params */ js.Object], 
      js.UndefOr[/* srcNodeRef */ HTMLElement], 
      _TreeNode
    ]
  ): TypeofTree = {
    val __obj = js.Dynamic.literal(_TreeNode = _TreeNode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TypeofTree]
  }
}

