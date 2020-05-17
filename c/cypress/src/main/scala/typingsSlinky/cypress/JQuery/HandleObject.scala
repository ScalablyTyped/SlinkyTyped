package typingsSlinky.cypress.JQuery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Many of the special event hook functions below are passed a `handleObj` object that provides more information about the event, how it was attached, and its current state. This object and its contents should be treated as read-only data, and only the properties below are documented for use by special event handlers.
  * @see \`{@link https://learn.jquery.com/events/event-extensions/#the-handleobj-object }\`
  */
@js.native
trait HandleObject[TTarget, TData] extends js.Object {
  /**
    * The data, if any, passed to jQuery during event binding, e.g. `{ myData: 42 }`. If the data argument was omitted or `undefined`, this property is `undefined` as well.
    */
  val data: TData = js.native
  /**
    * Namespace(s), if any, provided when the event was attached, such as `"myPlugin"`. When multiple namespaces are given, they are separated by periods and sorted in ascending alphabetical order. If no namespaces are provided, this property is an empty string.
    */
  val namespace: String = js.native
  /**
    * The original type name regardless of whether it was mapped via `bindType` or `delegateType`. So when a "pushy" event is mapped to "click" its `origType` would be "pushy".
    */
  val origType: String = js.native
  /**
    * For delegated events, this is the selector used to filter descendant elements and determine if the handler should be called. For directly bound events, this property is `null`.
    */
  val selector: js.UndefOr[String | Null] = js.native
  /**
    * The type of event, such as `"click"`. When special event mapping is used via `bindType` or `delegateType`, this will be the mapped type.
    */
  val `type`: String = js.native
  /**
    * Event handler function passed to jQuery during event binding. If `false` was passed during event binding, the handler refers to a single shared function that simply returns `false`.
    */
  def handler(t: TriggeredEvent[TTarget, TData, _, _], args: js.Any*): js.Any = js.native
}

object HandleObject {
  @scala.inline
  def apply[TTarget, TData](
    data: TData,
    handler: (TriggeredEvent[TTarget, TData, _, _], /* repeated */ js.Any) => js.Any,
    namespace: String,
    origType: String,
    `type`: String
  ): HandleObject[TTarget, TData] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], handler = js.Any.fromFunction2(handler), namespace = namespace.asInstanceOf[js.Any], origType = origType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandleObject[TTarget, TData]]
  }
  @scala.inline
  implicit class HandleObjectOps[Self[ttarget, tdata] <: HandleObject[ttarget, tdata], TTarget, TData] (val x: Self[TTarget, TData]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TTarget, TData] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TTarget, TData]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TTarget, TData]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TTarget, TData]) with Other]
    @scala.inline
    def withData(value: TData): Self[TTarget, TData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHandler(value: (TriggeredEvent[TTarget, TData, _, _], /* repeated */ js.Any) => js.Any): Self[TTarget, TData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handler")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withNamespace(value: String): Self[TTarget, TData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrigType(value: String): Self[TTarget, TData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self[TTarget, TData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelector(value: String): Self[TTarget, TData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelector: Self[TTarget, TData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectorNull: Self[TTarget, TData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(null)
        ret
    }
  }
  
}

