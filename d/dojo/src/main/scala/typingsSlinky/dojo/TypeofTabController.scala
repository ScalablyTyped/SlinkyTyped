package typingsSlinky.dojo

import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.dojo.dijit.layout.TabController.TabButton
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofTabController extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/layout/TabController.TabButton.html
    *
    * 
    * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
    * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
    */
  var TabButton: Instantiable2[
    js.UndefOr[/* params */ js.Object], 
    js.UndefOr[/* srcNodeRef */ HTMLElement], 
    typingsSlinky.dojo.dijit.layout.TabController.TabButton
  ] = js.native
}

object TypeofTabController {
  @scala.inline
  def apply(
    TabButton: Instantiable2[
      js.UndefOr[/* params */ js.Object], 
      js.UndefOr[/* srcNodeRef */ HTMLElement], 
      TabButton
    ]
  ): TypeofTabController = {
    val __obj = js.Dynamic.literal(TabButton = TabButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTabController]
  }
  @scala.inline
  implicit class TypeofTabControllerOps[Self <: TypeofTabController] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTabButton(
      value: Instantiable2[
          js.UndefOr[/* params */ js.Object], 
          js.UndefOr[/* srcNodeRef */ HTMLElement], 
          TabButton
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TabButton")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

