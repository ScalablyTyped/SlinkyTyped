package typingsSlinky.dojo

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.dojo.dijit.layout.BorderContainer.Gutter
import typingsSlinky.dojo.dijit.layout.BorderContainer.Splitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofBorderContainer extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/layout/BorderContainer._Gutter.html
    *
    * Just a spacer div to separate side pane from center pane.
    * Basically a trick to lookup the gutter/splitter width from the theme.
    * Instantiated by dijit/layout/BorderContainer.  Users should not
    * create directly.
    * 
    * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
    * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
    */
  var _Gutter: Instantiable2[js.UndefOr[/* params */ js.Object], js.UndefOr[/* srcNodeRef */ HTMLElement], Gutter] = js.native
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/layout/BorderContainer._Splitter.html
    *
    * A draggable spacer between two items in a dijit/layout/BorderContainer.
    * This is instantiated by dijit/layout/BorderContainer.  Users should not
    * create it directly.
    * 
    */
  var _Splitter: Instantiable0[Splitter] = js.native
}

object TypeofBorderContainer {
  @scala.inline
  def apply(
    _Gutter: Instantiable2[js.UndefOr[/* params */ js.Object], js.UndefOr[/* srcNodeRef */ HTMLElement], Gutter],
    _Splitter: Instantiable0[Splitter]
  ): TypeofBorderContainer = {
    val __obj = js.Dynamic.literal(_Gutter = _Gutter.asInstanceOf[js.Any], _Splitter = _Splitter.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofBorderContainer]
  }
  @scala.inline
  implicit class TypeofBorderContainerOps[Self <: TypeofBorderContainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_Gutter(
      value: Instantiable2[js.UndefOr[/* params */ js.Object], js.UndefOr[/* srcNodeRef */ HTMLElement], Gutter]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_Gutter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_Splitter(value: Instantiable0[Splitter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_Splitter")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

