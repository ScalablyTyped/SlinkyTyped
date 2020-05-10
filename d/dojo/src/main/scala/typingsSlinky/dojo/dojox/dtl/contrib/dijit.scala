package typingsSlinky.dojo.dojox.dtl.contrib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dtl/contrib/dijit.html
  *
  *
  */
@js.native
trait dijit extends js.Object {
  /**
    *
    */
  var widgetsInTemplate: Boolean = js.native
  /**
    *
    * @param keys
    * @param object
    */
  def AttachNode(keys: js.Any, `object`: js.Any): Unit = js.native
  /**
    *
    * @param node
    * @param parsed
    */
  def DojoTypeNode(node: js.Any, parsed: js.Any): Unit = js.native
  /**
    *
    * @param command
    * @param obj
    */
  def EventNode(command: js.Any, obj: js.Any): Unit = js.native
  /**
    *
    * @param parser
    * @param token
    */
  def data_dojo_attach_event(parser: js.Any, token: js.Any): js.Any = js.native
  /**
    *
    * @param parser
    * @param token
    */
  def data_dojo_attach_point(parser: js.Any, token: js.Any): js.Any = js.native
  /**
    *
    * @param parser
    * @param token
    */
  def data_dojo_type(parser: js.Any, token: js.Any): js.Any = js.native
  /**
    *
    * @param parser
    * @param token
    */
  def dojoAttachEvent(parser: js.Any, token: js.Any): js.Any = js.native
  /**
    *
    * @param parser
    * @param token
    */
  def dojoAttachPoint(parser: js.Any, token: js.Any): js.Any = js.native
  /**
    *
    * @param parser
    * @param token
    */
  def dojoType(parser: js.Any, token: js.Any): js.Any = js.native
  /**
    * Associates an event type to a function (on the current widget) by name
    *
    * @param parser
    * @param token
    */
  def on(parser: js.Any, token: js.Any): js.Any = js.native
}

object dijit {
  @scala.inline
  def apply(
    AttachNode: (js.Any, js.Any) => Unit,
    DojoTypeNode: (js.Any, js.Any) => Unit,
    EventNode: (js.Any, js.Any) => Unit,
    data_dojo_attach_event: (js.Any, js.Any) => js.Any,
    data_dojo_attach_point: (js.Any, js.Any) => js.Any,
    data_dojo_type: (js.Any, js.Any) => js.Any,
    dojoAttachEvent: (js.Any, js.Any) => js.Any,
    dojoAttachPoint: (js.Any, js.Any) => js.Any,
    dojoType: (js.Any, js.Any) => js.Any,
    on: (js.Any, js.Any) => js.Any,
    widgetsInTemplate: Boolean
  ): dijit = {
    val __obj = js.Dynamic.literal(AttachNode = js.Any.fromFunction2(AttachNode), DojoTypeNode = js.Any.fromFunction2(DojoTypeNode), EventNode = js.Any.fromFunction2(EventNode), data_dojo_attach_event = js.Any.fromFunction2(data_dojo_attach_event), data_dojo_attach_point = js.Any.fromFunction2(data_dojo_attach_point), data_dojo_type = js.Any.fromFunction2(data_dojo_type), dojoAttachEvent = js.Any.fromFunction2(dojoAttachEvent), dojoAttachPoint = js.Any.fromFunction2(dojoAttachPoint), dojoType = js.Any.fromFunction2(dojoType), on = js.Any.fromFunction2(on), widgetsInTemplate = widgetsInTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[dijit]
  }
  @scala.inline
  implicit class dijitOps[Self <: dijit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachNode(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttachNode")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDojoTypeNode(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DojoTypeNode")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withEventNode(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventNode")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withData_dojo_attach_event(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data_dojo_attach_event")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withData_dojo_attach_point(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data_dojo_attach_point")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withData_dojo_type(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data_dojo_type")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDojoAttachEvent(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dojoAttachEvent")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDojoAttachPoint(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dojoAttachPoint")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDojoType(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dojoType")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOn(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withWidgetsInTemplate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widgetsInTemplate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

