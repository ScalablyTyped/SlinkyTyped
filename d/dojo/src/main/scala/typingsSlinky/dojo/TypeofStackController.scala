package typingsSlinky.dojo

import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.dojo.dijit.layout.StackController.StackButton
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofStackController extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/layout/StackController.StackButton.html
    *
    * Internal widget used by StackContainer.
    * The button-like or tab-like object you click to select or delete a page
    * 
    * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
    * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
    */
  var StackButton: Instantiable2[
    js.UndefOr[/* params */ js.Object], 
    js.UndefOr[/* srcNodeRef */ HTMLElement], 
    typingsSlinky.dojo.dijit.layout.StackController.StackButton
  ] = js.native
}

object TypeofStackController {
  @scala.inline
  def apply(
    StackButton: Instantiable2[
      js.UndefOr[/* params */ js.Object], 
      js.UndefOr[/* srcNodeRef */ HTMLElement], 
      StackButton
    ]
  ): TypeofStackController = {
    val __obj = js.Dynamic.literal(StackButton = StackButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofStackController]
  }
  @scala.inline
  implicit class TypeofStackControllerOps[Self <: TypeofStackController] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStackButton(
      value: Instantiable2[
          js.UndefOr[/* params */ js.Object], 
          js.UndefOr[/* srcNodeRef */ HTMLElement], 
          StackButton
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackButton")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

